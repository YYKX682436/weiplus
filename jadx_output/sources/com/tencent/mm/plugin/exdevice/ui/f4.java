package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99455d;

    public f4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99455d = exdeviceProfileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p32.g.c(this.f99455d);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
