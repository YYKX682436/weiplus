package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class u1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f95385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f95386f;

    public u1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, java.util.List list, java.util.List list2) {
        this.f95384d = vipCardListUI;
        this.f95385e = list;
        this.f95386f = list2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95384d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) vipCardListUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.card.ui.v3.s1(this.f95385e, vipCardListUI);
        k0Var.f211881s = new com.tencent.mm.plugin.card.ui.v3.t1(vipCardListUI, this.f95386f);
        k0Var.v();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 1);
        return false;
    }
}
