package h61;

/* loaded from: classes9.dex */
public class l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public km5.b f360690d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f360691e = false;

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f360691e = false;
        if (i17 != 0 || i18 != 0) {
            km5.b bVar = this.f360690d;
            if (bVar != null) {
                bVar.a(java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 10L, 1L, false);
            return;
        }
        r45.v vVar = ((i61.j) m1Var).f370460e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(vVar.f469304d), vVar.f469305e);
        if (vVar.f469304d == 0) {
            km5.u.h(this.f360690d, vVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 9L, 1L, false);
            return;
        }
        if (this.f360690d != null) {
            r45.a aVar = vVar.f469310m;
            if (aVar != null && aVar.f451100d == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f451104h) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vVar.f469310m.f451102f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vVar.f469310m.f451103g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vVar.f469310m.f451101e)) {
                this.f360690d.a(vVar.f469310m);
            } else if (vVar.f469304d <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vVar.f469305e)) {
                this.f360690d.a(java.lang.Boolean.FALSE);
            } else {
                this.f360690d.a(vVar.f469305e);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 11L, 1L, false);
    }
}
