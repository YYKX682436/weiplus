package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class x2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.b3 f259282a;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.b3 b3Var) {
        this.f259282a = b3Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.d dVar = (nm5.d) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 w2Var = this.f259282a.f259151a;
        int intValue = ((java.lang.Integer) dVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) dVar.a(1)).intValue();
        int intValue3 = ((java.lang.Integer) dVar.a(2)).intValue();
        r45.kd kdVar = (r45.kd) dVar.a(3);
        w2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "fetchLqt, accountType: %s, %s", java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(intValue3));
        w2Var.f259269f = intValue;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = w2Var.f259265b;
        java.lang.String stringExtra = abstractActivityC22902xe37969e.getIntent().getStringExtra("operate_id");
        w2Var.f259271h = intValue2;
        abstractActivityC22902xe37969e.m83134x2b33b77f(true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue2);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(intValue3);
        km5.q qVar = new km5.q();
        qVar.y(valueOf, kdVar, valueOf2, valueOf3, stringExtra);
        qVar.n(w2Var.f259264a.f259191e);
        qVar.n(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.s2(w2Var));
        qVar.s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.r2(w2Var));
        km5.u.a(qVar);
        return null;
    }
}
