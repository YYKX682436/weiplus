package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class r extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "clearGameData";
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiClearGameData", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        sd.a aVar = (sd.a) bVar.f488129a;
        java.lang.String str = "wx62d9035fd4fd2059";
        if (aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) aVar;
            java.lang.String b17 = x0Var.K.b();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                java.lang.String s17 = x0Var.s();
                if (s17 == null) {
                    s17 = "";
                }
                android.net.Uri parse = android.net.Uri.parse(s17);
                if (parse.getHost() == null || !parse.getHost().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiClearGameData", "appId is null");
                    bVar.c("appid_null", null);
                    return;
                }
            } else {
                str = b17;
            }
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("keys");
        boolean optBoolean = jSONObject.optBoolean("clearAllData", false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", str);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            bundle.putString("keys", optJSONArray.toString());
        } else {
            if (!optBoolean) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiClearGameData", "keys is null");
                bVar.c("fail", null);
                return;
            }
            bundle.putBoolean("clearAll", optBoolean);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.q.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.p(this, bVar));
    }
}
