package com.tencent.mm.plugin.appbrand.jsapi.share;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/e2;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class e2 extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.share.ShareFileToConversationRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareFileMessage", "handleRequest, request is not ShareFileToConversationRequest");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.ShareFileToConversationRequest shareFileToConversationRequest = (com.tencent.mm.plugin.appbrand.jsapi.share.ShareFileToConversationRequest) appBrandProxyUIProcessTask$ProcessRequest;
        if (shareFileToConversationRequest.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String().length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareFileMessage", "handleRequest, fail since filePath is empty");
            com.tencent.mm.plugin.appbrand.jsapi.share.s2 s2Var = com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83248e;
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult(2));
            return;
        }
        java.lang.String fileName = com.tencent.mm.plugin.appbrand.jsapi.wf.a(shareFileToConversationRequest.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String(), shareFileToConversationRequest.getFileExt(), shareFileToConversationRequest.getCom.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME java.lang.String());
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.share.b2.f83117a;
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        java.lang.String filePath = shareFileToConversationRequest.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String();
        com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams params = shareFileToConversationRequest.getChatToolParams();
        com.tencent.mm.plugin.appbrand.jsapi.share.d2 d2Var = new com.tencent.mm.plugin.appbrand.jsapi.share.d2(this);
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.plugin.appbrand.jsapi.share.y1 y1Var = new com.tencent.mm.plugin.appbrand.jsapi.share.y1(d2Var, activityContext, fileName, filePath, params);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(filePath));
        java.lang.Long valueOf = r6Var.m() ? java.lang.Long.valueOf(r6Var.C()) : null;
        if (valueOf == null || 0 >= valueOf.longValue()) {
            db5.e1.y(activityContext, activityContext.getString(com.tencent.mm.R.string.ccu), "", activityContext.getString(com.tencent.mm.R.string.f492294fz1), new com.tencent.mm.plugin.appbrand.jsapi.share.z1(y1Var, valueOf));
            return;
        }
        long k17 = ip.c.k();
        if (k17 < valueOf.longValue()) {
            db5.e1.y(activityContext, activityContext.getString(com.tencent.mm.R.string.a0m, com.tencent.mm.sdk.platformtools.t8.f0(k17)), "", activityContext.getString(com.tencent.mm.R.string.f492294fz1), new com.tencent.mm.plugin.appbrand.jsapi.share.a2(y1Var, valueOf));
        } else {
            y1Var.invoke(java.lang.Boolean.TRUE, valueOf);
        }
    }
}
