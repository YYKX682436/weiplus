package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class i1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.j1 f100739d;

    public i1(com.tencent.mm.plugin.fav.ui.detail.j1 j1Var) {
        this.f100739d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.detail.j1 j1Var = this.f100739d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(j1Var.f100746d.f100750d.getContext(), "", j1Var.f100746d.f100750d.getString(com.tencent.mm.R.string.f490369t2), false, false, null);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI = j1Var.f100746d.f100750d;
        favoriteSightDetailUI.W6(favoriteSightDetailUI.f100641r, new com.tencent.mm.plugin.fav.ui.detail.h1(this, Q), 19);
    }
}
