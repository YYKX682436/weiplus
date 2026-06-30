package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes12.dex */
public class o implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.q f239825d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.q qVar) {
        this.f239825d = qVar;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "IdKeyAggregator";
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.p pVar : this.f239825d.f239836d) {
            if (pVar != null) {
                java.util.concurrent.atomic.AtomicLong atomicLong = pVar.f239831c;
                final long andSet = atomicLong != null ? atomicLong.getAndSet(0L) : 0L;
                if (andSet > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    final long j17 = pVar.f239829a;
                    final long j18 = pVar.f239830b;
                    g0Var.getClass();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                        g0Var.L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$r
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.b(j17, j18, andSet, false);
                            }
                        });
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && g0Var.u() && g0Var.f239710g) {
                        g0Var.L(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.report.service.g0$$s
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.x.c(j17, j18, andSet, false);
                            }
                        });
                    } else {
                        g0Var.M(j17, j18, andSet, false);
                    }
                }
            }
        }
    }
}
