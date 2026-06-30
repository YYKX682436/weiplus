package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class a1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95288d;

    public a1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95288d = vipCardListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95288d;
        g4Var.d(1, vipCardListUI.getResources().getColor(com.tencent.mm.R.color.f479482a31), vipCardListUI.getString(com.tencent.mm.R.string.f490367t0));
    }
}
