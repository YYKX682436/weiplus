package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.j2 f81297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f81298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81299f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81300g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81301h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81302i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f81303m;

    public i2(com.tencent.mm.plugin.appbrand.jsapi.j2 j2Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81297d = j2Var;
        this.f81298e = activity;
        this.f81299f = str;
        this.f81300g = str2;
        this.f81301h = str3;
        this.f81302i = lVar;
        this.f81303m = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.j2 j2Var = this.f81297d;
        j2Var.getClass();
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) uk0.a.d(new com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites$DoFavoriteParams(this.f81299f, this.f81300g, this.f81301h), com.tencent.mm.plugin.appbrand.jsapi.d2.f80734a);
        java.lang.Integer valueOf = iPCInteger != null ? java.lang.Integer.valueOf(iPCInteger.f68404d) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "doFavoriteAnyProcess, result: " + valueOf);
        int intValue = valueOf != null ? valueOf.intValue() : Integer.MIN_VALUE;
        pm0.v.X(new com.tencent.mm.plugin.appbrand.jsapi.h2(intValue, this.f81298e));
        boolean z17 = intValue == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, success: " + z17);
        this.f81302i.a(this.f81303m, j2Var.o(z17 ? "ok" : "fail"));
    }
}
