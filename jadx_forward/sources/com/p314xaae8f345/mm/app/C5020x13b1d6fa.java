package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.SupportProfile */
/* loaded from: classes12.dex */
public class C5020x13b1d6fa extends yo.d {
    @Override // yo.d
    public void a() {
        bm5.f1.a();
        com.p314xaae8f345.mm.app.C5020x13b1d6fa.class.getClassLoader();
        com.p314xaae8f345.mm.app.i4.a(new com.p314xaae8f345.mm.app.z6(this));
        com.p314xaae8f345.mm.p642xad8b531f.a3 a3Var = new com.p314xaae8f345.mm.p642xad8b531f.a3(com.p314xaae8f345.mm.p642xad8b531f.s.b(this.f545579a.getBaseContext()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z17 = x51.o1.f533575a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.display_msgstate"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.network.force_touch"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.crashIsExit"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.album_show_info"), false);
        x51.o1.f533575a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.location_help"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.force_soso"), false);
        x51.o1.f533579c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        x51.o1.f533581d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        x51.o1.f533585f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.filterfpnp"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.testForPull"), false);
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(a3Var.b(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        x51.o1.f533583e = j17;
        if (j17 != 4 && j17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SetupSupportDebugger", "cdn thread num " + x51.o1.f533583e);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.forcex5webview"), false);
        java.lang.String c17 = a3Var.c(".com.tencent.mm.debug.jsapi.permission");
        if (c17 == null) {
            c17 = "";
        }
        x51.o1.f533593m = c17;
        try {
            int intValue = java.lang.Integer.decode(a3Var.c(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            java.lang.String c18 = a3Var.c(".com.tencent.mm.debug.log.setapilevel");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c18)) {
                wo.q.f529313a = "android-" + c18;
                wo.q.f529317e = "android-" + c18;
                wo.q.f529318f = "" + c18;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274506a = c18;
                int i17 = o45.wf.f424556a;
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            o45.wf.f424561f = java.lang.Integer.decode(a3Var.c(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            a3Var.f145134a.f145095a = java.lang.Integer.decode(a3Var.c(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (java.lang.Exception unused4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        try {
            boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(a3Var.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f394813a = m17;
            kx3.a.f394814b = m18;
        } catch (java.lang.Exception unused5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SetupSupportDebugger", "no debugger was got");
        }
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37512x13c589e0();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(this.f545579a.getBaseContext());
        ((hd0.e) ((id0.e) i95.n0.c(id0.e.class))).getClass();
        s65.d1 d1Var = s65.c1.f484971a;
    }
}
