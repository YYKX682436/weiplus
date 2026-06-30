package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class j8 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBAuthUI f73952d;

    public j8(com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI) {
        this.f73952d = mMFBAuthUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI = this.f73952d;
        if (mMFBAuthUI.f73443g != null) {
            gm0.j1.d().d(mMFBAuthUI.f73443g);
        }
    }
}
