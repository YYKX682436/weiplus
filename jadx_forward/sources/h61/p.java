package h61;

/* loaded from: classes4.dex */
public class p implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public km5.b f360695d;

    /* renamed from: e, reason: collision with root package name */
    public long f360696e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f360697f = "";

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CloseAALogic", "onSceneEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            this.f360695d.a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 22L, 1L, false);
            return;
        }
        i61.e eVar = (i61.e) m1Var;
        r45.g gVar = eVar.f370438e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CloseAALogic", "closeAA, response.retcode: %s", java.lang.Integer.valueOf(gVar.f456289d));
        int i19 = gVar.f456289d;
        if (i19 == 0) {
            km5.u.h(this.f360695d, java.lang.Boolean.TRUE);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f456291f)) {
                long j17 = this.f360696e;
                if (j17 > 0 && eVar.f370440g == 3) {
                    h61.o.t(this.f360697f, j17, gVar.f456291f);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 21L, 1L, false);
            return;
        }
        if (i19 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f456290e)) {
            this.f360695d.a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 23L, 1L, false);
        } else {
            this.f360695d.a(gVar.f456290e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 11L, 1L, false);
        }
    }
}
