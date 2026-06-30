package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class u9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI f110599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ib1 f110600e;

    public u9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI, r45.ib1 ib1Var) {
        this.f110599d = finderLiveHistoryUI;
        this.f110600e = ib1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveHistoryUI$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(c61.ub.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity context = this.f110599d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.ib1 ib1Var = this.f110600e;
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) c17)).Fj(null, context, ib1Var.getLong(0), ib1Var.getLong(1), "", null, "", null, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveHistoryUI$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
