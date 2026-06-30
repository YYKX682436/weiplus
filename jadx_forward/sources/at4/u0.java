package at4;

/* loaded from: classes9.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public long f95508a;

    /* renamed from: b, reason: collision with root package name */
    public long f95509b;

    /* renamed from: c, reason: collision with root package name */
    public long f95510c;

    /* renamed from: d, reason: collision with root package name */
    public int f95511d;

    /* renamed from: e, reason: collision with root package name */
    public int f95512e;

    /* renamed from: f, reason: collision with root package name */
    public long f95513f;

    public void a(org.json.JSONObject jSONObject) {
        this.f95508a = jSONObject.optLong(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b);
        this.f95509b = jSONObject.optLong("activity_type", 0L);
        this.f95510c = jSONObject.optLong("award_id");
        this.f95511d = jSONObject.optInt("send_record_id");
        this.f95512e = jSONObject.optInt("user_record_id");
        this.f95513f = jSONObject.optLong("activity_mch_id", 0L);
    }
}
