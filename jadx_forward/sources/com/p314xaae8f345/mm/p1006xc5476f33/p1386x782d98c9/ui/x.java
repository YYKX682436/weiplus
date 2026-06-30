package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13459xe0f36c34 f181249d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13459xe0f36c34 activityC13459xe0f36c34) {
        this.f181249d = activityC13459xe0f36c34;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13459xe0f36c34 activityC13459xe0f36c34 = this.f181249d;
        intent.putExtra("device_scan_mode", activityC13459xe0f36c34.f180717p);
        intent.putExtra("device_scan_conn_proto", activityC13459xe0f36c34.f180718q);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, activityC13459xe0f36c34.f180719r);
        intent.putExtra("device_type", activityC13459xe0f36c34.f180720s);
        intent.putExtra("device_title", activityC13459xe0f36c34.f180721t);
        intent.putExtra("device_desc", activityC13459xe0f36c34.f180722u);
        intent.putExtra("device_icon_url", activityC13459xe0f36c34.f180723v);
        intent.putExtra("device_category_id", activityC13459xe0f36c34.f180724w);
        intent.putExtra("device_brand_name", activityC13459xe0f36c34.f180725x);
        intent.putExtra("bind_ticket", activityC13459xe0f36c34.f180726y);
        intent.putExtra("device_ble_simple_proto", activityC13459xe0f36c34.f180727z);
        intent.putExtra("encryptKey", activityC13459xe0f36c34.B);
        intent.putExtra("jumpToBindDevice", true);
        boolean z17 = activityC13459xe0f36c34.D;
        if (z17 && !activityC13459xe0f36c34.C) {
            j45.l.j(activityC13459xe0f36c34.mo55332x76847179(), "exdevice", ".ui.ExdeviceBindDeviceUI", intent, null);
        } else if (activityC13459xe0f36c34.C && !z17) {
            intent.putExtra("exdevice_airkiss_open_type", 2);
            j45.l.j(activityC13459xe0f36c34.mo55332x76847179(), "exdevice", ".ui.ExdeviceConnectWifiUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
