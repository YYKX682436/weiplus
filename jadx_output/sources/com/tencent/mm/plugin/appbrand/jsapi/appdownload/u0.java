package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes8.dex */
class u0 extends com.tencent.mm.plugin.appbrand.ipc.v {
    private u0() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        java.lang.String str = appBrandProxyUIProcessTask$ProcessRequest != null ? ((com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest) appBrandProxyUIProcessTask$ProcessRequest).f78875d : null;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", str);
        intent.putExtra("view_task", true);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(getActivityContext(), intent, new com.tencent.mm.plugin.appbrand.jsapi.appdownload.t0(this));
    }
}
