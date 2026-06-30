package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class j0 extends nh1.a {
    public j0() {
        super(11);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        if (((com.tencent.mm.plugin.appbrand.page.n7) v5Var).getRuntime().l2().f87790f != 1023) {
            g4Var.h(this.f337084a, context.getString(com.tencent.mm.R.string.f490279qj), com.tencent.mm.R.raw.appbrand_menu_send_to_desktop, 0);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = n7Var.getRuntime().u0();
        java.lang.String str2 = u07.f47278x;
        if (context == null || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_SendToDesktop", "performItemClick failed, context or username is null or nil.");
            return;
        }
        if (!n7Var.isRunning() || n7Var.getRuntime().L0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_SendToDesktop", "performItemClick failed, pageView destroyed");
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) n7Var.b(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class);
        com.tencent.mm.plugin.appbrand.t9 t9Var = new com.tencent.mm.plugin.appbrand.t9(u07.f47279x0, appBrandSysConfigWC.Z, u07.f77279e, appBrandSysConfigWC.f305842e, str2);
        boolean z17 = com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().getBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", false);
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        com.tencent.mm.plugin.appbrand.menu.g0 g0Var = new com.tencent.mm.plugin.appbrand.menu.g0(this);
        ((zd0.e) hVar).getClass();
        android.util.Pair j17 = xp1.d.j(context, str, z17, true, g0Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15782, j17.second, 0, str);
        int i17 = appBrandSysConfigWC.f305852r.f75399d;
        int intValue = ((java.lang.Integer) j17.first).intValue();
        int intValue2 = ((java.lang.Integer) j17.second).intValue();
        com.tencent.mm.plugin.appbrand.u9.f(context, t9Var, i17);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.menu.h0(this, new java.util.concurrent.atomic.AtomicBoolean(false), context, t9Var, i17, intValue, intValue2, z17));
        com.tencent.mm.plugin.appbrand.report.v0.e(str, n7Var.X1(), 14, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
