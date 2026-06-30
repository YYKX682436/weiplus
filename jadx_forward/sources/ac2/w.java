package ac2;

/* loaded from: classes2.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f84596d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ac2.y f84597e;

    public w(ac2.y yVar) {
        this.f84597e = yVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        ac2.y yVar = this.f84597e;
        int y17 = yVar.y();
        if (this.f84596d != y17 && y17 != -1) {
            java.util.ArrayList f17 = yVar.f84599r.f();
            if (y17 < (f17 != null ? f17.size() : 0)) {
                java.util.ArrayList f18 = yVar.f84599r.f();
                yVar.B((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) (f18 != null ? (so2.j5) f18.get(y17) : null));
            }
        }
        this.f84596d = y17;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
