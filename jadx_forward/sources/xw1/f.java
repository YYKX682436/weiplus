package xw1;

/* loaded from: classes8.dex */
public class f extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f539201m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ww f539202n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f539203o;

    public f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vw();
        lVar.f152198b = new r45.ww();
        lVar.f152200d = 1960;
        lVar.f152199c = "/cgi-bin/mmpay-bin/rewardqrcodepaycheck";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f539201m = a17;
        r45.vw vwVar = (r45.vw) a17.f152243a.f152217a;
        vwVar.f470148d = str;
        vwVar.f470149e = str2;
        vwVar.f470150f = str3;
        vwVar.f470151g = i17;
        vwVar.f470152h = str4;
        vwVar.f470153i = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardPayCheck", "rewardid: %s, amt: %s", str2, java.lang.Integer.valueOf(i17));
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardPayCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ww wwVar = (r45.ww) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f539202n = wwVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardPayCheck", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(wwVar.f471076d), this.f539202n.f471077e);
        if (!this.f539194h && this.f539202n.f471076d != 0) {
            this.f539195i = true;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f539203o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f539203o = u0Var;
        return mo9409x10f9447a(sVar, this.f539201m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1960;
    }
}
