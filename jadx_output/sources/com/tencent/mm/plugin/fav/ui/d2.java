package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class d2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFilterUI f100564d;

    public d2(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI) {
        this.f100564d = favFilterUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.fav.ui.FavFilterUI.F;
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = this.f100564d;
        if (favFilterUI.X6()) {
            return true;
        }
        favFilterUI.finish();
        return true;
    }
}
