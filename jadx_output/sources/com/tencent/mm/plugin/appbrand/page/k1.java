package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.AppCommentModule f86809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.rd5 f86811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86812g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.z1 f86813h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.fe0 f86814i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.l1 f86815m;

    public k1(com.tencent.mm.plugin.appbrand.page.l1 l1Var, com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule, java.lang.String str, r45.rd5 rd5Var, java.lang.String str2, r45.z1 z1Var, r45.fe0 fe0Var) {
        this.f86815m = l1Var;
        this.f86809d = appCommentModule;
        this.f86810e = str;
        this.f86811f = rd5Var;
        this.f86812g = str2;
        this.f86813h = z1Var;
        this.f86814i = fe0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = true;
        com.tencent.mm.plugin.appbrand.page.l1 l1Var = this.f86815m;
        com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule = this.f86809d;
        if (appCommentModule != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, onGetTradeComment");
            com.tencent.mm.plugin.appbrand.page.o1 o1Var = l1Var.f86845c;
            o1Var.f86942c = appCommentModule;
            ((com.tencent.mm.plugin.appbrand.page.p0) l1Var.f86844b).b(appCommentModule, true, o1Var.f86943d);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, onGetScore");
            com.tencent.mm.plugin.appbrand.page.o1 o1Var2 = l1Var.f86845c;
            java.lang.String str = this.f86810e;
            o1Var2.f86941b = str;
            ((com.tencent.mm.plugin.appbrand.page.p0) l1Var.f86844b).a(str);
        }
        r45.rd5 rd5Var = this.f86811f;
        if (rd5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, onGetKoubeiInfo");
            com.tencent.mm.plugin.appbrand.page.p0 p0Var = (com.tencent.mm.plugin.appbrand.page.p0) l1Var.f86844b;
            p0Var.getClass();
            p0Var.f86983e.post(new com.tencent.mm.plugin.appbrand.page.n0(p0Var, rd5Var));
        }
        java.lang.String str2 = this.f86812g;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            l1Var.f86845c.f86944e = str2;
            android.widget.TextView textView = ((com.tencent.mm.plugin.appbrand.page.p0) l1Var.f86844b).f86982d;
            textView.setText(str2);
            textView.setVisibility(0);
        }
        r45.z1 z1Var = this.f86813h;
        if (z1Var != null) {
            com.tencent.mm.plugin.appbrand.page.p0 p0Var2 = (com.tencent.mm.plugin.appbrand.page.p0) l1Var.f86844b;
            p0Var2.getClass();
            p0Var2.f86983e.post(new com.tencent.mm.plugin.appbrand.page.o0(p0Var2, z1Var));
        }
        r45.fe0 fe0Var = this.f86814i;
        if (fe0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "finalDeveloperServiceInfo is null");
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = ((com.tencent.mm.plugin.appbrand.page.p0) l1Var.f86844b).f86980b;
        com.tencent.mm.plugin.appbrand.page.n7 N2 = o6Var.N2();
        if (N2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMenuHeader", "onDeveloperService pageViewWC is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.menu.u0 H1 = N2.H1(40);
        boolean a17 = com.tencent.mm.plugin.appbrand.kf.a(o6Var);
        boolean z18 = fe0Var == null || !fe0Var.f374250d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeader", "onDeveloperService hide:%b， isSinglePageMode:%b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(a17));
        if (!z18 && !a17) {
            z17 = false;
        }
        if (H1 == null) {
            if (z17) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeader", "doAddMenuInfo developer service menu");
            com.tencent.mm.plugin.appbrand.menu.l1.a(N2.G1(), 40, false, false);
            return;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeader", "removeMenuItem developer service menu");
            java.util.List<com.tencent.mm.plugin.appbrand.menu.u0> G1 = N2.G1();
            if (G1 == null || G1.isEmpty()) {
                return;
            }
            for (int i17 = 0; i17 < G1.size(); i17++) {
                com.tencent.mm.plugin.appbrand.menu.u0 u0Var = G1.get(i17);
                if (u0Var != null && u0Var.f85993a == H1.f85993a) {
                    G1.remove(i17);
                    return;
                }
            }
        }
    }
}
