package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class u0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.x0 f80017f;

    public u0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var) {
        this.f80015d = lVar;
        this.f80016e = i17;
        this.f80017f = x0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        org.json.JSONObject jSONObject;
        com.tencent.mm.brandService.GetBizResponse getBizResponse = (com.tencent.mm.brandService.GetBizResponse) obj;
        boolean z17 = getBizResponse.f63621d;
        com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var = this.f80017f;
        int i17 = this.f80016e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80015d;
        if (!z17) {
            x0Var.getClass();
            java.lang.String str2 = getBizResponse.f63624g;
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = "fail:internal error";
            }
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, x0Var.u(str, jSONObject2));
            return;
        }
        java.lang.String str4 = getBizResponse.f63627m;
        if (str4.length() == 0) {
            jSONObject = new org.json.JSONObject();
        } else {
            try {
                jSONObject = new org.json.JSONObject(str4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleBrandPersonalCenterAction", "Failed to parse fullInfo JSON: ".concat(str4), e18);
                jSONObject = new org.json.JSONObject();
            }
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("biz", getBizResponse.f63622e);
        jSONObject3.put("interactiveIdentityType", getBizResponse.f63623f);
        jSONObject3.put("initFlag", getBizResponse.f63626i);
        jSONObject3.put("fullInfo", jSONObject);
        x0Var.getClass();
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, x0Var.u(str, jSONObject3));
    }
}
