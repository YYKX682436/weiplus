package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class z2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.b3 f259295a;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.b3 b3Var) {
        this.f259295a = b3Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 w2Var = this.f259295a.f259151a;
        int intValue = ((java.lang.Integer) cVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) cVar.a(1)).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) cVar.a(2);
        w2Var.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(intValue2);
        objArr[1] = c19091x9511676c != null ? c19091x9511676c.f69225xed6d60f6 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "saveLqt, accountType: %s, bankcard: %s", objArr);
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = w2Var.f259265b;
        java.lang.String stringExtra = abstractActivityC22902xe37969e.getIntent().getStringExtra("lqt_save_fund_code");
        java.lang.String stringExtra2 = abstractActivityC22902xe37969e.getIntent().getStringExtra("lqt_fund_spid");
        java.lang.String stringExtra3 = abstractActivityC22902xe37969e.getIntent().getStringExtra("operate_id");
        w2Var.f259268e = intValue;
        w2Var.f259271h = intValue2;
        java.lang.String str = c19091x9511676c.f69223x58802fcb;
        java.lang.String str2 = c19091x9511676c.f69225xed6d60f6;
        abstractActivityC22902xe37969e.m83134x2b33b77f(true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue2);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(w2Var.f259274k);
        km5.q qVar = new km5.q();
        qVar.y(stringExtra, stringExtra2, valueOf, valueOf2, stringExtra3, valueOf3, str, str2);
        qVar.n(w2Var.f259264a.f259188b);
        qVar.n(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.p2(w2Var));
        qVar.n(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.o2(w2Var, c19091x9511676c));
        qVar.s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.n2(w2Var));
        km5.u.a(qVar);
        return null;
    }
}
