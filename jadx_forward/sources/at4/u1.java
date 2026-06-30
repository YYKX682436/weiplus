package at4;

/* loaded from: classes9.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f95514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95515b;

    public u1(int i17, int i18) {
        this.f95514a = 0;
        this.f95515b = 0;
        gm0.j1.i();
        gm0.j1.u().c().w(196660, java.lang.Integer.valueOf(i17));
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_SHOW_INT, java.lang.Integer.valueOf(i18));
        this.f95514a = i17;
        this.f95515b = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig1 " + i17 + "balanceShow:" + i18);
    }

    public boolean a() {
        boolean z17 = (this.f95514a & 16384) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isHideBalanceNum, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f95514a));
        return z17;
    }

    public boolean b() {
        boolean z17 = (this.f95514a & 2) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isMicroPayOn, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f95514a));
        return z17;
    }

    public boolean c() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        boolean z18 = this.f95515b == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isShowBalance, ret = %s switchBit %s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(this.f95514a));
        return z18;
    }

    public boolean d() {
        boolean z17 = (this.f95514a & 4194304) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isShowBalanceAmount, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f95514a));
        return z17;
    }

    public boolean e() {
        boolean z17 = (this.f95514a & 2048) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isSupporSwitchWalletCurrency, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f95514a));
        return z17;
    }

    public boolean f() {
        boolean z17 = (this.f95514a & 67108864) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isSupportNewPayManage, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f95514a));
        return z17;
    }

    public boolean g() {
        boolean z17 = (this.f95514a & 128) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isSupportScanBankCard, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f95514a));
        return z17;
    }

    public boolean h() {
        boolean z17 = (this.f95514a & 256) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isSupportTouchPay, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f95514a));
        return z17;
    }

    public u1() {
        this.f95514a = 0;
        this.f95515b = 0;
        gm0.j1.i();
        this.f95514a = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue();
        this.f95515b = intValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + this.f95514a + "balanceShow:" + intValue);
    }
}
