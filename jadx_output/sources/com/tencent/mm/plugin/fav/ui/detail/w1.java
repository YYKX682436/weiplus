package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class w1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI f100810d;

    public w1(com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI) {
        this.f100810d = favoriteTextDetailUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI;
        o72.r2 r2Var;
        r45.bq0 bq0Var;
        if (menuItem.getItemId() != 1 || (r2Var = (favoriteTextDetailUI = this.f100810d).f100652n) == null || (bq0Var = r2Var.field_favProto) == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.b0.e(bq0Var.f370974s);
        db5.e1.T(favoriteTextDetailUI.getContext(), favoriteTextDetailUI.getContext().getString(com.tencent.mm.R.string.f490361st));
    }
}
