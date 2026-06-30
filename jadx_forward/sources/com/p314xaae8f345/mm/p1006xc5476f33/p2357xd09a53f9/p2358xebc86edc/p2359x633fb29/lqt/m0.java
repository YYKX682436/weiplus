package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class m0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f259223a;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.s0 s0Var, km5.b bVar) {
        this.f259223a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDetailInteractor", "on qryusrfunddetail finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        km5.b bVar = this.f259223a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.zg5 zg5Var = (r45.zg5) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDetailInteractor", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(zg5Var.f473542d), zg5Var.f473543e);
            if (zg5Var.f473567y1 != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6232x89590c5d c6232x89590c5d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6232x89590c5d();
                c6232x89590c5d.f136480g.f87649a = zg5Var.f473567y1;
                c6232x89590c5d.e();
            }
            if (zg5Var.f473542d == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(zg5Var.f473569z1);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_LQT_LONG_SYNC, java.lang.Long.valueOf(zg5Var.f473544f));
                bVar.c(zg5Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 0L, 1L, false);
            } else {
                bVar.a(zg5Var.f473567y1 != null ? null : zg5Var.f473543e);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 1L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 2L, 1L, false);
        }
        return null;
    }
}
