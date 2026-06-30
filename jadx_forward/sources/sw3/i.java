package sw3;

/* loaded from: classes9.dex */
public class i extends sw3.a {

    /* renamed from: t, reason: collision with root package name */
    public r45.tp6 f495005t;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sp6();
        lVar.f152198b = new r45.tp6();
        lVar.f152200d = 1903;
        lVar.f152199c = "/cgi-bin/mmpay-bin/transferphonesuccpage";
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494992r = a17;
        r45.sp6 sp6Var = (r45.sp6) a17.f152243a.f152217a;
        sp6Var.f467432d = str;
        sp6Var.f467433e = str2;
        sp6Var.f467434f = str3;
        sp6Var.f467435g = str4;
        sp6Var.f467436h = i17;
        sp6Var.f467437i = str5;
        sp6Var.f467438m = str6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetSuccPage", "do scene NetSceneMobileRemitGetSuccPage out_trade_no:%s trans_id:%s rcvr_openid:%s rcvr_token:%s amount:%s placeorder_token:%s placeorder_ext:%s", str, str2, str3, str4, java.lang.Integer.valueOf(i17), str5, str6);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetSuccPage", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.tp6 tp6Var = (r45.tp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f495005t = tp6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetSuccPage", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(tp6Var.f468192d), this.f495005t.f468193e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494993s;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.tp6 tp6Var = (r45.tp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = tp6Var.f468192d;
        this.f295563h = tp6Var.f468193e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1903;
    }
}
