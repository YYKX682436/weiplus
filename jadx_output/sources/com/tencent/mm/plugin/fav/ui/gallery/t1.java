package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class t1 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.v1 f101082a;

    public t1(com.tencent.mm.plugin.fav.ui.gallery.v1 v1Var) {
        this.f101082a = v1Var;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.c(0, 1, 0, this.f101082a.f101089d.f101099n.f101101d.getResources().getString(com.tencent.mm.R.string.cbi), com.tencent.mm.R.raw.icons_filled_multiple_choice);
        if (view.getTag(com.tencent.mm.R.id.t_7) != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("card_fav_type", view.getTag(com.tencent.mm.R.id.t_7));
            hashMap.put("card_clk_type", 1);
            v82.a.f434066a.a("fav_page_card_operation", "view_clk", hashMap);
        }
    }
}
