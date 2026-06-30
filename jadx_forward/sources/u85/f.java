package u85;

/* loaded from: classes10.dex */
public final class f implements fp0.p {
    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.lang.String a17 = task.f507252f.a();
        boolean z17 = status == fp0.u.f346823f;
        u85.i iVar = u85.i.f507240a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerFileManager", "onLoaderFin: " + a17 + ", " + z17);
        if (((u85.o) u85.i.f507247h.remove(a17)) == null || !((km0.c) gm0.j1.p().a()).a()) {
            return;
        }
        new android.content.Intent();
    }
}
