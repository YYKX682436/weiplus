package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class o2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 f259234b;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        this.f259234b = w2Var;
        this.f259233a = c19091x9511676c;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.ff5 ff5Var = (r45.ff5) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "doSaveLqt, prepayid: %s, cashierType: %d", ff5Var.f455815f, java.lang.Integer.valueOf(ff5Var.f455818i));
        r45.na5 na5Var = ff5Var.f455819m;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f259233a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 w2Var = this.f259234b;
        if (na5Var == null) {
            w2Var.f259277n = false;
            ((java.util.HashMap) w2Var.f259276m).put(ff5Var.f455815f, w2Var.f259266c);
            w2Var.c(ff5Var, c19091x9511676c);
            return null;
        }
        w2Var.f259278o = ff5Var;
        w2Var.f259279p = c19091x9511676c;
        km5.b b17 = km5.u.b();
        w2Var.f259275l = b17;
        b17.b();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237 c6233xa457e237 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237();
        c6233xa457e237.f136481g.f87740c = ff5Var.f455819m;
        c6233xa457e237.e();
        return null;
    }
}
