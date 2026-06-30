package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb f260017d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb) {
        this.f260017d = activityC18999x8e4b0cb;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb.W;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = this.f260017d;
        activityC18999x8e4b0cb.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "do get free fee");
        if (activityC18999x8e4b0cb.f259316e == null) {
            return;
        }
        if (activityC18999x8e4b0cb.M != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "cancel prev cgi");
            activityC18999x8e4b0cb.M.j();
        }
        long j07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j0("" + activityC18999x8e4b0cb.f259317f, "100");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC18999x8e4b0cb.f259316e;
        rr4.b bVar = new rr4.b(j07, c19091x9511676c.f69223x58802fcb, c19091x9511676c.f69225xed6d60f6);
        activityC18999x8e4b0cb.M = bVar;
        bVar.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.q(activityC18999x8e4b0cb));
    }
}
