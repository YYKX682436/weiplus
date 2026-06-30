package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class mb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb f200592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1 f200593e;

    public mb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb nbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1 v1Var) {
        this.f200592d = nbVar;
        this.f200593e = v1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb nbVar = this.f200592d;
            mm2.n0 n0Var = nbVar.H;
            java.lang.String str = null;
            r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f410798g) == null) ? null : (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb();
            long j17 = f50Var != null ? f50Var.f455546d : 0L;
            java.lang.String str2 = this.f200593e.f201553a;
            if (f50Var != null && (c19782x23db1cfa = f50Var.f455550h) != null) {
                str = c19782x23db1cfa.m76197x6c03c64c();
            }
            java.lang.String str3 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "doRemoveInvitee: invitationId=" + j17 + ", target=" + str2 + ", initiator=" + str3);
            if (j17 != 0) {
                if (!(str2.length() == 0)) {
                    az2.f a17 = az2.c.a(az2.f.f97658d, nbVar.f199716e, null, 0L, null, 8, null);
                    a17.a();
                    re2.e1.f475938a.a(j17, 3, str2, str3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bb(nbVar, a17, str2), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.db(nbVar, a17));
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveCoLiveInvitorPreparePanel", "doRemoveInvitee: invalid params, skip");
        }
    }
}
