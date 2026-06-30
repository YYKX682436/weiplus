package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class y9 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f101631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f101632b;

    public y9(com.tencent.mm.plugin.fav.ui.da daVar, int i17) {
        this.f101631a = daVar;
        this.f101632b = i17;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o72.b3 b3Var = new o72.b3();
        com.tencent.mm.plugin.fav.ui.da daVar = this.f101631a;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        o72.r2 item = cVar.getItem(this.f101632b - daVar.R6().getHeaderViewsCount());
        boolean c17 = b3Var.c(item, false, false);
        if (!c17) {
            g4Var.c(0, 3, 0, daVar.getContext().getResources().getString(com.tencent.mm.R.string.ccj), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (c17 && o72.x1.l0(item)) {
            g4Var.c(0, 3, 0, daVar.getContext().getResources().getString(com.tencent.mm.R.string.ccj), com.tencent.mm.R.raw.icons_filled_share);
        }
        g4Var.c(0, 2, 0, daVar.getContext().getResources().getString(com.tencent.mm.R.string.f491195ca4), com.tencent.mm.R.raw.tag_filled);
        g4Var.c(0, 0, 0, daVar.getContext().getResources().getString(com.tencent.mm.R.string.c_f), com.tencent.mm.R.raw.icons_filled_delete);
        if (item.B1) {
            int i17 = item.C1.field_type;
            if (i17 == 14) {
                g4Var.c(0, 5, 0, daVar.getContext().getResources().getString(com.tencent.mm.R.string.caz), com.tencent.mm.R.raw.icons_filled_chats);
            } else if (i17 != 18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchManager", "itemInfo exist detail but no note or record, error!");
            } else {
                g4Var.c(0, 5, 0, daVar.getContext().getResources().getString(com.tencent.mm.R.string.caz), com.tencent.mm.R.raw.note_filled);
            }
        }
        g4Var.c(0, 1, 0, daVar.getContext().getResources().getString(com.tencent.mm.R.string.cbi), com.tencent.mm.R.raw.icons_filled_multiple_choice);
    }
}
