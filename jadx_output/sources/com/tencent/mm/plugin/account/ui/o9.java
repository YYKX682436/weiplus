package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class o9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBLoginUI f74090d;

    public o9(com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI) {
        this.f74090d = mMFBLoginUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String[] strArr = com.tencent.mm.plugin.account.ui.MMFBLoginUI.f73459p;
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI = this.f74090d;
        n71.a.e(mMFBLoginUI.f73465i);
        mMFBLoginUI.finish();
        return true;
    }
}
