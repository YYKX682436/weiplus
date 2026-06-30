package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class ci implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SimpleLoginUI f73786d;

    public ci(com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI) {
        this.f73786d = simpleLoginUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.account.ui.SimpleLoginUI.f73660v;
        com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI = this.f73786d;
        boolean booleanExtra = simpleLoginUI.getIntent().getBooleanExtra("key_auto_login_wizard_exit", false);
        if (!booleanExtra) {
            simpleLoginUI.T6();
        }
        simpleLoginUI.W6(1);
        if (booleanExtra) {
            simpleLoginUI.U6(1);
        }
        return true;
    }
}
