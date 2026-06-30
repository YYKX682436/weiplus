package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.t1 f100792d;

    public s1(com.tencent.mm.plugin.fav.ui.detail.t1 t1Var) {
        this.f100792d = t1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.detail.t1 t1Var = this.f100792d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(t1Var.f100797d.f100803d.getContext(), "", t1Var.f100797d.f100803d.getString(com.tencent.mm.R.string.f490369t2), false, false, null);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI favoriteTextDetailUI = t1Var.f100797d.f100803d;
        favoriteTextDetailUI.W6(favoriteTextDetailUI.f100652n, new com.tencent.mm.plugin.fav.ui.detail.r1(this, Q), 17);
    }
}
