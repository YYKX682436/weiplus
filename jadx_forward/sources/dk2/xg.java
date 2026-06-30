package dk2;

/* loaded from: classes3.dex */
public final class xg {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f315890a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f315891b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 f315892c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f315893d;

    public xg(java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        str2 = (i17 & 2) != 0 ? null : str2;
        runnable = (i17 & 4) != 0 ? null : runnable;
        this.f315890a = str;
        this.f315891b = true;
        dk2.wg wgVar = new dk2.wg(this, runnable);
        this.f315892c = wgVar;
        this.f315893d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(wgVar) : new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(str2, wgVar);
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f315890a);
        sb6.append(" finishTask isQuit:");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f315893d;
        sb6.append(n3Var.mo50287xb9a7fe99());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleTaskLooper", sb6.toString());
        n3Var.mo50305x3d8a09a2(2);
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleTaskLooper", this.f315890a + " removeTask");
        this.f315893d.mo50302x6b17ad39(null);
        this.f315891b = true;
    }

    public final void c(java.lang.Long l17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f315890a);
        sb6.append(" tryRunTask isQuit:");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f315893d;
        sb6.append(n3Var.mo50287xb9a7fe99());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleTaskLooper", sb6.toString());
        n3Var.mo50292x733c63a2(1, l17).sendToTarget();
    }
}
