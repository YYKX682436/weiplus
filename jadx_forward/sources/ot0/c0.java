package ot0;

/* loaded from: classes9.dex */
public final class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429967a;

    public c0(java.lang.String str) {
        this.f429967a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        km5.b c17 = km5.u.c();
        java.lang.String str = this.f429967a;
        qk.o b17 = r01.z.b(str);
        if (b17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f66730x28d45f97)) {
            c17.c(java.lang.Boolean.TRUE);
            return null;
        }
        if (b17 == null) {
            qk.o oVar = new qk.o();
            oVar.f66748xdec927b = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "insert stub bizInfo, username: %s, success: %b", str, java.lang.Boolean.valueOf(r01.q3.cj().mo9952xce0038c9(oVar, new java.lang.String[0])));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 3, 1L, false);
        if (r01.q3.Ai().c(str, new ot0.b0(str, c17))) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgBizClickHandler", "try2UpdateBizAttributes fail");
        c17.a(new ot0.p0(2, "flush bizInfo fail"));
        return null;
    }
}
