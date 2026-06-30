package at4;

/* loaded from: classes9.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f13967a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f13968b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f13969c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f13970d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f13971e;

    /* renamed from: f, reason: collision with root package name */
    public int f13972f;

    public void a(org.json.JSONObject jSONObject) {
        jSONObject.optString("tinyapp_name");
        this.f13967a = jSONObject.optString("tinyapp_logo");
        this.f13968b = jSONObject.optString("tinyapp_desc");
        this.f13969c = jSONObject.optString("tinyapp_username");
        this.f13970d = jSONObject.optString("tinyapp_path");
        this.f13971e = jSONObject.optString("activity_tinyapp_btn_text");
        this.f13972f = jSONObject.optInt("tinyapp_version", 0);
    }
}
