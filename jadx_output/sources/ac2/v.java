package ac2;

/* loaded from: classes2.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.y f3062d;

    public v(ac2.y yVar) {
        this.f3062d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ac2.y yVar = this.f3062d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = yVar.f3069u;
        if (baseFinderFeed == null) {
            yVar.v(true);
        } else {
            yVar.f3066r.D0(baseFinderFeed);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$initRecyclerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
