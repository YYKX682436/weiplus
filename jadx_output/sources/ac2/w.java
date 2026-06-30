package ac2;

/* loaded from: classes2.dex */
public final class w extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f3063d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ac2.y f3064e;

    public w(ac2.y yVar) {
        this.f3064e = yVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        ac2.y yVar = this.f3064e;
        int y17 = yVar.y();
        if (this.f3063d != y17 && y17 != -1) {
            java.util.ArrayList f17 = yVar.f3066r.f();
            if (y17 < (f17 != null ? f17.size() : 0)) {
                java.util.ArrayList f18 = yVar.f3066r.f();
                yVar.B((com.tencent.mm.plugin.finder.model.BaseFinderFeed) (f18 != null ? (so2.j5) f18.get(y17) : null));
            }
        }
        this.f3063d = y17;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
