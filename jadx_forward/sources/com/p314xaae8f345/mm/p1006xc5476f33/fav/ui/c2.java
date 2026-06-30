package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class c2 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 f182069d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427) {
        this.f182069d = activityC13566x76c62427;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427 = this.f182069d;
        if (activityC13566x76c62427.f181860d == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavFilterUI", "on edit mode long click, ignore");
            return true;
        }
        if (i17 < activityC13566x76c62427.f181869p.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavFilterUI", "on header view long click, ignore");
            return true;
        }
        int[] iArr = activityC13566x76c62427.B;
        activityC13566x76c62427.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(activityC13566x76c62427.f181868o.getItem((i17 - activityC13566x76c62427.f181869p.getHeaderViewsCount()) - 1).f67657x2262335f));
        hashMap.put("card_clk_type", 1);
        v82.a.f515599a.a("fav_page_card_operation", "view_clk", hashMap);
        new rl5.r(activityC13566x76c62427.mo55332x76847179(), view).g(view, i17, j17, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v1(activityC13566x76c62427, i17), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a2(activityC13566x76c62427, i17, hashMap, view), iArr[0], iArr[1]);
        return true;
    }
}
