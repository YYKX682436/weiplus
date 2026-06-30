package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes11.dex */
public class h0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI f99472d;

    public h0(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI exdeviceBindDeviceUI) {
        this.f99472d = exdeviceBindDeviceUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        int headerViewsCount = i17 - ((android.widget.ListView) adapterView).getHeaderViewsCount();
        com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI exdeviceBindDeviceUI = this.f99472d;
        com.tencent.mm.plugin.exdevice.ui.t0 item = exdeviceBindDeviceUI.f99197e.getItem(headerViewsCount);
        if (item.f99669f.f382554w != 0) {
            exdeviceBindDeviceUI.getClass();
            android.content.Intent intent = new android.content.Intent(exdeviceBindDeviceUI, (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.class);
            r45.ov3 ov3Var = item.f99669f;
            intent.putExtra("device_mac", ov3Var.f382540f);
            intent.putExtra("device_brand_name", ov3Var.f382538d);
            intent.putExtra("device_desc", ov3Var.f382551t);
            intent.putExtra("device_title", ov3Var.f382550s);
            intent.putExtra("device_icon_url", ov3Var.f382548q);
            intent.putExtra("device_alias", ov3Var.f382547p);
            intent.putExtra("device_jump_url", ov3Var.f382549r);
            intent.putExtra("bind_ticket", item.f99670g);
            intent.putExtra("device_type", item.f99668e.f381691d);
            intent.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, item.f99668e.f381692e);
            intent.putExtra("hide_device_panel", true);
            intent.putExtra("subscribe_flag", 0);
            com.tencent.mm.plugin.exdevice.ui.p0 p0Var = item.f99665b;
            if (p0Var == com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_BLUE) {
                intent.putExtra("device_ble_simple_proto", ov3Var.f382555x);
            } else if (p0Var != com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_WIFI) {
                iz5.a.g(null, false);
            }
            exdeviceBindDeviceUI.startActivityForResult(intent, 0);
        } else {
            exdeviceBindDeviceUI.getClass();
            r45.tn4 tn4Var = item.f99671h;
            if (tn4Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "Device.contact == null");
            } else {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x51.j1.g(tn4Var.f386589d), true);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, item.f99668e.f381692e);
                intent2.putExtra("device_type", item.f99668e.f381691d);
                intent2.putExtra("Contact_User", x51.j1.g(tn4Var.f386589d));
                intent2.putExtra("Contact_Scene", tn4Var.f386609x);
                intent2.putExtra("KIsHardDevice", true);
                intent2.putExtra("KHardDeviceBindTicket", item.f99670g);
                if (n17 != null) {
                    if (!n17.r2()) {
                        intent2.putExtra("Contact_Alias", tn4Var.f386586J);
                        intent2.putExtra("Contact_Nick", tn4Var.f386590e.f372756d);
                        intent2.putExtra("Contact_Signature", tn4Var.A);
                        intent2.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(tn4Var.S, tn4Var.f386612y, tn4Var.f386615z));
                        intent2.putExtra("Contact_Sex", tn4Var.f386593h);
                        intent2.putExtra("Contact_VUser_Info", tn4Var.E);
                        intent2.putExtra("Contact_VUser_Info_Flag", tn4Var.D);
                        intent2.putExtra("Contact_KWeibo_flag", tn4Var.M);
                        intent2.putExtra("Contact_KWeibo", tn4Var.H);
                        intent2.putExtra("Contact_KWeiboNick", tn4Var.L);
                        r45.va0 va0Var = tn4Var.W;
                        if (va0Var != null) {
                            try {
                                intent2.putExtra("Contact_customInfo", va0Var.toByteArray());
                            } catch (java.io.IOException e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExdeviceBindDeviceUI", e17, "", new java.lang.Object[0]);
                            }
                        }
                    }
                    j45.l.j(exdeviceBindDeviceUI.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
