package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/d;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "d", "Ljava/lang/String;", "TAG", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.BuyWCCoinTask";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12281xd6f6e760 c12281xd6f6e760, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d dVar) {
        c12281xd6f6e760.getClass();
        c12281xd6f6e760.f165272d = "cancel";
        dVar.m50420x7b736e5c(c12281xd6f6e760);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12281xd6f6e760 c12281xd6f6e760, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d dVar) {
        c12281xd6f6e760.getClass();
        c12281xd6f6e760.f165272d = "fail";
        dVar.m50420x7b736e5c(c12281xd6f6e760);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12281xd6f6e760 c12281xd6f6e760, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d dVar) {
        c12281xd6f6e760.getClass();
        c12281xd6f6e760.f165272d = "ok";
        dVar.m50420x7b736e5c(c12281xd6f6e760);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12281xd6f6e760 c12281xd6f6e760 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12281xd6f6e760();
        if (!(request instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12280x7c9bbac)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.TAG, "handleRequest, request not instance of BuyWCCoinRequest");
            f(c12281xd6f6e760, this);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.c(this, c12281xd6f6e760);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12280x7c9bbac c12280x7c9bbac = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12280x7c9bbac) request;
        if ((c12280x7c9bbac.getMode().length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12280x7c9bbac.getMode(), "1")) {
            js4.n nVar = new js4.n();
            nVar.f383077b = c12280x7c9bbac.getBusinessId();
            nVar.f383076a = c12280x7c9bbac.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
            js4.l.a(c12280x7c9bbac.getPanelShowType());
            nVar.f383078c = "";
            nVar.f383079d = cVar;
            nVar.f383082g = js4.m.COMMON_CHARGE;
            nVar.f383086k = c12280x7c9bbac.getDiffWeCoinCount();
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(m50421x3c6fed6a(), nVar);
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12280x7c9bbac.getMode(), "2")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "mode not right");
            f(c12281xd6f6e760, this);
            return;
        }
        if (c12280x7c9bbac.getCustomCount().length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "[WeCoin] doBuyWCCoin customCount is null");
            f(c12281xd6f6e760, this);
            return;
        }
        if (c12280x7c9bbac.getProductId().length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "[WeCoin] doBuyWCCoin productId is null");
            f(c12281xd6f6e760, this);
            return;
        }
        if (c12280x7c9bbac.getAgreementVersion().length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "[WeCoin] doBuyWCCoin agreementVersion is null");
            f(c12281xd6f6e760, this);
            return;
        }
        js4.n nVar2 = new js4.n();
        nVar2.f383077b = c12280x7c9bbac.getBusinessId();
        nVar2.f383081f = c12280x7c9bbac.getProductId();
        nVar2.f383083h = java.lang.Long.parseLong(c12280x7c9bbac.getCustomCount());
        nVar2.f383080e = java.lang.Integer.parseInt(c12280x7c9bbac.getAgreementVersion());
        nVar2.f383076a = c12280x7c9bbac.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        nVar2.f383078c = "";
        nVar2.f383079d = cVar;
        nVar2.f383082g = js4.m.DIRECT_CHARGE;
        js4.l.a(c12280x7c9bbac.getPanelShowType());
        nVar2.f383086k = c12280x7c9bbac.getDiffWeCoinCount();
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(m50421x3c6fed6a(), nVar2);
    }
}
