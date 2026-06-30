package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99601d;

    public o2(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f99601d = exdeviceDeviceProfileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f99601d;
        com.tencent.mm.plugin.exdevice.ui.DeviceProfileHeaderPreference deviceProfileHeaderPreference = (com.tencent.mm.plugin.exdevice.ui.DeviceProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) exdeviceDeviceProfileUI.getPreferenceScreen()).h("device_profile_header");
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.f99254y;
        exdeviceDeviceProfileUI.V6(deviceProfileHeaderPreference);
    }
}
