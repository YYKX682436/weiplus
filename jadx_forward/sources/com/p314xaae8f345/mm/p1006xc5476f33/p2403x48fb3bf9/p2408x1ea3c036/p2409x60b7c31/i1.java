package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class i1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getOpenDeviceId";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetOpenDeviceId", "invokeInMM");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetOpenDeviceId", "data is null");
            q5Var.a("fail", null);
            return;
        }
        java.lang.String optString = e17.optString("preVerifyAppId");
        java.lang.String g17 = wo.w0.g(true);
        java.lang.String k17 = wo.w0.k();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            q5Var.a("fail", null);
            return;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(optString + g17));
        java.lang.String a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(optString + k17));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("deviceid", a17);
            jSONObject.put("newDeviceId", a18);
        } catch (org.json.JSONException unused) {
        }
        q5Var.a(null, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
