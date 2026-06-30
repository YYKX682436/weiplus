package aw1;

/* loaded from: classes12.dex */
public final class b1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96033d;

    public b1(java.lang.String str) {
        this.f96033d = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCollectFsFutureTask fsName = ");
        java.lang.String str = this.f96033d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportStorageDetailedTask", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.vfs.q2 b17 = ((com.p314xaae8f345.mm.vfs.r5) com.p314xaae8f345.mm.vfs.a3.f294314a.a()).b(str);
        java.lang.Iterable p17 = b17 != null ? com.p314xaae8f345.mm.vfs.e8.p(b17, "", false, null) : null;
        long j17 = 0;
        if (p17 != null) {
            java.util.Iterator it = ((pm5.b) p17).iterator();
            while (true) {
                pm5.c cVar = (pm5.c) it;
                if (!cVar.hasNext()) {
                    break;
                }
                j17 += ((com.p314xaae8f345.mm.vfs.x1) cVar.next()).f294767d;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportStorageDetailedTask", "getCollectFsFutureTask fsName = " + str + ", duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return java.lang.Long.valueOf(j17);
    }
}
