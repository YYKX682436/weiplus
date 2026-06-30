package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class vb implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101500d;

    public vb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        this.f101500d = favoriteIndexUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101500d;
        if (i17 < favoriteIndexUI.f100270h.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteIndexUI", "on header view long click, ignore");
            return true;
        }
        int i18 = com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.f100436y1;
        favoriteIndexUI.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        o72.r2 item = favoriteIndexUI.T.getItem(i17 - favoriteIndexUI.f100270h.getHeaderViewsCount());
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(item.field_type));
        hashMap.put("card_clk_type", 1);
        v82.a.f434066a.a("fav_page_card_operation", "view_clk", hashMap);
        rl5.r rVar = new rl5.r(favoriteIndexUI.getContext(), view);
        rVar.C = true;
        rVar.f397355y = new com.tencent.mm.plugin.fav.ui.wb(favoriteIndexUI, i17, j17);
        rVar.f397354x = new com.tencent.mm.plugin.fav.ui.zb(favoriteIndexUI, item, i17, view);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i19 = iArr[0];
        rVar.n((i19 + view.getWidth()) / 2, iArr[1]);
        return true;
    }
}
