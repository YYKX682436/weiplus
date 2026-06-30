package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.o2 f91544d;

    public m2(com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var) {
        this.f91544d = o2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.appbrand.widget.input.n2 n2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f91544d;
        if (!o2Var.f91579e && (n2Var = o2Var.f91580f) != null) {
            o2Var.f91579e = true;
            n2Var.onDone();
            o2Var.f91579e = false;
        }
        o2Var.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
