package c01;

/* loaded from: classes11.dex */
public final class b1 implements uh4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c01.b1 f118601d = new c01.b1();

    @Override // uh4.i0
    /* renamed from: onDataChanged */
    public final void mo13777xf050804b() {
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
        boolean z17 = (mo168058x74219ae7 == c01.d1.f118633g && h47 == c01.d1.f118634h) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTeenModeService", "onTeenModeDataChanged isTeenMode: %b, bizAcctOption: %d, isChanged: %b", java.lang.Boolean.valueOf(mo168058x74219ae7), java.lang.Integer.valueOf(h47), java.lang.Boolean.valueOf(z17));
        if (z17) {
            c01.d1.f118633g = mo168058x74219ae7;
            c01.d1.f118634h = h47;
            c01.d1 d1Var = c01.d1.f118630d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = c01.d1.f118632f;
            if (o4Var != null) {
                o4Var.putBoolean("is_teen_mode", c01.d1.f118633g);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = c01.d1.f118632f;
            if (o4Var2 != null) {
                o4Var2.putInt("biz_teen_mode_acct_option", c01.d1.f118634h);
            }
            if (((zq1.a0) gm0.j1.s(zq1.a0.class)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175976i.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175971d.a();
            }
        }
    }
}
