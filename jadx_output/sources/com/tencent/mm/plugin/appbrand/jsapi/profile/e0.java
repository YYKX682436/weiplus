package com.tencent.mm.plugin.appbrand.jsapi.profile;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H$J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\b\u0010\r\u001a\u00020\fH\u0014¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/e0;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Landroid/content/Context;", "context", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Lab0/f0;", "callback", "Lab0/a;", "b", "Ljz5/f0;", "handleRequest", "", "shouldOverrideExitAnimation", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class e0 extends com.tencent.mm.plugin.appbrand.ipc.v {
    public abstract ab0.a b(android.content.Context context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request, ab0.f0 callback);

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (appBrandProxyUIProcessTask$ProcessRequest == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, request is null");
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult(com.tencent.mm.plugin.appbrand.jsapi.profile.b0.f82777h, ""));
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(getActivityContext(), getActivityContext().getString(com.tencent.mm.R.string.ggd), true, 3, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, jumpToProfile");
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        ab0.a b17 = b(activityContext, appBrandProxyUIProcessTask$ProcessRequest, new com.tencent.mm.plugin.appbrand.jsapi.profile.d0(this, f17));
        if (b17 != null) {
            f17.setOnCancelListener(new com.tencent.mm.plugin.appbrand.jsapi.profile.c0(this, b17));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, jumpProfileTask is null");
        finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult(com.tencent.mm.plugin.appbrand.jsapi.profile.b0.f82777h, ""));
        f17.dismiss();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public boolean shouldOverrideExitAnimation() {
        return true;
    }
}
