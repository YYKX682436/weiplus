package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class ExDeviceProfile extends yo.d {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f53219b = com.tencent.mm.sdk.platformtools.x2.f193072b + ":exdevice";

    @Override // yo.d
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExDeviceProfile", "exdevice profile oncreate");
        com.tencent.mm.booter.y2 y2Var = new com.tencent.mm.booter.y2(com.tencent.mm.booter.s.b(this.f464046a.getBaseContext()));
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.display_errcode"), false);
        boolean z17 = x51.o1.f452042a;
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.display_msgstate"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.network.force_touch"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.crashIsExit"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.album_show_info"), false);
        x51.o1.f452042a = com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.location_help"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.force_soso"), false);
        x51.o1.f452046c = com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        x51.o1.f452048d = com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        x51.o1.f452052f = com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.filterfpnp"), false);
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.testForPull"), false);
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1(y2Var.b(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        x51.o1.f452050e = j17;
        if (j17 != 4 && j17 > 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdDebugger", "cdn thread num " + x51.o1.f452050e);
        }
        com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        try {
            int intValue = java.lang.Integer.decode(y2Var.c(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        try {
            java.lang.String c17 = y2Var.c(".com.tencent.mm.debug.log.setapilevel");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                wo.q.f447780a = "android-" + c17;
                wo.q.f447784e = "android-" + c17;
                wo.q.f447785f = "" + c17;
                com.tencent.mm.sdk.platformtools.s9.f192973a = c17;
                int i17 = o45.wf.f343023a;
            }
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        try {
            o45.wf.f343028f = java.lang.Integer.decode(y2Var.c(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        try {
            boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m18 = com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f313280a = m17;
            kx3.a.f313281b = m18;
        } catch (java.lang.Exception unused4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdDebugger", "no debugger was got");
        }
        java.lang.String c18 = y2Var.c(".com.tencent.mm.debug.jsapi.permission");
        if (c18 == null) {
            c18 = "";
        }
        x51.o1.f452060m = c18;
        java.lang.String c19 = y2Var.c(".com.tencent.mm.debug.generalcontrol.permission");
        x51.o1.f452061n = c19 != null ? c19 : "";
        x51.o1.f452062o = com.tencent.mm.sdk.platformtools.t8.m1(y2Var.a(".com.tencent.mm.debug.skiploadurlcheck"), false);
    }

    public java.lang.String toString() {
        return f53219b;
    }
}
