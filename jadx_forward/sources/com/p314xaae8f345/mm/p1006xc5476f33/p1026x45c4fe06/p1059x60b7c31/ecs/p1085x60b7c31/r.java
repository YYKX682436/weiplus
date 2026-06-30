package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ecs/jsapi/r;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC11887x3610e10c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage.OpenEcsGiftReceivePageRequest");
        java.lang.String orderId = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.C12083xf98acc1c) abstractC11887x3610e10c).getOrderId();
        if (orderId == null || orderId.length() == 0) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenEcsGiftReceivePage", "OpenEcsGiftReceivePageTask, order id is empty", null);
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.C12084x399a08f0(-1, "invalid orderId"));
            return;
        }
        java.lang.String wi6 = ((j00.o) ((c00.d3) i95.n0.c(c00.d3.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.q(this));
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenEcsGiftReceivePage", "set open event callback, eventId:" + wi6, null);
        java.util.Map l17 = kz5.c1.l(new jz5.l("ecsOpenEventId", wi6));
        i95.m c17 = i95.n0.c(c00.e3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        l17.put("orderId", orderId);
        c00.e3.n9((c00.e3) c17, m50421x3c6fed6a, l17, null, 4, null);
    }
}
