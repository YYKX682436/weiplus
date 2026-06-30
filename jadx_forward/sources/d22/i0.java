package d22;

/* loaded from: classes12.dex */
public final class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d22.k0 f307381d;

    public i0(d22.k0 k0Var) {
        this.f307381d = k0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        boolean z18;
        s25.a wi6;
        d22.k0 k0Var = this.f307381d;
        boolean z19 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k0Var.f445758c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(k0Var.f307386j, "userName is null");
            z17 = false;
            z18 = false;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(k0Var.f445758c, k0Var.f445762g);
            z18 = c01.ia.C(o27);
            z17 = c01.ia.e(o27);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f307386j, "isShareSaveForbidden:%s, forbiddenAllOp: %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        if (!z17) {
            if (!k0Var.f307385i.I1()) {
                k0Var.getClass();
                g4Var.a(0, com.p314xaae8f345.mm.R.C30867xcad56011.f571377dc);
            }
            if (!z18) {
                g4Var.a(k0Var.f307387k, com.p314xaae8f345.mm.R.C30867xcad56011.i29);
            }
            k12.s sVar = (k12.s) i95.n0.c(k12.s.class);
            if (sVar != null && (wi6 = ((g30.h) sVar).wi()) != null) {
                if (((y12.h) wi6).H(k0Var.f307385i)) {
                    z19 = true;
                }
            }
            if (z19 && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k0Var.f445760e) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(k0Var.f445760e))) {
                g4Var.a(k0Var.f307388l, com.p314xaae8f345.mm.R.C30867xcad56011.bxa);
            }
        }
        g4Var.a(k0Var.f307389m, com.p314xaae8f345.mm.R.C30867xcad56011.bw_);
    }
}
