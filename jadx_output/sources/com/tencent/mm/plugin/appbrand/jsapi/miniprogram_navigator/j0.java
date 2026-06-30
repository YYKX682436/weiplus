package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class j0 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f82240g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f82241h;

    public j0(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        this.f82237d = str;
        this.f82238e = str2;
        this.f82239f = str3;
        this.f82240g = j17;
        this.f82241h = appBrandStatObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        java.lang.String str = this.f82237d;
        h(com.tencent.mm.plugin.appbrand.x0.d(str), str, this.f82238e, this.f82239f);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        h(w0Var, this.f82237d, this.f82238e, this.f82239f);
    }

    public final void h(com.tencent.mm.plugin.appbrand.w0 w0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f82240g;
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniProgramNavigatorAdReportHelper", "[rewardAD] doReport appId: %s, adInfo: %s", str, str3);
        int ordinal = w0Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i17 = 1;
        } else {
            i17 = ordinal != 4 ? ordinal != 7 ? 0 : 3 : 2;
        }
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k0.b(i17, str, str2, str3, currentTimeMillis);
        this.f82241h.f87794m = null;
        com.tencent.mm.plugin.appbrand.x0.e(str, this);
    }
}
