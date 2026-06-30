package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class xz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 f192659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.g5 f192661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz f192662g;

    public xz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var, int i17, so2.g5 g5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz rzVar) {
        this.f192659d = g00Var;
        this.f192660e = i17;
        this.f192661f = g5Var;
        this.f192662g = rzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f192659d;
        g00Var.getClass();
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f545050b = this.f192660e;
        s3Var.f545053e = this.f192661f;
        int ordinal = this.f192662g.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = g00Var.f188331c;
        if (ordinal == 0) {
            if (ctVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l().Q(s3Var);
            }
        } else if (ordinal == 1) {
            if (ctVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l().O(s3Var);
            }
        } else if (ordinal == 2 && ctVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l().Q(s3Var);
        }
    }
}
