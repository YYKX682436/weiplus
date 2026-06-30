package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/RequestMedicalInsurancePayTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "Lcom/tencent/mm/sdk/event/IListener;", "d", "Lcom/tencent/mm/sdk/event/IListener;", "liteAppCloseWindowEvent", "<init>", "()V", "e", "com/tencent/mm/plugin/appbrand/jsapi/pay/v2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask */
/* loaded from: classes7.dex */
final class C12210x69394b55 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.v2 f164091e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.v2(null);

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f164092f = "MicroMsg.RequestMedicalInsurancePayTask";

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String f164093g = "wxalitebd687f90a5690a0e4fe5b08bfb273e90@pay";

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f164094h = "reportPayResult";

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f164095i = "success";

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<?> liteAppCloseWindowEvent;

    public C12210x69394b55() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.liteAppCloseWindowEvent = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask$liteAppCloseWindowEvent$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 event = c5675xda3892c3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ri riVar = event.f136001g;
                if (riVar.f89350a != 3 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(riVar.f89352c, "wxalitebd687f90a5690a0e4fe5b08bfb273e90@pay")) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RequestMedicalInsurancePayTask", "close liteapp appId %s, %s", riVar.f89352c, "wxalitebd687f90a5690a0e4fe5b08bfb273e90@pay");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12209xfce2a9ed c12209xfce2a9ed = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12209xfce2a9ed();
                c12209xfce2a9ed.f164089d = "fail close";
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12210x69394b55.this.m50420x7b736e5c(c12209xfce2a9ed);
                mo48814x2efc64();
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12209xfce2a9ed c12209xfce2a9ed = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12209xfce2a9ed();
        if (!(request instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12208x9f564abf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f164092f, "handleRequest, request not instance of RequestMedicalInsurancePayRequest");
            c12209xfce2a9ed.f164089d = "fail";
            m50420x7b736e5c(c12209xfce2a9ed);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12208x9f564abf c12208x9f564abf = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12208x9f564abf) request;
        java.lang.String queryString = c12208x9f564abf.getQueryString();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", f164093g);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
        bundle.putString("query", queryString);
        bundle.putLong("timeout", 30000L);
        bundle.putBoolean("withDownloadLoading", true);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WA_APP;
        c3708xc1f46f80.f14312x721f2ec7 = c12208x9f564abf.getAppId();
        bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.w2(c12209xfce2a9ed, this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(m50421x3c6fed6a(), bundle, true, false, sVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x2(c12209xfce2a9ed, this));
        this.liteAppCloseWindowEvent.mo48813x58998cd();
    }
}
