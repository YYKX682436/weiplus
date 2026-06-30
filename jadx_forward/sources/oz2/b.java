package oz2;

/* loaded from: classes9.dex */
public class b extends oe4.g implements d50.m {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f431774d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f431775e;

    /* renamed from: f, reason: collision with root package name */
    public final int f431776f;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.lc6();
        lVar.f152198b = new r45.mc6();
        lVar.f152199c = "/cgi-bin/mmpay-bin/soteropenfppayment";
        lVar.f152200d = 1638;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f431775e = a17;
        r45.lc6 lc6Var = (r45.lc6) a17.f152243a.f152217a;
        lc6Var.f460840d = str;
        lc6Var.f460841e = str2;
        lc6Var.f460842f = str3;
        lc6Var.f460843g = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121664x51474d82("passwd=" + lc6Var.f460842f);
        lc6Var.f460844h = i17;
        lc6Var.f460845i = 1;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
        lc6Var.f460846m = M.getInt("MMKV_KEY_SOTER_OPEN_SCENE", 0);
        M.putInt("MMKV_KEY_SOTER_OPEN_SCENE", -1);
        this.f431776f = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "soter_type: %s open_scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(lc6Var.f460846m));
    }

    @Override // oe4.g
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: authkey required");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f431774d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: onError: errType: %d, errcode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f431774d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay success");
            if (this.f431776f == 1) {
                mz2.m0.b(true);
                mz2.m0.c(false);
            } else {
                mz2.m0.c(true);
                mz2.m0.b(false);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay failed");
        }
        this.f431774d.mo815x76e0bfae(i18, i19, "", this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f431774d = u0Var;
        return mo9409x10f9447a(sVar, this.f431775e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1638;
    }
}
