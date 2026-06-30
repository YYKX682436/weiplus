package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes16.dex */
public class t implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.ExpansionsGlobal", "ipc invoke receive remote expansions call, request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.p(this, rVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.s(this, pVar);
        java.util.concurrent.ExecutorService executorService = p5.m.f433515f;
        p5.n nVar = new p5.n();
        try {
            executorService.execute(new p5.l(null, nVar, sVar));
        } catch (java.lang.Exception e17) {
            nVar.a(new p5.i(e17));
        }
        nVar.f433523a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.q(this, pVar), p5.m.f433516g, null);
    }
}
