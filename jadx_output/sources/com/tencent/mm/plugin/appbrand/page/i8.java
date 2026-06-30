package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class i8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86756d;

    public i8(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86756d = n7Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        this.f86756d.j4(false);
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
