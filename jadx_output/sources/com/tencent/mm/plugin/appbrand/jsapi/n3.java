package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.o3 f82364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f82365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82368h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82369i;

    public n3(com.tencent.mm.plugin.appbrand.jsapi.o3 o3Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82364d = o3Var;
        this.f82365e = activity;
        this.f82366f = str;
        this.f82367g = str2;
        this.f82368h = lVar;
        this.f82369i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.o3 o3Var = this.f82364d;
        o3Var.getClass();
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) uk0.a.d(new com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams(this.f82366f, this.f82367g), com.tencent.mm.plugin.appbrand.jsapi.i3.f81304a);
        java.lang.Integer valueOf = iPCInteger != null ? java.lang.Integer.valueOf(iPCInteger.f68404d) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteAnyProcess, result: " + valueOf);
        int intValue = valueOf != null ? valueOf.intValue() : Integer.MIN_VALUE;
        pm0.v.X(new com.tencent.mm.plugin.appbrand.jsapi.m3(intValue, this.f82365e));
        boolean z17 = intValue == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, success: " + z17);
        this.f82368h.a(this.f82369i, o3Var.o(z17 ? "ok" : "fail"));
    }
}
