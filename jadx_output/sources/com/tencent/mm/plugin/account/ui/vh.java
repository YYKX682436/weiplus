package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class vh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SetPwdUI f74278d;

    public vh(com.tencent.mm.plugin.account.ui.SetPwdUI setPwdUI) {
        this.f74278d = setPwdUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.SetPwdUI setPwdUI = this.f74278d;
        setPwdUI.getClass();
        if ((setPwdUI instanceof com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI) && setPwdUI.f73652h) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11868, 1);
        }
        setPwdUI.hideVKB();
        setPwdUI.setResult(0);
        setPwdUI.finish();
        return true;
    }
}
