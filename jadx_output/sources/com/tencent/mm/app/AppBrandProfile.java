package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class AppBrandProfile extends yo.d {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f53217b = "";

    @Override // yo.d
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProfile", "AppBrandProfile create");
        f53217b = bm5.f1.a();
        com.tencent.mm.app.AppBrandProfile.class.getClassLoader();
        com.tencent.mm.app.i4.a(new com.tencent.mm.app.e(this));
        com.tencent.mm.booter.w2 w2Var = new com.tencent.mm.booter.w2(com.tencent.mm.booter.s.b(this.f464046a.getBaseContext()));
        f53217b.replace(com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand", "");
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z17 = x51.o1.f452042a;
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.display_msgstate"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.network.force_touch"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.crashIsExit"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.album_show_info"), false);
        x51.o1.f452042a = com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.location_help"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.force_soso"), false);
        x51.o1.f452046c = com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        x51.o1.f452048d = com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        x51.o1.f452052f = com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.filterfpnp"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.testForPull"), false);
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1(w2Var.b(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        x51.o1.f452050e = j17;
        if (j17 != 4 && j17 > 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBDebugger", "cdn thread num " + x51.o1.f452050e);
        }
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.forcex5webview"), false);
        java.lang.String c17 = w2Var.c(".com.tencent.mm.debug.jsapi.permission");
        if (c17 == null) {
            c17 = "";
        }
        x51.o1.f452060m = c17;
        boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.appbrand.comm_lib_coverage_collect"), false);
        x51.o1.f452063p = m17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBDebugger", "Test.appbrandCommLibCoverageCollect=%b", java.lang.Boolean.valueOf(m17));
        try {
            int intValue = java.lang.Integer.decode(w2Var.c(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            java.lang.String c18 = w2Var.c(".com.tencent.mm.debug.log.setapilevel");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c18)) {
                wo.q.f447780a = "android-" + c18;
                wo.q.f447784e = "android-" + c18;
                wo.q.f447785f = "" + c18;
                com.tencent.mm.sdk.platformtools.s9.f192973a = c18;
                int i17 = o45.wf.f343023a;
            }
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            o45.wf.f343028f = java.lang.Integer.decode(w2Var.c(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            w2Var.f63601a.f63562a = java.lang.Integer.decode(w2Var.c(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (java.lang.Exception unused4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            boolean m18 = com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m19 = com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(w2Var.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f313280a = m18;
            kx3.a.f313281b = m19;
        } catch (java.lang.Exception unused5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        com.tencent.mars.WeChatMars.loadDependentLibraries();
    }
}
