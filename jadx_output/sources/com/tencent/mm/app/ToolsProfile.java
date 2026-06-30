package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class ToolsProfile extends yo.d {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f53286c = bm5.f1.a();

    /* renamed from: b, reason: collision with root package name */
    public int f53287b = 0;

    @Override // yo.d
    public void a() {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.app.ToolsProfile.class.getClassLoader();
        com.tencent.mm.app.i4.a(new com.tencent.mm.app.b7(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.ToolsProfileTest", f53286c);
        com.tencent.mm.booter.b3 b3Var = new com.tencent.mm.booter.b3(com.tencent.mm.booter.s.b(this.f464046a.getBaseContext()));
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z17 = x51.o1.f452042a;
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.display_msgstate"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.network.force_touch"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.crashIsExit"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.album_show_info"), false);
        x51.o1.f452042a = com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.location_help"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.force_soso"), false);
        x51.o1.f452046c = com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        x51.o1.f452048d = com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        x51.o1.f452052f = com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.filterfpnp"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.testForPull"), false);
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1(b3Var.b(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        x51.o1.f452050e = j17;
        if (j17 != 4 && j17 > 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ToolDebugger", "cdn thread num " + x51.o1.f452050e);
        }
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        try {
            int intValue = java.lang.Integer.decode(b3Var.c(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            java.lang.String c17 = b3Var.c(".com.tencent.mm.debug.log.setapilevel");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                wo.q.f447780a = "android-" + c17;
                wo.q.f447784e = "android-" + c17;
                wo.q.f447785f = "" + c17;
                com.tencent.mm.sdk.platformtools.s9.f192973a = c17;
                int i17 = o45.wf.f343023a;
            }
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            o45.wf.f343028f = java.lang.Integer.decode(b3Var.c(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            b3Var.f63601a.f63562a = java.lang.Integer.decode(b3Var.c(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (java.lang.Exception unused4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m18 = com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f313280a = m17;
            kx3.a.f313281b = m18;
        } catch (java.lang.Exception unused5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        java.lang.String c18 = b3Var.c(".com.tencent.mm.debug.jsapi.permission");
        if (c18 == null) {
            c18 = "";
        }
        x51.o1.f452060m = c18;
        java.lang.String c19 = b3Var.c(".com.tencent.mm.debug.generalcontrol.permission");
        if (c19 == null) {
            c19 = "";
        }
        x51.o1.f452061n = c19;
        x51.o1.f452062o = com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.skiploadurlcheck"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(b3Var.a(".com.tencent.mm.debug.forcex5webview"), false);
        com.tencent.mm.app.c0.a(((km0.c) gm0.j1.p().a()).f308989c);
        com.tencent.mars.WeChatMars.loadDependentLibraries();
        com.tencent.mars.xlog.Log.i("MicroMsg.ToolsProfile", "mars2 start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.tencent.mars.MarsContext.getContext().getNativeHandle()));
        com.tencent.mars.app.AppManager appManager = new com.tencent.mars.app.AppManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.app.AppManager.class, appManager);
        appManager.setCallback(new com.tencent.mars.mm.AppManagerCallback(com.tencent.mm.sdk.platformtools.x2.f193071a));
        com.tencent.mars.xlog.Log.i("MicroMsg.ToolsProfile", "mars2 end process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.tencent.mars.MarsContext.getContext().getNativeHandle()));
        com.tencent.mm.feature.app.extension.t0.f65024d = com.tencent.mm.ui.MMActivity.initLanguage(this.f464046a.getBaseContext());
        if (fp.h.c(14)) {
            com.tencent.mm.sdk.platformtools.i.a().registerActivityLifecycleCallbacks(new com.tencent.mm.app.c7(this));
        }
        if (com.tencent.mm.sdk.platformtools.x2.s()) {
            try {
                com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a.c().a();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbPlayerInitLogic", "resetPreloadData");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ThumbPlayerInitLogic", e17, "", new java.lang.Object[0]);
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.s()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProcessStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
            com.tencent.mars.xlog.Log.i("AdToolsProcessPreloader", "onProcessStart");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadAdLandingPagesProxy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
            try {
                if (com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isConnected()) {
                    com.tencent.mars.xlog.Log.i("AdToolsProcessPreloader", "AdLandingPagesProxy connected already");
                } else {
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().connect(new o54.m(java.lang.System.currentTimeMillis()));
                }
            } catch (java.lang.Throwable unused6) {
                com.tencent.mars.xlog.Log.e("AdToolsProcessPreloader", "preloadAdLandingPagesProxy");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadAdLandingPagesProxy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProcessStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
        }
    }

    public java.lang.String toString() {
        return f53286c;
    }
}
