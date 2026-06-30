package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes4.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.f0 f90436d = new com.tencent.mm.plugin.appbrand.utils.f0();

    public f0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_miniprogram_loading_perf_when_splash, true);
        jz5.g gVar = com.tencent.mm.plugin.appbrand.utils.g0.f90447a;
        com.tencent.mars.xlog.Log.i("AppBrandLoadingABTestHelper", "enableLoadingPerf, expt is %s", java.lang.Boolean.valueOf(fj6));
        return java.lang.Boolean.valueOf(fj6);
    }
}
