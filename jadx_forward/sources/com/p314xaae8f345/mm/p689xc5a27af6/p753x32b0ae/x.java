package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes5.dex */
public class x implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f148815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f148816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f148817c;

    public x(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
        this.f148815a = jSONArray;
        this.f148816b = jSONArray2;
        this.f148817c = sVar;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        org.json.JSONArray jSONArray = this.f148816b;
        org.json.JSONArray jSONArray2 = this.f148815a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            int length = jSONArray2.length();
            for (int i17 = 0; i17 < length; i17++) {
                if (str.equals(jSONArray2.optString(i17))) {
                    org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        optJSONObject.put("state", "fail");
                    } else {
                        optJSONObject.put("state", ya.b.f77504xbb80cbe3);
                        optJSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, com.p314xaae8f345.mm.vfs.w6.i(str2, false));
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("preloadImages", jSONArray);
                    this.f148817c.d(hashMap);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppFeatureService", e17, "", new java.lang.Object[0]);
        }
    }
}
