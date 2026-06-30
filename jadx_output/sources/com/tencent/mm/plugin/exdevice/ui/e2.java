package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f99438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99439e;

    public e2(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f99439e = exdeviceDeviceProfileUI;
        this.f99438d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f99439e;
        exdeviceDeviceProfileUI.f99256e = db5.e1.Q(exdeviceDeviceProfileUI.getContext(), "", exdeviceDeviceProfileUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.exdevice.ui.d2(this));
    }
}
