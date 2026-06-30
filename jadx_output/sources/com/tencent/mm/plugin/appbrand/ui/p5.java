package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class p5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89918d;

    public p5(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f89918d = o6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandLoadingSplashFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.x0.g(this.f89918d.f74803n, com.tencent.mm.plugin.appbrand.w0.CLOSE);
        this.f89918d.l0();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandLoadingSplashFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
