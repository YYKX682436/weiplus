package sw3;

/* loaded from: classes9.dex */
public class h extends sw3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f495001w = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f495002t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f495003u;

    /* renamed from: v, reason: collision with root package name */
    public r45.jp6 f495004v;

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ip6();
        lVar.f152198b = new r45.jp6();
        lVar.f152200d = 1495;
        lVar.f152199c = "/cgi-bin/mmpay-bin/transferphonegetrcvr";
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494992r = a17;
        r45.ip6 ip6Var = (r45.ip6) a17.f152243a.f152217a;
        ip6Var.f458790d = str;
        ip6Var.f458791e = str2;
        ip6Var.f458792f = str3;
        ip6Var.f458793g = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecvInfo", "do scene NetSceneMobileRemitGetRecvInfo phone:%s rcvr_id:%s input_type:%s", str, str2, java.lang.Integer.valueOf(i17));
        this.f495002t = str2;
        this.f495003u = str;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecvInfo", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.jp6 jp6Var = (r45.jp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f495004v = jp6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecvInfo", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(jp6Var.f459550d), this.f495004v.f459551e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494993s;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.jp6 jp6Var = (r45.jp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = jp6Var.f459550d;
        this.f295563h = jp6Var.f459551e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1495;
    }
}
