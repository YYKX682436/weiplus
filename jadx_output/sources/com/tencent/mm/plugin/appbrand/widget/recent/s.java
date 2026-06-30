package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.h1 f92047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.g1 f92048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f92049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.t f92050g;

    public s(com.tencent.mm.plugin.appbrand.widget.recent.t tVar, com.tencent.mm.plugin.appbrand.widget.recent.h1 h1Var, com.tencent.mm.plugin.appbrand.widget.recent.g1 g1Var, int i17) {
        this.f92050g = tVar;
        this.f92047d = h1Var;
        this.f92048e = g1Var;
        this.f92049f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCommonUsedTaskView$AppBrandCommonUsedItemViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.recent.t tVar = this.f92050g;
        com.tencent.mm.plugin.appbrand.widget.recent.h1 h1Var = this.f92047d;
        if (h1Var != null) {
            ((com.tencent.mm.plugin.appbrand.page.t7) h1Var).a(view, tVar.f92055d);
        }
        com.tencent.mm.plugin.appbrand.widget.recent.g1 g1Var = this.f92048e;
        if (g1Var != null) {
            ((com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer) g1Var).e(6, tVar.f92055d.f92092a.f76361d, "" + this.f92049f, android.net.Uri.encode(tVar.f92055d.f92092a.f76375u.f76339f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCommonUsedTaskView$AppBrandCommonUsedItemViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
