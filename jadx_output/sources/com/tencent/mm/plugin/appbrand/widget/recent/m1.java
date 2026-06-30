package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class m1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView f92017d;

    public m1(com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView, com.tencent.mm.plugin.appbrand.widget.recent.k1 k1Var) {
        this.f92017d = baseAppBrandRecentView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView = this.f92017d;
        int size = baseAppBrandRecentView.f91908f2.size();
        int completelyCountPerPage = baseAppBrandRecentView.getCompletelyCountPerPage();
        if (baseAppBrandRecentView.getCustomItemCount() == 1) {
            size--;
        }
        if (size > baseAppBrandRecentView.getShowCount()) {
            size = baseAppBrandRecentView.getShowCount();
        }
        if (baseAppBrandRecentView.getCustomItemCount() == 1) {
            int i17 = size % completelyCountPerPage;
            return (i17 == 0 ? size + 1 : size + ((completelyCountPerPage + 1) - i17)) + baseAppBrandRecentView.getCustomItemCount();
        }
        int i18 = size % completelyCountPerPage;
        return i18 != 0 ? size + (completelyCountPerPage - i18) : size;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.appbrand.widget.recent.p1 p1Var = (com.tencent.mm.plugin.appbrand.widget.recent.p1) k3Var;
        p1Var.f92033h.setVisibility(8);
        android.widget.ImageView imageView = p1Var.f92034i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView = this.f92017d;
        if (i17 >= ((java.util.ArrayList) baseAppBrandRecentView.f91908f2).size() || i17 - baseAppBrandRecentView.getCustomItemCount() > baseAppBrandRecentView.getShowCount()) {
            android.view.View view = p1Var.f92032g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            baseAppBrandRecentView.j1(p1Var, null, i17);
            return;
        }
        android.view.View view2 = p1Var.f92032g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$AppBrandPreviewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.appbrand.widget.recent.x xVar = (com.tencent.mm.plugin.appbrand.widget.recent.x) ((java.util.ArrayList) baseAppBrandRecentView.f91908f2).get(i17);
        if (xVar != null) {
            p1Var.f92032g.setTag(xVar);
        }
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = xVar.f92084a;
        if (localUsageInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.appbrand.appcache.p.a(localUsageInfo.f76363f))) {
            android.widget.TextView textView = p1Var.f92033h;
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.plugin.appbrand.appcache.p.a(localUsageInfo.f76363f));
        } else if (imageView != null && localUsageInfo != null && localUsageInfo.f76372r) {
            imageView.setVisibility(0);
            imageView.setImageResource(com.tencent.mm.R.raw.ok_icon);
        }
        baseAppBrandRecentView.j1(p1Var, xVar, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView = this.f92017d;
        return new com.tencent.mm.plugin.appbrand.widget.recent.p1(baseAppBrandRecentView, com.tencent.mm.ui.id.b(baseAppBrandRecentView.f91906d2).inflate(baseAppBrandRecentView.getLayoutId(), viewGroup, false));
    }
}
