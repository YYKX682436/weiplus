package fu1;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f348350d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f348351e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348352f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348353g = "";

    public b(double d17, double d18, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.lc3();
        lVar.f152198b = new r45.mc3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/card/getcardshomepage";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.x.f35000x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f348350d = a17;
        r45.lc3 lc3Var = (r45.lc3) a17.f152243a.f152217a;
        lc3Var.f460833d = d17;
        lc3Var.f460834e = d18;
        lc3Var.f460835f = str;
        lc3Var.f460836g = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_REDOT_BUFF_STRING_SYNC, "");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f348351e = u0Var;
        return mo9409x10f9447a(sVar, this.f348350d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.x.f35000x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCardsHomePageLayout", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.x.f35000x366c91de), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.mc3 mc3Var = (r45.mc3) this.f348350d.f152244b.f152233a;
            this.f348352f = mc3Var.f461894d;
            this.f348353g = mc3Var.f461895e;
        }
        this.f348351e.mo815x76e0bfae(i18, i19, str, this);
    }
}
