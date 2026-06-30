package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class n0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f259227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.s0 f259228b;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.s0 s0Var, km5.b bVar) {
        this.f259228b = s0Var;
        this.f259227a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDetailInteractor", "on close lqt account finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        this.f259228b.getClass();
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LQT_OPEN_FLAG_INT_SYNC, -1);
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LQT_ENTRY_WORDING_STRING_SYNC, null);
        int i17 = fVar.f152148a;
        km5.b bVar = this.f259227a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.u40 u40Var = (r45.u40) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDetailInteractor", "on close lqt account finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(u40Var.f468537d), u40Var.f468538e);
            if (u40Var.f468539f != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6232x89590c5d c6232x89590c5d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6232x89590c5d();
                c6232x89590c5d.f136480g.f87649a = u40Var.f468539f;
                c6232x89590c5d.e();
            }
            if (u40Var.f468537d == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(u40Var.f468540g);
                bVar.c(u40Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 15L, 1L, false);
            } else {
                bVar.a(u40Var.f468539f != null ? null : u40Var.f468538e);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 16L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 17L, 1L, false);
        }
        return null;
    }
}
