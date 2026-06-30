package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class we implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f74300d;

    public we(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI) {
        this.f74300d = regByMobileRegAIOUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = this.f74300d;
        regByMobileRegAIOUI.hideVKB();
        int i17 = com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.Y;
        regByMobileRegAIOUI.Z6();
        regByMobileRegAIOUI.finish();
        return true;
    }
}
