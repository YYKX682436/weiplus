package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class e9 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.b4 f73821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r61.h1 f73822e;

    public e9(com.tencent.mm.plugin.account.ui.MMFBFriendUI mMFBFriendUI, com.tencent.mm.sdk.platformtools.b4 b4Var, r61.h1 h1Var) {
        this.f73821d = b4Var;
        this.f73822e = h1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f73821d.d();
        gm0.j1.d().d(this.f73822e);
    }
}
