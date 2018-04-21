package basiccrudapplication.demo.DAO;



import java.util.Map;

import basiccrudapplication.demo.Entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

    private static Map<Integer, Person> persons;

}