package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class i4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginFastSwitchUI f73928d;

    public i4(com.tencent.mm.plugin.account.ui.LoginFastSwitchUI loginFastSwitchUI) {
        this.f73928d = loginFastSwitchUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.LoginFastSwitchUI loginFastSwitchUI = this.f73928d;
        loginFastSwitchUI.getClass();
        q61.j.e(q61.j.f360268h, 2, 2, 1, 0);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        loginFastSwitchUI.U6("自己取消", bool, bool);
        q61.j.h();
        return true;
    }
}
