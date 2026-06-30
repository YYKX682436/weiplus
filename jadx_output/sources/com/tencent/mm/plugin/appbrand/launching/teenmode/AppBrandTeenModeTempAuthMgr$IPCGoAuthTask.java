package com.tencent.mm.plugin.appbrand.launching.teenmode;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthTask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class AppBrandTeenModeTempAuthMgr$IPCGoAuthTask extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        kotlin.jvm.internal.o.e(appBrandProxyUIProcessTask$ProcessRequest, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr.IPCGoAuthRequest");
        com.tencent.mm.plugin.appbrand.launching.teenmode.l lVar = com.tencent.mm.plugin.appbrand.launching.teenmode.l.f85202a;
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        lVar.a(activityContext, ((com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthRequest) appBrandProxyUIProcessTask$ProcessRequest).getInitConfig(), new com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthTask$handleRequest$1(this));
    }
}
