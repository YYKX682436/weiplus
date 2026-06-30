package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.g1 f99452d;

    public f1(com.tencent.mm.plugin.exdevice.ui.g1 g1Var) {
        this.f99452d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99452d.f99461d;
        if (exdeviceConnectWifiUI.C != com.tencent.mm.plugin.exdevice.ui.s1.FINISH) {
            exdeviceConnectWifiUI.Z6(true);
        }
    }
}
