package b5;

/* loaded from: classes13.dex */
public class l extends m4.a {
    @Override // m4.a
    public void a(p4.b bVar) {
        ((q4.c) bVar).c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
    }
}
