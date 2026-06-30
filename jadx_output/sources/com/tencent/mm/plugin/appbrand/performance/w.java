package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87389d;

    public w(com.tencent.mm.plugin.appbrand.performance.y yVar, int i17) {
        this.f87389d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f87389d;
        int i18 = i17 != 5 ? i17 != 10 ? i17 != 15 ? i17 != 40 ? i17 != 60 ? i17 != 80 ? 99 : 2 : 3 : 4 : 6 : 7 : 8;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1312, i18);
        g0Var.A(1312, 1);
    }
}
