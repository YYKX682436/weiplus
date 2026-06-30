package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class v8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBFriendUI f74269d;

    public v8(com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI) {
        this.f74269d = mMFBFriendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI = this.f74269d;
        mMFBFriendUI.hideVKB();
        mMFBFriendUI.finish();
        return true;
    }
}
