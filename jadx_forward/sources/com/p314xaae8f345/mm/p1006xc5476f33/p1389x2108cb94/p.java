package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes16.dex */
public class p implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f181304a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.t tVar, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f181304a = rVar;
    }

    @Override // r.a
    /* renamed from: apply */
    public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.o(this, (java.lang.Boolean) obj);
        java.util.concurrent.ExecutorService executorService = p5.m.f433515f;
        p5.n nVar = new p5.n();
        try {
            executorService.execute(new p5.l(null, nVar, oVar));
        } catch (java.lang.Exception e17) {
            nVar.a(new p5.i(e17));
        }
        return null;
    }
}
