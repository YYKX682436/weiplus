package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class k0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.x0 f79974f;

    public k0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var) {
        this.f79972d = lVar;
        this.f79973e = i17;
        this.f79974f = x0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet) obj;
        boolean z17 = jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79932d;
        com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var = this.f79974f;
        int i17 = this.f79973e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79972d;
        if (!z17) {
            x0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, x0Var.u(str2, jSONObject));
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject b17 = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.b(lVar.getAppId(), jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79933e, "", false);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("tempFilePath", b17.f76102d);
        jSONObject2.put("aiPicId", jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79934f);
        jSONObject2.put("aiPicPrompt", jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79935g);
        jSONObject2.put("aiPicSource", jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79936h);
        jSONObject2.put("aiPicTemplateId", jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79937i);
        jSONObject2.put("aiPicDataBuf", jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79938m);
        jSONObject2.put("aiPicStyle", jsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet.f79939n);
        x0Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, x0Var.u(str2, jSONObject2));
    }
}
