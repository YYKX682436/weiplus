package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes11.dex */
public class kb implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult f81353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lb f81354b;

    public kb(com.tencent.mm.plugin.appbrand.jsapi.lb lbVar, com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult jsApiPrivateAddContact$AddContactResult) {
        this.f81354b = lbVar;
        this.f81353a = jsApiPrivateAddContact$AddContactResult;
    }

    @Override // r35.n3
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateAddContact", "onAddContact resultCode:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult jsApiPrivateAddContact$AddContactResult = this.f81353a;
        jsApiPrivateAddContact$AddContactResult.f78597d = i17;
        this.f81354b.finishProcess(jsApiPrivateAddContact$AddContactResult);
    }
}
