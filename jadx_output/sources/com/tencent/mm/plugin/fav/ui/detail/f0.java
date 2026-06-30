package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f100715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f100716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100718g;

    public f0(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI, boolean z17, boolean z18, int i17) {
        this.f100718g = favoriteFileDetailUI;
        this.f100715d = z17;
        this.f100716e = z18;
        this.f100717f = i17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17 = this.f100715d;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100718g;
        if ((!z17 || favoriteFileDetailUI.H.b(favoriteFileDetailUI.F, false, false) || favoriteFileDetailUI.F.X1 != 0) && !this.f100716e) {
            return false;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) favoriteFileDetailUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.fav.ui.detail.a0(this);
        k0Var.f211881s = new com.tencent.mm.plugin.fav.ui.detail.e0(this);
        k0Var.v();
        return true;
    }
}
