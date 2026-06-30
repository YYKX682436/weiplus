package aw1;

/* loaded from: classes12.dex */
public final class c1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw1.g1 f14504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f14505e;

    public c1(aw1.g1 g1Var, java.util.HashMap hashMap) {
        this.f14504d = g1Var;
        this.f14505e = hashMap;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "getCollectFsFutureTask fsName = image2");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.vfs.q2 b17 = ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).b("image2");
        java.lang.Iterable p17 = b17 != null ? com.tencent.mm.vfs.e8.p(b17, "", false, null) : null;
        long j17 = 0;
        if (p17 != null) {
            java.util.Iterator it = ((pm5.b) p17).iterator();
            while (true) {
                pm5.c cVar = (pm5.c) it;
                if (!cVar.hasNext()) {
                    break;
                }
                com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) cVar.next();
                j17 += x1Var.f213234d;
                java.lang.String name = x1Var.f213232b;
                kotlin.jvm.internal.o.f(name, "name");
                boolean y17 = r26.i0.y(name, "th_", false);
                java.util.HashMap hashMap = this.f14505e;
                aw1.g1 g1Var = this.f14504d;
                long j18 = x1Var.f213234d;
                if (!y17) {
                    g1Var.a(hashMap, "image2_not_thumb", j18);
                } else if (r26.i0.n(name, "hd", false)) {
                    g1Var.a(hashMap, "image2_thumb_hd", j18);
                } else {
                    g1Var.a(hashMap, "image2_thumb", j18);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "getCollectFsFutureTask fsName = image2, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return java.lang.Long.valueOf(j17);
    }
}
