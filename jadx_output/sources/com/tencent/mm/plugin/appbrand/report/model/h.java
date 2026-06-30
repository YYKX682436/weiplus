package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.w2 f87981a;

    /* renamed from: b, reason: collision with root package name */
    public volatile java.lang.String f87982b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.String f87983c;

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.AppBrandRuntime f87984d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f87985e = 0;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f87986f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f87987g = new java.util.LinkedList();

    public h(int i17) {
        this.f87981a = new com.tencent.mm.plugin.appbrand.report.w2("MicroMsg.AppBrandPageViewStatistics[" + i17 + "]");
    }

    public long a() {
        boolean z17 = false;
        if (!(1 == this.f87981a.f88420a.get())) {
            int i17 = this.f87981a.f88420a.get();
            if (!(-1 == i17 || 2 == i17)) {
                return 0L;
            }
        }
        long j17 = this.f87981a.f88424e;
        long j18 = this.f87985e;
        long j19 = this.f87986f;
        if (j17 <= 0) {
            if (b()) {
                return 0L;
            }
            if (this.f87984d != null && this.f87984d.S) {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewStatistics", "foregroundMs invalid(%d), loadStart %d, loadCost %d, [%s/%s], runtimeIsFinishing=%b", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), this.f87983c, this.f87982b, java.lang.Boolean.valueOf(z17));
            if (j18 > 0 && j19 > 0 && j17 == 0) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                return java.lang.System.currentTimeMillis() - j18;
            }
        }
        return java.lang.Math.max(0L, j17);
    }

    public boolean b() {
        return this.f87985e > 0 && this.f87986f <= 0;
    }

    public void c() {
        com.tencent.mm.plugin.appbrand.report.w2 w2Var = this.f87981a;
        boolean z17 = w2Var.f88420a.getAndSet(2) != 2;
        if (z17) {
            w2Var.f88421b.d();
            com.tencent.mm.plugin.appbrand.report.t2 t2Var = w2Var.f88423d;
            w2Var.f88421b = t2Var;
            t2Var.getClass();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            t2Var.f88409a = java.lang.System.currentTimeMillis();
        }
        if (!z17) {
            return;
        }
        while (true) {
            java.util.LinkedList linkedList = this.f87987g;
            if (linkedList.isEmpty()) {
                return;
            } else {
                ((java.lang.Runnable) linkedList.pollFirst()).run();
            }
        }
    }

    public void d() {
        if (this.f87985e <= 0) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.w2 w2Var = this.f87981a;
        boolean z17 = w2Var.f88420a.getAndSet(1) != 1;
        if (z17) {
            w2Var.f88421b.d();
            com.tencent.mm.plugin.appbrand.report.u2 u2Var = w2Var.f88422c;
            w2Var.f88421b = u2Var;
            u2Var.getClass();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            u2Var.f88414a = java.lang.System.currentTimeMillis();
        }
        if (z17) {
            this.f87987g.clear();
        }
    }

    public void e(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f87983c = appBrandRuntime.f74803n;
        this.f87984d = appBrandRuntime;
    }
}
