package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.ExDeviceProfile */
/* loaded from: classes12.dex */
public class C4995xf29cac60 extends yo.d {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f134752b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":exdevice";

    @Override // yo.d
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExDeviceProfile", "exdevice profile oncreate");
        com.p314xaae8f345.mm.p642xad8b531f.y2 y2Var = new com.p314xaae8f345.mm.p642xad8b531f.y2(com.p314xaae8f345.mm.p642xad8b531f.s.b(this.f545579a.getBaseContext()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z17 = x51.o1.f533575a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.display_msgstate"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.network.force_touch"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.crashIsExit"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.album_show_info"), false);
        x51.o1.f533575a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.location_help"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.force_soso"), false);
        x51.o1.f533579c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        x51.o1.f533581d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        x51.o1.f533585f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.filterfpnp"), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.testForPull"), false);
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(y2Var.b(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        x51.o1.f533583e = j17;
        if (j17 != 4 && j17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdDebugger", "cdn thread num " + x51.o1.f533583e);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        try {
            int intValue = java.lang.Integer.decode(y2Var.c(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        try {
            java.lang.String c17 = y2Var.c(".com.tencent.mm.debug.log.setapilevel");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                wo.q.f529313a = "android-" + c17;
                wo.q.f529317e = "android-" + c17;
                wo.q.f529318f = "" + c17;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274506a = c17;
                int i17 = o45.wf.f424556a;
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        try {
            o45.wf.f424561f = java.lang.Integer.decode(y2Var.c(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        try {
            boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f394813a = m17;
            kx3.a.f394814b = m18;
        } catch (java.lang.Exception unused4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        java.lang.String c18 = y2Var.c(".com.tencent.mm.debug.jsapi.permission");
        if (c18 == null) {
            c18 = "";
        }
        x51.o1.f533593m = c18;
        java.lang.String c19 = y2Var.c(".com.tencent.mm.debug.generalcontrol.permission");
        x51.o1.f533594n = c19 != null ? c19 : "";
        x51.o1.f533595o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(y2Var.a(".com.tencent.mm.debug.skiploadurlcheck"), false);
    }

    /* renamed from: toString */
    public java.lang.String m42948x9616526c() {
        return f134752b;
    }
}
