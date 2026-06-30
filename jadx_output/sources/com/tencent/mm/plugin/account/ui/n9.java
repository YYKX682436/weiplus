package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class n9 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBLoginUI f74061d;

    public n9(com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI) {
        this.f74061d = mMFBLoginUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI = this.f74061d;
        if (mMFBLoginUI.f73464h != null) {
            gm0.j1.d().d(mMFBLoginUI.f73464h);
        }
    }
}
