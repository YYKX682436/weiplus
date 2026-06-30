package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/k1;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "requestCode", "resultCode", "Landroid/content/Intent;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "mmOnActivityResult", "<init>", "()V", "d", "com/tencent/mm/plugin/appbrand/jsapi/biz/j1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class k1 extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.biz.j1 f79975d = new com.tencent.mm.plugin.appbrand.jsapi.biz.j1(null);

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f79976e = "BindPhoneTask";

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c()) {
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneResult(1, 0));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        getActivityContext().mmSetOnActivityResultCallback(this);
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneRequest jsApiStartBindPhone$BindPhoneRequest = appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneRequest ? (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneRequest) appBrandProxyUIProcessTask$ProcessRequest : null;
        java.lang.Integer valueOf = jsApiStartBindPhone$BindPhoneRequest != null ? java.lang.Integer.valueOf(jsApiStartBindPhone$BindPhoneRequest.getEnterType()) : null;
        com.tencent.mm.plugin.appbrand.jsapi.biz.a[] aVarArr = com.tencent.mm.plugin.appbrand.jsapi.biz.a.f79951d;
        if (valueOf == null || valueOf.intValue() != 1) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.g(intent, getActivityContext(), 1000);
        } else {
            intent.putExtra("back_to_status", false);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.h(getActivityContext(), intent, 1000);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v, com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1000) {
            return;
        }
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c();
        com.tencent.mars.xlog.Log.i(f79976e, "mmOnActivityResult: " + c17);
        finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneResult(0, c17 ? 1 : 0));
    }
}
