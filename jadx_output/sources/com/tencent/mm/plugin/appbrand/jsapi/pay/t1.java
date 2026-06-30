package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class t1 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.u1 f82676c;

    public t1(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.pay.u1 u1Var) {
        this.f82674a = d0Var;
        this.f82675b = i17;
        this.f82676c = u1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferResult requestMerchantTransferResult = (com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMerchantTransfer", "onReceiveResult result:" + requestMerchantTransferResult.f82567d + " data:" + requestMerchantTransferResult.f82568e);
        boolean b17 = kotlin.jvm.internal.o.b(requestMerchantTransferResult.f82567d, ya.b.SUCCESS);
        com.tencent.mm.plugin.appbrand.jsapi.pay.u1 u1Var = this.f82676c;
        int i17 = this.f82675b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82674a;
        if (b17) {
            org.json.JSONObject jSONObject = requestMerchantTransferResult.f82568e;
            u1Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, u1Var.u(str2, jSONObject));
            return;
        }
        org.json.JSONObject jSONObject2 = requestMerchantTransferResult.f82568e;
        if (jSONObject2 != null) {
            u1Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            d0Var.a(i17, u1Var.u(str2, jSONObject2));
            return;
        }
        u1Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 4);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        d0Var.a(i17, u1Var.u(str2, jSONObject3));
    }
}
