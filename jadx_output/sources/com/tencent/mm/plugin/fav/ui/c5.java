package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class c5 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f100544d;

    public c5(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI) {
        this.f100544d = favSearchUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f100544d;
        if (favSearchUI.f100393d == 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSearchUI", "on edit mode long click, ignore");
            return true;
        }
        if (i17 < favSearchUI.f100403q.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSearchUI", "on header view long click, ignore");
            return true;
        }
        int[] iArr = favSearchUI.f100392J;
        favSearchUI.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(favSearchUI.f100400n.getItem((i17 - favSearchUI.f100403q.getHeaderViewsCount()) - 1).field_type));
        hashMap.put("card_clk_type", 1);
        v82.a.f434066a.a("fav_page_card_operation", "view_clk", hashMap);
        new rl5.r(favSearchUI.getContext(), view).g(view, i17, j17, new com.tencent.mm.plugin.fav.ui.w4(favSearchUI, i17), new com.tencent.mm.plugin.fav.ui.a5(favSearchUI, i17, hashMap, view), iArr[0], iArr[1]);
        return true;
    }
}
