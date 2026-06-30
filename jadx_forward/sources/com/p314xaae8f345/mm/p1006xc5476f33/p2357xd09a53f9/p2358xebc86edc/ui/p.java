package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f260022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c0 f260023e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c0 c0Var, java.util.List list) {
        this.f260023e = c0Var;
        this.f260022d = list;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c0 c0Var = this.f260023e;
        java.util.List list = this.f260022d;
        if (list == null || i17 >= list.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "add new card");
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = c0Var.f259404d;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb.W;
            activityC18999x8e4b0cb.d7();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = c0Var.f259404d.L;
            objArr[1] = 9;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = c0Var.f259404d.f259316e;
            objArr[2] = c19091x9511676c != null ? c19091x9511676c.f69223x58802fcb : "";
            objArr[3] = c19091x9511676c != null ? c19091x9511676c.f69225xed6d60f6 : "";
            g0Var.d(16398, objArr);
        } else {
            c0Var.f259404d.f259316e = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) list.get(i17);
            c0Var.f259404d.h7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "bankcard: %s", c0Var.f259404d.f259316e.f69233x225aa2b6);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = c0Var.f259404d.L;
            objArr2[1] = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = c0Var.f259404d.f259316e;
            objArr2[2] = c19091x9511676c2 != null ? c19091x9511676c2.f69223x58802fcb : "";
            objArr2[3] = c19091x9511676c2 != null ? c19091x9511676c2.f69225xed6d60f6 : "";
            g0Var2.d(16398, objArr2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb2 = c0Var.f259404d;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb.W;
        activityC18999x8e4b0cb2.i7();
        c0Var.f259404d.getClass();
    }
}
