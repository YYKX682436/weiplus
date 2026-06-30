package xw1;

/* loaded from: classes8.dex */
public class j extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f539213m;

    /* renamed from: n, reason: collision with root package name */
    public r45.nx f539214n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f539215o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f539216p;

    public j(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.mx();
        lVar.f152198b = new r45.nx();
        lVar.f152200d = 1649;
        lVar.f152199c = "/cgi-bin/mmpay-bin/setrewardqrcodephotoword";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f539213m = a17;
        ((r45.mx) a17.f152243a.f152217a).f462407d = str;
        this.f539216p = str;
        if (str.length() >= 1 && str.length() <= 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 0L, 1L, false);
        } else if (str.length() > 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 1L, 1L, false);
        }
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.nx nxVar = (r45.nx) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f539214n = nxVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(nxVar.f463250d), this.f539214n.f463251e);
        if (!this.f539194h && this.f539214n.f463250d != 0) {
            this.f539195i = true;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f539215o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f539215o = u0Var;
        return mo9409x10f9447a(sVar, this.f539213m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1649;
    }
}
