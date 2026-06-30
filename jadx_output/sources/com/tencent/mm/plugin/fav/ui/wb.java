package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class wb implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f101520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101521c;

    public wb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI, int i17, long j17) {
        this.f101521c = favoriteIndexUI;
        this.f101519a = i17;
        this.f101520b = j17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o72.b3 b3Var = new o72.b3();
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101521c;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favoriteIndexUI.T;
        int headerViewsCount = favoriteIndexUI.f100270h.getHeaderViewsCount();
        int i17 = this.f101519a;
        o72.r2 item = cVar.getItem(i17 - headerViewsCount);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "[OnCreateContextMMMenu] pos = " + i17 + ", id = " + this.f101520b + ", fav id = " + item.field_id);
        boolean c17 = b3Var.c(item, false, false);
        if (!c17) {
            g4Var.c(0, 3, 0, favoriteIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.ccj), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (c17 && o72.x1.l0(item)) {
            g4Var.c(0, 3, 0, favoriteIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.ccj), com.tencent.mm.R.raw.icons_filled_share);
        }
        g4Var.c(0, 2, 0, favoriteIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.f491195ca4), com.tencent.mm.R.raw.tag_filled);
        g4Var.c(0, 0, 0, favoriteIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.c_f), com.tencent.mm.R.raw.icons_filled_delete);
        g4Var.c(0, 1, 0, favoriteIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.cbi), com.tencent.mm.R.raw.icons_filled_multiple_choice);
        boolean z17 = true;
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalFavDebug()) == 1) {
            g4Var.add(0, 5, 0, com.tencent.mm.R.string.c9v);
        }
        favoriteIndexUI.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!com.tencent.mm.sdk.platformtools.s9.f192975c && !z65.c.a()) {
            z17 = false;
        }
        if (z17) {
            g4Var.add(0, 7, 0, "删除本地文件");
        }
        if (item.B1) {
            int i18 = item.C1.field_type;
            if (i18 == 18) {
                g4Var.c(0, 6, 0, i65.a.r(favoriteIndexUI, com.tencent.mm.R.string.caz), com.tencent.mm.R.raw.note_filled);
            } else if (i18 == 14) {
                g4Var.c(0, 6, 0, i65.a.r(favoriteIndexUI, com.tencent.mm.R.string.caz), com.tencent.mm.R.raw.icons_filled_chats);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteIndexUI", "itemInfo exist detail but no note or record, error!");
            }
        }
    }
}
