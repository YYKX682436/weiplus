package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p f210718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f210719e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p pVar, int i17) {
        this.f210718d = pVar;
        this.f210719e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p pVar = this.f210718d;
        if (itemId != pVar.f210733n || (i18 = this.f210719e) < 0 || i18 >= pVar.c().size()) {
            return;
        }
        java.lang.Object obj = pVar.c().get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
        r45.ug7 ug7Var = j5Var instanceof so2.a0 ? r45.ug7.emFinderDelGlobalFavType_Collection : r45.ug7.emFinderDelGlobalFavType_Feed;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGlobalFavPresenter", "[handleDelete] positiveClick remove id: " + mo2128x1ed62e84);
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pm0.v.T(new bq.o(java.lang.Long.valueOf(mo2128x1ed62e84), ug7Var, java.lang.Long.valueOf(mo2128x1ed62e84)).l(), new cq.y(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.k(pVar, j5Var, mo2128x1ed62e84), null));
        pVar.f().i(kz5.b0.c(java.lang.Integer.valueOf(i18)));
    }
}
