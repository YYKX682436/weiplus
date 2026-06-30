package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class t0 extends nh1.a {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f85990c;

    /* renamed from: b, reason: collision with root package name */
    public com.huawei.easygo.sdk.EasyGo f85991b;

    public t0() {
        super(2);
        this.f85991b = null;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        if (f85990c == null) {
            try {
                if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_fold_appbrand_split_screen", "1", false, true), 1) > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_splitScreen", "isOpenSplitScreen!!");
                    f85990c = java.lang.Boolean.TRUE;
                } else {
                    f85990c = java.lang.Boolean.FALSE;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MenuDelegate_splitScreen", e17, "isOpenSplitScreen", new java.lang.Object[0]);
                f85990c = java.lang.Boolean.FALSE;
            }
        }
        if (f85990c.booleanValue()) {
            if (this.f85991b == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f85991b = new com.huawei.easygo.sdk.EasyGo(applicationContext);
            }
            this.f85991b.init(new java.lang.String[]{"magicwindow"});
            if (n7Var.getRuntime().u0().k()) {
                return;
            }
            if (com.tencent.mm.ui.bk.N(n7Var.v1().getTaskId()) || com.tencent.mm.ui.bk.w0()) {
                boolean v07 = com.tencent.mm.ui.bk.v0();
                int i17 = this.f337084a;
                if (v07 && com.tencent.mm.ui.bk.N(n7Var.v1().getTaskId())) {
                    if (com.tencent.mm.ui.bk.z(n7Var.v1().getTaskId())) {
                        g4Var.g(i17, context.getString(com.tencent.mm.R.string.b9c), com.tencent.mm.R.raw.icons_outlined_merge);
                    } else {
                        g4Var.g(i17, context.getString(com.tencent.mm.R.string.jjg), com.tencent.mm.R.raw.icons_outlined_sperated);
                    }
                }
                if (com.tencent.mm.ui.bk.w0() && com.tencent.mm.ui.bk.y()) {
                    if (com.tencent.mm.ui.fj.b(n7Var.v1())) {
                        g4Var.g(i17, context.getString(com.tencent.mm.R.string.b9c), com.tencent.mm.R.raw.icons_outlined_merge);
                    } else {
                        g4Var.g(i17, context.getString(com.tencent.mm.R.string.jjg), com.tencent.mm.R.raw.icons_outlined_sperated);
                    }
                }
            }
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        android.app.Activity v17 = ((com.tencent.mm.plugin.appbrand.page.n7) v5Var).v1();
        if (v17 == null) {
            return;
        }
        com.tencent.mm.ui.ee.f(v17.getTaskId(), null);
        if ((v17 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) && com.tencent.mm.ui.bk.w0()) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = (com.tencent.mm.plugin.appbrand.ui.AppBrandUI) v17;
            appBrandUI.f89422z = true;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.tencent.mm.plugin.appbrand.app.r0.f75243h;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "markActivityRecreateByConfigurationChanged %s", appBrandUI);
            com.tencent.mm.plugin.appbrand.app.r0.f75244i.f75246e.set(true);
        }
        com.tencent.mm.ui.fj.f(v17, false);
    }
}
