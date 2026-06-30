package at4;

/* loaded from: classes9.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f13981a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13982b;

    public u1(int i17, int i18) {
        this.f13981a = 0;
        this.f13982b = 0;
        gm0.j1.i();
        gm0.j1.u().c().w(196660, java.lang.Integer.valueOf(i17));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_SHOW_INT, java.lang.Integer.valueOf(i18));
        this.f13981a = i17;
        this.f13982b = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig1 " + i17 + "balanceShow:" + i18);
    }

    public boolean a() {
        boolean z17 = (this.f13981a & 16384) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isHideBalanceNum, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f13981a));
        return z17;
    }

    public boolean b() {
        boolean z17 = (this.f13981a & 2) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isMicroPayOn, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f13981a));
        return z17;
    }

    public boolean c() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean z18 = this.f13982b == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isShowBalance, ret = %s switchBit %s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(this.f13981a));
        return z18;
    }

    public boolean d() {
        boolean z17 = (this.f13981a & 4194304) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isShowBalanceAmount, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f13981a));
        return z17;
    }

    public boolean e() {
        boolean z17 = (this.f13981a & 2048) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isSupporSwitchWalletCurrency, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f13981a));
        return z17;
    }

    public boolean f() {
        boolean z17 = (this.f13981a & 67108864) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isSupportNewPayManage, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f13981a));
        return z17;
    }

    public boolean g() {
        boolean z17 = (this.f13981a & 128) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isSupportScanBankCard, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f13981a));
        return z17;
    }

    public boolean h() {
        boolean z17 = (this.f13981a & 256) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isSupportTouchPay, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f13981a));
        return z17;
    }

    public u1() {
        this.f13981a = 0;
        this.f13982b = 0;
        gm0.j1.i();
        this.f13981a = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue();
        this.f13982b = intValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + this.f13981a + "balanceShow:" + intValue);
    }
}
