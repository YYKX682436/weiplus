package bm5;

/* loaded from: classes14.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bm5.t0 f104271a = new bm5.t0();

    public final boolean a() {
        boolean z17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Global_ShowImageQuery_Int, 0) == 1;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_image_query_entrance_v2, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryEntranceConfig", "getImageQueryEntranceConfig >> result: " + fj6 + ", repairConfig: " + z17);
        return fj6 || z17;
    }

    public final boolean b() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.a3 a3Var = p05.a3.f431972a;
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f432221a;
        java.lang.String g17 = a3Var.g("MODEL_CHAT_CLS_MODEL");
        boolean z17 = !(g17 == null || g17.length() == 0);
        java.lang.String g18 = a3Var.g("MODEL_CHAT_CLS_MAP");
        boolean z18 = !(g18 == null || g18.length() == 0);
        java.lang.String g19 = a3Var.g("MODEL_FACE_FEATURE");
        boolean z19 = !(g19 == null || g19.length() == 0);
        java.lang.String b17 = s3Var.b("MODEL_OCR_REC_MODEL");
        boolean z27 = !(b17 == null || b17.length() == 0);
        java.lang.String b18 = s3Var.b("MODEL_OCR_DET");
        boolean z28 = !(b18 == null || b18.length() == 0);
        java.lang.String b19 = s3Var.b("MODEL_OCR_REC_MAP");
        boolean z29 = !(b19 == null || b19.length() == 0);
        java.lang.String g27 = a3Var.g("MODEL_MOBILE_POLICY_DB");
        boolean z37 = !(g27 == null || g27.length() == 0);
        java.lang.String g28 = a3Var.g("MODEL_FACE_DETECT");
        boolean z38 = !(g28 == null || g28.length() == 0);
        java.lang.String g29 = a3Var.g("MODEL_FACE_ALIGNMENT");
        boolean z39 = !(g29 == null || g29.length() == 0);
        java.lang.String g37 = a3Var.g("MODEL_FACE3D_XBIN");
        boolean z47 = !(g37 == null || g37.length() == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryEntranceConfig", "checkModelFileExit >> clsExit: " + z17 + ", clsClazzNameExit: " + z17 + ", faceExit: " + z19 + ", ocrExit: " + z27 + ", facePoliticalDbExit: " + z37 + ", ocrDetExit: " + z28 + ", ocrRecExit: " + z29 + ", detectModelPathExit: " + z38 + ", alignModelPathExit: " + z39 + ", coreModelPathExit: " + z47);
        return z17 && z18 && z19 && z27 && z28 && z29 && z38 && z37 && z39 && z47;
    }
}
