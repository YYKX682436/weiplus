package uy3;

/* loaded from: classes8.dex */
public final class i0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f513479b;

    public i0(uy3.j0 j0Var) {
        this.f513479b = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void e() {
        uy3.j0 j0Var = this.f513479b;
        try {
            zg0.q2 q2Var = j0Var.f513483h;
            if (q2Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 e07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).e0();
                uy3.g0 g0Var = j0Var.f513484i;
                zg0.q2 q2Var2 = j0Var.f513483h;
                e07.rg(g0Var, q2Var2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var2).U() : 0);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanBoxDialog", th6, "initWebViewController exception", new java.lang.Object[0]);
        }
    }
}
