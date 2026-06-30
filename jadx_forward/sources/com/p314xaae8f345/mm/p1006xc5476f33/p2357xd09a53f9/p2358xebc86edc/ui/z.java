package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class z implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f260068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb f260069b;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb, java.util.List list) {
        this.f260069b = activityC18999x8e4b0cb;
        this.f260068a = list;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = this.f260069b;
        java.util.List list = this.f260068a;
        if (list == null || (i17 = activityC18999x8e4b0cb.P.f366161m) < 0 || i17 >= list.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "add new card");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb.W;
            activityC18999x8e4b0cb.d7();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = activityC18999x8e4b0cb.L;
            objArr[1] = 9;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC18999x8e4b0cb.f259316e;
            objArr[2] = c19091x9511676c != null ? c19091x9511676c.f69223x58802fcb : "";
            objArr[3] = c19091x9511676c != null ? c19091x9511676c.f69225xed6d60f6 : "";
            g0Var.d(16398, objArr);
        } else {
            activityC18999x8e4b0cb.f259316e = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) list.get(activityC18999x8e4b0cb.P.f366161m);
            activityC18999x8e4b0cb.h7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "bankcard: %s", activityC18999x8e4b0cb.f259316e.f69233x225aa2b6);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = activityC18999x8e4b0cb.L;
            objArr2[1] = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = activityC18999x8e4b0cb.f259316e;
            objArr2[2] = c19091x9511676c2 != null ? c19091x9511676c2.f69223x58802fcb : "";
            objArr2[3] = c19091x9511676c2 != null ? c19091x9511676c2.f69225xed6d60f6 : "";
            g0Var2.d(16398, objArr2);
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb.W;
        activityC18999x8e4b0cb.i7();
        activityC18999x8e4b0cb.getClass();
        activityC18999x8e4b0cb.P.c();
    }
}
