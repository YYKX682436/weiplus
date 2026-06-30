package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class g2 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.h2 f81815c;

    public g2(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.media.h2 h2Var) {
        this.f81813a = lVar;
        this.f81814b = i17;
        this.f81815c = h2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONArray jSONArray;
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseResult jSApiBizChooseImage$ChooseResult = (com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.h2 h2Var = this.f81815c;
        int i17 = this.f81814b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81813a;
        if (jSApiBizChooseImage$ChooseResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JSApiBizChooseImage", "chooseMedia fail, onReceiveResult result is null");
            h2Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, h2Var.u(str2, jSONObject));
            return;
        }
        if (jSApiBizChooseImage$ChooseResult.f81618d != -1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JSApiBizChooseImage", "select failed, onReceiveResult");
            h2Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 107);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, h2Var.u(str2, jSONObject2));
            return;
        }
        java.lang.String str5 = jSApiBizChooseImage$ChooseResult.f81619e;
        try {
            jSONArray = new org.json.JSONArray(jSApiBizChooseImage$ChooseResult.f81620f);
        } catch (org.json.JSONException e19) {
            java.lang.String message = e19.getMessage();
            if (message == null) {
                message = "null";
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JSApiBizChooseImage", "parse json error = ".concat(message));
            jSONArray = null;
        }
        if (jSONArray != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", str5);
            hashMap.put("tempFiles", jSONArray);
            com.tencent.mars.xlog.Log.i("MicroMsg.JSApiBizChooseImage", "chooseMedia ok, type:%s, localIds:%s", str5, jSONArray);
            h2Var.getClass();
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            lVar.a(i17, h2Var.t("ok", hashMap));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JSApiBizChooseImage", "localIds is null");
        h2Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 107);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        lVar.a(i17, h2Var.u(str2, jSONObject3));
    }
}
