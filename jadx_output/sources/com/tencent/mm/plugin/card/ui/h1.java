package com.tencent.mm.plugin.card.ui;

/* loaded from: classes9.dex */
public class h1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftReceiveUI f95022d;

    public h1(com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI) {
        this.f95022d = cardGiftReceiveUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f95022d.finish();
        return true;
    }
}
