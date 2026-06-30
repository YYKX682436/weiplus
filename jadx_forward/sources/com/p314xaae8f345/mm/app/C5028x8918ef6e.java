package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.ToolsProfile */
/* loaded from: classes12.dex */
public final class C5028x8918ef6e extends yo.d {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f134819c = bm5.f1.a();

    /* renamed from: b, reason: collision with root package name */
    public int f134820b = 0;

    @Override // yo.d
    public void a() {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.app.C5028x8918ef6e.class.getClassLoader();
        com.p314xaae8f345.mm.app.i4.a(new com.p314xaae8f345.mm.app.b7(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProfileTest", f134819c);
        com.p314xaae8f345.mm.p642xad8b531f.b3 b3Var = new com.p314xaae8f345.mm.p642xad8b531f.b3(com.p314xaae8f345.mm.p642xad8b531f.s.b(this.f545579a.getBaseContext()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z17 = x51.o1.f533575a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.display_msgstate"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.network.force_touch"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.crashIsExit"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.album_show_info"), false);
        x51.o1.f533575a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.location_help"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.force_soso"), false);
        x51.o1.f533579c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        x51.o1.f533581d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        x51.o1.f533585f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.filterfpnp"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.testForPull"), false);
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(b3Var.b(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        x51.o1.f533583e = j17;
        if (j17 != 4 && j17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ToolDebugger", "cdn thread num " + x51.o1.f533583e);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        try {
            int intValue = java.lang.Integer.decode(b3Var.c(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            java.lang.String c17 = b3Var.c(".com.tencent.mm.debug.log.setapilevel");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                wo.q.f529313a = "android-" + c17;
                wo.q.f529317e = "android-" + c17;
                wo.q.f529318f = "" + c17;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274506a = c17;
                int i17 = o45.wf.f424556a;
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            o45.wf.f424561f = java.lang.Integer.decode(b3Var.c(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            b3Var.f145134a.f145095a = java.lang.Integer.decode(b3Var.c(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (java.lang.Exception unused4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        try {
            boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f394813a = m17;
            kx3.a.f394814b = m18;
        } catch (java.lang.Exception unused5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolDebugger", "no debugger was got");
        }
        java.lang.String c18 = b3Var.c(".com.tencent.mm.debug.jsapi.permission");
        if (c18 == null) {
            c18 = "";
        }
        x51.o1.f533593m = c18;
        java.lang.String c19 = b3Var.c(".com.tencent.mm.debug.generalcontrol.permission");
        if (c19 == null) {
            c19 = "";
        }
        x51.o1.f533594n = c19;
        x51.o1.f533595o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.skiploadurlcheck"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b3Var.a(".com.tencent.mm.debug.forcex5webview"), false);
        com.p314xaae8f345.mm.app.c0.a(((km0.c) gm0.j1.p().a()).f390522c);
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37512x13c589e0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProfile", "mars2 start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37620xdc4f8f95()));
        com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c c4440xec1b926c = new com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
        com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37617xa38667cc(com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.class, c4440xec1b926c);
        c4440xec1b926c.m37605x6c4ebec7(new com.p314xaae8f345.p542x3306d5.mm.C4562x2edeead1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProfile", "mars2 end process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37620xdc4f8f95()));
        com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.t0.f146557d = com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(this.f545579a.getBaseContext());
        if (fp.h.c(14)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().registerActivityLifecycleCallbacks(new com.p314xaae8f345.mm.app.c7(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.f172433a.c().a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbPlayerInitLogic", "resetPreloadData");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ThumbPlayerInitLogic", e17, "", new java.lang.Object[0]);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProcessStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdToolsProcessPreloader", "onProcessStart");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadAdLandingPagesProxy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
            try {
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69905x23b734ff()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdToolsProcessPreloader", "AdLandingPagesProxy connected already");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69788x38b478ea(new o54.m(java.lang.System.currentTimeMillis()));
                }
            } catch (java.lang.Throwable unused6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdToolsProcessPreloader", "preloadAdLandingPagesProxy");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadAdLandingPagesProxy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProcessStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader");
        }
    }

    /* renamed from: toString */
    public java.lang.String m42982x9616526c() {
        return f134819c;
    }
}
