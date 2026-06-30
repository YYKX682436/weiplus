package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class k8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBAuthUI f73981d;

    public k8(com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI) {
        this.f73981d = mMFBAuthUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI = this.f73981d;
        android.content.Intent intent = mMFBAuthUI.getIntent();
        intent.putExtra("bind_facebook_succ", mMFBAuthUI.f73445i);
        mMFBAuthUI.setResult(-1, intent);
        mMFBAuthUI.finish();
        return true;
    }
}
