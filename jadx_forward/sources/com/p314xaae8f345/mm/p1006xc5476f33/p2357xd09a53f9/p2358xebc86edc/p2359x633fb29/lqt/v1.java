package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes8.dex */
public class v1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f259261a;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w1 w1Var, km5.b bVar) {
        this.f259261a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtPlanHomeInteractor", "errCode: %s, errType: %s, resp: %s", java.lang.Integer.valueOf(fVar.f152149b), java.lang.Integer.valueOf(fVar.f152148a), fVar.f152151d);
        int i17 = fVar.f152148a;
        km5.b bVar = this.f259261a;
        if (i17 != 0 || fVar.f152149b != 0) {
            bVar.a(at4.j0.b(fVar.f152149b, i17));
            return null;
        }
        r45.hi4 hi4Var = (r45.hi4) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtPlanHomeInteractor", "retCode: %s, retMsg: %s", java.lang.Integer.valueOf(hi4Var.f457736d), hi4Var.f457737e);
        int i18 = hi4Var.f457736d;
        if (i18 == 0) {
            bVar.c(hi4Var);
            return null;
        }
        bVar.a(at4.j0.c(i18, hi4Var.f457737e));
        return null;
    }
}
