package cl1;

/* loaded from: classes8.dex */
public class u extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView f42899d;

    public u(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView, cl1.m mVar) {
        this.f42899d = appBrandDesktopView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f42899d.f91084h2.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = this.f42899d;
        cl1.n0 n0Var = (i17 >= appBrandDesktopView.f91084h2.size() || i17 < 0) ? null : (cl1.n0) appBrandDesktopView.f91084h2.get(i17);
        if (n0Var != null) {
            return n0Var.f42889b;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        if (list.size() == 0) {
            onBindViewHolder(k3Var, i17);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = this.f42899d;
        if (i17 == 2 || i17 == 1) {
            return new cl1.z(com.tencent.mm.ui.id.b(appBrandDesktopView.getContext()).inflate(com.tencent.mm.R.layout.f488146ig, viewGroup, false));
        }
        if (i17 == 3) {
            android.view.View view = new android.view.View(appBrandDesktopView.getContext());
            view.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, appBrandDesktopView.f91100x2));
            return new cl1.s(appBrandDesktopView, view);
        }
        if (i17 == 4) {
            appBrandDesktopView.f91101y2 = com.tencent.mm.ui.id.b(appBrandDesktopView.getContext()).inflate(com.tencent.mm.R.layout.f488021em, viewGroup, false);
            return new cl1.w(appBrandDesktopView, appBrandDesktopView.f91101y2);
        }
        if (i17 != 6) {
            return new cl1.s(appBrandDesktopView, com.tencent.mm.ui.id.b(appBrandDesktopView.getContext()).inflate(com.tencent.mm.R.layout.c5r, viewGroup, false));
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(appBrandDesktopView.getContext()).inflate(com.tencent.mm.R.layout.f488020el, viewGroup, false);
        appBrandDesktopView.f91089m2 = (com.tencent.mm.ui.widget.ThreeDotsLoadingView) inflate.findViewById(com.tencent.mm.R.id.imn);
        return new cl1.s(appBrandDesktopView, inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView;
        int itemViewType = k3Var.getItemViewType();
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = this.f42899d;
        if (itemViewType == 3) {
            android.view.View view = k3Var.itemView;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) k3Var.itemView.getLayoutParams();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = appBrandDesktopView.f91100x2;
            k3Var.itemView.setLayoutParams(layoutParams);
            return;
        }
        if (itemViewType == 6 && (threeDotsLoadingView = appBrandDesktopView.f91089m2) != null) {
            threeDotsLoadingView.e();
        }
        if (itemViewType == 4) {
            if (k3Var.itemView != null) {
                java.lang.String str = appBrandDesktopView.f91102z2;
                java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_FROM_DESKTOP_INPUT_HINT_CONTENT_STRING_SYNC, null);
                if (m17 instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) m17;
                    java.lang.String str3 = appBrandDesktopView.f91102z2;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str2 == null) {
                        str2 = str3;
                    }
                    appBrandDesktopView.f91102z2 = str2;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "updateSearchWording last: %s, new: %s", str, appBrandDesktopView.f91102z2);
                return;
            }
            int i18 = com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.f91080h0;
            appBrandDesktopView.getClass();
            return;
        }
        if (itemViewType == 1 || itemViewType == 2) {
            cl1.z zVar = (cl1.z) k3Var;
            cl1.n0 n0Var = (i17 >= appBrandDesktopView.f91084h2.size() || i17 < 0) ? null : (cl1.n0) appBrandDesktopView.f91084h2.get(i17);
            if (n0Var == null) {
                return;
            }
            zVar.f42849d = n0Var;
            zVar.i(new cl1.t(this, zVar, n0Var), null);
            if (appBrandDesktopView.f91098v2 == 0) {
                android.view.View view2 = k3Var.itemView;
                view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "onBindViewHolder itemHeight: %d, itemWidth: %d", java.lang.Integer.valueOf(view2.getMeasuredHeight()), java.lang.Integer.valueOf(view2.getMeasuredWidth()));
                appBrandDesktopView.f91098v2 = view2.getMeasuredHeight();
            }
            boolean z18 = itemViewType == 2;
            if (i17 > appBrandDesktopView.f91097u2 && i17 <= appBrandDesktopView.f91096t2) {
                appBrandDesktopView.f91082f2.e(n0Var, z18, true, true, i17);
            } else {
                appBrandDesktopView.f91082f2.e(n0Var, z18, true, false, i17);
            }
            appBrandDesktopView.f91097u2 = java.lang.Math.max(appBrandDesktopView.f91097u2, i17);
        }
        if (appBrandDesktopView.getDragRubbishView() == null || appBrandDesktopView.getDragRubbishView().getRecyclerView() != appBrandDesktopView) {
            return;
        }
        appBrandDesktopView.getDragRubbishView().i(k3Var, i17);
    }
}
