package com.tencent.mm.plugin.appbrand.ar;

/* loaded from: classes5.dex */
public class MagicARJNIHelper {
    public static final java.lang.String TAG = "MagicARJNIHelper";

    public static int getARImplType() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wa_ar_impl_type_android, 0);
    }

    public static java.lang.String getBodyConfig_pbinPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_BODY_POSE");
    }

    public static java.lang.String getBodyConfig_pose3dPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_BODY_POSE3D");
    }

    public static java.lang.String getDepthConfig_modelPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_DEPTH");
    }

    public static java.lang.String getDepthConfig_settingPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_DEPTH_SETTING");
    }

    public static java.lang.String getFaceConfig_alignModelBinPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_FACE_ALIGNMENT");
    }

    public static java.lang.String getFaceConfig_detModelBinPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_FACE_DETECT");
    }

    public static java.lang.String getFaceConfig_tdmmBinPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_FACE3D_XBIN");
    }

    public static java.lang.String getFaceConfig_tdmmParamPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_FACE3D_PARAMS");
    }

    public static java.lang.String getHandConfig_modelPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_HAND");
    }

    public static java.lang.String getHandConfig_pose3dPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_HAND_POSE3D");
    }

    public static java.lang.String getOCRConfig_certModelPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.s3.f350688a.b("MODEL_OCR_IDCARD");
    }

    public static java.lang.String getOCRConfig_detModelPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.s3.f350688a.b("MODEL_OCR_DET");
    }

    public static java.lang.String getOCRConfig_labelPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.s3.f350688a.b("MODEL_OCR_REC_MAP");
    }

    public static java.lang.String getOCRConfig_recModelPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.s3.f350688a.b("MODEL_OCR_REC_MODEL");
    }

    public static java.lang.String getOSDConfig_modelBackBonePath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_OSD_BACKBONE");
    }

    public static java.lang.String getOSDConfig_modelHeadPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_OSD_HEAD");
    }

    public static java.lang.String getOSDConfig_modelPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_OSD");
    }

    public static java.lang.String getShoeConfig_legsegPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_LEGSEGMENT");
    }

    public static java.lang.String getShoeConfig_pbinPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_SHOE");
    }

    public static java.lang.String getVIOConfigPath() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        return p05.a3.f350439a.g("MODEL_VIO_CONFIG");
    }

    public static boolean hasCameraPermission() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        return j35.u.h(context, "android.permission.CAMERA");
    }

    public static void reportIDKey(int i17, int i18, int i19, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(i17, i18, i19, z17);
    }

    public static void reportKV(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
    }
}
