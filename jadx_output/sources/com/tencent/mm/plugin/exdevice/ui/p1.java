package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes5.dex */
public class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99615d;

    public p1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99615d = exdeviceConnectWifiUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onClick connectBtn.");
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.T6(this.f99615d);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
