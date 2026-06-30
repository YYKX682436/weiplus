package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.u3 f91537d;

    public l3(com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var) {
        this.f91537d = u3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean isSelected = view.isSelected();
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f91537d;
        if (isSelected) {
            int i17 = com.tencent.mm.plugin.appbrand.widget.input.u3.D;
            u3Var.f91693z.showVKB();
            u3Var.A();
            view.setSelected(false);
        } else {
            int i18 = com.tencent.mm.plugin.appbrand.widget.input.u3.D;
            u3Var.f91693z.hideVKB();
            com.tencent.mm.plugin.appbrand.widget.input.u3.w(u3Var);
            u3Var.d(com.tencent.mm.plugin.appbrand.widget.input.l2.c(u3Var.f91692y));
            view.setSelected(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
