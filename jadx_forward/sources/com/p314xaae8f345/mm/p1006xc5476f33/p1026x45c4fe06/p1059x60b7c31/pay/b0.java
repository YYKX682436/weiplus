package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public final class b0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.c0 f164113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164115c;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2, int i17) {
        this.f164113a = c0Var;
        this.f164114b = c0Var2;
        this.f164115c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "on result, requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.c0 c0Var = this.f164113a;
        if (c0Var.f164122g != i17) {
            return true;
        }
        int i19 = this.f164115c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = this.f164114b;
        if (i18 == -1001) {
            rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "check pay jspi fail：user wallet region is not hk", new java.lang.Object[0]);
            c0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:require user interaction" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 7);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var2.a(i19, c0Var.u(str2, jSONObject));
            return true;
        }
        if (i18 != -1) {
            rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "check pay jspi fail", new java.lang.Object[0]);
            c0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var2.a(i19, c0Var.u(str2, jSONObject2));
            return true;
        }
        rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "goto hkoffline pay finish", new java.lang.Object[0]);
        c0Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        c0Var2.a(i19, c0Var.u(str2, jSONObject3));
        return true;
    }
}
