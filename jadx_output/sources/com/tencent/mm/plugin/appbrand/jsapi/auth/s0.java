package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class s0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.o f79725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask f79726e;

    public s0(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        this.f79726e = jsApiAuthorize$AuthorizeTask;
        this.f79725d = oVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o
    public void a() {
        this.f79725d.a();
        this.f79726e.x();
    }
}
