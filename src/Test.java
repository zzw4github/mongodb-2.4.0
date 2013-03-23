import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Set;
public class Test {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		


		// MongoClient mongoClient = new MongoClient();
		// or
		// MongoClient mongoClient = new MongoClient( "localhost" );
		// or
		 MongoClient mongoClient = null;
		try {
			mongoClient = new MongoClient( "localhost" , 27017 );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// or, to connect to a replica set, supply a seed list of members
		//MongoClient mongoClient = new MongoClient(Arrays.asList(new ServerAddress("localhost", 27017),
		//                                       new ServerAddress("localhost", 27018),
		//                                       new ServerAddress("localhost", 27019)));

		DB db = mongoClient.getDB( "test" );
		Set<String> colls = db.getCollectionNames();

		for (String s : colls) {
		    System.out.println(s);
		}
		System.out.println(db);

	}

}
