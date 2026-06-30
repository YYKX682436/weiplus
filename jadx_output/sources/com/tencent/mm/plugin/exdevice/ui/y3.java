package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99728d;

    public y3(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99728d = exdeviceProfileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99728d;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.U6(exdeviceProfileUI);
        exdeviceProfileUI.f99314r.notifyDataSetChanged();
    }
}
