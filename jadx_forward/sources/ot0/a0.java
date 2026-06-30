package ot0;

/* loaded from: classes4.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429904a;

    public a0(java.lang.String str) {
        this.f429904a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        km5.b c17 = km5.u.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f429904a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        if (n17 == null || ((int) n17.E2) == 0 || !n17.k2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "contact do not exist.(username : %s)", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 2, 1L, false);
            ((c01.k7) c01.n8.a()).b(str, 5, new ot0.z(str, c17));
        } else {
            c17.c(java.lang.Boolean.TRUE);
        }
        return java.lang.Boolean.FALSE;
    }
}
