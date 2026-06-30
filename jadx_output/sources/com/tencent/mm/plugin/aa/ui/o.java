package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAImagPreviewUI f72751d;

    public o(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI) {
        this.f72751d = aAImagPreviewUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI = this.f72751d;
        android.app.Dialog dialog = aAImagPreviewUI.f72435i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        aAImagPreviewUI.f72435i.dismiss();
    }
}
