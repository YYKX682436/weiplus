package ny4;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1 f422998a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f422999b = new java.lang.Object();

    public g() {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.c0.i("MODEL_OCR_DET", "MODEL_OCR_REC_MODEL", "MODEL_OCR_REC_MAP"));
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f432221a;
        if (s3Var.a(arrayList)) {
            return;
        }
        s3Var.c(arrayList);
    }

    public final float a(java.nio.Buffer dataBuffer, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataBuffer, "dataBuffer");
        synchronized (this.f422999b) {
            com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1 c27770xd9cf22d1 = this.f422998a;
            if (c27770xd9cf22d1 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatPicTranslateManager", "applyReq but handler is null");
                return 0.0f;
            }
            android.graphics.PointF[][] m119938xb06a26a3 = c27770xd9cf22d1.m119938xb06a26a3(new com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46(i17, i18, 3, (java.nio.ByteBuffer) dataBuffer));
            boolean z17 = true;
            if (m119938xb06a26a3 != null) {
                if (!(m119938xb06a26a3.length == 0)) {
                    z17 = false;
                }
            }
            return z17 ? 0.0f : 1.0f;
        }
    }

    public final int b() {
        if (this.f422998a != null) {
            return 0;
        }
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f432221a;
        java.lang.String b17 = s3Var.b("MODEL_OCR_DET");
        java.lang.String b18 = s3Var.b("MODEL_OCR_REC_MODEL");
        java.lang.String b19 = s3Var.b("MODEL_OCR_REC_MAP");
        if (!(b17 == null || b17.length() == 0)) {
            if (!(b18 == null || b18.length() == 0)) {
                if (!(b19 == null || b19.length() == 0)) {
                    synchronized (this.f422999b) {
                        com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69 = new com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69();
                        c27754x55cfdd69.f60662xa9bc687f = true;
                        this.f422998a = new com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1(b17, b18, b19, c27754x55cfdd69);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatPicTranslateManager", "init WeVision2.TextRecoginzer success");
                    }
                    return 0;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatPicTranslateManager", "ocr model is null");
        return 1;
    }
}
