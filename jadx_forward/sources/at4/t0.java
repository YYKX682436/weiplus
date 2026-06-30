package at4;

/* loaded from: classes9.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f95500a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f95501b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f95502c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f95503d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95504e;

    /* renamed from: f, reason: collision with root package name */
    public int f95505f;

    public void a(org.json.JSONObject jSONObject) {
        jSONObject.optString("tinyapp_name");
        this.f95500a = jSONObject.optString("tinyapp_logo");
        this.f95501b = jSONObject.optString("tinyapp_desc");
        this.f95502c = jSONObject.optString("tinyapp_username");
        this.f95503d = jSONObject.optString("tinyapp_path");
        this.f95504e = jSONObject.optString("activity_tinyapp_btn_text");
        this.f95505f = jSONObject.optInt("tinyapp_version", 0);
    }
}
