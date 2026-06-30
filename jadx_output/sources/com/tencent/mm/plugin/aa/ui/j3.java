package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class j3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.l3 f72696d;

    public j3(com.tencent.mm.plugin.aa.ui.l3 l3Var) {
        this.f72696d = l3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.aa.ui.l3 l3Var = this.f72696d;
        android.app.Dialog dialog = l3Var.f72720d.C1;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        l3Var.f72720d.C1.dismiss();
    }
}
