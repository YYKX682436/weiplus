package b5;

/* loaded from: classes13.dex */
public class m extends m4.a {
    @Override // m4.a
    public void a(p4.b bVar) {
        q4.c cVar = (q4.c) bVar;
        cVar.c("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        cVar.c("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
