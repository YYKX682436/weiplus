package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class p2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.q2 f100778d;

    public p2(com.tencent.mm.plugin.fav.ui.detail.q2 q2Var) {
        this.f100778d = q2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.detail.q2 q2Var = this.f100778d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(q2Var.f100783d.f100789d.getContext(), "", q2Var.f100783d.f100789d.getString(com.tencent.mm.R.string.f490369t2), false, false, null);
        com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI favoriteVoiceDetailUI = q2Var.f100783d.f100789d;
        o72.r2 r2Var = favoriteVoiceDetailUI.f100677m;
        favoriteVoiceDetailUI.W6(r2Var, new com.tencent.mm.plugin.fav.ui.detail.o2(this, Q, r2Var.field_localId, r2Var.field_id), 18);
    }
}
