package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class md implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103991f;

    public md(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.view.View view) {
        this.f103989d = s0Var;
        this.f103990e = baseFinderFeed;
        this.f103991f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        in5.s0 s0Var = this.f103989d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        b6Var.b(nyVar != null ? nyVar.V6() : null, "follow_like", false, this.f103990e.getItemId(), (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? "" : null);
        s0Var.p(com.tencent.mm.R.id.a_x).callOnClick();
        android.view.View view2 = this.f103991f;
        view2.animate().alpha(0.0f).setDuration(200L).setListener(new com.tencent.mm.plugin.finder.convert.ld(view2)).start();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
