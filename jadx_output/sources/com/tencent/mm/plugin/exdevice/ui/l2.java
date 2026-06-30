package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes9.dex */
public class l2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f99552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99553e;

    public l2(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f99553e = exdeviceDeviceProfileUI;
        this.f99552d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.n().f273288b.q(536, this.f99553e);
        com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent();
        am.y4 y4Var = exDeviceBindHardDeviceEvent.f54112g;
        y4Var.f8432c = 2;
        y4Var.f8433d = this.f99552d;
        exDeviceBindHardDeviceEvent.e();
    }
}
