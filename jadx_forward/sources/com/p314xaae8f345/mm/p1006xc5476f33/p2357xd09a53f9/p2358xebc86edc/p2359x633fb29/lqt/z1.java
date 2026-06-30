package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class z1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f259294a;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d2 d2Var, km5.b bVar) {
        this.f259294a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchInteractor", "on purchaseFund finish, cgiBack: %s, errType: %s, errCode: %s", fVar, java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        km5.b bVar = this.f259294a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.ff5 ff5Var = (r45.ff5) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchInteractor", "on purchaseFund finsih, retcode: %s, retmsg: %s, prepayid: %s, out_trade_no: %s", java.lang.Integer.valueOf(ff5Var.f455813d), ff5Var.f455814e, ff5Var.f455815f, ff5Var.f455816g);
            if (ff5Var.f455820n != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237 c6233xa457e237 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237();
                c6233xa457e237.f136481g.f87738a = ((r45.ff5) fVar.f152151d).f455820n;
                c6233xa457e237.e();
            }
            if (ff5Var.f455813d == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(ff5Var.f455821o);
                bVar.c(fVar.f152151d);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 3L, 1L, false);
            } else {
                bVar.a(ff5Var.f455820n != null ? null : ff5Var.f455814e);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(664L, 4L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(664L, 5L, 1L, false);
        }
        return null;
    }
}
