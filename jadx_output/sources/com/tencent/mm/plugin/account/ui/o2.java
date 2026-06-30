package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class o2 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI f74076d;

    public o2(com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI) {
        this.f74076d = inviteMMFBFriendsUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.t8.n(str);
        com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI = this.f74076d;
        inviteMMFBFriendsUI.f73292h = str;
        com.tencent.mm.plugin.account.ui.b3 b3Var = inviteMMFBFriendsUI.f73289e;
        if (b3Var != null) {
            java.lang.String trim = inviteMMFBFriendsUI.f73292h.trim();
            com.tencent.mm.sdk.platformtools.t8.n(trim);
            b3Var.f73738o = trim;
            b3Var.c();
            b3Var.q();
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
