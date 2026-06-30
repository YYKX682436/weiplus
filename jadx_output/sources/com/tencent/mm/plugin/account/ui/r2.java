package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class r2 extends v61.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI f74154d;

    public r2(com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI) {
        this.f74154d = inviteMMFBFriendsUI;
    }

    @Override // v61.r0, v61.p0
    public void a(int i17, java.lang.String str) {
        super.a(i17, str);
        if (i17 == 3) {
            int i18 = com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI.f73287m;
            com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI = this.f74154d;
            inviteMMFBFriendsUI.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.InviteFacebookFriendsUI", "dealWithRefreshTokenFail");
            db5.e1.u(inviteMMFBFriendsUI, inviteMMFBFriendsUI.getString(com.tencent.mm.R.string.c8h), inviteMMFBFriendsUI.getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.n2(inviteMMFBFriendsUI), null);
        }
    }

    @Override // v61.r0, v61.p0
    public void b(android.os.Bundle bundle) {
        super.b(bundle);
    }
}
