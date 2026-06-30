package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class k5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI f89824d;

    public k5(com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI appBrandLauncherUI) {
        this.f89824d = appBrandLauncherUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (!z65.c.a()) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI appBrandLauncherUI = this.f89824d;
        db5.e1.N(appBrandLauncherUI, appBrandLauncherUI.getResources().getString(com.tencent.mm.R.string.a0e), "", "", Integer.MAX_VALUE, new com.tencent.mm.plugin.appbrand.ui.j5(this, appBrandLauncherUI));
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
