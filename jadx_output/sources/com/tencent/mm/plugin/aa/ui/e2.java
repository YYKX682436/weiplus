package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class e2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI f72623d;

    public e2(com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI launchAABeforeUI) {
        this.f72623d = launchAABeforeUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI launchAABeforeUI = this.f72623d;
        android.app.Dialog dialog = launchAABeforeUI.f72475d;
        if (dialog != null && dialog.isShowing()) {
            launchAABeforeUI.f72475d.dismiss();
        }
        launchAABeforeUI.finish();
    }
}
