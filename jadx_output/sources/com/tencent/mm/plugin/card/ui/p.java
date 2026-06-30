package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardDetailUI f95102d;

    public p(com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI) {
        this.f95102d = cardDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
        this.f95102d.x();
        return true;
    }
}
