package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class n1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f95351b;

    public n1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, android.view.MenuItem menuItem) {
        this.f95350a = vipCardListUI;
        this.f95351b = menuItem;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            android.view.MenuItem menuItem = this.f95351b;
            kotlin.jvm.internal.o.f(menuItem, "$menuItem");
            com.tencent.mm.plugin.card.ui.v3.VipCardListUI.Y6(this.f95350a, menuItem);
        }
    }
}
