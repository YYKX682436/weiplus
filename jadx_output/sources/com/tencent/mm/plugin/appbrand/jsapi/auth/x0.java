package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask f79775d;

    public x0(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask) {
        this.f79775d = jsApiAuthorize$AuthorizeTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask = this.f79775d;
        android.content.Context context = jsApiAuthorize$AuthorizeTask.f79331g.getContext();
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo mMAuthScopeRiskInfo = jsApiAuthorize$AuthorizeTask.H;
        com.tencent.mm.plugin.appbrand.jsapi.auth.m0.f79634a.a(context, mMAuthScopeRiskInfo.f79454f, mMAuthScopeRiskInfo.f79456h, mMAuthScopeRiskInfo.f79455g, com.tencent.mm.plugin.appbrand.jsapi.auth.l0.f79624a.a(jsApiAuthorize$AuthorizeTask.f79331g.getContext(), jsApiAuthorize$AuthorizeTask.H), new com.tencent.mm.plugin.appbrand.jsapi.auth.w0(this));
    }
}
