package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class g1 extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99461d;

    public g1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99461d = exdeviceConnectWifiUI;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.exdevice.ui.f1(this));
    }
}
