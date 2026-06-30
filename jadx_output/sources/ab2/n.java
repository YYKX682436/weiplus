package ab2;

/* loaded from: classes2.dex */
public final class n extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab2.l f2784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f2785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f2786f;

    public n(ab2.l lVar, yz5.p pVar, yz5.a aVar) {
        this.f2784d = lVar;
        this.f2785e = pVar;
        this.f2786f = aVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$3$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$3$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$3$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int intValue = ((java.lang.Number) hc2.f1.s(recyclerView, false).f302834e).intValue();
        if (intValue >= this.f2784d.f2771x) {
            this.f2785e.invoke(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue + 1));
        } else {
            this.f2786f.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$3$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
