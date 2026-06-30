package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class t2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.b4 f74207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r61.h1 f74208e;

    public t2(com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI inviteMMFBFriendsUI, com.tencent.mm.sdk.platformtools.b4 b4Var, r61.h1 h1Var) {
        this.f74207d = b4Var;
        this.f74208e = h1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f74207d.d();
        gm0.j1.d().d(this.f74208e);
    }
}
