package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99464d;

    public g4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99464d = exdeviceProfileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ve4.g.a(18);
        p32.g.c(this.f99464d);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
