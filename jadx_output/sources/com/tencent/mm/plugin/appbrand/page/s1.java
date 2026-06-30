package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.x1 f87073d;

    public s1(com.tencent.mm.plugin.appbrand.page.x1 x1Var) {
        this.f87073d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87073d.K;
        if (i3Var != null && (runtime = i3Var.getRuntime()) != null) {
            com.tencent.mm.plugin.appbrand.x0.g(runtime.f74803n, com.tencent.mm.plugin.appbrand.w0.CLOSE);
            runtime.S();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
