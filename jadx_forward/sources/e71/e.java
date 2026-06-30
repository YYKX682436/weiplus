package e71;

/* loaded from: classes2.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f331404d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f331405e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f331406f;

    public e(java.lang.String str) {
        this.f331406f = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.qc0();
        lVar.f152198b = new r45.rc0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/delsafedevice";
        lVar.f152200d = 362;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f331404d = a17;
        ((r45.qc0) a17.f152243a.f152217a).f465366d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f331406f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDelSafeDevice", "null device id");
            return -1;
        }
        this.f331405e = u0Var;
        return mo9409x10f9447a(sVar, this.f331404d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 362;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().w(64, java.lang.Integer.valueOf(((r45.rc0) this.f331404d.f152244b.f152233a).f466255d));
        }
        this.f331405e.mo815x76e0bfae(i18, i19, str, this);
    }
}
