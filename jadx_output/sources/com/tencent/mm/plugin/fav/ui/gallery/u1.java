package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class u1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f101085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.v1 f101086e;

    public u1(com.tencent.mm.plugin.fav.ui.gallery.v1 v1Var, android.view.View view) {
        this.f101086e = v1Var;
        this.f101085d = view;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            android.view.View view = this.f101085d;
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.dug);
            if (tag != null) {
                ((java.lang.Integer) tag).intValue();
                ((com.tencent.mm.plugin.fav.ui.gallery.o0) this.f101086e.f101089d.f101099n.f101114t).f101034a.j();
            }
            if (view.getTag(com.tencent.mm.R.id.t_7) != null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("card_fav_type", view.getTag(com.tencent.mm.R.id.t_7));
                hashMap.put("card_clk_type", 5);
                v82.a.f434066a.a("fav_page_card_operation", "view_clk", hashMap);
            }
        }
    }
}
