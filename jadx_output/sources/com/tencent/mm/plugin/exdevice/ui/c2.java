package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99416d;

    public c2(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f99416d = exdeviceDeviceProfileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f99416d;
        new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.exdevice.ui.b2(this, db5.e1.Q(exdeviceDeviceProfileUI, exdeviceDeviceProfileUI.getString(com.tencent.mm.R.string.f490573yv), this.f99416d.getString(com.tencent.mm.R.string.c2i), true, false, null)), false).c(1000L, 1000L);
    }
}
