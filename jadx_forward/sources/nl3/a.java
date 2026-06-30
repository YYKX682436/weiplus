package nl3;

/* loaded from: classes10.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f419711d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f419712e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.m10 f419713f;

    public a(int i17, ql3.a aVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 940;
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkmusic";
        lVar.f152197a = new r45.m10();
        lVar.f152198b = new r45.n10();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f419712e = a17;
        r45.m10 m10Var = (r45.m10) a17.f152243a.f152217a;
        this.f419713f = m10Var;
        m10Var.f461599o = i17;
        m10Var.f461598n = aVar.f66974x28d45f97;
        m10Var.f461593f = aVar.f66992xe65a7da;
        m10Var.f461594g = aVar.f66995x4a6948ee;
        m10Var.f461596i = aVar.f67008x6e8dd380;
        m10Var.f461597m = aVar.f67005xdaf47629;
        m10Var.f461595h = aVar.f67006x45670355;
        m10Var.f461592e = aVar.f67001x79435ae5;
        m10Var.f461591d = aVar.f66983xc8c6afdb;
        m10Var.f461602r = aVar.f67002x3ed1b556;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f419711d = u0Var;
        return mo9409x10f9447a(sVar, this.f419712e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 940;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.NetSceneCheckMusic", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f419711d.mo815x76e0bfae(i18, i19, str, this);
    }
}
