package com.tencent.mm.plugin.appbrand.jsapi.emoji;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/emoji/g;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "shouldOverrideExitAnimation", "<init>", "()V", "d", "com/tencent/mm/plugin/appbrand/jsapi/emoji/c", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class g extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.emoji.c f80844d = new com.tencent.mm.plugin.appbrand.jsapi.emoji.c(null);

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f80845e = "MicroMsg.JsApiOpenDesignerProfile.FetchDesignerProxyTask";

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyRequest fetchDesignerProxyRequest = appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyRequest ? (com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyRequest) appBrandProxyUIProcessTask$ProcessRequest : null;
        if (fetchDesignerProxyRequest == null) {
            com.tencent.mars.xlog.Log.e(f80845e, "handleRequest, request type illegal: " + appBrandProxyUIProcessTask$ProcessRequest);
            com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult fetchDesignerProxyResult = new com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult();
            fetchDesignerProxyResult.f80813d = false;
            finishProcess(fetchDesignerProxyResult);
            return;
        }
        com.tencent.mm.feature.emoji.api.q6 q6Var = (com.tencent.mm.feature.emoji.api.q6) i95.n0.c(com.tencent.mm.feature.emoji.api.q6.class);
        if (q6Var == null) {
            com.tencent.mars.xlog.Log.e(f80845e, "handleRequest, unable to get emoticon page feature service");
            com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult fetchDesignerProxyResult2 = new com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult();
            fetchDesignerProxyResult2.f80813d = false;
            finishProcess(fetchDesignerProxyResult2);
            return;
        }
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(activityContext, activityContext.getString(com.tencent.mm.R.string.ggd), true, 3, null);
        com.tencent.mars.xlog.Log.i(f80845e, "handleRequest, show loading and start fetch designer info");
        ((com.tencent.mm.feature.emoji.h4) q6Var).Ai(activityContext, com.tencent.mm.plugin.appbrand.jsapi.emoji.m.f80854g.a(fetchDesignerProxyRequest.getPageExternalContext()), false, new com.tencent.mm.plugin.appbrand.jsapi.emoji.e(this, f17));
        f17.setOnCancelListener(new com.tencent.mm.plugin.appbrand.jsapi.emoji.f(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public boolean shouldOverrideExitAnimation() {
        return true;
    }
}
