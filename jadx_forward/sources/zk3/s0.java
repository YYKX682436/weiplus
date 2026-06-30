package zk3;

/* loaded from: classes8.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f555032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f555033e;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, zk3.w0 w0Var) {
        this.f555032d = c16601x7ed0e40c;
        this.f555033e = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        r45.lr4 v07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f555032d;
        java.lang.String str = null;
        android.graphics.Bitmap a17 = al3.b.f87382a.a(u0Var.c(c16601x7ed0e40c), null);
        java.lang.Integer valueOf = a17 != null ? java.lang.Integer.valueOf(a17.getWidth()) : null;
        java.lang.Integer valueOf2 = a17 != null ? java.lang.Integer.valueOf(a17.getHeight()) : null;
        zk3.w0 w0Var = this.f555033e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f555032d;
        if (valueOf == null || valueOf2 == null) {
            f0Var = null;
        } else {
            pm0.v.X(new zk3.q0(w0Var, valueOf.intValue(), c16601x7ed0e40c2, valueOf2.intValue(), a17));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSnapshotUIC, error! id:");
            sb6.append(c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null);
            sb6.append(", title:");
            if (c16601x7ed0e40c != null && (v07 = c16601x7ed0e40c.v0()) != null) {
                str = v07.m75945x2fec8307(1);
            }
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotMultiTaskUIC", sb6.toString());
            pm0.v.X(new zk3.r0(this.f555033e));
        }
    }
}
