package com.tencent.mm.plugin.appbrand.jsapi.share;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/g3;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class g3 extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.share.ShareVideoToConversationRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "handleRequest, request is not ShareVideoToConversationRequest");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.ShareVideoToConversationRequest shareVideoToConversationRequest = (com.tencent.mm.plugin.appbrand.jsapi.share.ShareVideoToConversationRequest) appBrandProxyUIProcessTask$ProcessRequest;
        if (shareVideoToConversationRequest.getVideoPath().length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "handleRequest, fail since videoPath is empty");
            com.tencent.mm.plugin.appbrand.jsapi.share.s2 s2Var = com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83248e;
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult(2));
            return;
        }
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.share.d3.f83128a;
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        java.lang.String videoPath = shareVideoToConversationRequest.getVideoPath();
        java.lang.String thumbPath = shareVideoToConversationRequest.getThumbPath();
        com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams params = shareVideoToConversationRequest.getChatToolParams();
        com.tencent.mm.plugin.appbrand.jsapi.share.f3 f3Var = new com.tencent.mm.plugin.appbrand.jsapi.share.f3(this);
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.plugin.appbrand.jsapi.share.z2 z2Var = new com.tencent.mm.plugin.appbrand.jsapi.share.z2(f3Var, videoPath, thumbPath, activityContext, params);
        int b17 = com.tencent.mm.plugin.appbrand.jsapi.xf.b(videoPath);
        if (b17 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "isVideoLegal2Share, durationS: " + b17);
            z2Var.invoke(java.lang.Boolean.FALSE, null);
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(videoPath));
        java.lang.Long valueOf = r6Var.m() ? java.lang.Long.valueOf(r6Var.C()) : null;
        if (valueOf == null || 0 >= valueOf.longValue()) {
            db5.e1.y(activityContext, activityContext.getString(com.tencent.mm.R.string.fje), "", activityContext.getString(com.tencent.mm.R.string.f492294fz1), new com.tencent.mm.plugin.appbrand.jsapi.share.b3(z2Var));
        } else if (ip.c.l() < valueOf.longValue()) {
            db5.e1.y(activityContext, activityContext.getString(com.tencent.mm.R.string.fjz), "", activityContext.getString(com.tencent.mm.R.string.f492294fz1), new com.tencent.mm.plugin.appbrand.jsapi.share.c3(z2Var));
        } else {
            z2Var.invoke(java.lang.Boolean.TRUE, new com.tencent.mm.plugin.appbrand.jsapi.share.v2(b17));
        }
    }
}
