package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f287788d;

    public y3(java.util.List list) {
        this.f287788d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        ot0.q v17;
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list = this.f287788d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return;
        }
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list) {
            if (f9Var.k2() && (v17 = ot0.q.v(f9Var.j())) != null && v17.y(ot0.a.class) != null) {
                com.p314xaae8f345.mm.p873x38eb0007.C10913x8647d6c c10913x8647d6c = new com.p314xaae8f345.mm.p873x38eb0007.C10913x8647d6c();
                c10913x8647d6c.f150518g = v17;
                c10913x8647d6c.e();
            }
            if (f9Var.t2()) {
                java.util.LinkedList<ot0.s0> linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.m124847x74d37ac6(), f9Var.j()).f430114i;
                if (linkedList != null) {
                    for (ot0.s0 s0Var : linkedList) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430313w) && k01.o.a(s0Var.f430308r)) {
                            l01.d0.f396294a.n(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z3(s0Var), s0Var.f430313w, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(112, 90));
                        }
                    }
                }
            }
        }
    }
}
