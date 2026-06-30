package ob1;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f425532a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f425533b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f425534c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f425535d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f425536e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f425537f;

    /* renamed from: g, reason: collision with root package name */
    public int f425538g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f425539h;

    public org.json.JSONObject a() {
        if (this.f425539h == null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            this.f425539h = jSONObject;
            jSONObject.put("uuid", this.f425532a);
            this.f425539h.put("handle", this.f425538g);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("read", this.f425533b);
            jSONObject2.put("write", this.f425534c || this.f425535d);
            jSONObject2.put("notify", this.f425536e);
            jSONObject2.put("indicate", this.f425537f);
            jSONObject2.put("writeNoResponse", this.f425535d);
            jSONObject2.put("writeDefault", this.f425534c);
            this.f425539h.put("properties", jSONObject2);
        }
        return this.f425539h;
    }
}
