package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.t0 f99523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI f99524e;

    public j0(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI exdeviceBindDeviceUI, com.tencent.mm.plugin.exdevice.ui.t0 t0Var) {
        this.f99524e = exdeviceBindDeviceUI;
        this.f99523d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99524e.T6(this.f99523d);
    }
}
