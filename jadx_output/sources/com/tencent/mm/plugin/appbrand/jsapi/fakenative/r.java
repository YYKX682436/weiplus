package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public final class r implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f80986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f80987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f80988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.v f80989d;

    public r(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.fakenative.v vVar) {
        this.f80986a = o6Var;
        this.f80987b = c0Var;
        this.f80988c = i17;
        this.f80989d = vVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        android.graphics.Bitmap a17 = com.tencent.mm.plugin.appbrand.ye.a(this.f80986a);
        if (a17 == null || a17.isRecycled()) {
            km5.u.b().a(null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save failed, appId=");
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f80987b;
            sb6.append(c0Var.getAppId());
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiSaveRuntimeSnapshot", sb6.toString());
            c0Var.a(this.f80988c, this.f80989d.o("fail"));
        }
        return a17;
    }
}
