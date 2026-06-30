package com.tencent.mm.plugin.appbrand.jsapi.pay;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/pay/AppBrandJsApiPayUtils$ProxyMMActivityResultTask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "onHostActivityDestroyed", "", "d", "Z", "mHasActivityResult", "", "e", "I", "requestId", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandJsApiPayUtils$ProxyMMActivityResultTask extends com.tencent.mm.plugin.appbrand.ipc.v implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean mHasActivityResult;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int requestId;

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        kotlin.jvm.internal.o.e(appBrandProxyUIProcessTask$ProcessRequest, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils.ProxyMMActivityResultRequest");
        int d17 = ((com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultRequest) appBrandProxyUIProcessTask$ProcessRequest).d();
        this.requestId = d17;
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.jsapi.pay.f.f82597b;
        java.lang.Object obj = sparseArray.get(d17);
        if (obj != null) {
            sparseArray.remove(d17);
        } else {
            obj = null;
        }
        yz5.l lVar = (yz5.l) obj;
        if (lVar == null) {
            finishProcess(null);
            return;
        }
        nf.g.a(getActivityContext()).f336584c.add(new com.tencent.mm.plugin.appbrand.jsapi.pay.d(this));
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        lVar.invoke(activityContext);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onHostActivityDestroyed() {
        if (this.mHasActivityResult) {
            return;
        }
        getActivityContext().setResult(0);
        getActivityContext().finish();
    }
}
