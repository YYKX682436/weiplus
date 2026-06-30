package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class sn extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110544d;

    public sn(com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI) {
        this.f110544d = finderTopicTimelineUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i19 = this.f110544d.H;
        ml2.x1 x1Var = ml2.x1.f328202f;
        p52.c cVar = p52.h.f352016a;
        p52.h.f352024i = true;
        if (2 == i19) {
            p52.h.f352024i = true;
        } else if (1 == i19) {
            x1Var = ml2.x1.f328203g;
            p52.h.f352024i = false;
            str = "9";
            nm5.b c17 = nm5.j.c(x1Var, str);
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            java.lang.Object a17 = c17.a(0);
            kotlin.jvm.internal.o.f(a17, "$1(...)");
            java.lang.Object a18 = c17.a(1);
            kotlin.jvm.internal.o.f(a18, "$2(...)");
            zy2.zb.Kh(zbVar, recyclerView, (ml2.x1) a17, (java.lang.String) a18, ml2.y.f328239d, 0, 0L, 0, 112, null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
        str = "27";
        nm5.b c172 = nm5.j.c(x1Var, str);
        i95.m c182 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c182, "getService(...)");
        zy2.zb zbVar2 = (zy2.zb) c182;
        java.lang.Object a172 = c172.a(0);
        kotlin.jvm.internal.o.f(a172, "$1(...)");
        java.lang.Object a182 = c172.a(1);
        kotlin.jvm.internal.o.f(a182, "$2(...)");
        zy2.zb.Kh(zbVar2, recyclerView, (ml2.x1) a172, (java.lang.String) a182, ml2.y.f328239d, 0, 0L, 0, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
