package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class r1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f95366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f95367f;

    public r1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2) {
        this.f95365d = vipCardListUI;
        this.f95366e = c0Var;
        this.f95367f = c0Var2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95365d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) vipCardListUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.card.ui.v3.p1(this.f95366e, vipCardListUI, this.f95367f);
        k0Var.f211881s = new com.tencent.mm.plugin.card.ui.v3.q1(vipCardListUI);
        k0Var.v();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 1);
        return false;
    }
}
