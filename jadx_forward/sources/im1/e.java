package im1;

/* loaded from: classes15.dex */
public final class e extends im1.a {

    /* renamed from: b, reason: collision with root package name */
    public int f373711b;

    /* renamed from: a, reason: collision with root package name */
    public float f373710a = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public int f373712c = -1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373713d = "";

    /* renamed from: e, reason: collision with root package name */
    public float f373714e = -1.0f;

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObj, "jsonObj");
        org.json.JSONObject optJSONObject = jsonObj.optJSONObject("params");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlattenEyeBrowInfo", "fromJson, paramsJsonObj is null");
            return this;
        }
        this.f373710a = (float) optJSONObject.optDouble("alpha", -1.0d);
        this.f373711b = optJSONObject.optInt("face_model", 0);
        this.f373712c = optJSONObject.optInt("blend_mode", -1);
        java.lang.String optString = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f373713d = optString;
        this.f373714e = (float) optJSONObject.optDouble("shrink_rate", -1.0d);
        return this;
    }

    @Override // im1.a, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("alpha", java.lang.Float.valueOf(this.f373710a));
        jSONObject.put("face_model", this.f373711b);
        jSONObject.put("blend_mode", this.f373712c);
        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f373713d);
        jSONObject.put("shrink_rate", java.lang.Float.valueOf(this.f373714e));
        b17.put("params", jSONObject);
        return b17;
    }

    @Override // im1.a
    public java.lang.String c() {
        return "EyeBrow";
    }
}
