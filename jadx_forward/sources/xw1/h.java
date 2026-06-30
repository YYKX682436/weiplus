package xw1;

/* loaded from: classes9.dex */
public class h extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f539207m;

    /* renamed from: n, reason: collision with root package name */
    public r45.lx f539208n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f539209o;

    public h(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.kx();
        lVar.f152198b = new r45.lx();
        lVar.f152200d = 1516;
        lVar.f152199c = "/cgi-bin/mmpay-bin/scanrewardqrcode";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f539207m = a17;
        r45.kx kxVar = (r45.kx) a17.f152243a.f152217a;
        kxVar.f460541d = str;
        kxVar.f460542e = i17;
        kxVar.f460543f = str2;
    }

    @Override // xw1.c
    public boolean H() {
        return false;
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardScanCode", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.lx lxVar = (r45.lx) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f539208n = lxVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardScanCode", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(lxVar.f461436d), this.f539208n.f461437e);
        if (!this.f539194h && this.f539208n.f461436d != 0) {
            this.f539195i = true;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f539209o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f539209o = u0Var;
        return mo9409x10f9447a(sVar, this.f539207m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1516;
    }
}
