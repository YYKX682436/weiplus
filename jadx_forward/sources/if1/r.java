package if1;

/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public int f372626a;

    /* renamed from: b, reason: collision with root package name */
    public float f372627b;

    /* renamed from: c, reason: collision with root package name */
    public float f372628c;

    public r(int i17, float f17, float f18) {
        this.f372626a = i17;
        this.f372627b = f17;
        this.f372628c = f18;
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(dm.i4.f66865x76d1ec5a, this.f372626a);
            jSONObject.put("x", this.f372627b / ik1.w.f());
            jSONObject.put("y", this.f372628c / ik1.w.f());
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: toString */
    public java.lang.String m135183x9616526c() {
        return a().toString();
    }
}
