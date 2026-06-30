package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes10.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f197774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e2 f197775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(gk2.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e2 e2Var) {
        super(0);
        this.f197774d = eVar;
        this.f197775e = e2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yi2.i0 i0Var;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e2.f197797p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTimerUpdateData linkMicVisitorUserList:");
        gk2.e eVar = this.f197774d;
        sb6.append(eVar != null ? ((mm2.o4) eVar.a(mm2.o4.class)).f410851o : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveApplyLinkAnchorView", sb6.toString());
        if (eVar != null && (i0Var = this.f197775e.f197799i) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorWidget", "onUpdateData() called");
            i0Var.l();
            int size = i0Var.f544055h.size();
            wi2.c cVar = i0Var.F;
            if (size > 0) {
                cVar.c(false);
            } else {
                cVar.c(true);
            }
        }
        return jz5.f0.f384359a;
    }
}
