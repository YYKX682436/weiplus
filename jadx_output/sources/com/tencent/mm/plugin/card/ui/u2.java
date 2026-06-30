package com.tencent.mm.plugin.card.ui;

/* loaded from: classes11.dex */
public class u2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardListSelectedUI f95177d;

    public u2(com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI) {
        this.f95177d = cardListSelectedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI = this.f95177d;
        cardListSelectedUI.setResult(0);
        int i17 = com.tencent.mm.plugin.card.ui.CardListSelectedUI.K;
        cardListSelectedUI.V6(0, "");
        cardListSelectedUI.finish();
        return true;
    }
}
