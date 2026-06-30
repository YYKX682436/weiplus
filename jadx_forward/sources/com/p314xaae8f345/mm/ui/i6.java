package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public final class i6 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.k6 f290439d;

    public i6(com.p314xaae8f345.mm.ui.k6 k6Var) {
        this.f290439d = k6Var;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        ra0.b0 state = (ra0.b0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        boolean z17 = this.f290439d.f290566a.f278186t.f501994g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreTopStoryRedLogic", "isExpose: " + z17 + ", action: " + state.f379599d);
        com.p314xaae8f345.mm.ui.k6 k6Var = this.f290439d;
        j75.d dVar = state.f379599d;
        if (dVar == null || !(dVar instanceof sa0.i)) {
            return;
        }
        sa0.i iVar = (sa0.i) dVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start process ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("NewLifeShowFindRedDotAction(redDotCacheData=");
        r45.fv4 fv4Var = iVar.f486784b;
        sb7.append(fv4Var != null ? fv4Var.mo12245xcc313de3() : null);
        sb7.append(", isNewLifeRedDot=");
        sb7.append(iVar.f486785c);
        sb7.append(", tipsInfo=");
        r45.qv4 qv4Var = iVar.f486786d;
        sb7.append(qv4Var != null ? qv4Var.mo12245xcc313de3() : null);
        sb7.append(", source='");
        sb7.append(iVar.f486787e);
        sb7.append("')");
        sb6.append(sb7.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreTopStoryRedLogic", sb6.toString());
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.h6(k6Var, iVar, false, ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri(), z17));
    }
}
