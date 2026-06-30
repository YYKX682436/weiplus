package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/c0;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "d", "Ljava/lang/String;", "TAG", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class c0 extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.ShowWCCoinFirstBuyCoinTipsTask";

    private static final void b(com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsResult showWCCoinFirstBuyCoinTipsResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.c0 c0Var) {
        showWCCoinFirstBuyCoinTipsResult.getClass();
        showWCCoinFirstBuyCoinTipsResult.f83757d = "fail";
        c0Var.finishProcess(showWCCoinFirstBuyCoinTipsResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsResult showWCCoinFirstBuyCoinTipsResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.c0 c0Var) {
        showWCCoinFirstBuyCoinTipsResult.getClass();
        showWCCoinFirstBuyCoinTipsResult.f83757d = "ok";
        c0Var.finishProcess(showWCCoinFirstBuyCoinTipsResult);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsResult showWCCoinFirstBuyCoinTipsResult = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsResult();
        if (!(request instanceof com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsRequest)) {
            com.tencent.mars.xlog.Log.w(this.TAG, "handleRequest, request not instance of ConsumeWCCoinRequest");
            b(showWCCoinFirstBuyCoinTipsResult, this);
            return;
        }
        js4.h e17 = ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).e(getActivityContext(), ((com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsRequest) request).getAlwaysDarkMode() == 1);
        if (e17 == null) {
            c(showWCCoinFirstBuyCoinTipsResult, this);
        } else {
            ((ns4.p1) e17).f339618c = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.b0(showWCCoinFirstBuyCoinTipsResult, this);
        }
    }
}
