package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class m8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86879d;

    public m8(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86879d = n7Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86879d;
        if (wa1.b.a(n7Var.getRuntime())) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (n7Var.getRuntime().e3()) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (!com.tencent.mm.plugin.appbrand.widget.recent.y0.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandTaskView is disable");
            yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandTaskView is enable");
        if (n7Var.Z1.getAndSet(true)) {
            com.tencent.mm.plugin.appbrand.page.n7.F3(n7Var, view, true, 3);
        } else {
            n7Var.m4(view, 3);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
