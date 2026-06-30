package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "batchUpdateWepkg";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiBatchUpdateWepkg", "invokeInMM");
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiBatchUpdateWepkg", "data is null");
            q5Var.a("fail", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("pkgIdList");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                if (jSONArray.length() > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        arrayList.add(jSONArray.optString(i17));
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3();
                        am.t20 t20Var = c6276xb08681d3.f136525g;
                        t20Var.f89502a = 8;
                        t20Var.f89508g = 0;
                        t20Var.f89509h = arrayList;
                        c6276xb08681d3.e();
                        q5Var.a(null, null);
                        return;
                    }
                }
            } catch (org.json.JSONException unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiBatchUpdateWepkg", "data is not json");
            }
        }
        q5Var.a("fail", null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
