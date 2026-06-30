package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.h1 f91956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.g1 f91957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f91958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.d0 f91959g;

    public c0(com.tencent.mm.plugin.appbrand.widget.recent.d0 d0Var, com.tencent.mm.plugin.appbrand.widget.recent.h1 h1Var, com.tencent.mm.plugin.appbrand.widget.recent.g1 g1Var, int i17) {
        this.f91959g = d0Var;
        this.f91956d = h1Var;
        this.f91957e = g1Var;
        this.f91958f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/AppBrandRecentTaskView$AppBrandRecentIconItemViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.recent.d0 d0Var = this.f91959g;
        com.tencent.mm.plugin.appbrand.widget.recent.h1 h1Var = this.f91956d;
        if (h1Var != null) {
            ((com.tencent.mm.plugin.appbrand.page.t7) h1Var).a(view, d0Var.f91963d);
        }
        com.tencent.mm.plugin.appbrand.widget.recent.g1 g1Var = this.f91957e;
        if (g1Var != null) {
            ((com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer) g1Var).e(4, d0Var.f91963d.f92092a.f76361d, "" + this.f91958f, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandRecentTaskView$AppBrandRecentIconItemViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
