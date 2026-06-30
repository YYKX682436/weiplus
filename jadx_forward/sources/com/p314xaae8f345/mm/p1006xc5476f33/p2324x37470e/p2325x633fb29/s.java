package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes14.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w f257251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs0.h f257252e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar, rs0.h hVar) {
        this.f257251d = wVar;
        this.f257252e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar = this.f257251d;
        os0.g gVar = wVar.f257299o;
        if (gVar != null) {
            gVar.n();
        }
        wVar.f257299o = null;
        rs0.i.f480829a.u(this.f257252e);
    }
}
