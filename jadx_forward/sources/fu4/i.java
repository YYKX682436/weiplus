package fu4;

/* loaded from: classes2.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f348427d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f348428e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348429f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f348430g = false;

    public i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.do6();
        lVar.f152198b = new r45.eo6();
        lVar.f152199c = "/cgi-bin/mmpay-bin/touchlockgetchallenge";
        lVar.f152200d = 1548;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f348428e = a17;
        r45.do6 do6Var = (r45.do6) a17.f152243a.f152217a;
        do6Var.f454159d = 1548;
        do6Var.f454160e = str;
        do6Var.f454161f = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f348427d = u0Var;
        return mo9409x10f9447a(sVar, this.f348428e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1548;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetTouchWalletLockChallenge", "get touch wallet lock challenge errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.eo6 eo6Var = (r45.eo6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f348429f = eo6Var.f455160d;
        if (eo6Var.f455161e == 1) {
            this.f348430g = true;
        } else {
            this.f348430g = false;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f348427d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
