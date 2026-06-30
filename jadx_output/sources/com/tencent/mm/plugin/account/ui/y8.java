package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class y8 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBFriendUI f74339d;

    public y8(com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI) {
        this.f74339d = mMFBFriendUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.t8.n(str);
        com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI = this.f74339d;
        mMFBFriendUI.f73457m = str;
        com.tencent.mm.plugin.account.ui.u8 u8Var = mMFBFriendUI.f73452e;
        if (u8Var != null) {
            java.lang.String trim = mMFBFriendUI.f73457m.trim();
            com.tencent.mm.sdk.platformtools.t8.n(trim);
            u8Var.f74245p = trim;
            u8Var.c();
            u8Var.q();
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
