package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class m3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardNewMsgUI f95078d;

    public m3(com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI) {
        this.f95078d = cardNewMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "CardMsgClearMenu", 2, 0, "", "", "");
        int i17 = com.tencent.mm.plugin.card.ui.CardNewMsgUI.f94893n;
        com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = this.f95078d;
        cardNewMsgUI.getClass();
        lu1.r.a(cardNewMsgUI, new com.tencent.mm.plugin.card.ui.o3(cardNewMsgUI));
        return true;
    }
}
