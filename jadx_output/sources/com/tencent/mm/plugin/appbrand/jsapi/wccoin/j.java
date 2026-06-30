package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/j;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "d", "Ljava/lang/String;", "TAG", "", "e", "Ljava/lang/Object;", "logic", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class j extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.ConsumeWCCoinTask";

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private java.lang.Object logic;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.j jVar) {
        consumeWCCoinResult.getClass();
        consumeWCCoinResult.f83752d = "cancel";
        jVar.finishProcess(consumeWCCoinResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.j jVar) {
        consumeWCCoinResult.getClass();
        consumeWCCoinResult.f83752d = "fail";
        jVar.finishProcess(consumeWCCoinResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.j jVar) {
        consumeWCCoinResult.getClass();
        consumeWCCoinResult.f83752d = "insufficient";
        jVar.finishProcess(consumeWCCoinResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.j jVar) {
        consumeWCCoinResult.getClass();
        consumeWCCoinResult.f83752d = "intercept";
        jVar.finishProcess(consumeWCCoinResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.j jVar, java.lang.String str) {
        consumeWCCoinResult.getClass();
        consumeWCCoinResult.f83752d = "ok";
        kotlin.jvm.internal.o.g(str, "<set-?>");
        consumeWCCoinResult.f83753e = str;
        jVar.finishProcess(consumeWCCoinResult);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult();
        if (!(request instanceof com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinRequest)) {
            com.tencent.mars.xlog.Log.w(this.TAG, "handleRequest, request not instance of ConsumeWCCoinRequest");
            h(consumeWCCoinResult, this);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinRequest consumeWCCoinRequest = (com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinRequest) request;
        int a17 = com.tencent.mm.sdk.platformtools.b8.a(consumeWCCoinRequest.getBusinessId());
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        pr4.l lVar = new pr4.l(a17, activityContext, new com.tencent.mm.plugin.appbrand.jsapi.wccoin.g(this, consumeWCCoinResult), new com.tencent.mm.plugin.appbrand.jsapi.wccoin.h(consumeWCCoinResult, this), new com.tencent.mm.plugin.appbrand.jsapi.wccoin.i(consumeWCCoinResult, this));
        if (consumeWCCoinRequest.getMode() == 2) {
            lVar.f358025f = pr4.k.f358017e;
            java.lang.String productTitle = consumeWCCoinRequest.getProductTitle();
            kotlin.jvm.internal.o.g(productTitle, "<set-?>");
            lVar.f358027h = productTitle;
            java.lang.String productTitleInsufficient = consumeWCCoinRequest.getProductTitleInsufficient();
            kotlin.jvm.internal.o.g(productTitleInsufficient, "<set-?>");
            lVar.f358028i = productTitleInsufficient;
            lVar.f358029j = consumeWCCoinRequest.getProductWecoinPrice();
            java.lang.String productWecoinRealPrice = consumeWCCoinRequest.getProductWecoinRealPrice();
            kotlin.jvm.internal.o.g(productWecoinRealPrice, "<set-?>");
            lVar.f358030k = productWecoinRealPrice;
            if (consumeWCCoinRequest.getConsumeTipsWording().length() > 0) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(((com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinRequest) request).getConsumeTipsWording());
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    int length = jSONArray.length();
                    java.lang.String[] strArr = new java.lang.String[length];
                    for (int i17 = 0; i17 < length; i17++) {
                        strArr[i17] = jSONArray.optString(i17);
                    }
                    lVar.f358031l = kz5.z.z0(strArr);
                } catch (org.json.JSONException unused) {
                    com.tencent.mars.xlog.Log.i(this.TAG, "json parse fail");
                    h(consumeWCCoinResult, this);
                    return;
                }
            }
            if (consumeWCCoinRequest.getConsumeButtonTitle().length() > 0) {
                java.lang.String consumeButtonTitle = consumeWCCoinRequest.getConsumeButtonTitle();
                kotlin.jvm.internal.o.g(consumeButtonTitle, "<set-?>");
                lVar.f358032m = consumeButtonTitle;
            }
            if (consumeWCCoinRequest.getConsumeButtonTitleInsufficient().length() > 0) {
                java.lang.String consumeButtonTitleInsufficient = consumeWCCoinRequest.getConsumeButtonTitleInsufficient();
                kotlin.jvm.internal.o.g(consumeButtonTitleInsufficient, "<set-?>");
                lVar.f358033n = consumeButtonTitleInsufficient;
            }
            if (consumeWCCoinRequest.getAgreementSelected() == 0) {
                lVar.f358034o = false;
            } else if (consumeWCCoinRequest.getAgreementSelected() == 1) {
                lVar.f358034o = true;
            }
            if (consumeWCCoinRequest.getAgreementString().length() > 0) {
                java.lang.String agreementString = consumeWCCoinRequest.getAgreementString();
                kotlin.jvm.internal.o.g(agreementString, "<set-?>");
                lVar.f358035p = agreementString;
            }
        }
        lVar.f358026g = android.util.Base64.decode(consumeWCCoinRequest.getBuff(), 2);
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        ls4.u uVar = new ls4.u(lVar);
        uVar.f();
        this.logic = uVar;
    }
}
