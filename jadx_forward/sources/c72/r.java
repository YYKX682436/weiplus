package c72;

/* loaded from: classes8.dex */
public class r extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, c72.c {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f121118d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f121119e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f121120f = null;

    public r(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ln5();
        lVar.f152198b = new r45.mn5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/registerface";
        lVar.f152200d = 918;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f121119e = a17;
        r45.ln5 ln5Var = (r45.ln5) a17.f152243a.f152217a;
        ln5Var.f461194d = j17;
        ln5Var.f461195e = str;
        ln5Var.f461196f = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f121118d = u0Var;
        return mo9409x10f9447a(sVar, this.f121119e, this);
    }

    @Override // c72.c
    public boolean e() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 918;
    }

    @Override // c72.c
    public java.lang.String n() {
        return this.f121120f;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.mn5 mn5Var = (r45.mn5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            i19 = mn5Var.f462229f;
            boolean z17 = i19 == 0;
            this.f121120f = mn5Var.f462227d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceRegFace", "hy: is Verified: %b", java.lang.Boolean.valueOf(z17));
        } else if (mn5Var != null && mn5Var.f462229f != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceRegFace", "hy: has detail ret. use");
            i19 = mn5Var.f462229f;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f121118d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
