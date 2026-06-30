package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class k9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.c9 f89828d;

    public k9(com.tencent.mm.plugin.appbrand.ui.c9 c9Var) {
        this.f89828d = c9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplash$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ui.c9 c9Var = this.f89828d;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = c9Var.f89628x;
        if (appBrandRuntime == null) {
            yz5.a aVar = c9Var.E;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (c9Var.M) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplash$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else {
            com.tencent.mm.plugin.appbrand.x0.g(appBrandRuntime.f74803n, com.tencent.mm.plugin.appbrand.w0.CLOSE);
            this.f89828d.f89628x.l0();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplash$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
