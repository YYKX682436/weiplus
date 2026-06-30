package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ecs/jsapi/d;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandRequest) {
            com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k kVar = com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k.f80805a;
            com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
            com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandRequest ecsIPCHandleAPPBrandRequest = (com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandRequest) appBrandProxyUIProcessTask$ProcessRequest;
            java.lang.String paramsJsonStr = ecsIPCHandleAPPBrandRequest.getParamsJsonStr();
            try {
                kVar.d(activityContext, paramsJsonStr, ecsIPCHandleAPPBrandRequest.getEnvDataJsonStr(), new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.c(this));
            } catch (java.lang.Exception e17) {
                if (paramsJsonStr == null) {
                    paramsJsonStr = "";
                }
                kVar.e("AppBrandIPCProxyUILauncher", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, paramsJsonStr, e17);
            }
        }
    }
}
