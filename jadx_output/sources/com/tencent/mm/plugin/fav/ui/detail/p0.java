package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.q0 f100776d;

    public p0(com.tencent.mm.plugin.fav.ui.detail.q0 q0Var) {
        this.f100776d = q0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.detail.q0 q0Var = this.f100776d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(q0Var.f100781d.f100786e.getContext(), "", q0Var.f100781d.f100786e.getString(com.tencent.mm.R.string.f490369t2), false, false, null);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = q0Var.f100781d.f100786e;
        favoriteImgDetailUI.W6(favoriteImgDetailUI.f100627o, new com.tencent.mm.plugin.fav.ui.detail.o0(this, Q), 16);
    }
}
