package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class t6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72815d;

    public t6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72815d = paylistAAUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72815d;
        android.app.Dialog dialog = paylistAAUI.f72549n;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        paylistAAUI.f72549n.dismiss();
    }
}
