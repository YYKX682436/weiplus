package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/pay/AppBrandJsApiPayUtils$ProxyMMActivityResultTask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "onHostActivityDestroyed", "", "d", "Z", "mHasActivityResult", "", "e", "I", "requestId", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultTask */
/* loaded from: classes7.dex */
public final class C12205x916cb7cf extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean mHasActivityResult;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int requestId;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC11887x3610e10c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils.ProxyMMActivityResultRequest");
        int d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12203xd792d405) abstractC11887x3610e10c).d();
        this.requestId = d17;
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.f164130b;
        java.lang.Object obj = sparseArray.get(d17);
        if (obj != null) {
            sparseArray.remove(d17);
        } else {
            obj = null;
        }
        yz5.l lVar = (yz5.l) obj;
        if (lVar == null) {
            m50420x7b736e5c(null);
            return;
        }
        nf.g.a(m50421x3c6fed6a()).f418117c.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.d(this));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
        lVar.mo146xb9724478(m50421x3c6fed6a);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onHostActivityDestroyed */
    public final void m51180x6f320663() {
        if (this.mHasActivityResult) {
            return;
        }
        m50421x3c6fed6a().setResult(0);
        m50421x3c6fed6a().finish();
    }
}
