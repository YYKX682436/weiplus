package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd f226710d;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4 d4Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
        this.f226710d = c5255x5f3208fd;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = this.f226710d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5255x5f3208fd.f135586g.f89294c)) {
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.i(c5255x5f3208fd.f135586g.f89294c, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.e())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney new year resource file update succ");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 22);
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney new year resource file update fail");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 23);
            z17 = false;
        }
        zy.r rVar = (zy.r) i95.n0.c(zy.r.class);
        am.r2 r2Var = c5255x5f3208fd.f135586g;
        ((yy.a) rVar).Ui(r2Var.f89292a, r2Var.f89293b, r2Var.f89295d, z17);
    }
}
