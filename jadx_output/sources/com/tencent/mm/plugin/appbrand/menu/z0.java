package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public abstract class z0 {
    public static void a(com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        com.tencent.mm.plugin.appbrand.menu.y0 y0Var = new com.tencent.mm.plugin.appbrand.menu.y0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, E0.f305841d);
        hashMap.put("desc", "");
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, n7Var.Y1());
        of1.w1 s37 = n7Var.s3();
        hashMap.put("webViewUrl", s37 != null ? s37.getWebView().getUrl() : null);
        hashMap.put("imgUrl", E0.f305843f);
        hashMap.put("mode", com.tencent.mm.plugin.appbrand.menu.l1.c(u0Var, "enable_share_with_share_ticket", false) ? "withShareTicket" : "common");
        hashMap.put("dynamic", java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.menu.l1.c(u0Var, "enable_share_dynamic", false)));
        hashMap.put(ya.b.ORIGIN, "weixin");
        com.tencent.mm.plugin.appbrand.menu.l1.d(u0Var, "user_clicked_share_btn", true);
        y0Var.v(n7Var.getRuntime().C0(), n7Var.getComponentId());
        y0Var.t(hashMap);
        y0Var.m();
    }

    public static void b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.menu.u0 u0Var, java.lang.Runnable runnable) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        android.content.SharedPreferences b17 = com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(context, "pref_appbrand_" + n7Var.getRuntime().u0().f47279x0, 4);
        if (E0.f305852r.f75399d == 1) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) b17;
            if (!o4Var.contains("has_share_dev_tips")) {
                o4Var.putLong("has_share_dev_tips", java.lang.System.currentTimeMillis()).commit();
                db5.e1.o(context, com.tencent.mm.R.string.f490136lx, com.tencent.mm.R.string.f490573yv, false, new com.tencent.mm.plugin.appbrand.menu.w0(runnable, n7Var, u0Var));
                return;
            }
        }
        if (E0.f305852r.f75399d == 2) {
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = (com.tencent.mm.sdk.platformtools.o4) b17;
            if (!o4Var2.contains("has_share_beta_tips")) {
                o4Var2.putLong("has_share_beta_tips", java.lang.System.currentTimeMillis()).commit();
                db5.e1.o(context, com.tencent.mm.R.string.f490135lw, com.tencent.mm.R.string.f490573yv, false, new com.tencent.mm.plugin.appbrand.menu.x0(runnable, n7Var, u0Var));
                return;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        a(n7Var, u0Var);
    }
}
