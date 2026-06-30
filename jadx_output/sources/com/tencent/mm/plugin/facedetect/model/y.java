package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public enum y {
    INSTANCE;


    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f100041f = new com.tencent.mm.sdk.platformtools.n3("face_process");

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService f100043d = null;

    y() {
    }

    public boolean d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectManager", "face detect isCheckDynCfg: %b", java.lang.Boolean.valueOf(z17));
        boolean hasSystemFeature = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().hasSystemFeature("android.hardware.camera.front");
        boolean c17 = com.tencent.mm.plugin.facedetect.model.s0.c(true);
        com.tencent.mm.plugin.facedetect.e.wi();
        boolean z18 = !com.tencent.mm.ui.bk.A() || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_flash_enable_pad, true);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectManager", "hy: hardware support: %b, isModelFileValid: %b, isPluginFaceEnabled: %b", java.lang.Boolean.valueOf(hasSystemFeature), java.lang.Boolean.valueOf(c17), java.lang.Boolean.TRUE);
            return c17 && hasSystemFeature && z18;
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BioSigFaceEntry"), 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectManager", "hy: face config support: %b, hardware support: %b, isModelFileValid: %b, isPluginFaceEnabled: %b", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(hasSystemFeature), java.lang.Boolean.valueOf(c17), java.lang.Boolean.TRUE);
        return z19 && hasSystemFeature && c17 && z18;
    }
}
