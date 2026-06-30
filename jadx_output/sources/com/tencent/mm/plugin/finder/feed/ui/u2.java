package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI f110592d;

    public u2(com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI finderFollowAggregationUI) {
        this.f110592d = finderFollowAggregationUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
        com.tencent.mm.plugin.finder.search.l4.f125763c = null;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI finderFollowAggregationUI = this.f110592d;
        androidx.appcompat.app.AppCompatActivity context = finderFollowAggregationUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        intent.putExtra("request_type", 3);
        intent.putExtra("need_history", false);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context2 = finderFollowAggregationUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        i0Var.nj(context2, null, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
