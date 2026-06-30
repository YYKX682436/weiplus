package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes.dex */
public final class l0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f79977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f79979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f79981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.x0 f79982i;

    public l0(int i17, java.lang.String str, int i18, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i19, com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var) {
        this.f79977d = i17;
        this.f79978e = str;
        this.f79979f = i18;
        this.f79980g = lVar;
        this.f79981h = i19;
        this.f79982i = x0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet jsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet) obj;
        boolean z17 = jsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet.f79942d;
        com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var = this.f79982i;
        int i17 = this.f79981h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79980g;
        int i18 = this.f79979f;
        java.lang.String str2 = this.f79978e;
        int i19 = this.f79977d;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "read native draft is empty, draftType: " + i19 + ", scene:" + str2 + ", bizType:" + i18);
            x0Var.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
            str = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 107);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, x0Var.u(str, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "read native draft success, draftType: " + i19 + ", scene:" + str2 + ", bizType:" + i18);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("draftData", jsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet.f79943e);
        x0Var.getClass();
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, x0Var.u(str, jSONObject2));
    }
}
