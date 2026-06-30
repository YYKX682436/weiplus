package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/g1;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class g1 extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "handleRequest, request is not DoSetTextStatusRequest");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "handleRequest, publishTextStatus");
        bi4.n1 n1Var = new bi4.n1(null);
        com.tencent.mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest doPublishTextStatusRequest = (com.tencent.mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest) appBrandProxyUIProcessTask$ProcessRequest;
        n1Var.f354969n = doPublishTextStatusRequest.getPublishTextStatusParams().f78666e;
        n1Var.f354968m = doPublishTextStatusRequest.getPublishTextStatusParams().f78665d + "@weapp";
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ui(getActivityContext(), n1Var, new com.tencent.mm.plugin.appbrand.jsapi.f1(this));
    }
}
