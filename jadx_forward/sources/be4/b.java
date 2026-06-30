package be4;

/* loaded from: classes4.dex */
public class b implements lt3.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f101089a;

    /* renamed from: b, reason: collision with root package name */
    public r45.hi0 f101090b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.C16989x37a4afe8 f101091c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f101092d;

    /* renamed from: e, reason: collision with root package name */
    public final be4.a f101093e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f101094f = true;

    public b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, be4.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVLogHelper", "SnsFakeVLogHelper");
        this.f101089a = abstractActivityC21394xb3d2c0cf;
        this.f101093e = aVar;
    }

    @Override // lt3.f
    public void a(java.lang.String str, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVLogHelper", "onFinish,success:%b taskId:%s", java.lang.Boolean.valueOf(z17), str);
        if (str == null || !str.equals(this.f101092d)) {
            str2 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
        } else {
            this.f101094f = true;
            lt3.e.f402742a.c(7, this);
            dw3.c0 c0Var = dw3.c0.f325715a;
            if (c16991x15ced046 != null && c16991x15ced046.f237193d.booleanValue() && gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true)) {
                ((ku5.t0) ku5.t0.f394148d).h(new dw3.w(c16991x15ced046), "mux_save_work");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6 i6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6) this.f101093e;
            i6Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            i6Var.f250105k = c16991x15ced046.f237194e;
            i6Var.f250103j = c16991x15ced046.f237195f;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = i6Var.f251490c;
            abstractActivityC21394xb3d2c0cf.getIntent().putExtra("KSightThumbPath", i6Var.f250103j);
            abstractActivityC21394xb3d2c0cf.getIntent().putExtra("KSightPath", i6Var.f250105k);
            i6Var.f250107l = com.p314xaae8f345.mm.vfs.w6.p(c16991x15ced046.f237194e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = i6Var.f250090J;
            if (u3Var == null || !u3Var.isShowing()) {
                str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                str4 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
            } else {
                i6Var.f250090J.dismiss();
                str4 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
                str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                i6Var.c(i6Var.f250093c0, i6Var.f250094d0, i6Var.f250095e0, i6Var.f250096f0, i6Var.f250098g0, i6Var.f250100h0, i6Var.f250102i0, i6Var.f250104j0, i6Var.f250106k0, i6Var.f250108l0, i6Var.f250110m0, i6Var.f250112n0, i6Var.f250114o0, i6Var.f250116p0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", str3);
            str2 = str4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", str2);
    }

    @Override // lt3.f
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInit", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVLogHelper", "onInit, taskId:%s", str);
        java.lang.String str2 = lt3.n.f402793a.b(str).t0().f463905o;
        lt3.v.f402810a.b();
        this.f101092d = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInit", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
    }

    @Override // lt3.f
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onWait", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVLogHelper", "onWait, taskId:%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onWait", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
    }

    @Override // lt3.f
    public void d(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRun", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVLogHelper", "onRun, taskId:%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRun", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
    }
}
