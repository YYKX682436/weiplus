package c72;

/* loaded from: classes2.dex */
public class w extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f121128d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f121129e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f121130f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f121131g = false;

    public w(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ri6();
        lVar.f152198b = new r45.si6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/switchopface";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.h.f34403x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f121129e = a17;
        ((r45.ri6) a17.f152243a.f152217a).f466472d = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f121128d = u0Var;
        return mo9409x10f9447a(sVar, this.f121129e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.h.f34403x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.si6 si6Var = (r45.si6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f121130f = si6Var.f467299d;
        this.f121131g = si6Var.f467300e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceSwitchOpFace", "hy: NetSceneFaceSwitchOpFace errType: %d, errCode: %d, errMsg: %s, hasBio: %b, isOpen: %b", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Boolean.valueOf(this.f121130f), java.lang.Boolean.valueOf(this.f121131g));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f121128d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
