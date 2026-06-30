package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.l0 f85579d;

    public d0(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.l0 l0Var) {
        this.f85579d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.lifecycle.o mo133getLifecycle;
        android.app.Activity r07 = this.f85579d.f85656a.r0();
        if (r07 == null) {
            return;
        }
        final ul1.j jVar = new ul1.j(r07, true);
        jVar.a(r07.getString(com.tencent.mm.R.string.lbn));
        android.view.View findViewById = jVar.getContentView().findViewById(com.tencent.mm.R.id.lbi);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setLoading", "(Z)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setLoading", "(Z)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = jVar.f428585d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = r07 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) r07 : null;
        if (appCompatActivity != null && (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$navigateBack$1$1$1
                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onDestroy(androidx.lifecycle.y owner) {
                    kotlin.jvm.internal.o.g(owner, "owner");
                    ul1.j.this.dismiss();
                }
            });
        }
        jVar.b(com.tencent.wcdb.core.Database.DictDefaultMatchValue);
    }
}
