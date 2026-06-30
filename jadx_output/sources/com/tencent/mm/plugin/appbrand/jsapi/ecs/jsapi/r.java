package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ecs/jsapi/r;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class r extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        kotlin.jvm.internal.o.e(appBrandProxyUIProcessTask$ProcessRequest, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage.OpenEcsGiftReceivePageRequest");
        java.lang.String orderId = ((com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest) appBrandProxyUIProcessTask$ProcessRequest).getOrderId();
        if (orderId == null || orderId.length() == 0) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenEcsGiftReceivePage", "OpenEcsGiftReceivePageTask, order id is empty", null);
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult(-1, "invalid orderId"));
            return;
        }
        java.lang.String wi6 = ((j00.o) ((c00.d3) i95.n0.c(c00.d3.class))).wi(new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.q(this));
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenEcsGiftReceivePage", "set open event callback, eventId:" + wi6, null);
        java.util.Map l17 = kz5.c1.l(new jz5.l("ecsOpenEventId", wi6));
        i95.m c17 = i95.n0.c(c00.e3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        l17.put("orderId", orderId);
        c00.e3.n9((c00.e3) c17, activityContext, l17, null, 4, null);
    }
}
