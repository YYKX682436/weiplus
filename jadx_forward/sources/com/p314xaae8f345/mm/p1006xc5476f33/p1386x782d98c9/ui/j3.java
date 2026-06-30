package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3 f181060d;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3 n3Var) {
        this.f181060d = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3 n3Var = this.f181060d;
        if (n3Var.f181115e) {
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Object tag = view.getTag();
        if (tag == null || !(tag instanceof java.lang.Integer)) {
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) tag).intValue();
        if (intValue < 0 || intValue >= n3Var.getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        v32.b bVar = (v32.b) ((java.util.LinkedList) n3Var.f181114d).get(intValue);
        android.content.Context context = (android.content.Context) n3Var.f181116f.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceManageDeviceUI", "Start activity failed, context is null.");
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("device_type", bVar.f66607xe7b73b15);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, bVar.f66606x5fdff396);
        intent.putExtra("device_mac", bVar.f66609x4b6e688a);
        intent.putExtra("device_brand_name", bVar.f66602x6bae49ad);
        intent.putExtra("device_desc", bVar.C);
        intent.putExtra("device_title", bVar.B);
        intent.putExtra("device_icon_url", bVar.f318640z);
        intent.putExtra("device_alias", bVar.f318639y);
        intent.putExtra("device_jump_url", bVar.A);
        intent.putExtra("subscribe_flag", 1);
        j45.l.n(context, "exdevice", ".ui.ExdeviceDeviceProfileUI", intent, 1000);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
