package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes3.dex */
public class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13472xa1fc2044 f181162d;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13472xa1fc2044 c13472xa1fc2044) {
        this.f181162d = c13472xa1fc2044;
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13472xa1fc2044 c13472xa1fc2044 = this.f181162d;
            if (r17.equals(c13472xa1fc2044.f180830d)) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = c13472xa1fc2044.f180832f;
                c21500x7be515c9.setVisibility(c21500x7be515c9.getVisibility() == 0 ? 8 : 0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileAffectedUserView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
