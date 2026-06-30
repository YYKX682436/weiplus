package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class hb implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.mb f81290c;

    public hb(com.tencent.mm.plugin.appbrand.jsapi.mb mbVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81290c = mbVar;
        this.f81288a = lVar;
        this.f81289b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult jsApiPrivateAddContact$AddContactResult = (com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult) appBrandProxyUIProcessTask$ProcessResult;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(jsApiPrivateAddContact$AddContactResult == null ? -1000 : jsApiPrivateAddContact$AddContactResult.f78597d);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateAddContact", "onReceiveResult resultCode:%d", objArr);
        com.tencent.mm.plugin.appbrand.jsapi.mb mbVar = this.f81290c;
        int i17 = this.f81289b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81288a;
        if (jsApiPrivateAddContact$AddContactResult == null) {
            lVar.a(i17, mbVar.o("fail"));
            return;
        }
        int i18 = jsApiPrivateAddContact$AddContactResult.f78597d;
        if (i18 != -2) {
            if (i18 == -1) {
                lVar.a(i17, mbVar.o("fail"));
                return;
            } else if (i18 == 0) {
                lVar.a(i17, mbVar.o("cancel"));
                return;
            } else if (i18 != 1) {
                return;
            }
        }
        lVar.a(i17, mbVar.o("ok"));
    }
}
