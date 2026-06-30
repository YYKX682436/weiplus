package by4;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ by4.k f36389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f36390e;

    public h(by4.k kVar, org.json.JSONObject jSONObject) {
        this.f36389d = kVar;
        this.f36390e = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        by4.k kVar = this.f36389d;
        org.json.JSONObject jSONObject = this.f36390e;
        kVar.f36401b = jSONObject;
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("WeiXinHostList") : null;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String optString = optJSONArray.optString(i17);
                if (optString != null) {
                    ((java.util.HashSet) kVar.f36402c).add(optString);
                }
            }
        }
    }
}
