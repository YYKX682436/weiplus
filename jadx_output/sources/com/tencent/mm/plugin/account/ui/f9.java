package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class f9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBFriendUI f73847d;

    public f9(com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI) {
        this.f73847d = mMFBFriendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI = this.f73847d;
        android.content.Intent intent = new android.content.Intent(this.f73847d, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMFBFriendUI, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI$8", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMFBFriendUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMFBFriendUI, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$8", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
