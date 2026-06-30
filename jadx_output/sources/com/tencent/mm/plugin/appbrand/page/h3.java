package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class h3 extends com.tencent.mm.plugin.appbrand.page.d3 {
    public h3(com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.util.List list) {
        super(n7Var, list, true);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d3
    public void e(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super.e(k0Var);
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86513f;
        android.content.Context f147807d = v5Var.getF147807d();
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = v5Var instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) v5Var : null;
        if (f147807d == null || n7Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageActionSheetWC", "trySupportRecentForward, context or pageViewWC is null");
        } else {
            new com.tencent.mm.plugin.appbrand.page.ue(f147807d, n7Var, k0Var, this);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d3
    public void f(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        int i17;
        int i18;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86513f;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        if (n7Var.getRuntime().q2()) {
            k0Var.T1 = n7Var.k2() || n7Var.S();
            k0Var.X1 = n7Var.k2() || n7Var.S();
        } else {
            k0Var.T1 = n7Var.k2();
            k0Var.X1 = n7Var.k2();
        }
        k0Var.p(new com.tencent.mm.plugin.appbrand.page.e3(this, n7Var));
        k0Var.C = new com.tencent.mm.plugin.appbrand.page.f3(this, n7Var);
        k0Var.f211892z = new com.tencent.mm.plugin.appbrand.page.g3(this, n7Var);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var2 = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        mi1.f a17 = mi1.c.a(n7Var2.getRuntime());
        boolean e17 = com.tencent.mm.plugin.appbrand.menu.l0.e(n7Var2);
        if (n7Var2.getRuntime().u0().g()) {
            i17 = 2;
        } else {
            com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) n7Var2.t3();
            i17 = o6Var.q2() ? false : n7Var2.Y1().startsWith(o6Var.m0().b()) ? 1 : 0;
        }
        int ordinal = com.tencent.mm.plugin.appbrand.menu.i.d(n7Var2, n7Var2.getF147807d()).ordinal();
        int i19 = ordinal != 0 ? ordinal != 2 ? 1 : 0 : 2;
        if (a17.j() == 1) {
            i18 = 1;
        } else {
            i18 = 3;
            if (a17.j() != 3) {
                i18 = a17.j() == 2 ? 2 : 0;
            }
        }
        boolean d17 = com.tencent.mm.plugin.appbrand.menu.n0.d(n7Var2);
        int i27 = ti1.c.a(n7Var2.getRuntime()) ? 1 : 2;
        com.tencent.mm.plugin.appbrand.menu.v0 v0Var = com.tencent.mm.plugin.appbrand.menu.v0.SHOW_CLICKABLE;
        com.tencent.mm.plugin.appbrand.o6 runtime = n7Var2.getRuntime();
        int b17 = (runtime == null || (E0 = runtime.E0()) == null) ? 0 : k91.a.b(k91.a.f305524h, E0, 0, 2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MenuDelegate_TradeComplaint", "getState, controlByte: " + b17);
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var2.getAppId(), n7Var2.X1(), 28, java.lang.String.format(java.util.Locale.US, "%d_%d_%d_%d_%d_%d_%d_%d", java.lang.Integer.valueOf(e17 ? 1 : 0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d17 ? 1 : 0), 1, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(v0Var == (b17 == 1 ? v0Var : com.tencent.mm.plugin.appbrand.menu.v0.HIDDEN) ? 1 : 0)), com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
