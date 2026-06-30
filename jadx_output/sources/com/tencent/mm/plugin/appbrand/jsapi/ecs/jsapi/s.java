package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t f80809c;

    public s(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t tVar) {
        this.f80807a = lVar;
        this.f80808b = i17;
        this.f80809c = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult jsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult = (com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult) appBrandProxyUIProcessTask$ProcessResult;
        java.lang.String str2 = "OpenEcsGiftReceivePageResult, errCode:" + jsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult.f80785d + ", errMsg:" + jsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult.f80786e;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenEcsGiftReceivePage", str2, null);
        int i18 = jsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult.f80785d;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t tVar = this.f80809c;
        int i19 = this.f80808b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80807a;
        if (i18 == 0) {
            tVar.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i19, tVar.u(str, jSONObject));
            return;
        }
        java.lang.String str5 = jsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult.f80786e;
        tVar.getClass();
        if (android.text.TextUtils.isEmpty(str5)) {
            str5 = "fail:internal error";
        }
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i19, tVar.u(str, jSONObject2));
    }
}
