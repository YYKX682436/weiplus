package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes.dex */
public class c1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99415d;

    public c1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99415d = exdeviceConnectWifiUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99415d;
        androidx.appcompat.app.AppCompatActivity context = exdeviceConnectWifiUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        exdeviceConnectWifiUI.finish();
    }
}
