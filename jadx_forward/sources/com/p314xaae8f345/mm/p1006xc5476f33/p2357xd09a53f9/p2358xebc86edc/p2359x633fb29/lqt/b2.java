package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class b2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f259150a;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d2 d2Var, km5.b bVar) {
        this.f259150a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchInteractor", "on redeem fund finish, cgiBack: %s, errType: %s, errCode: %s", fVar, java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        km5.b bVar = this.f259150a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.an5 an5Var = (r45.an5) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchInteractor", "on redeem fund finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(an5Var.f451675d), an5Var.f451676e);
            if (an5Var.f451687s != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237 c6233xa457e237 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237();
                c6233xa457e237.f136481g.f87738a = ((r45.an5) fVar.f152151d).f451687s;
                c6233xa457e237.e();
            }
            if (an5Var.f451675d == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(an5Var.f451688t);
                bVar.c(an5Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 12L, 1L, false);
            } else {
                if (an5Var.f451687s != null) {
                    an5Var = null;
                }
                bVar.a(an5Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 13L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 14L, 1L, false);
        }
        return null;
    }
}
