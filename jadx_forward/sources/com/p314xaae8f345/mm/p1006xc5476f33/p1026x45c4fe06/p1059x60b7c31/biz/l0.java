package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes.dex */
public final class l0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f161512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161513g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f161514h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 f161515i;

    public l0(int i17, java.lang.String str, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 x0Var) {
        this.f161510d = i17;
        this.f161511e = str;
        this.f161512f = i18;
        this.f161513g = lVar;
        this.f161514h = i19;
        this.f161515i = x0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12032x19dce960 c12032x19dce960 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12032x19dce960) obj;
        boolean z17 = c12032x19dce960.f161475d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 x0Var = this.f161515i;
        int i17 = this.f161514h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161513g;
        int i18 = this.f161512f;
        java.lang.String str2 = this.f161511e;
        int i19 = this.f161510d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "read native draft is empty, draftType: " + i19 + ", scene:" + str2 + ", bizType:" + i18);
            x0Var.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
            str = str3 != null ? str3 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 107);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, x0Var.u(str, jSONObject));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "read native draft success, draftType: " + i19 + ", scene:" + str2 + ", bizType:" + i18);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("draftData", c12032x19dce960.f161476e);
        x0Var.getClass();
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, x0Var.u(str, jSONObject2));
    }
}
