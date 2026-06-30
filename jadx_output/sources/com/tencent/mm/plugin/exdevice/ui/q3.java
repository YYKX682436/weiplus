package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes3.dex */
public class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView f99629d;

    public q3(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView exdeviceProfileAffectedUserView) {
        this.f99629d = exdeviceProfileAffectedUserView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileAffectedUserView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String r17 = c01.z1.r();
        if (r17 != null) {
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView exdeviceProfileAffectedUserView = this.f99629d;
            if (r17.equals(exdeviceProfileAffectedUserView.f99297d)) {
                com.tencent.mm.ui.base.MMHorList mMHorList = exdeviceProfileAffectedUserView.f99299f;
                mMHorList.setVisibility(mMHorList.getVisibility() == 0 ? 8 : 0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileAffectedUserView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
