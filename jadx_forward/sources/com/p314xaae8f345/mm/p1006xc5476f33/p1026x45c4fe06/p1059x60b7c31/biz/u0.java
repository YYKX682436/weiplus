package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes7.dex */
public final class u0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 f161550f;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 x0Var) {
        this.f161548d = lVar;
        this.f161549e = i17;
        this.f161550f = x0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e c10320x67f7455e = (com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e) obj;
        boolean z17 = c10320x67f7455e.f145154d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.x0 x0Var = this.f161550f;
        int i17 = this.f161549e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161548d;
        if (!z17) {
            x0Var.getClass();
            java.lang.String str2 = c10320x67f7455e.f145157g;
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = "fail:internal error";
            }
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, x0Var.u(str, jSONObject2));
            return;
        }
        java.lang.String str4 = c10320x67f7455e.f145160m;
        if (str4.length() == 0) {
            jSONObject = new org.json.JSONObject();
        } else {
            try {
                jSONObject = new org.json.JSONObject(str4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleBrandPersonalCenterAction", "Failed to parse fullInfo JSON: ".concat(str4), e18);
                jSONObject = new org.json.JSONObject();
            }
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("biz", c10320x67f7455e.f145155e);
        jSONObject3.put("interactiveIdentityType", c10320x67f7455e.f145156f);
        jSONObject3.put("initFlag", c10320x67f7455e.f145159i);
        jSONObject3.put("fullInfo", jSONObject);
        x0Var.getClass();
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, x0Var.u(str, jSONObject3));
    }
}
