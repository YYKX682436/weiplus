package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class n2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI f74054d;

    public n2(com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI) {
        this.f74054d = inviteMMFBFriendsUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI = this.f74054d;
        android.content.Intent intent = new android.content.Intent(inviteMMFBFriendsUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MMFBAuthUI.class);
        intent.putExtra("is_force_unbind", true);
        androidx.appcompat.app.AppCompatActivity context = inviteMMFBFriendsUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        inviteMMFBFriendsUI.finish();
    }
}
