package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.u3 f91522d;

    public k3(com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var) {
        this.f91522d = u3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.appbrand.widget.input.o3 o3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f91522d;
        if (!u3Var.f91680m && (o3Var = u3Var.f91679i) != null) {
            u3Var.f91680m = true;
            o3Var.a(true);
            u3Var.f91680m = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
