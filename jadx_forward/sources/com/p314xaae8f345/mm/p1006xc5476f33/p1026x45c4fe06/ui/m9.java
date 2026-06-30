package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f171401d;

    public m9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f171401d = c11510xdd90c2f2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplashWeakNetReloadButtonContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171401d;
        if (c11510xdd90c2f2 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplashWeakNetReloadButtonContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (c11510xdd90c2f2 instanceof ze.n) {
            ((ze.n) c11510xdd90c2f2).z1(null, wg1.b.f527248h.h());
        } else {
            c11510xdd90c2f2.z1(null, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplashWeakNetReloadButtonContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
