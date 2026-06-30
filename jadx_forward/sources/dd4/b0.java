package dd4;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dd4.e0 f310505d;

    public b0(dd4.e0 e0Var) {
        this.f310505d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc4.p a17;
        r45.jj4 R0;
        dd4.e0 e0Var = this.f310505d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$reportExportAsync$1");
        try {
            a17 = dd4.e0.a(e0Var);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FlexibleShareHelper", th6, "[-] Exception was thrown when report.", new java.lang.Object[0]);
        }
        if (a17 != null && (R0 = a17.R0()) != null) {
            com.p314xaae8f345.mm.app.t0 t0Var = new com.p314xaae8f345.mm.app.t0(3, com.p314xaae8f345.mm.app.s0.VIDEO, null);
            xc4.p a18 = dd4.e0.a(e0Var);
            t0Var.f135312b = a18 != null ? a18.m125483x6bf53a6c() : null;
            xc4.p a19 = dd4.e0.a(e0Var);
            t0Var.f135314d = a19 != null ? a19.y0() : 0L;
            t0Var.f135316f = R0.f459391g;
            r45.lj4 lj4Var = R0.f459398p;
            t0Var.f135317g = (int) lj4Var.f461053d;
            t0Var.f135318h = (int) lj4Var.f461054e;
            t0Var.f135319i = R0.f459393i;
            t0Var.f135320j = (int) R0.R;
            t0Var.f135323m = R0.M;
            com.p314xaae8f345.mm.app.u0.a(t0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$reportExportAsync$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$reportExportAsync$1");
    }
}
