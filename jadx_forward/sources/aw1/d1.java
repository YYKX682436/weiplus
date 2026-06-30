package aw1;

/* loaded from: classes12.dex */
public final class d1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw1.g1 f96043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f96044e;

    public d1(aw1.g1 g1Var, java.util.HashMap hashMap) {
        this.f96043d = g1Var;
        this.f96044e = hashMap;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportStorageDetailedTask", "getCollectFsFutureTask fsName = video");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.vfs.q2 b17 = ((com.p314xaae8f345.mm.vfs.r5) com.p314xaae8f345.mm.vfs.a3.f294314a.a()).b("video");
        java.lang.Iterable p17 = b17 != null ? com.p314xaae8f345.mm.vfs.e8.p(b17, "", false, null) : null;
        long j17 = 0;
        if (p17 != null) {
            java.util.Iterator it = ((pm5.b) p17).iterator();
            while (true) {
                pm5.c cVar = (pm5.c) it;
                if (!cVar.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) cVar.next();
                j17 += x1Var.f294767d;
                java.lang.String name = x1Var.f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                boolean n17 = r26.i0.n(name, ".mp4", false);
                java.util.HashMap hashMap = this.f96044e;
                aw1.g1 g1Var = this.f96043d;
                long j18 = x1Var.f294767d;
                if (n17) {
                    g1Var.a(hashMap, "video_video", j18);
                } else if (r26.i0.n(name, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG, false)) {
                    g1Var.a(hashMap, "video_thumb", j18);
                } else {
                    g1Var.a(hashMap, "video_unknown", j18);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportStorageDetailedTask", "getCollectFsFutureTask fsName = video, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return java.lang.Long.valueOf(j17);
    }
}
