package p83;

/* loaded from: classes14.dex */
public class l extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f434297d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f434298e;

    public l(int i17, long j17, boolean z17) {
        this.f434297d = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.re5();
        lVar.f152198b = new r45.se5();
        lVar.f152200d = 227;
        lVar.f152199c = "/cgi-bin/micromsg-bin/pstnreport";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f434297d = a17;
        r45.re5 re5Var = (r45.re5) a17.f152243a.f152217a;
        re5Var.f466304g = i17;
        re5Var.f466305h = j17;
        re5Var.f466306i = z17 ? 1 : 0;
        m83.d Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
        java.lang.String str = "" + Zi.f406267l + "," + Zi.f406268m + "," + Zi.f406269n + "," + Zi.f406270o + "," + Zi.f406271p + "," + Zi.f406256a + "," + Zi.f406257b + "," + Zi.f406258c + "," + Zi.f406259d + "," + Zi.f406260e + "," + Zi.f406261f + "," + Zi.f406262g + "," + Zi.f406263h + "," + Zi.f406264i + "," + Zi.f406265j + "," + Zi.f406272q + "," + vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) + "," + Zi.A + "," + Zi.B + "," + Zi.C + "," + Zi.D + "," + Zi.E + Zi.f406280y + "," + Zi.G;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "getPstnClientReportString, result: %s", str);
        re5Var.f466301d = x51.j1.i(str);
        m83.d Zi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
        java.lang.String str2 = "" + Zi2.f406267l + "," + Zi2.f406268m + "," + Zi2.f406269n + Zi2.f406279x + "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "getPstnChannelReportString, result: %s", str2);
        re5Var.f466302e = x51.j1.i(str2);
        m83.d Zi3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
        java.lang.String str3 = "" + Zi3.f406267l + "," + Zi3.f406268m + "," + Zi3.f406269n + Zi3.f406278w + "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "getPstnEngineReport, result: %s", str3);
        re5Var.f466303f = x51.j1.i(str3);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f434298e = u0Var;
        return mo9409x10f9447a(sVar, this.f434297d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 227;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallReport", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f434298e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
