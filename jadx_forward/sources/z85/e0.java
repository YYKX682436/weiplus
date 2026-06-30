package z85;

/* loaded from: classes12.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f552326a;

    /* renamed from: b, reason: collision with root package name */
    public int f552327b;

    /* renamed from: c, reason: collision with root package name */
    public long f552328c;

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("key", this.f552326a);
            jSONObject.put("use_count", this.f552327b);
            jSONObject.put("last_time", this.f552328c);
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
