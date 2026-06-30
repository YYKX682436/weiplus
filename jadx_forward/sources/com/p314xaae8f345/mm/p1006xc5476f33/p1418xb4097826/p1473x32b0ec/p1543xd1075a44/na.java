package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class na implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ra f200704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f200705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f200706f;

    public na(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ra raVar, mm2.n0 n0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f200704d = raVar;
        this.f200705e = n0Var;
        this.f200706f = c0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.LinkedList linkedList;
        r45.f50 f50Var = (r45.f50) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeSlice: invitationId=");
        sb6.append(f50Var != null ? new java.lang.Long(f50Var.f455546d) : null);
        sb6.append(", status=");
        sb6.append(f50Var != null ? new java.lang.Integer(f50Var.f455547e) : null);
        sb6.append(", inviteeCount=");
        sb6.append((f50Var == null || (linkedList = f50Var.f455549g) == null) ? null : new java.lang.Integer(linkedList.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ra raVar = this.f200704d;
        raVar.e0();
        boolean O6 = this.f200705e.O6();
        int i17 = f50Var != null ? f50Var.f455547e : -1;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f200706f;
        if (c0Var.f391645d && !O6 && i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", "observeSlice: invitation invalidated (non-Used), close panel");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(raVar, false, 1, null);
        }
        c0Var.f391645d = O6;
        return jz5.f0.f384359a;
    }
}
