package t85;

/* loaded from: classes10.dex */
public final class k extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public double[] f498018a = new double[0];

    /* renamed from: b, reason: collision with root package name */
    public double[] f498019b = new double[0];

    /* renamed from: c, reason: collision with root package name */
    public double[] f498020c = new double[0];

    /* renamed from: d, reason: collision with root package name */
    public double[] f498021d = new double[0];

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObj, "jsonObj");
        org.json.JSONArray optJSONArray = jsonObj.optJSONArray("trans_0");
        this.f498018a = optJSONArray != null ? t85.b.a(optJSONArray) : this.f498018a;
        org.json.JSONArray optJSONArray2 = jsonObj.optJSONArray("trans_1");
        this.f498019b = optJSONArray2 != null ? t85.b.a(optJSONArray2) : this.f498019b;
        org.json.JSONArray optJSONArray3 = jsonObj.optJSONArray("trans_2");
        this.f498020c = optJSONArray3 != null ? t85.b.a(optJSONArray3) : this.f498020c;
        org.json.JSONArray optJSONArray4 = jsonObj.optJSONArray("trans_3");
        this.f498021d = optJSONArray4 != null ? t85.b.a(optJSONArray4) : this.f498021d;
        return this;
    }

    @Override // t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("trans_0", t85.b.b(this.f498018a));
        jSONObject.put("trans_1", t85.b.b(this.f498019b));
        jSONObject.put("trans_2", t85.b.b(this.f498020c));
        jSONObject.put("trans_3", t85.b.b(this.f498021d));
        return jSONObject;
    }
}
