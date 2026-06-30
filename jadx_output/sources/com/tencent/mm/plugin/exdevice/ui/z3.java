package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class z3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99736d;

    public z3(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99736d = exdeviceProfileUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99736d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = exdeviceProfileUI.f99322z;
        if (u3Var != null) {
            u3Var.dismiss();
            exdeviceProfileUI.f99322z = null;
        }
        exdeviceProfileUI.finish();
    }
}
