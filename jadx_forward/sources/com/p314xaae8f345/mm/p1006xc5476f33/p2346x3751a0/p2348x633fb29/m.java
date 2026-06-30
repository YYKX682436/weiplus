package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public final class m implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n f258275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.r27 f258276b;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n nVar, r45.r27 r27Var) {
        this.f258275a = nVar;
        this.f258276b = r27Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n nVar = this.f258275a;
        jq4.z0.c(nVar.f258286d, false, false, false, 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n.b(nVar, 2);
        nVar.q();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0) nVar;
        if (!gq4.v.Bi().f258091a.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "click accept, directly accept");
            c0Var.z(this.f258276b);
            nVar.p();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "click accept, hangup and waiting for accept");
        nVar.f258296q = true;
        nVar.f258294o = false;
        nVar.f258295p = true ^ gq4.v.Bi().f258096f;
        gq4.a aVar = gq4.v.Bi().f258092b;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) aVar).s0();
        }
    }
}
