package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f79598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask f79599e;

    public j2(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask, java.util.LinkedList linkedList) {
        this.f79599e = jsApiLogin$LoginTask;
        this.f79598d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.i2 i2Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.i2(this);
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask = this.f79599e;
        jsApiLogin$LoginTask.f79357g.getDialogContainer().c(new fl1.k(jsApiLogin$LoginTask.f79356f.H(jsApiLogin$LoginTask.f79357g), com.tencent.mm.plugin.appbrand.jsapi.auth.n0.I(this.f79598d), jsApiLogin$LoginTask.f79370w, jsApiLogin$LoginTask.f79371x, i2Var));
    }
}
