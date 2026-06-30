package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class a2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f259147a;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d2 d2Var, km5.b bVar) {
        this.f259147a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchInteractor", "on qry purchase result finish, cgiBack: %s, errType: %s, errCode: %s", fVar, java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        km5.b bVar = this.f259147a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.vg5 vg5Var = (r45.vg5) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchInteractor", "on qry purchase result finsih, retcode: %s, retmsg: %s, purchase_state: %s", java.lang.Integer.valueOf(vg5Var.f469745d), vg5Var.f469746e, java.lang.Integer.valueOf(vg5Var.f469747f));
            if (vg5Var.f469754p != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237 c6233xa457e237 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237();
                c6233xa457e237.f136481g.f87738a = ((r45.vg5) fVar.f152151d).f469754p;
                c6233xa457e237.e();
            }
            if (vg5Var.f469745d == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(vg5Var.f469755q);
                bVar.c(vg5Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 6L, 1L, false);
            } else {
                bVar.a(vg5Var.f469754p != null ? null : vg5Var.f469746e);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 7L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 8L, 1L, false);
        }
        return null;
    }
}
