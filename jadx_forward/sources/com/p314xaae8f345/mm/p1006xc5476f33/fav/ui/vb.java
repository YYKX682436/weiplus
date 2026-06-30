package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class vb implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a f183033d;

    public vb(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a) {
        this.f183033d = activityC13579xef51058a;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = this.f183033d;
        if (i17 < activityC13579xef51058a.f181803h.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteIndexUI", "on header view long click, ignore");
            return true;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.f181969y1;
        activityC13579xef51058a.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        o72.r2 item = activityC13579xef51058a.T.getItem(i17 - activityC13579xef51058a.f181803h.getHeaderViewsCount());
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(item.f67657x2262335f));
        hashMap.put("card_clk_type", 1);
        v82.a.f515599a.a("fav_page_card_operation", "view_clk", hashMap);
        rl5.r rVar = new rl5.r(activityC13579xef51058a.mo55332x76847179(), view);
        rVar.C = true;
        rVar.f478888y = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.wb(activityC13579xef51058a, i17, j17);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.zb(activityC13579xef51058a, item, i17, view);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i19 = iArr[0];
        rVar.n((i19 + view.getWidth()) / 2, iArr[1]);
        return true;
    }
}
