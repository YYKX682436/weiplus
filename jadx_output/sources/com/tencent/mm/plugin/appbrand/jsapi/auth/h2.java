package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class h2 implements com.tencent.mm.plugin.appbrand.jsapi.auth.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask f79569a;

    public h2(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask) {
        this.f79569a = jsApiLogin$LoginTask;
    }

    public void a(int i17, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable appBrandErrorInfoParcelable) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "onFailure errorCode:%d errorMsg:%s errorInfo:%s!", java.lang.Integer.valueOf(i17), str, appBrandErrorInfoParcelable);
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask = this.f79569a;
        jsApiLogin$LoginTask.f79365r = "fail";
        jsApiLogin$LoginTask.C = i17;
        jsApiLogin$LoginTask.D = str;
        jsApiLogin$LoginTask.E = appBrandErrorInfoParcelable;
        jsApiLogin$LoginTask.c();
    }
}
