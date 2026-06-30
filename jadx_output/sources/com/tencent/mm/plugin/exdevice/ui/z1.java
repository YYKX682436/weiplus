package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes8.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99734d;

    public z1(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f99734d = exdeviceDeviceProfileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f99734d;
        db5.e1.s(exdeviceDeviceProfileUI, exdeviceDeviceProfileUI.getString(com.tencent.mm.R.string.c29), exdeviceDeviceProfileUI.getString(com.tencent.mm.R.string.f490573yv));
    }
}
