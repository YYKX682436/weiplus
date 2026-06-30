package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class c5 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 f182077d;

    public c5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257) {
        this.f182077d = activityC13570xd6b9f257;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = this.f182077d;
        if (activityC13570xd6b9f257.f181926d == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSearchUI", "on edit mode long click, ignore");
            return true;
        }
        if (i17 < activityC13570xd6b9f257.f181936q.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSearchUI", "on header view long click, ignore");
            return true;
        }
        int[] iArr = activityC13570xd6b9f257.f181925J;
        activityC13570xd6b9f257.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(activityC13570xd6b9f257.f181933n.getItem((i17 - activityC13570xd6b9f257.f181936q.getHeaderViewsCount()) - 1).f67657x2262335f));
        hashMap.put("card_clk_type", 1);
        v82.a.f515599a.a("fav_page_card_operation", "view_clk", hashMap);
        new rl5.r(activityC13570xd6b9f257.mo55332x76847179(), view).g(view, i17, j17, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w4(activityC13570xd6b9f257, i17), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a5(activityC13570xd6b9f257, i17, hashMap, view), iArr[0], iArr[1]);
        return true;
    }
}
