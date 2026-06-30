package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiShareFinderShop$ShareFinderShopTask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "onActivityStopped", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopTask */
/* loaded from: classes7.dex */
final class C12128x76ddc726 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v implements p012xc85e97e9.p093xedfae76a.x {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        m50421x3c6fed6a().mo273xed6858b4().a(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12127x3357757e c12127x3357757e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12127x3357757e();
        if (!(request instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12126x377af14e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Finder.JsApiShareFinderShop", "handleRequest, request not instance of ShareFinderShopRequest");
            m50420x7b736e5c(c12127x3357757e);
            return;
        }
        java.lang.String reqData = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12126x377af14e) request).getReqData();
        if (reqData == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Finder.JsApiShareFinderShop", "data is null");
            m50420x7b736e5c(c12127x3357757e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiShareFinderShop", "JsApiShareFinderShop json:".concat(reqData));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(m50421x3c6fed6a), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.x0(this, reqData, c12127x3357757e, null), 3, null);
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: onActivityStopped */
    public final void m50983x59edc7df() {
        m50420x7b736e5c(null);
    }
}
