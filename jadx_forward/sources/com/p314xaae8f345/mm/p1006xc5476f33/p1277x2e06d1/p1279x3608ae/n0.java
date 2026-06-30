package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes14.dex */
public class n0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.o0 f175308d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.o0 o0Var) {
        this.f175308d = o0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        if (!gm0.j1.i().f354741a.f354832d) {
            return true;
        }
        synchronized (this.f175308d.f175312a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "The lock was released.");
            this.f175308d.f175313b = true;
            this.f175308d.f175312a.notifyAll();
        }
        return false;
    }
}
