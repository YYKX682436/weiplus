package k91;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f387128a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f387129b;

    public h(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAppConfig", "renderBackend is null");
            this.f387128a = "webview";
            this.f387129b = new java.lang.String[0];
            return;
        }
        this.f387128a = jSONObject.optString("default", "webview");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("allUsed");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            this.f387129b = new java.lang.String[0];
        } else {
            this.f387129b = new java.lang.String[optJSONArray.length()];
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                this.f387129b[i17] = optJSONArray.optString(i17, this.f387128a);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAppConfig", "renderBackend is %s, default is %s", jSONObject, this.f387128a);
    }
}
