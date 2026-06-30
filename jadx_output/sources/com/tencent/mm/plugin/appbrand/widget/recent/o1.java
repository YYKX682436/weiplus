package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class o1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.p1 f92024d;

    public o1(com.tencent.mm.plugin.appbrand.widget.recent.p1 p1Var, com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView) {
        this.f92024d = p1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.appbrand.widget.recent.x xVar = (com.tencent.mm.plugin.appbrand.widget.recent.x) view.getTag();
        com.tencent.mm.plugin.appbrand.widget.recent.p1 p1Var = this.f92024d;
        p1Var.getAdapterPosition();
        xVar.getClass();
        if (p1Var.f92035m.getOnItemClickListener() != null) {
            com.tencent.mm.plugin.appbrand.widget.recent.h0 onItemClickListener = p1Var.f92035m.getOnItemClickListener();
            com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView = p1Var.f92035m;
            onItemClickListener.a(view, xVar, baseAppBrandRecentView.f91919q2, baseAppBrandRecentView.f91920r2);
        }
        p1Var.f92035m.f91921s2 = true;
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/widget/recent/BaseAppBrandRecentView$RecentViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
