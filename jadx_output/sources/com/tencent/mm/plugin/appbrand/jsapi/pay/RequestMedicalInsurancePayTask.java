package com.tencent.mm.plugin.appbrand.jsapi.pay;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/RequestMedicalInsurancePayTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "Lcom/tencent/mm/sdk/event/IListener;", "d", "Lcom/tencent/mm/sdk/event/IListener;", "liteAppCloseWindowEvent", "<init>", "()V", "e", "com/tencent/mm/plugin/appbrand/jsapi/pay/v2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class RequestMedicalInsurancePayTask extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.pay.v2 f82558e = new com.tencent.mm.plugin.appbrand.jsapi.pay.v2(null);

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f82559f = "MicroMsg.RequestMedicalInsurancePayTask";

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String f82560g = "wxalitebd687f90a5690a0e4fe5b08bfb273e90@pay";

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f82561h = "reportPayResult";

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f82562i = "success";

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.tencent.mm.sdk.event.IListener<?> liteAppCloseWindowEvent;

    public RequestMedicalInsurancePayTask() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.liteAppCloseWindowEvent = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask$liteAppCloseWindowEvent$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ri riVar = event.f54468g;
                if (riVar.f7817a != 3 || !com.tencent.mm.sdk.platformtools.t8.D0(riVar.f7819c, "wxalitebd687f90a5690a0e4fe5b08bfb273e90@pay")) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RequestMedicalInsurancePayTask", "close liteapp appId %s, %s", riVar.f7819c, "wxalitebd687f90a5690a0e4fe5b08bfb273e90@pay");
                com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult requestMedicalInsurancePayResult = new com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult();
                requestMedicalInsurancePayResult.f82556d = "fail close";
                com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask.this.finishProcess(requestMedicalInsurancePayResult);
                dead();
                return false;
            }
        };
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult requestMedicalInsurancePayResult = new com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult();
        if (!(request instanceof com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayRequest)) {
            com.tencent.mars.xlog.Log.e(f82559f, "handleRequest, request not instance of RequestMedicalInsurancePayRequest");
            requestMedicalInsurancePayResult.f82556d = "fail";
            finishProcess(requestMedicalInsurancePayResult);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayRequest requestMedicalInsurancePayRequest = (com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayRequest) request;
        java.lang.String queryString = requestMedicalInsurancePayRequest.getQueryString();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", f82560g);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        bundle.putString("query", queryString);
        bundle.putLong("timeout", 30000L);
        bundle.putBoolean("withDownloadLoading", true);
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.WA_APP;
        liteAppReferrerInfo.sceneId = requestMedicalInsurancePayRequest.getAppId();
        bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new com.tencent.mm.plugin.appbrand.jsapi.pay.w2(requestMedicalInsurancePayResult, this);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(getActivityContext(), bundle, true, false, sVar, new com.tencent.mm.plugin.appbrand.jsapi.pay.x2(requestMedicalInsurancePayResult, this));
        this.liteAppCloseWindowEvent.alive();
    }
}
