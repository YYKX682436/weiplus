package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/webrtc/r;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/jsapi/webrtc/JsApiRequestSRFile$GetDownloadInfo;", "Lcom/tencent/mm/plugin/appbrand/jsapi/webrtc/JsApiRequestSRFile$GetDownloadStatus;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
final class r implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadInfo data = (com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadInfo) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.h0 h0Var = com.tencent.mm.plugin.appbrand.jsapi.webrtc.h0.INSTANCE;
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.q qVar = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.q(rVar);
        h0Var.getClass();
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        java.lang.String str = data.f83792d;
        t0Var.f97150a = str;
        java.lang.String str2 = data.f83793e;
        t0Var.f97153d = str2;
        t0Var.f97155f = 2;
        t0Var.f97159j = false;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) h0Var.f83833e;
        if (concurrentHashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SRDownloadFile", str + " is downloading");
            qVar.a(5);
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        long b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.g0 g0Var = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.g0(h0Var, str, str2, qVar);
        ((java.util.concurrent.ConcurrentHashMap) h0Var.f83832d).put(java.lang.Long.valueOf(b17), g0Var);
        concurrentHashMap.put(str, g0Var);
    }
}
