package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99411d;

    public b6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99411d = exdeviceRankInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99411d;
        com.tencent.mm.plugin.exdevice.ui.i5 i5Var = exdeviceRankInfoUI.f99334e;
        i5Var.f99505e = exdeviceRankInfoUI.B;
        i5Var.g(exdeviceRankInfoUI.Q);
        exdeviceRankInfoUI.f99334e.notifyDataSetChanged();
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V6(exdeviceRankInfoUI);
    }
}
