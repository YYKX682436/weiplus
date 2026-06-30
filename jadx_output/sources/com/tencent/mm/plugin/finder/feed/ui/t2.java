package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI f110552d;

    public t2(com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI finderFollowAggregationUI) {
        this.f110552d = finderFollowAggregationUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f110552d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
