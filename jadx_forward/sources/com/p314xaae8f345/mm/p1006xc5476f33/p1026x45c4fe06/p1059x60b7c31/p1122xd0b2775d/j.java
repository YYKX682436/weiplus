package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/j;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "d", "Ljava/lang/String;", "TAG", "", "e", "Ljava/lang/Object;", "logic", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String TAG = "MicroMsg.ConsumeWCCoinTask";

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private java.lang.Object logic;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12283x18def3d6 c12283x18def3d6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.j jVar) {
        c12283x18def3d6.getClass();
        c12283x18def3d6.f165285d = "cancel";
        jVar.m50420x7b736e5c(c12283x18def3d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12283x18def3d6 c12283x18def3d6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.j jVar) {
        c12283x18def3d6.getClass();
        c12283x18def3d6.f165285d = "fail";
        jVar.m50420x7b736e5c(c12283x18def3d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12283x18def3d6 c12283x18def3d6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.j jVar) {
        c12283x18def3d6.getClass();
        c12283x18def3d6.f165285d = "insufficient";
        jVar.m50420x7b736e5c(c12283x18def3d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12283x18def3d6 c12283x18def3d6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.j jVar) {
        c12283x18def3d6.getClass();
        c12283x18def3d6.f165285d = "intercept";
        jVar.m50420x7b736e5c(c12283x18def3d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12283x18def3d6 c12283x18def3d6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.j jVar, java.lang.String str) {
        c12283x18def3d6.getClass();
        c12283x18def3d6.f165285d = "ok";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        c12283x18def3d6.f165286e = str;
        jVar.m50420x7b736e5c(c12283x18def3d6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12283x18def3d6 c12283x18def3d6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12283x18def3d6();
        if (!(request instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12282x2e33df6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.TAG, "handleRequest, request not instance of ConsumeWCCoinRequest");
            h(c12283x18def3d6, this);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12282x2e33df6 c12282x2e33df6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12282x2e33df6) request;
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(c12282x2e33df6.getBusinessId());
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
        pr4.l lVar = new pr4.l(a17, m50421x3c6fed6a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.g(this, c12283x18def3d6), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.h(c12283x18def3d6, this), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.i(c12283x18def3d6, this));
        if (c12282x2e33df6.getMode() == 2) {
            lVar.f439558f = pr4.k.f439550e;
            java.lang.String productTitle = c12282x2e33df6.getProductTitle();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productTitle, "<set-?>");
            lVar.f439560h = productTitle;
            java.lang.String productTitleInsufficient = c12282x2e33df6.getProductTitleInsufficient();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productTitleInsufficient, "<set-?>");
            lVar.f439561i = productTitleInsufficient;
            lVar.f439562j = c12282x2e33df6.getProductWecoinPrice();
            java.lang.String productWecoinRealPrice = c12282x2e33df6.getProductWecoinRealPrice();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productWecoinRealPrice, "<set-?>");
            lVar.f439563k = productWecoinRealPrice;
            if (c12282x2e33df6.getConsumeTipsWording().length() > 0) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12282x2e33df6) request).getConsumeTipsWording());
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    int length = jSONArray.length();
                    java.lang.String[] strArr = new java.lang.String[length];
                    for (int i17 = 0; i17 < length; i17++) {
                        strArr[i17] = jSONArray.optString(i17);
                    }
                    lVar.f439564l = kz5.z.z0(strArr);
                } catch (org.json.JSONException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "json parse fail");
                    h(c12283x18def3d6, this);
                    return;
                }
            }
            if (c12282x2e33df6.getConsumeButtonTitle().length() > 0) {
                java.lang.String consumeButtonTitle = c12282x2e33df6.getConsumeButtonTitle();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumeButtonTitle, "<set-?>");
                lVar.f439565m = consumeButtonTitle;
            }
            if (c12282x2e33df6.getConsumeButtonTitleInsufficient().length() > 0) {
                java.lang.String consumeButtonTitleInsufficient = c12282x2e33df6.getConsumeButtonTitleInsufficient();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumeButtonTitleInsufficient, "<set-?>");
                lVar.f439566n = consumeButtonTitleInsufficient;
            }
            if (c12282x2e33df6.getAgreementSelected() == 0) {
                lVar.f439567o = false;
            } else if (c12282x2e33df6.getAgreementSelected() == 1) {
                lVar.f439567o = true;
            }
            if (c12282x2e33df6.getAgreementString().length() > 0) {
                java.lang.String agreementString = c12282x2e33df6.getAgreementString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(agreementString, "<set-?>");
                lVar.f439568p = agreementString;
            }
        }
        lVar.f439559g = android.util.Base64.decode(c12282x2e33df6.getBuff(), 2);
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        ls4.u uVar = new ls4.u(lVar);
        uVar.f();
        this.logic = uVar;
    }
}
