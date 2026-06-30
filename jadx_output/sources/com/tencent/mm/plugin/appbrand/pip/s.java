package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.y f87551d;

    public s(com.tencent.mm.plugin.appbrand.pip.y yVar) {
        this.f87551d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = this.f87551d.f87567a.f87523f;
        if (appBrandPipContainerView.H) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "showOnLoading");
            android.view.View view = appBrandPipContainerView.B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
