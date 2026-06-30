package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.AppBrandProfile */
/* loaded from: classes12.dex */
public class C4992x6ead7cc3 extends yo.d {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f134750b = "";

    @Override // yo.d
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProfile", "AppBrandProfile create");
        f134750b = bm5.f1.a();
        com.p314xaae8f345.mm.app.C4992x6ead7cc3.class.getClassLoader();
        com.p314xaae8f345.mm.app.i4.a(new com.p314xaae8f345.mm.app.e(this));
        com.p314xaae8f345.mm.p642xad8b531f.w2 w2Var = new com.p314xaae8f345.mm.p642xad8b531f.w2(com.p314xaae8f345.mm.p642xad8b531f.s.b(this.f545579a.getBaseContext()));
        f134750b.replace(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand", "");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z17 = x51.o1.f533575a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.display_msgstate"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.network.force_touch"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.crashIsExit"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.album_show_info"), false);
        x51.o1.f533575a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.location_help"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.force_soso"), false);
        x51.o1.f533579c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        x51.o1.f533581d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        x51.o1.f533585f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.filterfpnp"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.testForPull"), false);
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(w2Var.b(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        x51.o1.f533583e = j17;
        if (j17 != 4 && j17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBDebugger", "cdn thread num " + x51.o1.f533583e);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.forcex5webview"), false);
        java.lang.String c17 = w2Var.c(".com.tencent.mm.debug.jsapi.permission");
        if (c17 == null) {
            c17 = "";
        }
        x51.o1.f533593m = c17;
        boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.appbrand.comm_lib_coverage_collect"), false);
        x51.o1.f533596p = m17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBDebugger", "Test.appbrandCommLibCoverageCollect=%b", java.lang.Boolean.valueOf(m17));
        try {
            int intValue = java.lang.Integer.decode(w2Var.c(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            java.lang.String c18 = w2Var.c(".com.tencent.mm.debug.log.setapilevel");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c18)) {
                wo.q.f529313a = "android-" + c18;
                wo.q.f529317e = "android-" + c18;
                wo.q.f529318f = "" + c18;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274506a = c18;
                int i17 = o45.wf.f424556a;
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            o45.wf.f424561f = java.lang.Integer.decode(w2Var.c(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            w2Var.f145134a.f145095a = java.lang.Integer.decode(w2Var.c(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (java.lang.Exception unused4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        try {
            boolean m18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(w2Var.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f394813a = m18;
            kx3.a.f394814b = m19;
        } catch (java.lang.Exception unused5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBDebugger", "no debugger was got");
        }
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37512x13c589e0();
    }
}
