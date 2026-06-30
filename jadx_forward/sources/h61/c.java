package h61;

/* loaded from: classes9.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public km5.b f360673d;

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAGetPaylistDetailLogic", "onSceneEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            km5.b bVar = this.f360673d;
            if (bVar != null) {
                bVar.a(java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 7L, 1L, false);
            return;
        }
        r45.d0 d0Var = ((i61.k) m1Var).f370463e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAGetPaylistDetailLogic", "AAQueryDetailRes, onSceneEnd, retCode: %s", java.lang.Integer.valueOf(d0Var.f453488d));
        int i19 = d0Var.f453488d;
        if (i19 == 0) {
            km5.u.h(this.f360673d, d0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 6L, 1L, false);
            j61.c z07 = e61.e.wi().z0(d0Var.f453490f);
            if (z07 != null) {
                z07.f65953x10a0fed7 = d0Var.f453498q;
                e61.e.wi().mo11260x413cb2b4(z07);
                return;
            }
            return;
        }
        r45.a aVar = d0Var.G;
        if (aVar != null && aVar.f451100d == 1) {
            this.f360673d.a(aVar);
        } else if (i19 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f453489e)) {
            this.f360673d.a(java.lang.Boolean.FALSE);
        } else {
            this.f360673d.a(d0Var.f453489e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 8L, 1L, false);
    }
}
