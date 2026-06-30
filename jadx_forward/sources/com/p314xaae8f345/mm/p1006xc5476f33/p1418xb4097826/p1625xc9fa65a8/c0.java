package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 f207175e;

    public c0(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 activityC14942x98a58d56) {
        this.f207174d = i17;
        this.f207175e = activityC14942x98a58d56;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.mu2 mu2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        int i18 = this.f207174d;
        if (i18 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 activityC14942x98a58d56 = this.f207175e;
            if (i18 >= activityC14942x98a58d56.f207067z.size() || (mu2Var = (r45.mu2) activityC14942x98a58d56.f207067z.get(i18)) == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0)) == null) {
                return;
            }
            new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.q().d(c19782x23db1cfa, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b0(activityC14942x98a58d56, i18));
        }
    }
}
