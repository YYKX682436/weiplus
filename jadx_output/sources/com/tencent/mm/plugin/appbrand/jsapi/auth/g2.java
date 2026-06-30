package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class g2 implements com.tencent.mm.plugin.appbrand.jsapi.auth.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.o f79562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask f79563e;

    public g2(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        this.f79563e = jsApiLogin$LoginTask;
        this.f79562d = oVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o
    public void a() {
        this.f79562d.a();
        this.f79563e.x();
    }
}
