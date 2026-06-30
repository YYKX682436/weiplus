package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.p1 f92019d;

    public n1(com.tencent.mm.plugin.appbrand.widget.recent.p1 p1Var, com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView) {
        this.f92019d = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.recent.x xVar = (com.tencent.mm.plugin.appbrand.widget.recent.x) view.getTag();
        com.tencent.mm.plugin.appbrand.widget.recent.p1 p1Var = this.f92019d;
        p1Var.getAdapterPosition();
        xVar.getClass();
        if (p1Var.f92035m.getOnItemClickListener() != null) {
            com.tencent.mm.plugin.appbrand.widget.recent.h0 onItemClickListener = p1Var.f92035m.getOnItemClickListener();
            com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView = p1Var.f92035m;
            onItemClickListener.b(view, xVar, baseAppBrandRecentView.f91919q2, baseAppBrandRecentView.f91920r2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
