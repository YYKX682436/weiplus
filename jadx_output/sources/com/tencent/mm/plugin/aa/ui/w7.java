package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class w7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.y7 f72877d;

    public w7(com.tencent.mm.plugin.aa.ui.y7 y7Var) {
        this.f72877d = y7Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.aa.ui.y7 y7Var = this.f72877d;
        android.app.Dialog dialog = y7Var.f72901d.f72916c.f72549n;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        y7Var.f72901d.f72916c.f72549n.dismiss();
    }
}
