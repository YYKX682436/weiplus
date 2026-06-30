package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class i0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.x0 f79967f;

    public i0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var) {
        this.f79965d = lVar;
        this.f79966e = i17;
        this.f79967f = x0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        org.json.JSONArray jSONArray;
        com.tencent.mm.brandService.GetBizResponse getBizResponse = (com.tencent.mm.brandService.GetBizResponse) obj;
        boolean z17 = getBizResponse.f63621d;
        com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var = this.f79967f;
        int i17 = this.f79966e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79965d;
        if (!z17) {
            x0Var.getClass();
            java.lang.String str2 = getBizResponse.f63624g;
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = "fail:internal error";
            }
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, x0Var.u(str, jSONObject));
            return;
        }
        java.lang.String str4 = getBizResponse.f63625h;
        if (str4 == null) {
            str4 = "[]";
        }
        try {
            jSONArray = new org.json.JSONArray(str4);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleBrandPersonalCenterAction", "Failed to parse bizList JSON: ".concat(str4), e18);
            jSONArray = new org.json.JSONArray();
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("result", jSONArray);
        x0Var.getClass();
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, x0Var.u(str, jSONObject2));
    }
}
