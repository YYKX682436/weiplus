package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class t1 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.v1 f182615a;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.v1 v1Var) {
        this.f182615a = v1Var;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.c(0, 1, 0, this.f182615a.f182622d.f182632n.f182634d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbi), com.p314xaae8f345.mm.R.raw.f79818xafe47098);
        if (view.getTag(com.p314xaae8f345.mm.R.id.t_7) != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("card_fav_type", view.getTag(com.p314xaae8f345.mm.R.id.t_7));
            hashMap.put("card_clk_type", 1);
            v82.a.f515599a.a("fav_page_card_operation", "view_clk", hashMap);
        }
    }
}
