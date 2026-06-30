package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/MiniProgramNavigatorUglyLogic$ProxyTask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class MiniProgramNavigatorUglyLogic$ProxyTask extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest miniProgramNavigatorUglyLogic$ProxyRequest = (com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest) request;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig = miniProgramNavigatorUglyLogic$ProxyRequest.getInitConfig();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject statObj = miniProgramNavigatorUglyLogic$ProxyRequest.getStatObj();
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniProgramNavigatorUglyLogic", "proxy in mm, before start " + initConfig.f77278d + '(' + initConfig.f47277w + ')');
        new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyTask$handleRequest$1(this, initConfig, com.tencent.mm.app.a0.f53288d).alive();
        com.tencent.mm.plugin.appbrand.task.u0 a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        com.tencent.luggage.sdk.processes.r.y(a17, activityContext, new com.tencent.mm.plugin.appbrand.task.a1(initConfig, statObj, null), null, null, 12, null);
    }
}
