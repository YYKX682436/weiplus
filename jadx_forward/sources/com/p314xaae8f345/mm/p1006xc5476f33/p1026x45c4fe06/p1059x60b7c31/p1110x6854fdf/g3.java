package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/g3;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class g3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12241x4943f75)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "handleRequest, request is not ShareVideoToConversationRequest");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12241x4943f75 c12241x4943f75 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12241x4943f75) abstractC11887x3610e10c;
        if (c12241x4943f75.getVideoPath().length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "handleRequest, fail since videoPath is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164781e;
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12240x358662ba(2));
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d3.f164661a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
        java.lang.String videoPath = c12241x4943f75.getVideoPath();
        java.lang.String thumbPath = c12241x4943f75.getThumbPath();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 params = c12241x4943f75.getChatToolParams();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f3 f3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f3(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.z2 z2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.z2(f3Var, videoPath, thumbPath, m50421x3c6fed6a, params);
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xf.b(videoPath);
        if (b17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "isVideoLegal2Share, durationS: " + b17);
            z2Var.mo149xb9724478(java.lang.Boolean.FALSE, null);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(videoPath));
        java.lang.Long valueOf = r6Var.m() ? java.lang.Long.valueOf(r6Var.C()) : null;
        if (valueOf == null || 0 >= valueOf.longValue()) {
            db5.e1.y(m50421x3c6fed6a, m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fje), "", m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.b3(z2Var));
        } else if (ip.c.l() < valueOf.longValue()) {
            db5.e1.y(m50421x3c6fed6a, m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjz), "", m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.c3(z2Var));
        } else {
            z2Var.mo149xb9724478(java.lang.Boolean.TRUE, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v2(b17));
        }
    }
}
