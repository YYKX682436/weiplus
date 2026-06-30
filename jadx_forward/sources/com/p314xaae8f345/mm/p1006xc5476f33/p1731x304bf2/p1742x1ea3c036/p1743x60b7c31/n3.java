package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class n3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "publishHaowanEdition";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        java.lang.String Di;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPublishHaowanEdition", "invokeInMM");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_data", null);
            return;
        }
        java.lang.String optString = e17.optString("postId");
        boolean optBoolean = e17.optBoolean("compressImg", true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            org.json.JSONArray optJSONArray = e17.optJSONArray("localIds");
            int optInt = e17.optInt("from");
            int optInt2 = e17.optInt("postType");
            java.lang.String optString2 = e17.optString("extra");
            int optInt3 = e17.optInt("sourceSceneId");
            int optInt4 = e17.optInt("MiniGamePublish", 0);
            m33.m1 m1Var = new m33.m1();
            m1Var.f404848a = optInt4 == 1;
            m1Var.f404850c = e17.optInt("needDelAfterPost", 0) == 1;
            m1Var.f404849b = e17.optString("videoId");
            Di = ((i53.d0) ((m33.n1) i95.n0.c(m33.n1.class))).Di(optInt, optInt2, optJSONArray, optString2, optBoolean, optInt3, m1Var);
        } else {
            Di = ((i53.d0) ((m33.n1) i95.n0.c(m33.n1.class))).Ri(optString);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("postId", Di);
        } catch (org.json.JSONException unused) {
        }
        q5Var.a(null, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
