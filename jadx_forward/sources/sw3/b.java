package sw3;

/* loaded from: classes9.dex */
public class b extends sw3.a {

    /* renamed from: t, reason: collision with root package name */
    public r45.dp6 f494994t;

    /* renamed from: u, reason: collision with root package name */
    public final int f494995u;

    public b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cp6();
        lVar.f152198b = new r45.dp6();
        lVar.f152200d = 2694;
        lVar.f152199c = "/cgi-bin/mmpay-bin/transferphonecheckname";
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494992r = a17;
        r45.cp6 cp6Var = (r45.cp6) a17.f152243a.f152217a;
        cp6Var.f453304d = i17;
        cp6Var.f453305e = str;
        cp6Var.f453306f = str2;
        cp6Var.f453307g = str3;
        cp6Var.f453308h = str4;
        cp6Var.f453309i = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "do scene NetSceneMobileRemitCheckName reason:%s rcvrOpenid:%s rcvrToken:%s inputName:%s getRcvrExt:%s", java.lang.Integer.valueOf(i17), str, str2, str3, str4);
        this.f494995u = i17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.dp6 dp6Var = (r45.dp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f494994t = dp6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(dp6Var.f454181d), this.f494994t.f454182e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494993s;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.dp6 dp6Var = (r45.dp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = dp6Var.f454181d;
        this.f295563h = dp6Var.f454182e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2694;
    }
}
