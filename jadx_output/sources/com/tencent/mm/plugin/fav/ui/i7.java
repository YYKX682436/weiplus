package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class i7 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f101171a;

    public i7(int i17, com.tencent.mm.plugin.fav.ui.z7 z7Var, int i18) {
        this.f101171a = z7Var;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f101171a;
        g4Var.c(0, 1, 0, z7Var.f101655a.getResources().getString(com.tencent.mm.R.string.c9e), com.tencent.mm.R.raw.icons_outlined_quote_pencil);
        g4Var.c(0, 2, 0, z7Var.f101655a.getResources().getString(com.tencent.mm.R.string.c9d), com.tencent.mm.R.raw.icons_filled_delete);
    }
}
