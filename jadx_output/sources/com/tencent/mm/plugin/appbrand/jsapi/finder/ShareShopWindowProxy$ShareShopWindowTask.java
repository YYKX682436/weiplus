package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/ShareShopWindowProxy$ShareShopWindowTask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "onActivityStopped", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class ShareShopWindowProxy$ShareShopWindowTask extends com.tencent.mm.plugin.appbrand.ipc.v implements androidx.lifecycle.x {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.appbrand.jsapi.finder.ShareShopWindowProxy$ShareShopWindowRequest shareShopWindowProxy$ShareShopWindowRequest = appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.finder.ShareShopWindowProxy$ShareShopWindowRequest ? (com.tencent.mm.plugin.appbrand.jsapi.finder.ShareShopWindowProxy$ShareShopWindowRequest) appBrandProxyUIProcessTask$ProcessRequest : null;
        if (shareShopWindowProxy$ShareShopWindowRequest == null || shareShopWindowProxy$ShareShopWindowRequest.getIntent() == null) {
            finishProcess(null);
            return;
        }
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        if (activityContext == null || (mo133getLifecycle = activityContext.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public final void onActivityStopped() {
        finishProcess(null);
    }
}
