package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/e2;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class e2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12237xf6a7e2f6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareFileMessage", "handleRequest, request is not ShareFileToConversationRequest");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12237xf6a7e2f6 c12237xf6a7e2f6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12237xf6a7e2f6) abstractC11887x3610e10c;
        if (c12237xf6a7e2f6.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String().length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareFileMessage", "handleRequest, fail since filePath is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164781e;
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12240x358662ba(2));
            return;
        }
        java.lang.String fileName = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.wf.a(c12237xf6a7e2f6.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String(), c12237xf6a7e2f6.getFileExt(), c12237xf6a7e2f6.getCom.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME java.lang.String());
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.b2.f164650a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
        java.lang.String filePath = c12237xf6a7e2f6.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 params = c12237xf6a7e2f6.getChatToolParams();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d2(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.y1(d2Var, m50421x3c6fed6a, fileName, filePath, params);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(filePath));
        java.lang.Long valueOf = r6Var.m() ? java.lang.Long.valueOf(r6Var.C()) : null;
        if (valueOf == null || 0 >= valueOf.longValue()) {
            db5.e1.y(m50421x3c6fed6a, m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccu), "", m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.z1(y1Var, valueOf));
            return;
        }
        long k17 = ip.c.k();
        if (k17 < valueOf.longValue()) {
            db5.e1.y(m50421x3c6fed6a, m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a0m, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(k17)), "", m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a2(y1Var, valueOf));
        } else {
            y1Var.mo149xb9724478(java.lang.Boolean.TRUE, valueOf);
        }
    }
}
