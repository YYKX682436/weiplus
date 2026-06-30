package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class b extends nh1.a {
    public b() {
        super(13);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        g4Var.g(13, context.getString(com.tencent.mm.R.string.a2t), com.tencent.mm.R.raw.icons_outlined_mini_program2);
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = n7Var.getRuntime().u0();
        if (E0 == null) {
            return;
        }
        java.lang.String str2 = n7Var.getRuntime().l2() != null ? n7Var.getRuntime().u0().f47276v : "";
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(n7Var.getAppId(), new ld1.c(n7Var));
        k91.z5 z5Var = new k91.z5();
        z5Var.f305863a = E0.f305842e;
        z5Var.f305872j = 3;
        z5Var.f305873k = n7Var.a2() != null ? n7Var.X1() : "";
        z5Var.f305870h = E0.f305852r.f75399d;
        z5Var.f305869g = E0.f305852r.pkgVersion;
        com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.V6(context, u07.f47278x, 3, str2, true, z5Var.a(), null, com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.a(context));
        com.tencent.mm.plugin.appbrand.report.v0.e(str, n7Var.X1(), 6, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
