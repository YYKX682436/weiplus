package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        r45.br2 productShareObject;
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest = appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest ? (com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest) appBrandProxyUIProcessTask$ProcessRequest : null;
        if (jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest == null || (productShareObject = jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest.getProductShareObject()) == null) {
            finishProcess(null);
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.appbrand.jsapi.finder.c0(this, productShareObject, null), 3, null);
            getActivityContext().mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask$handleRequest$2
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
                public final void onActivityStopped() {
                    com.tencent.mm.ui.MMActivity activityContext;
                    com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask = com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask.this;
                    activityContext = jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask.getActivityContext();
                    activityContext.mo133getLifecycle().c(this);
                    jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask.finishProcess(null);
                }
            });
        }
    }
}
