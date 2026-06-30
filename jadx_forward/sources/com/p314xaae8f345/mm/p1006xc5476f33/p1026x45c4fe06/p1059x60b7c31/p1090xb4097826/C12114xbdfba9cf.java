package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask */
/* loaded from: classes7.dex */
final class C12114xbdfba9cf extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        r45.br2 productShareObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12113x2646a205 c12113x2646a205 = abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12113x2646a205 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12113x2646a205) abstractC11887x3610e10c : null;
        if (c12113x2646a205 == null || (productShareObject = c12113x2646a205.getProductShareObject()) == null) {
            m50420x7b736e5c(null);
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.c0(this, productShareObject, null), 3, null);
            m50421x3c6fed6a().mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask$handleRequest$2
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
                /* renamed from: onActivityStopped */
                public final void m50974x59edc7df() {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12114xbdfba9cf c12114xbdfba9cf = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12114xbdfba9cf.this;
                    m50421x3c6fed6a = c12114xbdfba9cf.m50421x3c6fed6a();
                    m50421x3c6fed6a.mo273xed6858b4().c(this);
                    c12114xbdfba9cf.m50420x7b736e5c(null);
                }
            });
        }
    }
}
