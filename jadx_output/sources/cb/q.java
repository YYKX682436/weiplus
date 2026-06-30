package cb;

/* loaded from: classes13.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final long f40169d = java.util.concurrent.TimeUnit.DAYS.toMillis(7);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f40170e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f40171a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f40172b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40173c;

    public q(java.lang.String str, java.lang.String str2, long j17) {
        this.f40171a = str;
        this.f40172b = str2;
        this.f40173c = j17;
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
            return new cb.q(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP));
        } catch (org.json.JSONException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 23);
            return null;
        }
    }

    public final boolean b(java.lang.String str) {
        return java.lang.System.currentTimeMillis() > this.f40173c + f40169d || !str.equals(this.f40172b);
    }
}
