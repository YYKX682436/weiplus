package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class e1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90069d;

    public e1(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, com.tencent.mm.plugin.appbrand.ui.recents.b0 b0Var) {
        this.f90069d = appBrandLauncherRecentsList;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        rect.left = 0;
        rect.right = 0;
        rect.bottom = 0;
        rect.top = 0;
        if (recyclerView instanceof com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView) {
            androidx.recyclerview.widget.k3 w07 = recyclerView.w0(view);
            if (w07 instanceof com.tencent.mm.plugin.appbrand.ui.recents.c1) {
                android.view.View view2 = ((com.tencent.mm.plugin.appbrand.ui.recents.c1) w07).f90045d;
                int i17 = ((com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView) recyclerView).g1(w07) == this.f90069d.f90016y.getItemCount() + (-1) ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$ThisItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$ThisItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
