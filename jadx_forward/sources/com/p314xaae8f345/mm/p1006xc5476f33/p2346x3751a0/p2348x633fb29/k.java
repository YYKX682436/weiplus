package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n f258221d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n nVar) {
        this.f258221d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "on timeout, dismiss incoming card");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n nVar = this.f258221d;
        jq4.z0.c(nVar.f258286d, false, false, false, 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n.b(nVar, 3);
        nVar.p();
    }
}
