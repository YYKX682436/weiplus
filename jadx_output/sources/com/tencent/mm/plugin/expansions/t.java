package com.tencent.mm.plugin.expansions;

/* loaded from: classes16.dex */
public class t implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.ExpansionsGlobal", "ipc invoke receive remote expansions call, request");
        com.tencent.mm.plugin.expansions.p pVar = new com.tencent.mm.plugin.expansions.p(this, rVar);
        com.tencent.mm.plugin.expansions.s sVar = new com.tencent.mm.plugin.expansions.s(this, pVar);
        java.util.concurrent.ExecutorService executorService = p5.m.f351982f;
        p5.n nVar = new p5.n();
        try {
            executorService.execute(new p5.l(null, nVar, sVar));
        } catch (java.lang.Exception e17) {
            nVar.a(new p5.i(e17));
        }
        nVar.f351990a.a(new com.tencent.mm.plugin.expansions.q(this, pVar), p5.m.f351983g, null);
    }
}
