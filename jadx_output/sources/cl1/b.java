package cl1;

/* loaded from: classes8.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView f42851d;

    public b(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView appBrandDesktopContainerView) {
        this.f42851d = appBrandDesktopContainerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView appBrandDesktopContainerView = this.f42851d;
        if (!((com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView) appBrandDesktopContainerView.f91073f).f91125d2) {
            appBrandDesktopContainerView.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
