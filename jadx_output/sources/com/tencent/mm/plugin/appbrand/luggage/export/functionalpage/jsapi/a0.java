package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/jsapi/a0;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "Ljz5/f0;", "a", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "_req", "handleRequest", "d", "Ljava/lang/String;", "TAG", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class a0 extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.AppBrand.FunctionalDirectApi.ProxyTask";

    private final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e(this.TAG, "errorReturn reason:" + str);
        finishProcess(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.ProxyRequest proxyRequest = appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.ProxyRequest ? (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.ProxyRequest) appBrandProxyUIProcessTask$ProcessRequest : null;
        if (proxyRequest == null) {
            a("Invalid ProxyRequest");
            return;
        }
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.a.f85598a;
        android.util.SparseArray sparseArray2 = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.a.f85598a;
        int functionHash = proxyRequest.getFunctionHash();
        kotlin.jvm.internal.o.g(sparseArray2, "<this>");
        java.lang.Object obj = sparseArray2.get(functionHash);
        if (obj != null) {
            sparseArray2.remove(functionHash);
        }
        yz5.l lVar = (yz5.l) obj;
        if (lVar == null) {
            a("Invalid functionHash");
            return;
        }
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        lVar.invoke(activityContext);
    }
}
