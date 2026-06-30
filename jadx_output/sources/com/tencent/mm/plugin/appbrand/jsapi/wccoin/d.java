package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/d;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "d", "Ljava/lang/String;", "TAG", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class d extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.BuyWCCoinTask";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult buyWCCoinResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.d dVar) {
        buyWCCoinResult.getClass();
        buyWCCoinResult.f83739d = "cancel";
        dVar.finishProcess(buyWCCoinResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult buyWCCoinResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.d dVar) {
        buyWCCoinResult.getClass();
        buyWCCoinResult.f83739d = "fail";
        dVar.finishProcess(buyWCCoinResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult buyWCCoinResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.d dVar) {
        buyWCCoinResult.getClass();
        buyWCCoinResult.f83739d = "ok";
        dVar.finishProcess(buyWCCoinResult);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult buyWCCoinResult = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinResult();
        if (!(request instanceof com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinRequest)) {
            com.tencent.mars.xlog.Log.w(this.TAG, "handleRequest, request not instance of BuyWCCoinRequest");
            f(buyWCCoinResult, this);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.c cVar = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.c(this, buyWCCoinResult);
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinRequest buyWCCoinRequest = (com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinRequest) request;
        if ((buyWCCoinRequest.getMode().length() == 0) || kotlin.jvm.internal.o.b(buyWCCoinRequest.getMode(), "1")) {
            js4.n nVar = new js4.n();
            nVar.f301544b = buyWCCoinRequest.getBusinessId();
            nVar.f301543a = buyWCCoinRequest.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
            js4.l.a(buyWCCoinRequest.getPanelShowType());
            nVar.f301545c = "";
            nVar.f301546d = cVar;
            nVar.f301549g = js4.m.COMMON_CHARGE;
            nVar.f301553k = buyWCCoinRequest.getDiffWeCoinCount();
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(getActivityContext(), nVar);
            return;
        }
        if (!kotlin.jvm.internal.o.b(buyWCCoinRequest.getMode(), "2")) {
            com.tencent.mars.xlog.Log.i(this.TAG, "mode not right");
            f(buyWCCoinResult, this);
            return;
        }
        if (buyWCCoinRequest.getCustomCount().length() == 0) {
            com.tencent.mars.xlog.Log.i(this.TAG, "[WeCoin] doBuyWCCoin customCount is null");
            f(buyWCCoinResult, this);
            return;
        }
        if (buyWCCoinRequest.getProductId().length() == 0) {
            com.tencent.mars.xlog.Log.i(this.TAG, "[WeCoin] doBuyWCCoin productId is null");
            f(buyWCCoinResult, this);
            return;
        }
        if (buyWCCoinRequest.getAgreementVersion().length() == 0) {
            com.tencent.mars.xlog.Log.i(this.TAG, "[WeCoin] doBuyWCCoin agreementVersion is null");
            f(buyWCCoinResult, this);
            return;
        }
        js4.n nVar2 = new js4.n();
        nVar2.f301544b = buyWCCoinRequest.getBusinessId();
        nVar2.f301548f = buyWCCoinRequest.getProductId();
        nVar2.f301550h = java.lang.Long.parseLong(buyWCCoinRequest.getCustomCount());
        nVar2.f301547e = java.lang.Integer.parseInt(buyWCCoinRequest.getAgreementVersion());
        nVar2.f301543a = buyWCCoinRequest.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        nVar2.f301545c = "";
        nVar2.f301546d = cVar;
        nVar2.f301549g = js4.m.DIRECT_CHARGE;
        js4.l.a(buyWCCoinRequest.getPanelShowType());
        nVar2.f301553k = buyWCCoinRequest.getDiffWeCoinCount();
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(getActivityContext(), nVar2);
    }
}
