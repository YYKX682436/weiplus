package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public final class t implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f80991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.v f80993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80994g;

    public t(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.fakenative.v vVar, java.lang.String str) {
        this.f80991d = c0Var;
        this.f80992e = i17;
        this.f80993f = vVar;
        this.f80994g = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String o17 = this.f80993f.o("ok");
        int i17 = this.f80992e;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f80991d;
        c0Var.a(i17, o17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSaveRuntimeSnapshot", "invokeMM ok, appId=" + c0Var.getAppId() + ", path=" + this.f80994g);
    }
}
