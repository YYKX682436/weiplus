package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.config.AppBrandInitConfigLU f86652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f86653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.config.AppBrandSysConfigLU f86654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.o1 f86655g;

    public h1(com.tencent.mm.plugin.appbrand.page.o1 o1Var, com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU, com.tencent.luggage.sdk.jsapi.component.b bVar, com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU) {
        this.f86655g = o1Var;
        this.f86652d = appBrandInitConfigLU;
        this.f86653e = bVar;
        this.f86654f = appBrandSysConfigLU;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = ((ze.n) this.f86655g.f86940a).l2() != null ? this.f86652d.f47276v : "";
        new na1.d().x(this.f86653e.v3(), na1.c.BeforeJumpToProfile, 0);
        com.tencent.luggage.sdk.jsapi.component.b bVar = this.f86653e;
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(bVar.getAppId(), new ld1.c(bVar));
        k91.z5 z5Var = new k91.z5();
        z5Var.f305863a = this.f86654f.f305842e;
        z5Var.f305872j = 3;
        z5Var.f305873k = this.f86653e.a2() != null ? this.f86653e.X1() : "";
        z5Var.f305870h = this.f86654f.f305852r.f75399d;
        z5Var.f305869g = this.f86654f.f305852r.pkgVersion;
        com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.U6(this.f86653e.getF147807d(), this.f86652d.f47278x, 3, 1236, str, true, z5Var.a(), null, com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.a(this.f86653e.getF147807d()), -1);
        com.tencent.mm.plugin.appbrand.report.v0.e(this.f86653e.getAppId(), this.f86653e.X1(), 6, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
