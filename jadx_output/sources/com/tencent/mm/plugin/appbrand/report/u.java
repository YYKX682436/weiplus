package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final long f88411a = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);

    public static java.lang.String a() {
        return b() + "WxaAppRecord";
    }

    public static java.lang.String b() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        java.lang.String h17 = gm0.j1.u().h();
        if (!h17.endsWith("/")) {
            h17 = h17.concat("/");
        }
        java.lang.String str = h17 + "appbrand/report/";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }

    public static void c(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$IDKeyBatchReportTask appBrandIDKeyBatchReport$IDKeyBatchReportTask = new com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$IDKeyBatchReportTask();
        appBrandIDKeyBatchReport$IDKeyBatchReportTask.f87768f = 1;
        appBrandIDKeyBatchReport$IDKeyBatchReportTask.f87770h = str;
        appBrandIDKeyBatchReport$IDKeyBatchReportTask.f87771i = i17;
        appBrandIDKeyBatchReport$IDKeyBatchReportTask.d();
    }

    public static void d(r45.uc7 uc7Var) {
        if (uc7Var == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = com.tencent.mm.plugin.appbrand.report.t.f88401a;
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.report.s(uc7Var), "MicroMsg.AppBrandIDKeyBatchReport");
            return;
        }
        synchronized (com.tencent.mm.plugin.appbrand.report.n.f88121a) {
            com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$IDKeyBatchReportTask appBrandIDKeyBatchReport$IDKeyBatchReportTask = new com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$IDKeyBatchReportTask();
            appBrandIDKeyBatchReport$IDKeyBatchReportTask.f87772m = uc7Var;
            appBrandIDKeyBatchReport$IDKeyBatchReportTask.f87768f = 3;
            appBrandIDKeyBatchReport$IDKeyBatchReportTask.d();
        }
    }
}
