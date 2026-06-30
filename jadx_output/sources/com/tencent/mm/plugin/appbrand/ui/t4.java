package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f90224d;

    public t4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var) {
        this.f90224d = w4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ui.w4 w4Var = this.f90224d;
        if (w4Var.f90294p1) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.x0.g(w4Var.f90295x.f74803n, com.tencent.mm.plugin.appbrand.w0.CLOSE);
        this.f90224d.f90295x.l0();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
