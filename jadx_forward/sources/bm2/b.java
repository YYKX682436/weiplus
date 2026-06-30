package bm2;

/* loaded from: classes9.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.c f103315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.k f103316e;

    public b(bm2.c cVar, cm2.k kVar) {
        this.f103315d = cVar;
        this.f103316e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveRecentPlayAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f103315d.f103337e;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f103316e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveRecentPlayAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
