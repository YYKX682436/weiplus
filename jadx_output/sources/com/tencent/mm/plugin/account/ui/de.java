package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class de implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileVerifyUI f73807d;

    public de(com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI) {
        this.f73807d = mobileVerifyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.account.ui.MobileVerifyUI.B;
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f73807d;
        n71.a.e(mobileVerifyUI.f73536s);
        if (mobileVerifyUI.f73538u.a(com.tencent.mm.plugin.account.ui.fe.GoBack)) {
            return true;
        }
        mobileVerifyUI.finish();
        return true;
    }
}
