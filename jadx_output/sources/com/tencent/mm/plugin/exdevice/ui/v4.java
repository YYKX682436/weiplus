package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99705d;

    public v4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99705d = exdeviceProfileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99705d.f99314r.notifyDataSetChanged();
    }
}
