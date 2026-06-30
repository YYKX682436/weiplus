package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI f99716d;

    public x(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI exdeviceBindDeviceGuideUI) {
        this.f99716d = exdeviceBindDeviceGuideUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI exdeviceBindDeviceGuideUI = this.f99716d;
        intent.putExtra("device_scan_mode", exdeviceBindDeviceGuideUI.f99184p);
        intent.putExtra("device_scan_conn_proto", exdeviceBindDeviceGuideUI.f99185q);
        intent.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, exdeviceBindDeviceGuideUI.f99186r);
        intent.putExtra("device_type", exdeviceBindDeviceGuideUI.f99187s);
        intent.putExtra("device_title", exdeviceBindDeviceGuideUI.f99188t);
        intent.putExtra("device_desc", exdeviceBindDeviceGuideUI.f99189u);
        intent.putExtra("device_icon_url", exdeviceBindDeviceGuideUI.f99190v);
        intent.putExtra("device_category_id", exdeviceBindDeviceGuideUI.f99191w);
        intent.putExtra("device_brand_name", exdeviceBindDeviceGuideUI.f99192x);
        intent.putExtra("bind_ticket", exdeviceBindDeviceGuideUI.f99193y);
        intent.putExtra("device_ble_simple_proto", exdeviceBindDeviceGuideUI.f99194z);
        intent.putExtra("encryptKey", exdeviceBindDeviceGuideUI.B);
        intent.putExtra("jumpToBindDevice", true);
        boolean z17 = exdeviceBindDeviceGuideUI.D;
        if (z17 && !exdeviceBindDeviceGuideUI.C) {
            j45.l.j(exdeviceBindDeviceGuideUI.getContext(), "exdevice", ".ui.ExdeviceBindDeviceUI", intent, null);
        } else if (exdeviceBindDeviceGuideUI.C && !z17) {
            intent.putExtra("exdevice_airkiss_open_type", 2);
            j45.l.j(exdeviceBindDeviceGuideUI.getContext(), "exdevice", ".ui.ExdeviceConnectWifiUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
