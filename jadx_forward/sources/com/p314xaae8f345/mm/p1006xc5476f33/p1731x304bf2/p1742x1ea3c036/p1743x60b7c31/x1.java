package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class x1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h.f34168x24728b;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBusinessView", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            bVar.c("request data is null", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("businessType", "");
        java.lang.String optString2 = jSONObject.optString("referrerAppId", "");
        java.lang.String u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).u();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            hashMap.put("err_code", -4);
            bVar.b("openBusinessView:fail invalid businessType", hashMap);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            hashMap.put("err_code", -1);
            bVar.b("openBusinessView:fail invalid referrerAppId", hashMap);
            return;
        }
        java.lang.String optString3 = jSONObject.optString("envVersion", "");
        if (optString3 == null) {
            optString3 = "";
        }
        int i17 = !optString3.equals("trial") ? !optString3.equals("develop") ? 0 : 1 : 2;
        java.lang.String optString4 = jSONObject.optString("queryString", "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("businessType", optString);
        bundle.putString("queryString", optString4);
        bundle.putString("referrerAppId", optString2);
        bundle.putString("referrerUrl", u17);
        bundle.putInt("versionType", i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBusinessView", "doOpenBusinessView appid:%s, businessType:%s, queryString:%s, referrerUrl:%s", optString2, optString, optString4, u17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.C15885x920c565c(bundle), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.w1.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.u1(this, hashMap, bVar));
    }
}
