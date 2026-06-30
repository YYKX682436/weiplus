package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes8.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99453d;

    public f2(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f99453d = exdeviceDeviceProfileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(this.f99453d.getContext(), com.tencent.mm.R.string.c5i, 1).show();
    }
}
