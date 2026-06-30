package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class n0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.r0 f100764d;

    public n0(com.tencent.mm.plugin.fav.ui.detail.r0 r0Var) {
        this.f100764d = r0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.fav.ui.detail.r0 r0Var = this.f100764d;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = r0Var.f100786e;
        if (favoriteImgDetailUI.f100630r) {
            g4Var.f(2, favoriteImgDetailUI.getString(com.tencent.mm.R.string.ccw));
        }
        g4Var.f(3, r0Var.f100786e.getString(com.tencent.mm.R.string.ccl));
        g4Var.f(0, r0Var.f100786e.getString(com.tencent.mm.R.string.f491195ca4));
        g4Var.f(1, r0Var.f100786e.getContext().getString(com.tencent.mm.R.string.f490367t0));
    }
}
