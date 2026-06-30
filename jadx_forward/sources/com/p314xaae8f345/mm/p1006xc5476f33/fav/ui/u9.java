package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class u9 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f183010d;

    public u9(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar) {
        this.f183010d = daVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f183010d;
        if (i17 < daVar.R6().getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchManager", "on header view long click, ignore");
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        daVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(cVar.getItem(i17 - daVar.R6().getHeaderViewsCount()).f67657x2262335f));
        hashMap.put("card_clk_type", 1);
        v82.a.f515599a.a("fav_page_card_operation", "view_clk", hashMap);
        rl5.r rVar = new rl5.r(daVar.m80379x76847179(), view);
        rVar.C = true;
        rVar.f478888y = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y9(daVar, i17);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ca(daVar, i17, hashMap, view);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i18 = iArr[0];
        rVar.n((i18 + view.getWidth()) / 2, iArr[1]);
        return true;
    }
}
