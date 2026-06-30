package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class l8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86858d;

    public l8(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86858d = n7Var;
    }

    public final void a(android.view.View view) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86858d;
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView appBrandRecentView = n7Var.Q1;
        if (appBrandRecentView == null || appBrandRecentView.getCount() == 0) {
            return;
        }
        n7Var.Q1.g1();
        n7Var.R1.showAsDropDown(view);
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 21, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86858d;
        if (wa1.b.a(n7Var.getRuntime())) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (n7Var.getRuntime().e3()) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (com.tencent.mm.plugin.appbrand.widget.recent.y0.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandTaskView is enable");
            if (n7Var.Z1.getAndSet(true)) {
                com.tencent.mm.plugin.appbrand.page.n7.F3(n7Var, view, true, 1);
            } else {
                n7Var.m4(view, 1);
            }
            yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandTaskView is disable");
        if (n7Var.Y1.getAndSet(true)) {
            a(view);
        } else {
            n7Var.n4();
            com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView appBrandRecentView = n7Var.Q1;
            if (appBrandRecentView != null) {
                appBrandRecentView.setRefreshListener(new com.tencent.mm.plugin.appbrand.page.k8(this, view));
                n7Var.Q1.g1();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
