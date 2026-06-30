package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f88244a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.quality.l1 f88245b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88246c;

    /* renamed from: d, reason: collision with root package name */
    public long f88247d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f88248e;

    public n1(com.tencent.mm.plugin.appbrand.report.quality.j1 j1Var) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f88248e = sparseArray;
        sparseArray.put(1, new com.tencent.mm.plugin.appbrand.report.quality.m1(1));
        sparseArray.put(2, new com.tencent.mm.plugin.appbrand.report.quality.m1(2));
        sparseArray.put(3, new com.tencent.mm.plugin.appbrand.report.quality.m1(3));
        sparseArray.put(4, new com.tencent.mm.plugin.appbrand.report.quality.m1(4));
        sparseArray.put(5, new com.tencent.mm.plugin.appbrand.report.quality.m1(5));
        sparseArray.put(6, new com.tencent.mm.plugin.appbrand.report.quality.m1(6));
        sparseArray.put(7, new com.tencent.mm.plugin.appbrand.report.quality.m1(7));
    }

    public final void a() {
        yd.c0 c0Var = yd.c0.INST;
        android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
        android.os.Debug.getMemoryInfo(memoryInfo);
        yd.b0 a17 = yd.c0.a(memoryInfo);
        yd.b0 h17 = c0Var.h();
        android.util.SparseArray sparseArray = this.f88248e;
        ((com.tencent.mm.plugin.appbrand.report.quality.m1) sparseArray.get(1)).a(a17.f460918a);
        com.tencent.mm.plugin.appbrand.report.quality.m1 m1Var = (com.tencent.mm.plugin.appbrand.report.quality.m1) sparseArray.get(2);
        int i17 = a17.f460924g;
        if (i17 <= 0) {
            i17 = a17.f460920c;
        }
        m1Var.a(i17);
        ((com.tencent.mm.plugin.appbrand.report.quality.m1) sparseArray.get(3)).a(a17.f460919b);
        ((com.tencent.mm.plugin.appbrand.report.quality.m1) sparseArray.get(4)).a(h17.f460921d);
        ((com.tencent.mm.plugin.appbrand.report.quality.m1) sparseArray.get(5)).a(a17.f460925h);
        ((com.tencent.mm.plugin.appbrand.report.quality.m1) sparseArray.get(6)).a(a17.f460926i);
        if (((ob0.h3) i95.n0.c(ob0.h3.class)) != null) {
            ((com.tencent.mm.plugin.appbrand.report.quality.m1) sparseArray.get(7)).a((int) ((com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.f() / 1024) / 1024));
        }
    }

    public final com.tencent.mm.plugin.appbrand.report.quality.m1 b(int i17) {
        com.tencent.mm.plugin.appbrand.report.quality.m1 m1Var = (com.tencent.mm.plugin.appbrand.report.quality.m1) this.f88248e.get(i17);
        if (m1Var != null) {
            return m1Var;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("StatisticsWrapper null, type:%d", java.lang.Integer.valueOf(i17)));
    }
}
