package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f161544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 f161545h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 x0Var) {
        super(1);
        this.f161541d = i17;
        this.f161542e = str;
        this.f161543f = lVar;
        this.f161544g = i18;
        this.f161545h = x0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String draftData = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftData, "draftData");
        boolean z17 = draftData.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 x0Var = this.f161545h;
        int i17 = this.f161544g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161543f;
        java.lang.String str2 = this.f161542e;
        int i18 = this.f161541d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "read draft is empty, draftType: " + i18 + ", scene:" + str2);
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
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "read draft success, draftType: " + i18 + ", scene:" + str2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("draftData", draftData);
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
        return jz5.f0.f384359a;
    }
}
