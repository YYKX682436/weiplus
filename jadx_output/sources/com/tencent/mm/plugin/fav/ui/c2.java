package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class c2 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFilterUI f100536d;

    public c2(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI) {
        this.f100536d = favFilterUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = this.f100536d;
        if (favFilterUI.f100327d == 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavFilterUI", "on edit mode long click, ignore");
            return true;
        }
        if (i17 < favFilterUI.f100336p.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavFilterUI", "on header view long click, ignore");
            return true;
        }
        int[] iArr = favFilterUI.B;
        favFilterUI.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(favFilterUI.f100335o.getItem((i17 - favFilterUI.f100336p.getHeaderViewsCount()) - 1).field_type));
        hashMap.put("card_clk_type", 1);
        v82.a.f434066a.a("fav_page_card_operation", "view_clk", hashMap);
        new rl5.r(favFilterUI.getContext(), view).g(view, i17, j17, new com.tencent.mm.plugin.fav.ui.v1(favFilterUI, i17), new com.tencent.mm.plugin.fav.ui.a2(favFilterUI, i17, hashMap, view), iArr[0], iArr[1]);
        return true;
    }
}
