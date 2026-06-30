package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 f173070d;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var) {
        this.f173070d = u3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean isSelected = view.isSelected();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var = this.f173070d;
        if (isSelected) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3.D;
            u3Var.f173226z.mo26063x7b383410();
            u3Var.A();
            view.setSelected(false);
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3.D;
            u3Var.f173226z.mo48674x36654fab();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3.w(u3Var);
            u3Var.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2.c(u3Var.f173225y));
            view.setSelected(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
