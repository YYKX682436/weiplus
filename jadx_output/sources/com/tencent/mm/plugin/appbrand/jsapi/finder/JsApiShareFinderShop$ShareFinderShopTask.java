package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiShareFinderShop$ShareFinderShopTask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "onActivityStopped", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiShareFinderShop$ShareFinderShopTask extends com.tencent.mm.plugin.appbrand.ipc.v implements androidx.lifecycle.x {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        getActivityContext().mo133getLifecycle().a(this);
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult jsApiShareFinderShop$ShareFinderShopResult = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult();
        if (!(request instanceof com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShareFinderShop", "handleRequest, request not instance of ShareFinderShopRequest");
            finishProcess(jsApiShareFinderShop$ShareFinderShopResult);
            return;
        }
        java.lang.String reqData = ((com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopRequest) request).getReqData();
        if (reqData == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Finder.JsApiShareFinderShop", "data is null");
            finishProcess(jsApiShareFinderShop$ShareFinderShopResult);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderShop", "JsApiShareFinderShop json:".concat(reqData));
            com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
            kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
            kotlinx.coroutines.l.d(v65.m.b(activityContext), null, null, new com.tencent.mm.plugin.appbrand.jsapi.finder.x0(this, reqData, jsApiShareFinderShop$ShareFinderShopResult, null), 3, null);
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public final void onActivityStopped() {
        finishProcess(null);
    }
}
