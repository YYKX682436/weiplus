package gl3;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f354360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl3.g f354361e;

    public f(gl3.g gVar, long j17) {
        this.f354361e = gVar;
        this.f354360d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        if (gl3.e.d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.n.g(this.f354360d);
        }
        gl3.g gVar = this.f354361e;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceCacheCleanController", "clean music piece file");
        java.lang.String a17 = gl3.e.a();
        java.lang.String concat = a17.endsWith("/") ? a17.concat("music") : a17.concat("/music");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(concat);
        if (!r6Var.m() || !r6Var.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceCacheCleanController", "musicFolder is not exist or not Directory");
            return;
        }
        java.lang.String[] D = r6Var.D();
        if (D == null || D.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceCacheCleanController", "none files exist");
            return;
        }
        for (java.lang.String str : D) {
            java.util.Iterator it = ((java.util.ArrayList) gVar.f354363e).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.contains((java.lang.String) it.next())) {
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceCacheCleanController", "file is the block file, don't delete");
            } else {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(concat + "/" + str);
                if (!r6Var2.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceCacheCleanController", "file not exist");
                } else if (r6Var2.y()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceCacheCleanController", "file is directory, don't delete");
                } else if (java.lang.System.currentTimeMillis() - r6Var2.B() > gl3.b.f354351a.longValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.PieceCacheCleanController", "Clean 7 days file in music file name=%s, path:%s", r6Var2.m82467xfb82e301(), r6Var2.o());
                    r6Var2.l();
                    if (str.startsWith("piece")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.PieceCacheCleanController", "file is piece prefix, delete the piece info in db");
                        if (gl3.e.d()) {
                            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.n.a(str);
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceCacheCleanController", "not delete the file, file is in valid time for 7 day");
                }
            }
        }
    }
}
