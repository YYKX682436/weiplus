package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes8.dex */
public final class s0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.iu f95371e;

    public s0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, r45.iu iuVar) {
        this.f95370d = couponCardListUI;
        this.f95371e = iuVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95370d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) couponCardListUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.card.ui.v3.q0(couponCardListUI);
        k0Var.f211881s = new com.tencent.mm.plugin.card.ui.v3.r0(this.f95371e);
        k0Var.v();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 2, 1);
        return false;
    }
}
