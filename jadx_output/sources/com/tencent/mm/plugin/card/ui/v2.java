package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class v2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardListSelectedUI f95181d;

    public v2(com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI) {
        this.f95181d = cardListSelectedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI = this.f95181d;
        if (cardListSelectedUI.f94880n) {
            cardListSelectedUI.x();
        } else if (cardListSelectedUI.f94872J.f456437o) {
            cardListSelectedUI.U6(true);
            wt1.c0 Ri = xt1.t0.Ri();
            xt1.a aVar = cardListSelectedUI.f94872J;
            Ri.b(aVar.f456432j, lu1.a0.z(aVar.f456430h), 1, 3);
        } else {
            cardListSelectedUI.x();
        }
        return true;
    }
}
