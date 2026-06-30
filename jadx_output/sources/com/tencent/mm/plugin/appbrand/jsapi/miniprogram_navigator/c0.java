package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f82198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g f82200c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f82202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0 f82203f;

    public c0(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0 i0Var, ik1.b0 b0Var, com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar, java.lang.String str, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        this.f82203f = i0Var;
        this.f82198a = b0Var;
        this.f82199b = yVar;
        this.f82200c = gVar;
        this.f82201d = str;
        this.f82202e = launchParcel;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) obj;
        if (this.f82198a.f291824a != null) {
            ((ph1.l) this.f82198a.f291824a).dismiss();
        }
        if (appBrandInitConfigLU == null) {
            km5.u.b().a(new java.lang.Exception("get attrs failed"));
            return null;
        }
        if (android.text.TextUtils.isEmpty(appBrandInitConfigLU.f77278d)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            km5.u.b().a(new java.lang.Exception("get invalid appId"));
            return null;
        }
        if (!this.f82199b.isRunning()) {
            km5.u.b().a(new java.lang.Exception("fail:interrupted"));
            return null;
        }
        ze.n nVar = (ze.n) this.f82199b.getRuntime();
        if (nVar == null) {
            km5.u.b().a(new java.lang.Exception("fail:internal error"));
            return null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar = this.f82200c;
        if (gVar != null) {
            gVar.b(appBrandInitConfigLU);
        }
        appBrandInitConfigLU.X = nVar.u0().X;
        if (appBrandInitConfigLU.h() && !appBrandInitConfigLU.k()) {
            this.f82203f.a(appBrandInitConfigLU.A1.f77200e, this.f82201d);
        }
        nVar.u2(appBrandInitConfigLU, this.f82202e.f84910o);
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar2 = this.f82200c;
        if (gVar2 == null) {
            return null;
        }
        gVar2.a(true, "ok");
        return null;
    }
}
