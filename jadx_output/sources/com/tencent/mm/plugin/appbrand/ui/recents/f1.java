package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f90075a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.ThreeDotsLoadingView f90076b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f90077c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f90078d;

    public f1(android.content.Context context, android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488081gg, viewGroup, false);
        this.f90075a = inflate;
        this.f90076b = (com.tencent.mm.ui.widget.ThreeDotsLoadingView) inflate.findViewById(com.tencent.mm.R.id.imn);
        this.f90077c = inflate.findViewById(com.tencent.mm.R.id.gc9);
        this.f90078d = inflate.findViewById(com.tencent.mm.R.id.dgm);
    }

    public void a(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView = this.f90076b;
            if (threeDotsLoadingView != null) {
                threeDotsLoadingView.setVisibility(0);
                this.f90076b.e();
            }
            android.view.View view = this.f90078d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView2 = this.f90076b;
        if (threeDotsLoadingView2 != null) {
            threeDotsLoadingView2.f();
            this.f90076b.setVisibility(8);
        }
        android.view.View view2 = this.f90078d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
