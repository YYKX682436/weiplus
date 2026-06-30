package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class u9 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f101477d;

    public u9(com.tencent.mm.plugin.fav.ui.da daVar) {
        this.f101477d = daVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.fav.ui.da daVar = this.f101477d;
        if (i17 < daVar.R6().getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchManager", "on header view long click, ignore");
            return true;
        }
        kotlin.jvm.internal.o.d(view);
        daVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(cVar.getItem(i17 - daVar.R6().getHeaderViewsCount()).field_type));
        hashMap.put("card_clk_type", 1);
        v82.a.f434066a.a("fav_page_card_operation", "view_clk", hashMap);
        rl5.r rVar = new rl5.r(daVar.getContext(), view);
        rVar.C = true;
        rVar.f397355y = new com.tencent.mm.plugin.fav.ui.y9(daVar, i17);
        rVar.f397354x = new com.tencent.mm.plugin.fav.ui.ca(daVar, i17, hashMap, view);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i18 = iArr[0];
        rVar.n((i18 + view.getWidth()) / 2, iArr[1]);
        return true;
    }
}
