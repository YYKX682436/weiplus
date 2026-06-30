package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class u1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f182618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.v1 f182619e;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.v1 v1Var, android.view.View view) {
        this.f182619e = v1Var;
        this.f182618d = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            android.view.View view = this.f182618d;
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.dug);
            if (tag != null) {
                ((java.lang.Integer) tag).intValue();
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o0) this.f182619e.f182622d.f182632n.f182647t).f182567a.j();
            }
            if (view.getTag(com.p314xaae8f345.mm.R.id.t_7) != null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("card_fav_type", view.getTag(com.p314xaae8f345.mm.R.id.t_7));
                hashMap.put("card_clk_type", 5);
                v82.a.f515599a.a("fav_page_card_operation", "view_clk", hashMap);
            }
        }
    }
}
