package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/m;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "d", "Ljava/lang/String;", "TAG", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class m extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.EnterWCCoinHomePageTask";

    private static final void a(com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageResult enterWCCoinHomePageResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.m mVar) {
        enterWCCoinHomePageResult.getClass();
        enterWCCoinHomePageResult.f83755d = "fail";
        mVar.finishProcess(enterWCCoinHomePageResult);
    }

    private static final void b(com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageResult enterWCCoinHomePageResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.m mVar) {
        enterWCCoinHomePageResult.getClass();
        enterWCCoinHomePageResult.f83755d = "ok";
        mVar.finishProcess(enterWCCoinHomePageResult);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageResult enterWCCoinHomePageResult = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageResult();
        if (!(request instanceof com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageRequest)) {
            com.tencent.mars.xlog.Log.w(this.TAG, "handleRequest, request not instance of ConsumeWCCoinRequest");
            a(enterWCCoinHomePageResult, this);
            return;
        }
        if (((com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageRequest) request).getBusinessId().length() == 0) {
            a(enterWCCoinHomePageResult, this);
        } else {
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).i(getActivityContext());
            b(enterWCCoinHomePageResult, this);
        }
    }
}
