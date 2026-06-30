package cb;

/* loaded from: classes13.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final long f121702d = java.util.concurrent.TimeUnit.DAYS.toMillis(7);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f121703e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f121704a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f121705b;

    /* renamed from: c, reason: collision with root package name */
    public final long f121706c;

    public q(java.lang.String str, java.lang.String str2, long j17) {
        this.f121704a = str;
        this.f121705b = str2;
        this.f121706c = j17;
    }

    public static cb.q a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new cb.q(str, null, 0L);
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            return new cb.q(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6));
        } catch (org.json.JSONException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 23);
            return null;
        }
    }

    public final boolean b(java.lang.String str) {
        return java.lang.System.currentTimeMillis() > this.f121706c + f121702d || !str.equals(this.f121705b);
    }
}
