package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f87330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.performance.c0 f87331e;

    public b0(com.tencent.mm.plugin.appbrand.performance.c0 c0Var, long j17) {
        this.f87331e = c0Var;
        this.f87330d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.performance.c0 c0Var = this.f87331e;
        java.lang.String str2 = c0Var.f87333a;
        c0Var.getClass();
        long j17 = this.f87330d;
        int i17 = j17 <= 60 ? 1 : (j17 <= 60 || j17 > 80) ? (j17 <= 80 || j17 > 100) ? (j17 <= 100 || j17 > 300) ? (j17 <= 300 || j17 > 600) ? (j17 <= 600 || j17 > 1000) ? 7 : 6 : 5 : 4 : 3 : 2;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1246, i17);
        g0Var.A(1246, 0);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = c0Var.f87334b;
        if (n7Var != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(c0Var.f87335c)) {
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = n7Var.getRuntime() != null ? n7Var.getRuntime().S2(false) : com.tencent.mm.plugin.appbrand.appcache.e8.b();
                if (S2 != null) {
                    c0Var.f87335c = S2.W0();
                }
            }
            if (c0Var.f87336d < 0) {
                int ordinal = com.tencent.mm.plugin.appbrand.report.l1.a(n7Var).ordinal();
                if (ordinal == 0) {
                    c0Var.f87336d = 2;
                } else if (ordinal == 1) {
                    c0Var.f87336d = 4;
                } else if (ordinal == 2) {
                    c0Var.f87336d = 3;
                } else if (ordinal != 3) {
                    c0Var.f87336d = -1;
                } else {
                    c0Var.f87336d = 5;
                }
            }
            if (c0Var.f87336d == 3) {
                c0Var.f87337e = org.xwalk.core.XWalkEnvironment.d() + "";
            }
        }
        if (n7Var == null || n7Var.getRuntime() == null) {
            str = "";
        } else {
            java.lang.String n07 = n7Var.getRuntime().n0();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str = fp.s0.a(n07 != null ? n07 : "");
        }
        com.tencent.mm.plugin.appbrand.report.d.f87824a.b(18794, java.lang.String.format("%d,%s,%s,%s,%d,%s", java.lang.Long.valueOf(j17), str2, str, c0Var.f87335c, java.lang.Integer.valueOf(c0Var.f87336d), c0Var.f87337e));
    }
}
