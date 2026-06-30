package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class yi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VerifyPwdUI f74350d;

    public yi(com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI) {
        this.f74350d = verifyPwdUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f74350d.onBackPressed();
        return true;
    }
}
