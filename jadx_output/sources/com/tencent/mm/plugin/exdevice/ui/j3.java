package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.n3 f99527d;

    public j3(com.tencent.mm.plugin.exdevice.ui.n3 n3Var) {
        this.f99527d = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.n3 n3Var = this.f99527d;
        if (n3Var.f99582e) {
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
        v32.b bVar = (v32.b) ((java.util.LinkedList) n3Var.f99581d).get(intValue);
        android.content.Context context = (android.content.Context) n3Var.f99583f.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceManageDeviceUI", "Start activity failed, context is null.");
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("device_type", bVar.field_deviceType);
        intent.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, bVar.field_deviceID);
        intent.putExtra("device_mac", bVar.field_mac);
        intent.putExtra("device_brand_name", bVar.field_brandName);
        intent.putExtra("device_desc", bVar.C);
        intent.putExtra("device_title", bVar.B);
        intent.putExtra("device_icon_url", bVar.f237107z);
        intent.putExtra("device_alias", bVar.f237106y);
        intent.putExtra("device_jump_url", bVar.A);
        intent.putExtra("subscribe_flag", 1);
        j45.l.n(context, "exdevice", ".ui.ExdeviceDeviceProfileUI", intent, 1000);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceManageDeviceUI$DeviceAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
