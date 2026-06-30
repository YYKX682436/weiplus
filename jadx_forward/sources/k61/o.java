package k61;

/* loaded from: classes4.dex */
public class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f386042a;

    public o(k61.p pVar, km5.b bVar) {
        this.f386042a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAAInteractor", "on urgeAAPay finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        km5.b bVar = this.f386042a;
        if (i17 != 0 || fVar.f152149b != 0) {
            bVar.a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 25L, 1L, false);
            return null;
        }
        r45.z zVar = (r45.z) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAAInteractor", "on urgeAAPay finish, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(zVar.f473092d), zVar.f473093e);
        int i18 = zVar.f473092d;
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAAInteractor", "on urgeAAPay success");
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            bVar.c(java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 24L, 1L, false);
            return null;
        }
        if (i18 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f473093e)) {
            bVar.a(java.lang.Boolean.FALSE);
        } else {
            bVar.a(zVar.f473093e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 26L, 1L, false);
        return null;
    }
}
