package df2;

/* loaded from: classes3.dex */
public final class yf implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f313393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f313394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.ug f313395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313396h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f313397i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313398m;

    public yf(yz5.l lVar, dk2.zf zfVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, df2.ug ugVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, android.view.View view2) {
        this.f313392d = lVar;
        this.f313393e = zfVar;
        this.f313394f = c14197x319b1b9e;
        this.f313395g = ugVar;
        this.f313396h = view;
        this.f313397i = mgVar;
        this.f313398m = view2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dk2.zf zfVar = this.f313393e;
        yz5.l lVar = this.f313392d;
        if (itemId == 165) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
            int a17 = mm2.j2.F.a(zfVar.p());
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.F1;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 2);
            gVar.o("barrage_type", a17);
            zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
        } else if (itemId != 166) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zq zqVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zq.f215023a;
            gk2.e liveRoomData = this.f313394f.getLiveRoomData();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f313395g.f372632e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
            zqVar.b(2, liveRoomData, k0Var != null ? k0Var.m57691xa0fa63f9() : null, this.f313396h, this.f313397i, this.f313398m, menuItem, i17, this.f313393e);
        } else {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
            int a18 = mm2.j2.F.a(zfVar.p());
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.z4 z4Var2 = ml2.z4.F1;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("type", 8);
            gVar2.o("barrage_type", a18);
            zy2.zb.y6(zbVar2, z4Var2, gVar2.toString(), null, 4, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a.a();
    }
}
