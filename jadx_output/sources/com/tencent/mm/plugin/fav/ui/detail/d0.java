package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class d0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.e0 f100707d;

    public d0(com.tencent.mm.plugin.fav.ui.detail.e0 e0Var) {
        this.f100707d = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.detail.e0 e0Var = this.f100707d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(e0Var.f100711d.f100718g.getContext(), "", e0Var.f100711d.f100718g.getString(com.tencent.mm.R.string.f490369t2), false, false, null);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = e0Var.f100711d.f100718g;
        favoriteFileDetailUI.W6(favoriteFileDetailUI.E, new com.tencent.mm.plugin.fav.ui.detail.c0(this, Q), 15);
    }
}
