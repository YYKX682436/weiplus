package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes9.dex */
public class r2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI f100789d;

    public r2(com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI favoriteVoiceDetailUI) {
        this.f100789d = favoriteVoiceDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f100789d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.fav.ui.detail.n2(this);
        k0Var.f211881s = new com.tencent.mm.plugin.fav.ui.detail.q2(this);
        k0Var.v();
        return true;
    }
}
