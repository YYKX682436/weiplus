package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class l8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBAuthUI f74006d;

    public l8(com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI) {
        this.f74006d = mMFBAuthUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.MMFBAuthUI mMFBAuthUI = this.f74006d;
        mMFBAuthUI.f73441e = android.app.ProgressDialog.show(mMFBAuthUI, mMFBAuthUI.getString(com.tencent.mm.R.string.f490573yv), mMFBAuthUI.getString(com.tencent.mm.R.string.c8e), true);
        mMFBAuthUI.f73441e.setOnCancelListener(mMFBAuthUI.f73442f);
        gm0.j1.d().g(new r61.f1(3));
    }
}
