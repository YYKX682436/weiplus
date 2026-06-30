package yf;

/* loaded from: classes15.dex */
public class p1 {

    /* renamed from: f, reason: collision with root package name */
    public static yf.w f542966f;

    /* renamed from: a, reason: collision with root package name */
    public final yf.p f542967a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f542968b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.x f542969c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f542970d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f542971e;

    static {
        int i17 = yf.w.f543000a;
        f542966f = yf.v.f542998b;
    }

    public p1(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793 livePusherJsAdapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(livePusherJsAdapter, "livePusherJsAdapter");
        yf.q1 q1Var = new yf.q1(livePusherJsAdapter);
        this.f542968b = false;
        this.f542969c = f542966f.mo136760xaf65a0fc();
        this.f542970d = false;
        this.f542971e = false;
        this.f542967a = q1Var;
    }

    public final void a(android.os.Bundle bundle, java.lang.String str, yf.q qVar) {
        if (bundle.containsKey(str)) {
            float f17 = 0.0f;
            float f18 = bundle.getFloat(str, 0.0f);
            if (f18 < 0.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePusherWeEffectJSAdapter", "applyFaceBeautyIfNeed, rate(%f) of %s is illegal", java.lang.Float.valueOf(f18), str);
            } else {
                f17 = f18;
            }
            if (f17 > 1.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePusherWeEffectJSAdapter", "applyFaceBeautyIfNeed, rate(%f) of %s is illegal", java.lang.Float.valueOf(f17), str);
                f17 = 1.0f;
            }
            b();
            this.f542969c.e(qVar, f17);
        }
    }

    public final void b() {
        if (this.f542970d) {
            return;
        }
        yf.q1 q1Var = (yf.q1) this.f542967a;
        q1Var.getClass();
        yf.x videoProcessListener = this.f542969c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoProcessListener, "videoProcessListener");
        q1Var.f542979a.m32035x29bf11ca(videoProcessListener);
        this.f542970d = true;
    }

    public final void c(android.os.Bundle bundle, boolean z17) {
        if (z17 || bundle.keySet().size() != 0) {
            this.f542971e = bundle.getBoolean("customEffect", this.f542971e);
            if (f()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePusherWeEffectJSAdapter", "parseAndApplyParams, useCustomEffect");
                a(bundle, "skinWhiteness", yf.q.SKIN_BRIGHT);
                a(bundle, "skinSmoothness", yf.q.SKIN_SMOOTH);
                a(bundle, "faceThinness", yf.q.FACE_THIN);
                a(bundle, "eyeBigness", yf.q.EYE_BIGGER);
            }
        }
    }

    public final float d(org.json.JSONObject jSONObject, java.lang.String str, float f17) {
        float optDouble = (float) jSONObject.optDouble(str, 1.0d);
        if (optDouble < 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePusherWeEffectJSAdapter", "parseRate, rate(%f) is illegal", java.lang.Float.valueOf(optDouble));
            optDouble = 0.0f;
        }
        if (optDouble <= 1.0f) {
            return optDouble;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePusherWeEffectJSAdapter", "parseRate, rate(%f)  is illegal", java.lang.Float.valueOf(optDouble));
        return 1.0f;
    }

    public final yf.s e(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("stickerType", null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TXLivePusherWeEffectJSAdapter", "parseStickerType, stickerTypeStr is empty");
            return null;
        }
        if (optString.equalsIgnoreCase("back")) {
            return yf.s.STICKER_BACK;
        }
        if (optString.equalsIgnoreCase("front")) {
            return yf.s.STICKER_FRONT;
        }
        if (optString.equalsIgnoreCase("2d")) {
            return yf.s.STICKER_2D;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TXLivePusherWeEffectJSAdapter", "parseStickerType, stickerTypeStr: ".concat(optString));
        return null;
    }

    public final boolean f() {
        return this.f542971e && this.f542969c.mo136758x7d80d2b7();
    }
}
