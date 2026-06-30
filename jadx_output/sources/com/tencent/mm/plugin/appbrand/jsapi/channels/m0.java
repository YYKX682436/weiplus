package com.tencent.mm.plugin.appbrand.jsapi.channels;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/m0;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class m0 extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsCreateContactRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCreateContact", "handleRequest#OpenChannelsCreateContactTask, request is not OpenChannelsCreateContactRequest");
            return;
        }
        try {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((c61.l7) b6Var).qj(context, null, ((com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsCreateContactRequest) appBrandProxyUIProcessTask$ProcessRequest).getParams(), false, new com.tencent.mm.plugin.appbrand.jsapi.channels.l0(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiOpenChannelsCreateContact", e17, "OpenFinderCreateAccountTask exception", new java.lang.Object[0]);
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.EmptyResult());
        }
    }
}
