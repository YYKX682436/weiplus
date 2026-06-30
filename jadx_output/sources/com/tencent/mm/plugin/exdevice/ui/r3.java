package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes3.dex */
public class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView f99640d;

    public r3(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView exdeviceProfileAffectedUserView) {
        this.f99640d = exdeviceProfileAffectedUserView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileAffectedUserView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f99640d.f99298e.performClick();
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileAffectedUserView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
