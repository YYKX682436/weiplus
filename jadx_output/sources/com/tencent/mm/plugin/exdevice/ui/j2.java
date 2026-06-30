package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes8.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99526d;

    public j2(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f99526d = exdeviceDeviceProfileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceDeviceProfileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f99526d;
        db5.e1.N(exdeviceDeviceProfileUI, exdeviceDeviceProfileUI.getString(com.tencent.mm.R.string.c3h), "", "", 50, this.f99526d.f99272x);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceDeviceProfileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
