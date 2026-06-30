package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class u1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1320;
    public static final java.lang.String NAME = "requestMerchantTransfer";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null || jSONObject == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMerchantTransfer", "JsApiRequestMerchantTransfer data:" + jSONObject);
        jSONObject.put("sourceType", "WAAPP");
        jSONObject.put("sourceAppId", d0Var.getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferRequest requestMerchantTransferRequest = new com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferRequest();
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        requestMerchantTransferRequest.d(jSONObject2);
        java.lang.String appId = d0Var.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        requestMerchantTransferRequest.c(appId);
        com.tencent.mm.plugin.appbrand.jsapi.pay.t1 t1Var = new com.tencent.mm.plugin.appbrand.jsapi.pay.t1(d0Var, i17, this);
        android.content.Context context = d0Var.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, requestMerchantTransferRequest, t1Var, null);
    }
}
