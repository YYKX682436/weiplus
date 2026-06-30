package com.tencent.mm.modelstat;

/* loaded from: classes.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f71588d;

    public u(com.tencent.mm.modelstat.t tVar, long j17) {
        this.f71588d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(gm0.j1.u().h());
        long j17 = this.f71588d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", java.lang.Long.valueOf(com.tencent.mm.modelstat.t.l(r6Var, j17)), gm0.j1.u().h());
        com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", java.lang.Long.valueOf(com.tencent.mm.modelstat.t.l(new com.tencent.mm.vfs.r6(lp0.b.D()), j17)), lp0.b.D());
        com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", java.lang.Long.valueOf(com.tencent.mm.modelstat.t.l(new com.tencent.mm.vfs.r6(lp0.b.D()), j17)), lp0.b.D());
        com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", java.lang.Long.valueOf(com.tencent.mm.modelstat.t.l(new com.tencent.mm.vfs.r6(gm0.j1.u().d()), j17)), gm0.j1.u().d());
        java.lang.String str = com.tencent.mm.storage.v3.f196273a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", java.lang.Long.valueOf(com.tencent.mm.modelstat.t.l(new com.tencent.mm.vfs.r6(str), j17)), str);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "clearfile finish %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
