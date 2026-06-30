package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class e2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI f100713d;

    public e2(com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI) {
        this.f100713d = favoriteVideoPlayUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI = this.f100713d;
        if (favoriteVideoPlayUI.f100671v) {
            if (com.tencent.mm.vfs.w6.j(favoriteVideoPlayUI.f100657e)) {
                g4Var.add(0, 1, 0, favoriteVideoPlayUI.getString(com.tencent.mm.R.string.ccw));
            }
            g4Var.add(0, 2, 0, favoriteVideoPlayUI.getString(com.tencent.mm.R.string.i8d));
        }
    }
}
