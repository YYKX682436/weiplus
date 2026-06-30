package com.p314xaae8f345.mm.p815xbe0af3c9.app;

@j95.b
/* loaded from: classes13.dex */
public class z0 extends i95.w {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2829xfa87f9de.y0.c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebLegacyBootStepFeatureService", "initXWebChildProcessCrashDumpPath");
            vx5.l0.f522913a = new com.p314xaae8f345.mm.p815xbe0af3c9.app.y0();
        }
        com.p314xaae8f345.p3210x3857dc.a3.v(com.p314xaae8f345.mm.ui.bk.C());
        o56.a aVar = o56.a.MEDIA_QUERY_ONLY;
        org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429510j = 1;
        by5.c4.f("XWalkEnvironment", "setForceDarkBehavior, forceDarkBehavior:" + aVar);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f2.f165519a.b() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429511k = true;
            by5.c4.f("XWalkEnvironment", "setV8LiteMode true");
        }
        try {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, getService costTime:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
            if (e0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, IExptService is null");
            } else {
                h62.d dVar = (h62.d) e0Var;
                int Ni = dVar.Ni(e42.d0.clicfg_xweb_debug_check_value, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, clicfg_xweb_debug_check_value:%s", java.lang.Integer.valueOf(Ni));
                if (Ni == 1) {
                    if (dVar.Ni(e42.d0.clicfg_xweb_turnon_local_debug, 0) == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, turnonDebugMode is true");
                        com.p314xaae8f345.p3210x3857dc.t0.f302127a.i(true);
                    }
                    try {
                        int Ni2 = dVar.Ni(e42.d0.clicfg_xweb_mm_webtype, 0);
                        int Ni3 = dVar.Ni(e42.d0.clicfg_xweb_tools_webtype, 0);
                        int Ni4 = dVar.Ni(e42.d0.clicfg_xweb_appbrand_webtype, 0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, moduleToolsType:%s; moduleAppbrandType:%s; moduleMMType:%s", java.lang.Integer.valueOf(Ni3), java.lang.Integer.valueOf(Ni4), java.lang.Integer.valueOf(Ni2));
                        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
                        u0Var.f("mm", com.p314xaae8f345.p3210x3857dc.f1.m120253xcee59d22()[Ni2]);
                        u0Var.f("tools", com.p314xaae8f345.p3210x3857dc.f1.m120253xcee59d22()[Ni3]);
                        u0Var.f("appbrand", com.p314xaae8f345.p3210x3857dc.f1.m120253xcee59d22()[Ni4]);
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XWeb.MM.XWebUtil", "xweb abtest set webview kind error:" + th6);
                    }
                    try {
                        java.lang.String Zi = dVar.Zi(e42.d0.clicfg_xweb_test_url, "", true);
                        if (!android.text.TextUtils.isEmpty(Zi)) {
                            java.lang.String Zi2 = dVar.Zi(e42.d0.clicfg_xweb_test_url_enddate, "", true);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, base config url:%s, date:%s", Zi, Zi2);
                            com.p314xaae8f345.p3210x3857dc.a3.x(Zi, Zi2);
                        }
                        java.lang.String Zi3 = dVar.Zi(e42.d0.clicfg_xweb_test_plugin_url, "", true);
                        if (!android.text.TextUtils.isEmpty(Zi3)) {
                            java.lang.String Zi4 = dVar.Zi(e42.d0.clicfg_xweb_test_plugin_url_enddate, "", true);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebUtil", "checkAbTestConfigs, plugin config url:%s, date:%s", Zi3, Zi4);
                            com.p314xaae8f345.p3210x3857dc.a3.y(Zi3, Zi4);
                        }
                    } catch (java.lang.Throwable th7) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XWeb.MM.XWebUtil", "xweb abtest set config url error:" + th7);
                    }
                }
            }
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XWeb.MM.XWebUtil", "xweb abtest set local debug error:" + th8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            zx5.h.a(!com.p314xaae8f345.p3210x3857dc.b.m().h("disable_auto_check_update", "tools", false));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebLegacyBootStepFeatureService", "process start:WebViewPreloadAndKeepAliveRenderProcessHelper.INSTANCE.preloadAndKeepAlive");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.u0.f264885a.a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebLegacyBootStepFeatureService", "onCreate, process:" + bm5.f1.a() + ", costTime:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
