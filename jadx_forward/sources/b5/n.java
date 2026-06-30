package b5;

/* loaded from: classes13.dex */
public class n extends m4.a {
    @Override // m4.a
    public void a(p4.b bVar) {
        ((q4.c) bVar).c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    }
}
