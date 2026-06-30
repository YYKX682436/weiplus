package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class xf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI f74324d;

    public xf(com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI) {
        this.f74324d = regByMobileSendSmsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI.f73583z;
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI = this.f74324d;
        db5.e1.u(regByMobileSendSmsUI, regByMobileSendSmsUI.getString(com.tencent.mm.R.string.hwm), "", new com.tencent.mm.plugin.account.ui.uf(regByMobileSendSmsUI), null);
        return true;
    }
}
