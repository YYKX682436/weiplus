package t85;

/* loaded from: classes10.dex */
public final class e extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public int f497992a;

    /* renamed from: d, reason: collision with root package name */
    public int f497995d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f497996e;

    /* renamed from: b, reason: collision with root package name */
    public int f497993b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f497994c = -1;

    /* renamed from: f, reason: collision with root package name */
    public double[] f497997f = new double[0];

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObj, "jsonObj");
        this.f497992a = jsonObj.optInt("len");
        this.f497993b = jsonObj.optInt("active", this.f497993b);
        this.f497994c = jsonObj.optInt("segtype", this.f497994c);
        this.f497995d = jsonObj.optInt("pendant_type", this.f497995d);
        this.f497996e = jsonObj.optBoolean("adjust", this.f497996e);
        org.json.JSONArray optJSONArray = jsonObj.optJSONArray("pos");
        this.f497997f = optJSONArray != null ? t85.b.a(optJSONArray) : this.f497997f;
        return this;
    }

    @Override // t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("len", this.f497992a);
        jSONObject.put("active", this.f497993b);
        if (this.f497994c >= 0 || this.f497995d == 2) {
            jSONObject.put("segtype", 0);
        }
        double[] dArr = this.f497997f;
        if (!(dArr.length == 0)) {
            jSONObject.put("pos", t85.b.b(dArr));
        }
        int i17 = this.f497995d;
        if (i17 == 1 || i17 == 2) {
            jSONObject.put("adjust", true);
        }
        return jSONObject;
    }
}
