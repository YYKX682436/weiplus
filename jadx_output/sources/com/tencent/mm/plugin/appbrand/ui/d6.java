package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class d6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.f6 f89660d;

    public d6(com.tencent.mm.plugin.appbrand.ui.f6 f6Var) {
        this.f89660d = f6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandPluginLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ui.f6 f6Var = this.f89660d;
        com.tencent.mm.plugin.appbrand.o6 o6Var = f6Var.f89704x;
        if (o6Var != null) {
            com.tencent.mm.plugin.appbrand.x0.g(o6Var.f74803n, com.tencent.mm.plugin.appbrand.w0.CLOSE);
            this.f89660d.f89704x.l0();
        } else {
            yz5.a aVar = f6Var.f89706z;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandPluginLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
