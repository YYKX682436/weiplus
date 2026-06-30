package bm2;

/* loaded from: classes9.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.f f21850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.k f21851e;

    public e(bm2.f fVar, cm2.k kVar) {
        this.f21850d = fVar;
        this.f21851e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f21850d.f21876e;
        if (lVar != null) {
            lVar.invoke(this.f21851e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
