package al1;

/* loaded from: classes7.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout f5819d;

    public x(com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout appBrandTranslateLayout) {
        this.f5819d = appBrandTranslateLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout appBrandTranslateLayout = this.f5819d;
        al1.a0 a0Var = appBrandTranslateLayout.f91049q;
        if (a0Var != null) {
            int i17 = appBrandTranslateLayout.f91046n;
            mi1.v vVar = ((mi1.q) a0Var).f326661a;
            if (i17 == 0) {
                tj1.f.f419693a.a(vVar.f326702a);
            } else if (i17 == 1) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = vVar.f326702a;
                kotlin.jvm.internal.o.g(runtime, "runtime");
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) runtime.r0(), 1, true);
                k0Var.q(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m0u), 17);
                k0Var.f211872n = tj1.c.f419690d;
                k0Var.f211881s = new tj1.d(runtime);
                k0Var.v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
