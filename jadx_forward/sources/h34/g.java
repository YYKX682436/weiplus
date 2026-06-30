package h34;

/* loaded from: classes2.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f360061d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f360062e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f360063f;

    /* renamed from: g, reason: collision with root package name */
    public final int f360064g;

    public g(java.lang.String str, int i17) {
        this.f360063f = str;
        this.f360064g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f360061d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vo3();
        lVar.f152198b = new r45.wo3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/gettvinfo";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f0.f34795x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f360062e = a17;
        r45.vo3 vo3Var = (r45.vo3) a17.f152243a.f152217a;
        vo3Var.f469939d = this.f360063f;
        vo3Var.f469940e = this.f360064g;
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f0.f34795x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f360061d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        java.lang.String str;
        r45.vo3 vo3Var = (r45.vo3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        if (vo3Var.f469940e >= 0 && (str = vo3Var.f469939d) != null && str.length() > 0) {
            return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.NetSceneGetTVInfo", "ERR: Security Check Failed, Scene = %s", java.lang.Integer.valueOf(vo3Var.f469940e));
        return com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
    }
}
