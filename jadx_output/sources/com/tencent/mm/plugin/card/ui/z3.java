package com.tencent.mm.plugin.card.ui;

/* loaded from: classes3.dex */
public class z3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardShopUI f95466d;

    public z3(com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI) {
        this.f95466d = cardShopUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f95466d.finish();
        return true;
    }
}
