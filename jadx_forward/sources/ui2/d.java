package ui2;

/* loaded from: classes8.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi2.b f509623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ui2.f f509624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f509625f;

    public d(vi2.b bVar, ui2.f fVar, int i17) {
        this.f509623d = bVar;
        this.f509624e = fVar;
        this.f509625f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        si2.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetAcceptRecommendItemConvert$bindAcceptButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        km2.q qVar = this.f509623d.f519069f;
        if (qVar != null && (aVar = this.f509624e.f509629e) != null) {
            aVar.d(this.f509625f, qVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetAcceptRecommendItemConvert$bindAcceptButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
