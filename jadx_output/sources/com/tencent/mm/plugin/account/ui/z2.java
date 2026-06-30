package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public class z2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI f74354d;

    public z2(com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI) {
        this.f74354d = inviteMMFBFriendsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.mmfb.sdk.l lVar = new com.tencent.mm.ui.mmfb.sdk.l();
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI = this.f74354d;
        bundle.putString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, inviteMMFBFriendsUI.getString(com.tencent.mm.R.string.c8j));
        long[] t17 = inviteMMFBFriendsUI.f73289e.t();
        java.lang.String l17 = java.lang.Long.toString(t17[0]);
        for (int i17 = 1; i17 < t17.length; i17++) {
            l17 = (l17 + ",") + java.lang.Long.toString(t17[i17]);
        }
        bundle.putString("to", l17);
        com.tencent.mm.plugin.account.ui.y2 y2Var = new com.tencent.mm.plugin.account.ui.y2(this, t17);
        java.lang.String str = com.tencent.mm.ui.mmfb.sdk.l.f209209m + "apprequests";
        bundle.putString("display", "touch");
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, "290293790992170");
        if (lVar.d()) {
            bundle.putString("access_token", lVar.f209213a);
        }
        java.lang.String str2 = str + "?" + com.tencent.mm.ui.mmfb.sdk.o.b(bundle);
        if (inviteMMFBFriendsUI.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(inviteMMFBFriendsUI);
            builder.setTitle("Error");
            builder.setMessage("Application requires permission to access the Internet");
            builder.create().show();
        } else {
            new com.tencent.mm.ui.mmfb.sdk.s(inviteMMFBFriendsUI, str2, y2Var).show();
        }
        return true;
    }
}
