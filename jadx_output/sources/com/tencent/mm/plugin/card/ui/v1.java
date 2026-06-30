package com.tencent.mm.plugin.card.ui;

/* loaded from: classes5.dex */
public class v1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftVideoUI f95180d;

    public v1(com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI) {
        this.f95180d = cardGiftVideoUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 0) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI = this.f95180d;
        ((yb0.g) b0Var).Bi(cardGiftVideoUI.getContext(), cardGiftVideoUI.f94844f, new com.tencent.mm.plugin.card.ui.u1(this));
    }
}
