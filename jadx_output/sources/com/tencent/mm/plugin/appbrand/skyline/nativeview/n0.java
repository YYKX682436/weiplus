package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes7.dex */
public final class n0 implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f88924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.v f88925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.x f88926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 f88927h;

    public n0(int i17, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.jsapi.v vVar, com.tencent.mm.plugin.appbrand.jsapi.x xVar, com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 t0Var) {
        this.f88923d = i17;
        this.f88924e = n7Var;
        this.f88925f = vVar;
        this.f88926g = xVar;
        this.f88927h = t0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        int i17 = this.f88923d;
        sb6.append(i17);
        sb6.append(" onDestroy");
        com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f88924e;
        n7Var.K(this);
        n7Var.O(this.f88925f);
        n7Var.I(this.f88926g);
        com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 t0Var = this.f88927h;
        t0Var.f88948i = null;
        t0Var.f88946g = null;
        com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a.d(i17, "");
    }
}
