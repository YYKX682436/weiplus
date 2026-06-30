package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.u1 f89261a = new com.tencent.mm.plugin.appbrand.u1();

    public final void a(l81.b1 bundle, l81.v0 v0Var) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        int hashCode = bundle.hashCode();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreRenderColdStartService", "start with id:" + hashCode + " username:" + bundle.f317012a + " appId:" + bundle.f317014b + " versionType:" + bundle.f317016c + " path:" + bundle.f317022f + " scene:" + bundle.f317032k);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.minigame.y.CTRL_INDEX, 0);
        java.lang.String str = bundle.f317014b;
        if (str != null && com.tencent.mm.plugin.appbrand.launching.g5.f84619a.d(str)) {
            bundle.f317016c = 1;
        } else if (com.tencent.mm.plugin.appbrand.launching.g5.f84619a.e()) {
            bundle.f317016c = 2;
        }
        com.tencent.mm.plugin.appbrand.s1 s1Var = new com.tencent.mm.plugin.appbrand.s1(hashCode, elapsedRealtime, v0Var);
        new com.tencent.mm.plugin.appbrand.launching.precondition.k0(hashCode, bundle, new com.tencent.mm.plugin.appbrand.t1(hashCode, s1Var), s1Var, true, com.tencent.luggage.sdk.launching.p.PRE_RENDER).a();
    }
}
