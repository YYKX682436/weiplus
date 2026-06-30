package im1;

/* loaded from: classes15.dex */
public final class h extends im1.a {

    /* renamed from: a, reason: collision with root package name */
    public float f373722a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f373723b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f373724c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f373725d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f373726e;

    /* renamed from: f, reason: collision with root package name */
    public int f373727f;

    /* renamed from: g, reason: collision with root package name */
    public int f373728g;

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObj, "jsonObj");
        org.json.JSONObject optJSONObject = jsonObj.optJSONObject("params");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlattenLipStickInfo", "fromJson, paramsJsonObj is null");
            return this;
        }
        this.f373722a = (float) optJSONObject.optDouble("alpha", -1.0d);
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("color");
        if (optJSONArray == null || 1 > optJSONArray.length()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlattenLipStickInfo", "fromJson, colorJsonArr2d is illegal");
        } else {
            org.json.JSONArray jSONArray = optJSONArray.getJSONArray(0);
            if (jSONArray == null || 3 != optJSONArray.length()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlattenLipStickInfo", "fromJson, colorJsonArr is illegal");
            } else {
                this.f373723b = jSONArray.optInt(0, -1);
                this.f373724c = jSONArray.optInt(1, -1);
                this.f373725d = jSONArray.optInt(2, -1);
            }
        }
        this.f373726e = optJSONObject.optInt("lipstick_type", 0);
        this.f373727f = optJSONObject.optInt("face_model", 0);
        this.f373728g = optJSONObject.optInt("mouth_shape", 0);
        return this;
    }

    @Override // im1.a, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("alpha", java.lang.Float.valueOf(this.f373722a));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(this.f373723b);
        jSONArray2.put(this.f373724c);
        jSONArray2.put(this.f373725d);
        jSONArray.put(jSONArray2);
        jSONObject.put("color", jSONArray);
        jSONObject.put("lipstick_type", this.f373726e);
        jSONObject.put("face_model", this.f373727f);
        jSONObject.put("mouth_shape", this.f373728g);
        b17.put("params", jSONObject);
        return b17;
    }

    @Override // im1.a
    public java.lang.String c() {
        return "LipStickV2";
    }
}
