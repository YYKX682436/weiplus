package gc0;

/* loaded from: classes5.dex */
public final class g0 implements vg3.o4, vg3.s4 {
    @Override // vg3.o4
    public void M(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void b0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o3
    public void f(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }

    @Override // vg3.o3
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendRemarkContactAssemblerImpl", "beforeAddContact() called with: newContact = " + str + " profileExposeMaxTime:" + j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20636x403d87ce()) + " limitDetectMsgCount:" + j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20633xe8c24a2f()) + " msgDetectTimeLimit:" + (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20632x7f01de68()) * 60 * 1000));
    }

    @Override // vg3.o4
    public void m1(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, r45.xb0 xb0Var) {
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendRemarkContactAssemblerImpl", "del contact, talker: " + d17);
        if (d17 != null) {
            gc0.f0 f0Var = gc0.f0.f351700a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendRemarkCache", "clearTalkerRemarkData talker: ".concat(d17));
            f0Var.d(d17);
            f0Var.c().remove(d17);
            gc0.y0 y0Var = gc0.y0.f351898a;
            gc0.y0.f351899b.clear();
            f0Var.d(d17);
        }
    }

    @Override // vg3.o3
    public void q(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }

    @Override // vg3.o3
    public void t(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }
}
