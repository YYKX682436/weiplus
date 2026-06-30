package jw3;

/* loaded from: classes8.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jw3.i f383856b;

    public h(jw3.i iVar) {
        this.f383856b = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void e() {
        jw3.i iVar = this.f383856b;
        try {
            zg0.q2 q2Var = iVar.f383859h;
            if (q2Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 e07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).e0();
                jw3.g gVar = iVar.f383860i;
                zg0.q2 q2Var2 = iVar.f383859h;
                e07.rg(gVar, q2Var2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var2).U() : 0);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SelectTextDialog", th6, "initWebViewController exception", new java.lang.Object[0]);
        }
    }
}
