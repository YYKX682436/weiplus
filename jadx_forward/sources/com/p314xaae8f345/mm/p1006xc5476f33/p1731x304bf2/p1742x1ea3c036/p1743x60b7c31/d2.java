package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openGameDetail";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiOpenGameDetail", "data is null");
            q5Var.a("null_data", null);
            return;
        }
        java.lang.String optString = e17.optString("appId");
        java.lang.String optString2 = e17.optString("promotionId");
        java.lang.String optString3 = e17.optString("currentUrl");
        java.lang.String optString4 = e17.optString("preVerifyAppId");
        if (optString4 == null || optString4.length() == 0) {
            optString4 = "wx62d9035fd4fd2059";
        }
        java.lang.String str2 = optString4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiOpenGameDetail", "JsApiOpenGameDetail appId:%s, promotionId:%s", optString, optString2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).fj(context, str2, optString3, "game", optString, optString2, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.c2(this, q5Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
