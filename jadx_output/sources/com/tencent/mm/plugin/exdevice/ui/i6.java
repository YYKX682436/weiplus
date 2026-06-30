package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99518d;

    public i6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99518d = exdeviceRankInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99518d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = exdeviceRankInfoUI.f99344r;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        exdeviceRankInfoUI.f99344r.dismiss();
        exdeviceRankInfoUI.f99344r = null;
    }
}
