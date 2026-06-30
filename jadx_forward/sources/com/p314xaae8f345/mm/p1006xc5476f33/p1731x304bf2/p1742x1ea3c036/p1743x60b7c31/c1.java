package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class c1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getWepkgFileInfo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWepkgFileInfo", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("wepkgId");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("files");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || optJSONArray == null || optJSONArray.length() == 0) {
            bVar.c("null_data", null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWepkgFileInfo", "wepkgId:[%s] files:[%s]", optString, optJSONArray.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            try {
                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                hashMap.put(jSONObject2.optString("rid"), jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15));
            } catch (org.json.JSONException unused) {
            }
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.b1(this, optString, hashMap, bVar));
    }
}
