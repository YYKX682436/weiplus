package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w2 f169514a;

    /* renamed from: b, reason: collision with root package name */
    public volatile java.lang.String f169515b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.String f169516c;

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169517d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f169518e = 0;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f169519f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f169520g = new java.util.LinkedList();

    public h(int i17) {
        this.f169514a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w2("MicroMsg.AppBrandPageViewStatistics[" + i17 + "]");
    }

    public long a() {
        boolean z17 = false;
        if (!(1 == this.f169514a.f169953a.get())) {
            int i17 = this.f169514a.f169953a.get();
            if (!(-1 == i17 || 2 == i17)) {
                return 0L;
            }
        }
        long j17 = this.f169514a.f169957e;
        long j18 = this.f169518e;
        long j19 = this.f169519f;
        if (j17 <= 0) {
            if (b()) {
                return 0L;
            }
            if (this.f169517d != null && this.f169517d.S) {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageViewStatistics", "foregroundMs invalid(%d), loadStart %d, loadCost %d, [%s/%s], runtimeIsFinishing=%b", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), this.f169516c, this.f169515b, java.lang.Boolean.valueOf(z17));
            if (j18 > 0 && j19 > 0 && j17 == 0) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                return java.lang.System.currentTimeMillis() - j18;
            }
        }
        return java.lang.Math.max(0L, j17);
    }

    public boolean b() {
        return this.f169518e > 0 && this.f169519f <= 0;
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w2 w2Var = this.f169514a;
        boolean z17 = w2Var.f169953a.getAndSet(2) != 2;
        if (z17) {
            w2Var.f169954b.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.t2 t2Var = w2Var.f169956d;
            w2Var.f169954b = t2Var;
            t2Var.getClass();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            t2Var.f169942a = java.lang.System.currentTimeMillis();
        }
        if (!z17) {
            return;
        }
        while (true) {
            java.util.LinkedList linkedList = this.f169520g;
            if (linkedList.isEmpty()) {
                return;
            } else {
                ((java.lang.Runnable) linkedList.pollFirst()).run();
            }
        }
    }

    public void d() {
        if (this.f169518e <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w2 w2Var = this.f169514a;
        boolean z17 = w2Var.f169953a.getAndSet(1) != 1;
        if (z17) {
            w2Var.f169954b.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.u2 u2Var = w2Var.f169955c;
            w2Var.f169954b = u2Var;
            u2Var.getClass();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            u2Var.f169947a = java.lang.System.currentTimeMillis();
        }
        if (z17) {
            this.f169520g.clear();
        }
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f169516c = c11510xdd90c2f2.f156336n;
        this.f169517d = c11510xdd90c2f2;
    }
}
