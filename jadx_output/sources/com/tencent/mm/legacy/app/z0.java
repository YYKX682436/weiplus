package com.tencent.mm.legacy.app;

@j95.b
/* loaded from: classes13.dex */
public class z0 extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.xwebutil.y0.c();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebLegacyBootStepFeatureService", "initXWebChildProcessCrashDumpPath");
            vx5.l0.f441380a = new com.tencent.mm.legacy.app.y0();
        }
        com.tencent.xweb.a3.v(com.tencent.mm.ui.bk.C());
        o56.a aVar = o56.a.MEDIA_QUERY_ONLY;
        org.xwalk.core.XWalkEnvironment.f347977j = 1;
        by5.c4.f("XWalkEnvironment", "setForceDarkBehavior, forceDarkBehavior:" + aVar);
        if (com.tencent.mm.plugin.appbrand.jsruntime.f2.f83986a.b() && !com.tencent.mm.sdk.platformtools.a0.c()) {
            org.xwalk.core.XWalkEnvironment.f347978k = true;
            by5.c4.f("XWalkEnvironment", "setV8LiteMode true");
        }
        try {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, getService costTime:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
            if (e0Var == null) {
                com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, IExptService is null");
            } else {
                h62.d dVar = (h62.d) e0Var;
                int Ni = dVar.Ni(e42.d0.clicfg_xweb_debug_check_value, 0);
                com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, clicfg_xweb_debug_check_value:%s", java.lang.Integer.valueOf(Ni));
                if (Ni == 1) {
                    if (dVar.Ni(e42.d0.clicfg_xweb_turnon_local_debug, 0) == 1) {
                        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, turnonDebugMode is true");
                        com.tencent.xweb.t0.f220594a.i(true);
                    }
                    try {
                        int Ni2 = dVar.Ni(e42.d0.clicfg_xweb_mm_webtype, 0);
                        int Ni3 = dVar.Ni(e42.d0.clicfg_xweb_tools_webtype, 0);
                        int Ni4 = dVar.Ni(e42.d0.clicfg_xweb_appbrand_webtype, 0);
                        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, moduleToolsType:%s; moduleAppbrandType:%s; moduleMMType:%s", java.lang.Integer.valueOf(Ni3), java.lang.Integer.valueOf(Ni4), java.lang.Integer.valueOf(Ni2));
                        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
                        u0Var.f("mm", com.tencent.xweb.f1.values()[Ni2]);
                        u0Var.f("tools", com.tencent.xweb.f1.values()[Ni3]);
                        u0Var.f("appbrand", com.tencent.xweb.f1.values()[Ni4]);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("XWeb.MM.XWebUtil", "xweb abtest set webview kind error:" + th6);
                    }
                    try {
                        java.lang.String Zi = dVar.Zi(e42.d0.clicfg_xweb_test_url, "", true);
                        if (!android.text.TextUtils.isEmpty(Zi)) {
                            java.lang.String Zi2 = dVar.Zi(e42.d0.clicfg_xweb_test_url_enddate, "", true);
                            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, base config url:%s, date:%s", Zi, Zi2);
                            com.tencent.xweb.a3.x(Zi, Zi2);
                        }
                        java.lang.String Zi3 = dVar.Zi(e42.d0.clicfg_xweb_test_plugin_url, "", true);
                        if (!android.text.TextUtils.isEmpty(Zi3)) {
                            java.lang.String Zi4 = dVar.Zi(e42.d0.clicfg_xweb_test_plugin_url_enddate, "", true);
                            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, plugin config url:%s, date:%s", Zi3, Zi4);
                            com.tencent.xweb.a3.y(Zi3, Zi4);
                        }
                    } catch (java.lang.Throwable th7) {
                        com.tencent.mars.xlog.Log.e("XWeb.MM.XWebUtil", "xweb abtest set config url error:" + th7);
                    }
                }
            }
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.e("XWeb.MM.XWebUtil", "xweb abtest set local debug error:" + th8);
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            zx5.h.a(!com.tencent.xweb.b.m().h("disable_auto_check_update", "tools", false));
        }
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebLegacyBootStepFeatureService", "process start:WebViewPreloadAndKeepAliveRenderProcessHelper.INSTANCE.preloadAndKeepAlive");
            com.tencent.mm.plugin.webview.modeltools.u0.f183352a.a();
        }
        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebLegacyBootStepFeatureService", "onCreate, process:" + bm5.f1.a() + ", costTime:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
