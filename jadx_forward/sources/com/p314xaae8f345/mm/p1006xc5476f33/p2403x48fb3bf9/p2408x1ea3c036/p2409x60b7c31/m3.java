package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class m3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "reportIDKey";
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
        org.json.JSONArray optJSONArray = bVar.f488130b.f426039c.optJSONArray("idKeyDataInfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportIDKey", "idkey data is null");
            bVar.c("invaild_parms", null);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optJSONObject.optString(dm.i4.f66865x76d1ec5a), 0));
            c4582x424c344.m40331x936762bd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optJSONObject.optString("key"), 0));
            c4582x424c344.m40332x57b2b64f(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optJSONObject.optString("value"), 0));
            arrayList.add(c4582x424c344);
        }
        if (arrayList.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
        }
        bVar.a();
    }
}
