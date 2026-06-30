package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes14.dex */
public enum y {
    INSTANCE;


    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f181574f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("face_process");

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6 f181576d = null;

    y() {
    }

    public boolean d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectManager", "face detect isCheckDynCfg: %b", java.lang.Boolean.valueOf(z17));
        boolean hasSystemFeature = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.camera.front");
        boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.c(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e.wi();
        boolean z18 = !com.p314xaae8f345.mm.ui.bk.A() || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_flash_enable_pad, true);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectManager", "hy: hardware support: %b, isModelFileValid: %b, isPluginFaceEnabled: %b", java.lang.Boolean.valueOf(hasSystemFeature), java.lang.Boolean.valueOf(c17), java.lang.Boolean.TRUE);
            return c17 && hasSystemFeature && z18;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BioSigFaceEntry"), 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectManager", "hy: face config support: %b, hardware support: %b, isModelFileValid: %b, isPluginFaceEnabled: %b", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(hasSystemFeature), java.lang.Boolean.valueOf(c17), java.lang.Boolean.TRUE);
        return z19 && hasSystemFeature && c17 && z18;
    }
}
