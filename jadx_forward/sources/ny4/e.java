package ny4;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f422990a;

    /* renamed from: b, reason: collision with root package name */
    public long f422991b;

    /* renamed from: c, reason: collision with root package name */
    public long f422992c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1 f422993d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27768xea664901 f422994e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f422995f = new java.lang.Object();

    public e() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.e5.a();
    }

    public final java.lang.String a(java.nio.Buffer dataBuffer, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataBuffer, "dataBuffer");
        synchronized (this.f422995f) {
            com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1 c27770xd9cf22d1 = this.f422993d;
            if (c27770xd9cf22d1 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "aplyOcrReq >> no init: return");
                return null;
            }
            java.lang.String m119941x9256cadb = c27770xd9cf22d1.m119941x9256cadb(new com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46(i17, i18, 3, (java.nio.ByteBuffer) dataBuffer));
            g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "WeVision2.TextRecognizer recognize >> result: return");
            return m119941x9256cadb;
        }
    }

    public final java.lang.String b(android.graphics.PointF[][] pointFArr) {
        if (pointFArr == null) {
            return "";
        }
        if (pointFArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"data\": [");
        int length = pointFArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            sb6.append("[");
            android.graphics.PointF[] pointFArr2 = pointFArr[i17];
            int length2 = pointFArr2.length;
            for (int i18 = 0; i18 < length2; i18++) {
                android.graphics.PointF pointF = pointFArr2[i18];
                sb6.append("[");
                sb6.append(pointF.x);
                sb6.append(", ");
                sb6.append(pointF.y);
                sb6.append("]");
                if (i18 < pointFArr2.length - 1) {
                    sb6.append(", ");
                }
            }
            sb6.append("]");
            if (i17 < pointFArr.length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append("]}");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "destroyOcrEnv");
        synchronized (this.f422995f) {
            com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1 c27770xd9cf22d1 = this.f422993d;
            if (c27770xd9cf22d1 != null) {
                c27770xd9cf22d1.m119937x5cd39ffa();
            }
            this.f422993d = null;
            com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27768xea664901 c27768xea664901 = this.f422994e;
            if (c27768xea664901 != null) {
                c27768xea664901.m119926x5cd39ffa();
            }
            this.f422994e = null;
        }
    }

    public final java.lang.String d(int i17, java.lang.String langCode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(langCode, "langCode");
        long j17 = this.f422990a;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatClsManager", "getLabelNameByLabelId >> weChatClsHandle no init");
            return "";
        }
        java.lang.String m83704xc2128c21 = com.p314xaae8f345.mm.p2825x7e128009.C22967xee5e9be4.m83704xc2128c21(j17, i17, langCode);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "labelId: " + i17 + " labelName: " + m83704xc2128c21 + ", lan: " + langCode);
        return m83704xc2128c21 == null ? "" : m83704xc2128c21;
    }

    public final boolean e(boolean z17) {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f432221a;
        java.lang.String b17 = s3Var.b("MODEL_OCR_DET");
        java.lang.String b18 = s3Var.b("MODEL_OCR_REC_MODEL");
        java.lang.String b19 = s3Var.b("MODEL_OCR_REC_MAP");
        if (!(b17 == null || b17.length() == 0)) {
            if (!(b18 == null || b18.length() == 0)) {
                if (!(b19 == null || b19.length() == 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "ocr in initOcrEnv allowNPU val false");
                    ((com.p314xaae8f345.mm.p2818xd0d82df3.a) ((ft.g4) i95.n0.c(ft.g4.class))).getClass();
                    java.lang.String c17 = com.p314xaae8f345.mm.p2818xd0d82df3.v.f295912a.c();
                    synchronized (this.f422995f) {
                        com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69 = new com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69();
                        c27754x55cfdd69.f60662xa9bc687f = true;
                        c27754x55cfdd69.f60666x70e62183 = false;
                        c27754x55cfdd69.f60663xdefef6c7 = c17;
                        this.f422993d = new com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1(b17, b18, b19, c27754x55cfdd69);
                        this.f422994e = new com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27768xea664901(10000);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "init WeVision2.TextRecoginzer success");
                    }
                    return true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatClsManager", "ocr model is null");
        h();
        return false;
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "release");
        synchronized (this.f422995f) {
            com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1 c27770xd9cf22d1 = this.f422993d;
            if (c27770xd9cf22d1 != null) {
                c27770xd9cf22d1.m119937x5cd39ffa();
            }
            this.f422993d = null;
            com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27768xea664901 c27768xea664901 = this.f422994e;
            if (c27768xea664901 != null) {
                c27768xea664901.m119926x5cd39ffa();
            }
            this.f422994e = null;
        }
        long j17 = this.f422990a;
        if (j17 != 0) {
            com.p314xaae8f345.mm.p2825x7e128009.C22967xee5e9be4.m83708x46fb07b9(j17);
        }
        if (this.f422992c != 0) {
            com.p314xaae8f345.mm.p2825x7e128009.C22971x477b7d0f.m83771x9080e00a(this.f422991b);
            com.p314xaae8f345.mm.p2825x7e128009.C22971x477b7d0f.m83775x46fb07b9(this.f422992c, this.f422991b);
        }
        this.f422992c = 0L;
        this.f422990a = 0L;
        this.f422991b = 0L;
    }

    public final boolean g() {
        java.lang.String str;
        com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27768xea664901 c27768xea664901 = this.f422994e;
        if (c27768xea664901 != null) {
            str = c27768xea664901.m119927x9bd346f5();
            if (!(str == null || str.length() == 0)) {
                str = "Cpu,INT8," + str + ",2";
            }
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager.MobileOCRReport", "Nothing to report");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager.MobileOCRReport", "report MobileOCR data using protocal 28950, data: " + str);
            jx3.f.INSTANCE.mo68478xbd3cda5f((int) 28950, str);
        }
        return true;
    }

    public final void h() {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.c0.i("MODEL_OCR_DET", "MODEL_OCR_REC_MODEL", "MODEL_OCR_REC_MAP"));
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f432221a;
        if (s3Var.a(arrayList)) {
            return;
        }
        s3Var.c(arrayList);
    }
}
