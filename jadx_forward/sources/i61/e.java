package i61;

/* loaded from: classes4.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370437d;

    /* renamed from: e, reason: collision with root package name */
    public r45.g f370438e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370439f;

    /* renamed from: g, reason: collision with root package name */
    public final int f370440g;

    public e(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.f();
        lVar.f152198b = new r45.g();
        lVar.f152200d = 1530;
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaaclose";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370437d = a17;
        r45.f fVar = (r45.f) a17.f152243a.f152217a;
        fVar.f455393f = str2;
        fVar.f455391d = str;
        fVar.f455392e = i17;
        this.f370440g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAClose", "doScene");
        this.f370439f = u0Var;
        return mo9409x10f9447a(sVar, this.f370437d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1530;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAClose", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.g gVar = (r45.g) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f370438e = gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAClose", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(gVar.f456289d), this.f370438e.f456290e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f370439f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
