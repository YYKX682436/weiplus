package im1;

/* loaded from: classes15.dex */
public final class f extends im1.a {

    /* renamed from: a, reason: collision with root package name */
    public float f373715a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f373716b = -1;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f373717c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373718d;

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObj, "jsonObj");
        org.json.JSONObject optJSONObject = jsonObj.optJSONObject("params");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlattenEyeShadowInfo", "fromJson, paramsJsonObj is null");
            return this;
        }
        this.f373715a = (float) optJSONObject.optDouble("alpha", -1.0d);
        this.f373716b = optJSONObject.optInt("blend_mode", -1);
        java.lang.String optString = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f373717c = optString;
        this.f373718d = optJSONObject.optString("shimmer_position", null);
        return this;
    }

    @Override // im1.a, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("alpha", java.lang.Float.valueOf(this.f373715a));
        jSONObject.put("blend_mode", this.f373716b);
        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f373717c);
        java.lang.String str = this.f373718d;
        if (str != null) {
            jSONObject.put("shimmer_position", str);
        }
        jSONObject.put("eyeshadow_type", this.f373718d != null ? 1 : 0);
        b17.put("params", jSONObject);
        return b17;
    }

    @Override // im1.a
    public java.lang.String c() {
        return "EyeShadowV2";
    }
}
