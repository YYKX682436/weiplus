package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class t7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f74216d;

    public t7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f74216d = loginUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.account.ui.LoginUI.K;
        com.tencent.mm.plugin.account.ui.LoginUI loginUI = this.f74216d;
        loginUI.hideVKB();
        n71.a.e(loginUI.f73414r);
        com.tencent.mm.pluginsdk.model.app.y5.f189160h = null;
        com.tencent.mm.pluginsdk.model.app.y5.f189161i = -1L;
        loginUI.finish();
        return true;
    }
}
