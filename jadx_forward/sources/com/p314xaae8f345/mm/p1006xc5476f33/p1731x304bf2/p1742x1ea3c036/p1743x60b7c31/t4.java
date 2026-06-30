package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class t4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setBlackList";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLife.JsApiSetBlackList", "invokeInMM");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLife.JsApiSetBlackList", "userName:[%s]", optString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            q5Var.a("null_data", null);
            return;
        }
        if (!e17.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf)) {
            q5Var.a("switch_null", null);
            return;
        }
        try {
            boolean z17 = e17.getBoolean(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf);
            boolean optBoolean = e17.optBoolean("associateWxGameAccount", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLife.JsApiSetBlackList", "JsApiSetBlackList setBlack:%b,associateWxGameAccount:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(optBoolean));
            ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ri(optString, z17, optBoolean, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.s4(this, q5Var));
        } catch (org.json.JSONException unused) {
            q5Var.a("switch_error", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
