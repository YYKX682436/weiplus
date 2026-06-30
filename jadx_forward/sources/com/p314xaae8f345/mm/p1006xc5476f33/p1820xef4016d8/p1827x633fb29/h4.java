package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class h4 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 f226844a;

    public h4() {
        a();
    }

    public final void a() {
        this.f226844a = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_HK_CONFIG_STRING_SYNC, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var = this.f226844a;
            c1Var.f226716e = 2000.0d;
            c1Var.f226715d = 100;
            c1Var.f226720i = 200.0d;
            c1Var.f226721m = 0.01d;
            c1Var.f226719h = 200.0d;
        } else {
            try {
                this.f226844a.mo11468x92b714fd(str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyHKConfigManager", "parseConfig exp, " + e17.getLocalizedMessage());
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var2 = this.f226844a;
                c1Var2.f226716e = 2000.0d;
                c1Var2.f226715d = 100;
                c1Var2.f226720i = 200.0d;
                c1Var2.f226721m = 0.01d;
                c1Var2.f226719h = 200.0d;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKConfigManager", "LuckyMoneyConfig init maxTotalAmount:" + this.f226844a.f226716e + " maxTotalNum:" + this.f226844a.f226715d + " perGroupMaxValue:" + this.f226844a.f226720i + " perMinValue:" + this.f226844a.f226721m + " perPersonMaxValue:" + this.f226844a.f226719h);
    }
}
