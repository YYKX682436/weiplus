package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class s4 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.a5 f82046c;

    public s4(com.tencent.mm.plugin.appbrand.jsapi.media.a5 a5Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82046c = a5Var;
        this.f82044a = lVar;
        this.f82045b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult = (com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.a5 a5Var = this.f82046c;
        int i17 = this.f82045b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82044a;
        if (jsApiChooseVideo$ChooseResult == null) {
            lVar.a(i17, a5Var.o("fail"));
            return;
        }
        int i18 = jsApiChooseVideo$ChooseResult.f81670d;
        if (i18 != -1) {
            if (i18 != 0) {
                lVar.a(i17, a5Var.o("fail"));
                return;
            } else {
                lVar.a(i17, a5Var.o("cancel"));
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject appBrandLocalVideoObject = jsApiChooseVideo$ChooseResult.f81671e;
        if (appBrandLocalVideoObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseVideo", "choose result code is OK but videoObj null");
            lVar.a(i17, a5Var.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tempFilePath", appBrandLocalVideoObject.f76102d);
        hashMap.put("duration", java.lang.Integer.valueOf(appBrandLocalVideoObject.f76112n));
        hashMap.put("size", java.lang.Long.valueOf(appBrandLocalVideoObject.f76113o));
        hashMap.put("height", java.lang.Integer.valueOf(appBrandLocalVideoObject.f76115q));
        hashMap.put("width", java.lang.Integer.valueOf(appBrandLocalVideoObject.f76114p));
        lVar.a(i17, a5Var.p("ok", hashMap));
    }
}
