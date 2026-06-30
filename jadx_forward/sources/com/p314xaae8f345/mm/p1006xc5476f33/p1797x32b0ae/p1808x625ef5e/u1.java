package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes13.dex */
public class u1 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225599a;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var) {
        this.f225599a = g1Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225599a;
            synchronized (g1Var.f225493n) {
                java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) g1Var.f225492m).keySet().iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((java.util.concurrent.ConcurrentHashMap) g1Var.f225492m).get((java.lang.String) it.next())).d();
                }
                ((java.util.concurrent.ConcurrentHashMap) g1Var.f225492m).clear();
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.v1 v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.v1(g1Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(v1Var, 30000L, false);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
    }
}
