package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class z5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99738d;

    public z5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99738d = exdeviceRankInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99738d;
        exdeviceRankInfoUI.Z6(true);
        if (!exdeviceRankInfoUI.M) {
            exdeviceRankInfoUI.b7();
        } else {
            exdeviceRankInfoUI.f99334e.g(exdeviceRankInfoUI.Q);
            exdeviceRankInfoUI.f99334e.notifyDataSetChanged();
        }
    }
}
