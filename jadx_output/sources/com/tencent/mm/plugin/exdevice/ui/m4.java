package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99568d;

    public m4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99568d = exdeviceProfileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.M;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99568d;
        exdeviceProfileUI.X6();
        exdeviceProfileUI.f99314r.notifyDataSetChanged();
        exdeviceProfileUI.W6();
    }
}
