package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.tencent.mm.plugin.appbrand.launching.q4 q4Var) {
        super(0);
        this.f84780d = q4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.launching.h4 h4Var = com.tencent.mm.plugin.appbrand.launching.q4.f85057t;
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var = this.f84780d.f85059b;
        com.tencent.mm.plugin.appbrand.appcache.sa wxaPkgStorageRouter = ((com.tencent.mm.plugin.appbrand.app.PluginAppBrand) i95.n0.c(com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class)).getWxaPkgStorageRouter();
        kotlin.jvm.internal.o.f(wxaPkgStorageRouter, "getWxaPkgStorageRouter(...)");
        java.lang.String appId = o6Var.f84851d;
        o6Var.f84855h.a();
        kotlin.jvm.internal.o.g(appId, "appId");
        return (kz5.z.F(qq5.a.f365997d, o6Var.f84853f) && com.tencent.mm.plugin.appbrand.appcache.g0.a(o6Var.f84854g)) ? wxaPkgStorageRouter.f75964b : wxaPkgStorageRouter.f75963a;
    }
}
