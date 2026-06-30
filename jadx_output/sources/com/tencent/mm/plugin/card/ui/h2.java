package com.tencent.mm.plugin.card.ui;

/* loaded from: classes.dex */
public class h2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardHomePageUI f95023d;

    public h2(com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI) {
        this.f95023d = cardHomePageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI = this.f95023d;
        int i17 = cardHomePageUI.K;
        if (i17 == 1 || i17 == 2) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 3);
            j45.l.u(cardHomePageUI, "com.tencent.mm.ui.LauncherUI", intent, null);
            cardHomePageUI.finish();
        } else {
            cardHomePageUI.finish();
        }
        return true;
    }
}
