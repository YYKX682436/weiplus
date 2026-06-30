package sw3;

/* loaded from: classes9.dex */
public class f extends sw3.a {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f494999u = 0;

    /* renamed from: t, reason: collision with root package name */
    public r45.hp6 f495000t;

    public f(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gp6();
        lVar.f152198b = new r45.hp6();
        lVar.f152200d = 2993;
        lVar.f152199c = "/cgi-bin/mmpay-bin/transferphonegethisrcvrs";
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494992r = a17;
        r45.gp6 gp6Var = (r45.gp6) a17.f152243a.f152217a;
        gp6Var.f456993d = str;
        gp6Var.f456994e = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "[doScene] last_id:%s homepage_ext:%s", str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.hp6 hp6Var = (r45.hp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f495000t = hp6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(hp6Var.f457911d), this.f495000t.f457912e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494993s;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.hp6 hp6Var = (r45.hp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = hp6Var.f457911d;
        this.f295563h = hp6Var.f457912e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2993;
    }
}
