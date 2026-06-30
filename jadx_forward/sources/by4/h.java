package by4;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ by4.k f117922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f117923e;

    public h(by4.k kVar, org.json.JSONObject jSONObject) {
        this.f117922d = kVar;
        this.f117923e = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        by4.k kVar = this.f117922d;
        org.json.JSONObject jSONObject = this.f117923e;
        kVar.f117934b = jSONObject;
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("WeiXinHostList") : null;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String optString = optJSONArray.optString(i17);
                if (optString != null) {
                    ((java.util.HashSet) kVar.f117935c).add(optString);
                }
            }
        }
    }
}
