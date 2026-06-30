package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class b1 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.e1 f79953a;

    public b1(com.tencent.mm.plugin.appbrand.jsapi.biz.e1 e1Var) {
        this.f79953a = e1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "receive callback, value: " + str);
        this.f79953a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse(true, "", str.toString()));
    }
}
