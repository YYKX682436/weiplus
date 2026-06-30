package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class SupportProfile extends yo.d {
    @Override // yo.d
    public void a() {
        bm5.f1.a();
        com.tencent.mm.app.SupportProfile.class.getClassLoader();
        com.tencent.mm.app.i4.a(new com.tencent.mm.app.z6(this));
        com.tencent.mm.booter.a3 a3Var = new com.tencent.mm.booter.a3(com.tencent.mm.booter.s.b(this.f464046a.getBaseContext()));
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z17 = x51.o1.f452042a;
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.display_msgstate"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.network.force_touch"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.crashIsExit"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.album_show_info"), false);
        x51.o1.f452042a = com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.location_help"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.force_soso"), false);
        x51.o1.f452046c = com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        x51.o1.f452048d = com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        x51.o1.f452052f = com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.filterfpnp"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.testForPull"), false);
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1(a3Var.b(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        x51.o1.f452050e = j17;
        if (j17 != 4 && j17 > 0) {
            com.tencent.mars.xlog.Log.e("SetupSupportDebugger", "cdn thread num " + x51.o1.f452050e);
        }
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.forcex5webview"), false);
        java.lang.String c17 = a3Var.c(".com.tencent.mm.debug.jsapi.permission");
        if (c17 == null) {
            c17 = "";
        }
        x51.o1.f452060m = c17;
        try {
            int intValue = java.lang.Integer.decode(a3Var.c(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            java.lang.String c18 = a3Var.c(".com.tencent.mm.debug.log.setapilevel");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c18)) {
                wo.q.f447780a = "android-" + c18;
                wo.q.f447784e = "android-" + c18;
                wo.q.f447785f = "" + c18;
                com.tencent.mm.sdk.platformtools.s9.f192973a = c18;
                int i17 = o45.wf.f343023a;
            }
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            o45.wf.f343028f = java.lang.Integer.decode(a3Var.c(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            a3Var.f63601a.f63562a = java.lang.Integer.decode(a3Var.c(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (java.lang.Exception unused4) {
            com.tencent.mars.xlog.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m18 = com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(a3Var.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f313280a = m17;
            kx3.a.f313281b = m18;
        } catch (java.lang.Exception unused5) {
            com.tencent.mars.xlog.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        com.tencent.mars.WeChatMars.loadDependentLibraries();
        com.tencent.mm.ui.MMActivity.initLanguage(this.f464046a.getBaseContext());
        ((hd0.e) ((id0.e) i95.n0.c(id0.e.class))).getClass();
        s65.d1 d1Var = s65.c1.f403438a;
    }
}
