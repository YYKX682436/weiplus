package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class v0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask f79758a;

    public v0(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask) {
        this.f79758a = jsApiAuthorize$AuthorizeTask;
    }

    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "onFailure !");
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask = this.f79758a;
        jsApiAuthorize$AuthorizeTask.f79339r = "fail";
        jsApiAuthorize$AuthorizeTask.K = i17;
        jsApiAuthorize$AuthorizeTask.L = str;
        jsApiAuthorize$AuthorizeTask.c();
    }
}
