package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes5.dex */
public class d1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99423d;

    public d1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99423d = exdeviceConnectWifiUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f99423d.finish();
    }
}
