package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes8.dex */
public final class q0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95361d;

    public q0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI) {
        this.f95361d = couponCardListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.add(0, 0, 1, this.f95361d.B);
    }
}
