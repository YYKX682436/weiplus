package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99580d;

    public n2(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f99580d = exdeviceDeviceProfileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f99580d;
        exdeviceDeviceProfileUI.f99267s = true;
        exdeviceDeviceProfileUI.X6();
        ((com.tencent.mm.ui.base.preference.h0) exdeviceDeviceProfileUI.getPreferenceScreen()).notifyDataSetChanged();
    }
}
