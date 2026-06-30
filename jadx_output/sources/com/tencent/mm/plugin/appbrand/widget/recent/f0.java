package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.h1 f91974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.g1 f91975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f91976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.g0 f91977g;

    public f0(com.tencent.mm.plugin.appbrand.widget.recent.g0 g0Var, com.tencent.mm.plugin.appbrand.widget.recent.h1 h1Var, com.tencent.mm.plugin.appbrand.widget.recent.g1 g1Var, int i17) {
        this.f91977g = g0Var;
        this.f91974d = h1Var;
        this.f91975e = g1Var;
        this.f91976f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/AppBrandRecentTaskView$AppBrandRecentItemViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.recent.g0 g0Var = this.f91977g;
        com.tencent.mm.plugin.appbrand.widget.recent.h1 h1Var = this.f91974d;
        if (h1Var != null) {
            ((com.tencent.mm.plugin.appbrand.page.t7) h1Var).a(view, g0Var.f91981d);
        }
        com.tencent.mm.plugin.appbrand.widget.recent.g1 g1Var = this.f91975e;
        if (g1Var != null) {
            ((com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer) g1Var).e(4, g0Var.f91981d.f92092a.f76361d, "" + this.f91976f, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandRecentTaskView$AppBrandRecentItemViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
