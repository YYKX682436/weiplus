package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99730d;

    public y5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99730d = exdeviceRankInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99730d;
        exdeviceRankInfoUI.c7();
        exdeviceRankInfoUI.Y6();
    }
}
