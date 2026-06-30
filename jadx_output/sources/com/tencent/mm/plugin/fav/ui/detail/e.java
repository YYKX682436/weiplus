package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100710d;

    public e(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f100710d = favoriteFileDetailUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100710d;
        com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, null, com.tencent.mm.sdk.platformtools.t8.K0(favoriteFileDetailUI.F.f375404d) ? favoriteFileDetailUI.getString(com.tencent.mm.R.string.f492674hf5) : favoriteFileDetailUI.F.f375404d, null);
        db5.e1.T(favoriteFileDetailUI, favoriteFileDetailUI.getString(com.tencent.mm.R.string.f490361st));
    }
}
