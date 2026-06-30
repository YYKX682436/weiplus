package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class n extends nh1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.menu.e f85985b = new com.tencent.mm.plugin.appbrand.menu.e();

    public n() {
        super(40);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        g4Var.l(this.f337084a, context.getString(com.tencent.mm.R.string.f490641n41), com.tencent.mm.R.raw.app_brand_mennu_develoer_service, false);
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        r45.fe0 fe0Var;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        d(n7Var, "-1", 1);
        java.lang.String appId = n7Var.getAppId();
        java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.page.o1.f86938g;
        synchronized (hashMap) {
            if (hashMap.containsKey(appId)) {
                fe0Var = (r45.fe0) hashMap.get(appId);
            } else {
                com.tencent.mm.plugin.appbrand.page.o1.a(appId);
                fe0Var = null;
            }
        }
        r45.fe0 fe0Var2 = fe0Var;
        if (fe0Var2 == null || !fe0Var2.f374250d) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_DeveloperService", "has entrance");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.f211872n = new com.tencent.mm.plugin.appbrand.menu.k(this, fe0Var2, context);
        k0Var.f211881s = new com.tencent.mm.plugin.appbrand.menu.l(this, fe0Var2, context, n7Var, str, k0Var);
        k0Var.C = new com.tencent.mm.plugin.appbrand.menu.m(this, n7Var);
        k0Var.q(context.getString(com.tencent.mm.R.string.f490641n41), 17);
        k0Var.v();
    }

    public final void d(com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 58, str, com.tencent.mm.sdk.platformtools.t8.i1(), i17, 0);
    }
}
