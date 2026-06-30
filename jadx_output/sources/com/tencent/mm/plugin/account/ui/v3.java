package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class v3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI f74263d;

    public v3(com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f74263d = loginByMobileSendSmsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI.D;
        com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f74263d;
        db5.e1.u(loginByMobileSendSmsUI, loginByMobileSendSmsUI.getString(com.tencent.mm.R.string.hwm), "", new com.tencent.mm.plugin.account.ui.u3(loginByMobileSendSmsUI), null);
        return true;
    }
}
