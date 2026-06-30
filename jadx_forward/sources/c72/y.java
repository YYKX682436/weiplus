package c72;

/* loaded from: classes8.dex */
public class y extends c72.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0, c72.c {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f121135d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f121136e;

    public y(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hx6();
        lVar.f152198b = new r45.ix6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/verifyface";
        lVar.f152200d = 797;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f121136e = a17;
        r45.hx6 hx6Var = (r45.hx6) a17.f152243a.f152217a;
        hx6Var.f458077e = j17;
        hx6Var.f458079g = str;
        hx6Var.f458080h = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f121135d = u0Var;
        return mo9409x10f9447a(sVar, this.f121136e, this);
    }

    @Override // c72.c
    public boolean e() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 797;
    }

    @Override // c72.c
    public java.lang.String n() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.ix6 ix6Var = (r45.ix6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            i19 = ix6Var.f458932f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceVerifyFace", "hy: is Verified: %b", java.lang.Boolean.valueOf(i19 == 0));
        } else if (ix6Var != null && ix6Var.f458932f != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceVerifyFace", "hy: has DetailRet, use it");
            i19 = ix6Var.f458932f;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f121135d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
