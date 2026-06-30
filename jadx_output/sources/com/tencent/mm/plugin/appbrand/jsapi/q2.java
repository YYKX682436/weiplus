package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.s2 f82851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f82852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f82855h;

    public q2(com.tencent.mm.plugin.appbrand.jsapi.s2 s2Var, android.app.Activity activity, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82851d = s2Var;
        this.f82852e = activity;
        this.f82853f = str;
        this.f82854g = lVar;
        this.f82855h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.s2 s2Var = this.f82851d;
        s2Var.getClass();
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) uk0.a.d(new com.tencent.mm.ipcinvoker.type.IPCString(this.f82853f), com.tencent.mm.plugin.appbrand.jsapi.l2.f81362a);
        java.lang.Integer valueOf = iPCInteger != null ? java.lang.Integer.valueOf(iPCInteger.f68404d) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "doFavoriteAnyProcess, result: " + valueOf);
        int intValue = valueOf != null ? valueOf.intValue() : Integer.MIN_VALUE;
        pm0.v.X(new com.tencent.mm.plugin.appbrand.jsapi.p2(intValue, this.f82852e));
        boolean z17 = intValue == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, success: " + z17);
        this.f82854g.a(this.f82855h, s2Var.o(z17 ? "ok" : "fail"));
    }
}
