package aw1;

/* loaded from: classes12.dex */
public final class b1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14500d;

    public b1(java.lang.String str) {
        this.f14500d = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCollectFsFutureTask fsName = ");
        java.lang.String str = this.f14500d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.vfs.q2 b17 = ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).b(str);
        java.lang.Iterable p17 = b17 != null ? com.tencent.mm.vfs.e8.p(b17, "", false, null) : null;
        long j17 = 0;
        if (p17 != null) {
            java.util.Iterator it = ((pm5.b) p17).iterator();
            while (true) {
                pm5.c cVar = (pm5.c) it;
                if (!cVar.hasNext()) {
                    break;
                }
                j17 += ((com.tencent.mm.vfs.x1) cVar.next()).f213234d;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "getCollectFsFutureTask fsName = " + str + ", duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return java.lang.Long.valueOf(j17);
    }
}
