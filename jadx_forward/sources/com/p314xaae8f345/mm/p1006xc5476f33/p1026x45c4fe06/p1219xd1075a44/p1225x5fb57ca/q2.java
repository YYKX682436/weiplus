package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class q2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12774xd6ab59bb f173157d;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12774xd6ab59bb c12774xd6ab59bb) {
        this.f173157d = c12774xd6ab59bb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12774xd6ab59bb c12774xd6ab59bb = this.f173157d;
        if (c12774xd6ab59bb.f172804y == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.f78323xf2891774) {
            int i17 = c12774xd6ab59bb.f172802w;
            if (i17 == 1) {
                str = "X";
            } else {
                if (i17 != 2) {
                    yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                str = ".";
            }
        } else {
            java.lang.String str2 = null;
            for (int i18 = 0; i18 < c12774xd6ab59bb.f172803x.size(); i18++) {
                if (view.getId() == c12774xd6ab59bb.f172803x.valueAt(i18)) {
                    str2 = java.lang.String.valueOf(c12774xd6ab59bb.f172803x.keyAt(i18));
                }
            }
            str = str2;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            c12774xd6ab59bb.f172804y.commitText(str, str.length());
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
