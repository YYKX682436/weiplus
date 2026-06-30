package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class kb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb f200364d;

    public kb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb nbVar) {
        this.f200364d = nbVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        if (menuItem.getItemId() == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb nbVar = this.f200364d;
            mm2.n0 n0Var = nbVar.H;
            java.lang.String str = null;
            r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f410798g) == null) ? null : (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb();
            long j17 = f50Var != null ? f50Var.f455546d : 0L;
            if (f50Var != null && (c19782x23db1cfa = f50Var.f455550h) != null) {
                str = c19782x23db1cfa.m76197x6c03c64c();
            }
            java.lang.String str2 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "doEndCoLive: invitationId=" + j17 + ", initiator=" + str2);
            if (j17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveCoLiveInvitorPreparePanel", "doEndCoLive: invalid invitationId, skip");
                return;
            }
            az2.f a17 = az2.c.a(az2.f.f97658d, nbVar.f199716e, null, 0L, null, 8, null);
            a17.a();
            p3325xe03a0797.p3326xc267989b.y0 y0Var = nbVar.E;
            re2.e1.f475938a.a(j17, 4, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : str2, (r18 & 16) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wa(y0Var, a17, j17, nbVar), (r18 & 32) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ya(y0Var, a17, nbVar));
        }
    }
}
