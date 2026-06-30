package h34;

/* loaded from: classes8.dex */
public class l extends h34.j {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f360081f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f360082g;

    public l(byte[] bArr, int i17, int i18, int i19, long j17, int i27, boolean z17, int i28) {
        super(bArr, i19, j17, i27, z17, i28);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fh4();
        lVar.f152198b = new r45.gh4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmqqshakemusic";
        lVar.f152200d = 5245;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f360082g = a17;
        r45.fh4 fh4Var = (r45.fh4) a17.f152243a.f152217a;
        fh4Var.f455885f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
        fh4Var.f455883d = 0;
        fh4Var.f455888i = z17 ? 1 : 0;
        fh4Var.f455886g = i18;
        fh4Var.f455887h = i17;
        fh4Var.f455884e = i27 + "";
    }

    @Override // h34.j
    public r45.js5 H() {
        return (r45.gh4) this.f360082g.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f360082g;
        r45.fh4 fh4Var = (r45.fh4) oVar.f152243a.f152217a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneShakeMusicAndSing", "doScene id: %s, offset: %d, endFlag: %d， seq: %d， data length: %d", fh4Var.f455884e, java.lang.Integer.valueOf(fh4Var.f455887h), java.lang.Integer.valueOf(fh4Var.f455888i), java.lang.Integer.valueOf(fh4Var.f455886g), java.lang.Integer.valueOf(fh4Var.f455885f.g().length));
        this.f360081f = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5245;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.gh4 gh4Var = (r45.gh4) this.f360082g.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneShakeMusicAndSing", "errType: %d, errCode: %d, errMsg: %s, rep: appId: %s， endFlag: %d, maxPacketSize: %d, interval: %d, music size: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, gh4Var.f456783h, java.lang.Integer.valueOf(gh4Var.f456782g), java.lang.Integer.valueOf(gh4Var.f456781f), java.lang.Integer.valueOf(gh4Var.f456780e), java.lang.Integer.valueOf(gh4Var.f456784i.size()));
        if (i18 == 0 && i19 == 0 && gh4Var.f456782g == 1) {
            this.f360077d = true;
        }
        this.f360081f.mo815x76e0bfae(i18, i19, str, this);
    }
}
