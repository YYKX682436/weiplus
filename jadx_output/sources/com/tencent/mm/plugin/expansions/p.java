package com.tencent.mm.plugin.expansions;

/* loaded from: classes16.dex */
public class p implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f99771a;

    public p(com.tencent.mm.plugin.expansions.t tVar, com.tencent.mm.ipcinvoker.r rVar) {
        this.f99771a = rVar;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        com.tencent.mm.plugin.expansions.o oVar = new com.tencent.mm.plugin.expansions.o(this, (java.lang.Boolean) obj);
        java.util.concurrent.ExecutorService executorService = p5.m.f351982f;
        p5.n nVar = new p5.n();
        try {
            executorService.execute(new p5.l(null, nVar, oVar));
        } catch (java.lang.Exception e17) {
            nVar.a(new p5.i(e17));
        }
        return null;
    }
}
