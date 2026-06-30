package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes11.dex */
public class h0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13460xef0a2250 f181005d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13460xef0a2250 activityC13460xef0a2250) {
        this.f181005d = activityC13460xef0a2250;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13460xef0a2250 activityC13460xef0a2250 = this.f181005d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 item = activityC13460xef0a2250.f180730e.getItem(headerViewsCount);
        if (item.f181202f.f464087w != 0) {
            activityC13460xef0a2250.getClass();
            android.content.Intent intent = new android.content.Intent(activityC13460xef0a2250, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13465x3d3dbc1e.class);
            r45.ov3 ov3Var = item.f181202f;
            intent.putExtra("device_mac", ov3Var.f464073f);
            intent.putExtra("device_brand_name", ov3Var.f464071d);
            intent.putExtra("device_desc", ov3Var.f464084t);
            intent.putExtra("device_title", ov3Var.f464083s);
            intent.putExtra("device_icon_url", ov3Var.f464081q);
            intent.putExtra("device_alias", ov3Var.f464080p);
            intent.putExtra("device_jump_url", ov3Var.f464082r);
            intent.putExtra("bind_ticket", item.f181203g);
            intent.putExtra("device_type", item.f181201e.f463224d);
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, item.f181201e.f463225e);
            intent.putExtra("hide_device_panel", true);
            intent.putExtra("subscribe_flag", 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0 p0Var = item.f181198b;
            if (p0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0.CONNECT_PROTO_TYPE_BLUE) {
                intent.putExtra("device_ble_simple_proto", ov3Var.f464088x);
            } else if (p0Var != com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0.CONNECT_PROTO_TYPE_WIFI) {
                iz5.a.g(null, false);
            }
            activityC13460xef0a2250.startActivityForResult(intent, 0);
        } else {
            activityC13460xef0a2250.getClass();
            r45.tn4 tn4Var = item.f181204h;
            if (tn4Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "Device.contact == null");
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x51.j1.g(tn4Var.f468122d), true);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, item.f181201e.f463225e);
                intent2.putExtra("device_type", item.f181201e.f463224d);
                intent2.putExtra("Contact_User", x51.j1.g(tn4Var.f468122d));
                intent2.putExtra("Contact_Scene", tn4Var.f468142x);
                intent2.putExtra("KIsHardDevice", true);
                intent2.putExtra("KHardDeviceBindTicket", item.f181203g);
                if (n17 != null) {
                    if (!n17.r2()) {
                        intent2.putExtra("Contact_Alias", tn4Var.f468119J);
                        intent2.putExtra("Contact_Nick", tn4Var.f468123e.f454289d);
                        intent2.putExtra("Contact_Signature", tn4Var.A);
                        intent2.putExtra("Contact_RegionCode", com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(tn4Var.S, tn4Var.f468145y, tn4Var.f468148z));
                        intent2.putExtra("Contact_Sex", tn4Var.f468126h);
                        intent2.putExtra("Contact_VUser_Info", tn4Var.E);
                        intent2.putExtra("Contact_VUser_Info_Flag", tn4Var.D);
                        intent2.putExtra("Contact_KWeibo_flag", tn4Var.M);
                        intent2.putExtra("Contact_KWeibo", tn4Var.H);
                        intent2.putExtra("Contact_KWeiboNick", tn4Var.L);
                        r45.va0 va0Var = tn4Var.W;
                        if (va0Var != null) {
                            try {
                                intent2.putExtra("Contact_customInfo", va0Var.mo14344x5f01b1f6());
                            } catch (java.io.IOException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExdeviceBindDeviceUI", e17, "", new java.lang.Object[0]);
                            }
                        }
                    }
                    j45.l.j(activityC13460xef0a2250.mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
