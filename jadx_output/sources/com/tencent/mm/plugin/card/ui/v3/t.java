package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xt f95375e;

    public t(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI, r45.xt xtVar) {
        this.f95374d = cardHomePageV3UI;
        this.f95375e = xtVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95374d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cardHomePageV3UI.getContext(), 1, false);
        r45.xt xtVar = this.f95375e;
        k0Var.f211872n = new com.tencent.mm.plugin.card.ui.v3.r(xtVar);
        k0Var.f211881s = new com.tencent.mm.plugin.card.ui.v3.s(xtVar, cardHomePageV3UI);
        k0Var.v();
        return false;
    }
}
