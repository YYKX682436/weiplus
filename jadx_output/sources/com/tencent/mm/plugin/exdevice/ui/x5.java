package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class x5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99722d;

    public x5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99722d = exdeviceRankInfoUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99722d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = exdeviceRankInfoUI.f99344r;
        if (u3Var != null) {
            u3Var.dismiss();
            exdeviceRankInfoUI.f99344r = null;
        }
        exdeviceRankInfoUI.finish();
    }
}
