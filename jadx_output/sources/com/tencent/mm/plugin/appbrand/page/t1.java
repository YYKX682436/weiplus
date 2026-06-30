package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.x1 f87109d;

    public t1(com.tencent.mm.plugin.appbrand.page.x1 x1Var) {
        this.f87109d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.x1 x1Var = this.f87109d;
        android.content.DialogInterface.OnClickListener positiveButton = x1Var.getPositiveButton();
        if (positiveButton != null) {
            positiveButton.onClick(x1Var, -1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
