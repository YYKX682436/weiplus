package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class h9 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.i9 f81283c;

    public h9(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.i9 i9Var) {
        this.f81281a = lVar;
        this.f81282b = i17;
        this.f81283c = i9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult jsApiOpenCameraForImageSearch$ChooseResult = (com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult) appBrandProxyUIProcessTask$ProcessResult;
        if (this.f81281a.getAppId() != null) {
            com.tencent.mm.plugin.appbrand.m6.a(this.f81281a.getAppId()).f85713f = false;
        }
        if (jsApiOpenCameraForImageSearch$ChooseResult == null) {
            com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81281a;
            int i17 = this.f81282b;
            com.tencent.mm.plugin.appbrand.jsapi.i9 i9Var = this.f81283c;
            i9Var.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, i9Var.u(str, jSONObject));
            return;
        }
        if (jsApiOpenCameraForImageSearch$ChooseResult.f78583e == null) {
            com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = this.f81281a;
            int i18 = this.f81282b;
            com.tencent.mm.plugin.appbrand.jsapi.i9 i9Var2 = this.f81283c;
            i9Var2.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar2.a(i18, i9Var2.u(str, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l lVar3 = this.f81281a;
        int i19 = this.f81282b;
        com.tencent.mm.plugin.appbrand.jsapi.i9 i9Var3 = this.f81283c;
        i9Var3.getClass();
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar3.a(i19, i9Var3.u(str, jSONObject3));
    }
}
