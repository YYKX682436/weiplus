package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class q9 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r9 f164402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f164403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164404c;

    public q9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r9 r9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f164402a = r9Var;
        this.f164403b = d0Var;
        this.f164404c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.util.Map a17;
        java.util.Map a18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMyAddress", "[openSelectAddr]requestCode: %d, resultCode: %d data: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r9 r9Var = this.f164402a;
        if (i17 != (r9Var.hashCode() & 65535)) {
            return false;
        }
        int i19 = this.f164404c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f164403b;
        if (i18 == -1 && intent != null && (a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e.a(intent)) != null) {
            r9Var.getClass();
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!(a18 instanceof java.util.HashMap)) {
                a18 = new java.util.HashMap(a18);
            }
            a18.put("errno", 0);
            d0Var.a(i19, r9Var.t("ok", a18));
            return true;
        }
        if (i18 != 0) {
            r9Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i19, r9Var.u(str2, jSONObject));
            return true;
        }
        if (intent != null && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e.a(intent)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMyAddress", "[openSelectAddr]cancel, with data");
            r9Var.getClass();
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!(a17 instanceof java.util.HashMap)) {
                a17 = new java.util.HashMap(a17);
            }
            a17.put("errno", 1);
            d0Var.a(i19, r9Var.t("cancel", a17));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMyAddress", "[openSelectAddr]cancel, without data");
        r9Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 1);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        d0Var.a(i19, r9Var.u(str2, jSONObject2));
        return true;
    }
}
