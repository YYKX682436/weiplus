package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class u2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI f74236d;

    public u2(com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI) {
        this.f74236d = inviteMMFBFriendsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI = this.f74236d;
        inviteMMFBFriendsUI.hideVKB();
        inviteMMFBFriendsUI.finish();
        return true;
    }
}
