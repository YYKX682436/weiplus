package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class g2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardHomePageUI f95010d;

    public g2(com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI) {
        this.f95010d = cardHomePageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        lu1.d.b(this.f95010d, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "CardListMsgMenu", 2, 0, "", "");
        return true;
    }
}
