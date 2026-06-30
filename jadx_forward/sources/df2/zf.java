package df2;

/* loaded from: classes3.dex */
public final class zf implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f313493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.ug f313494f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313495g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f313496h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313497i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f313498m;

    public zf(yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, df2.ug ugVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, android.view.View view2, dk2.zf zfVar) {
        this.f313492d = lVar;
        this.f313493e = c14197x319b1b9e;
        this.f313494f = ugVar;
        this.f313495g = view;
        this.f313496h = mgVar;
        this.f313497i = view2;
        this.f313498m = zfVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 165 || menuItem.getItemId() == 166) {
            this.f313492d.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zq zqVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zq.f215023a;
            gk2.e liveRoomData = this.f313493e.getLiveRoomData();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f313494f.f372632e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
            zqVar.c(2, liveRoomData, k0Var != null ? k0Var.m57691xa0fa63f9() : null, this.f313495g, this.f313496h, this.f313497i, menuItem, i17, this.f313498m);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a.a();
    }
}
