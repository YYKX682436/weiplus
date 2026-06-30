package pw4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f440245a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f440246b;

    /* renamed from: c, reason: collision with root package name */
    public float f440247c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f440248d;

    /* renamed from: f, reason: collision with root package name */
    public float f440250f;

    /* renamed from: i, reason: collision with root package name */
    public float f440253i;

    /* renamed from: j, reason: collision with root package name */
    public float f440254j;

    /* renamed from: k, reason: collision with root package name */
    public float f440255k;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f440257m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Float f440258n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Float f440259o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Long f440260p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f440261q;

    /* renamed from: s, reason: collision with root package name */
    public java.util.Map f440263s;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f440249e = "";

    /* renamed from: g, reason: collision with root package name */
    public int f440251g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f440252h = -1;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f440256l = "";

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f440262r = pw4.b.f440244d;

    @android.webkit.JavascriptInterface
    /* renamed from: getEnv */
    public final java.lang.String m159085xb58839b7() {
        jz5.f0 f0Var;
        java.util.Set<java.util.Map.Entry> entrySet;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("immersiveMode", this.f440245a);
        jSONObject.put("normalTopInset", java.lang.Float.valueOf(this.f440247c));
        jSONObject.put("childView", this.f440246b);
        int i17 = this.f440251g;
        if (i17 >= 0 && this.f440252h >= 0) {
            jSONObject.put("fontLevel", i17);
            jSONObject.put("fontScale", this.f440252h);
        }
        java.lang.String str = this.f440249e;
        if (!(str == null || r26.n0.N(str))) {
            jSONObject.put("extData", this.f440249e);
        }
        float f17 = this.f440250f;
        if (f17 > 0.0f) {
            jSONObject.put("heightPercent", java.lang.Float.valueOf(f17));
        }
        jSONObject.put("isPreload", this.f440261q);
        jSONObject.put("maxHeight", java.lang.Float.valueOf(this.f440254j));
        jSONObject.put("peekHeight", java.lang.Float.valueOf(this.f440253i));
        jSONObject.put("currHeight", java.lang.Float.valueOf(this.f440255k));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f440256l)) {
            jSONObject.put("jumperExtInfo", this.f440256l);
        }
        java.lang.Integer num = this.f440257m;
        if (num != null) {
            jSONObject.put("bizSessionId", num);
        }
        if (this.f440258n != null && this.f440259o != null && this.f440260p != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("latitude", this.f440258n);
            jSONObject2.put("longitude", this.f440259o);
            jSONObject2.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, this.f440260p);
            jSONObject.put("position", jSONObject2);
        }
        jSONObject.put("enableAndroidEdge2Edge", ((java.lang.Boolean) this.f440262r.mo152xb9724478()).booleanValue());
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.util.Map map = this.f440263s;
            if (map == null || (entrySet = map.entrySet()) == null) {
                f0Var = null;
            } else {
                for (java.util.Map.Entry entry : entrySet) {
                    if (((java.lang.CharSequence) entry.getKey()).length() > 0) {
                        jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                    }
                }
                f0Var = jz5.f0.f384359a;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewEnv", "getEnv ".concat(jSONObject3));
        return jSONObject3;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getLayoutScale */
    public final float m159086x510bcf0a() {
        return j65.f.g() / 400;
    }
}
