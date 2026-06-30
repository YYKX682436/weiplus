package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91654d;

    public t(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91654d = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91654d;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = q0Var.f91612q;
        if (e4Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (e4Var.hasFocus()) {
            q0Var.B();
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            if (q0Var.f91612q == view) {
                q0Var.m();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
