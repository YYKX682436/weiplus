package xw1;

/* loaded from: classes9.dex */
public class g extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f539204m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fx f539205n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f539206o;

    public g(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i27) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ex();
        lVar.f152198b = new r45.fx();
        lVar.f152200d = 1336;
        lVar.f152199c = "/cgi-bin/mmpay-bin/rewardqrcodeplaceorder";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f539204m = a17;
        r45.ex exVar = (r45.ex) a17.f152243a.f152217a;
        exVar.f455301e = i17;
        exVar.f455304h = i18;
        exVar.f455300d = str;
        exVar.f455302f = str2;
        exVar.f455303g = str3;
        exVar.f455305i = i19;
        exVar.f455306m = str4;
        exVar.f455307n = str5;
        exVar.f455308o = str6;
        exVar.f455309p = str7;
        exVar.f455310q = str8;
        exVar.f455311r = i27;
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.fx fxVar = (r45.fx) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f539205n = fxVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQrRewardPlaceOrder", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(fxVar.f456198d), this.f539205n.f456199e);
        if (!this.f539194h && this.f539205n.f456198d != 0) {
            this.f539195i = true;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f539206o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f539206o = u0Var;
        return mo9409x10f9447a(sVar, this.f539204m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1336;
    }
}
