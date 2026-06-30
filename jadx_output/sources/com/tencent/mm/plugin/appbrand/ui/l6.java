package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class l6 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI f89848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(java.lang.Object obj, com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI) {
        super(obj);
        this.f89848b = appBrandPreLoadingUI;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
        if (!booleanValue || booleanValue2) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI = this.f89848b;
        if (appBrandPreLoadingUI.f89385o != null) {
            android.os.Bundle bundle = android.os.Build.VERSION.SDK_INT >= 31 ? android.app.ActivityOptions.makeCustomAnimation(appBrandPreLoadingUI, 0, 0).toBundle() : null;
            com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI2 = this.f89848b;
            android.content.Intent intent = appBrandPreLoadingUI2.f89385o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundle);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(appBrandPreLoadingUI2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$special$$inlined$observable$1", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            appBrandPreLoadingUI2.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
            yj0.a.f(appBrandPreLoadingUI2, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$special$$inlined$observable$1", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            appBrandPreLoadingUI.f89385o = null;
        }
    }
}
