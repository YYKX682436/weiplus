package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes8.dex */
public final class m0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95345d;

    public m0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI) {
        this.f95345d = couponCardListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f95345d.finish();
        return false;
    }
}
