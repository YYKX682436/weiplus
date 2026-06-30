package at4;

/* loaded from: classes9.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public long f13975a;

    /* renamed from: b, reason: collision with root package name */
    public long f13976b;

    /* renamed from: c, reason: collision with root package name */
    public long f13977c;

    /* renamed from: d, reason: collision with root package name */
    public int f13978d;

    /* renamed from: e, reason: collision with root package name */
    public int f13979e;

    /* renamed from: f, reason: collision with root package name */
    public long f13980f;

    public void a(org.json.JSONObject jSONObject) {
        this.f13975a = jSONObject.optLong(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
        this.f13976b = jSONObject.optLong("activity_type", 0L);
        this.f13977c = jSONObject.optLong("award_id");
        this.f13978d = jSONObject.optInt("send_record_id");
        this.f13979e = jSONObject.optInt("user_record_id");
        this.f13980f = jSONObject.optLong("activity_mch_id", 0L);
    }
}
