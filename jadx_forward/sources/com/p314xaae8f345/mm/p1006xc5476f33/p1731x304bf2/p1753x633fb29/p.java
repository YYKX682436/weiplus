package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public long f221929a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f221930b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f221931c = -10;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f221932d = new java.util.ArrayList();

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return pVar;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            pVar.f221929a = jSONObject.optLong("startTime", 0L);
            pVar.f221930b = jSONObject.optLong("endTime", 0L);
            pVar.f221931c = jSONObject.optInt("basicType", -10);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("msgIdList");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    ((java.util.ArrayList) pVar.f221932d).add(optJSONArray.optString(i17));
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return pVar;
    }
}
