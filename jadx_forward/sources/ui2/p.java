package ui2;

/* loaded from: classes8.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi2.b f509638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ui2.q f509639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f509640f;

    public p(vi2.b bVar, ui2.q qVar, int i17) {
        this.f509638d = bVar;
        this.f509639e = qVar;
        this.f509640f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi2.b bVar = this.f509638d;
        boolean z17 = bVar.f519073m;
        int i17 = this.f509640f;
        ui2.q qVar = this.f509639e;
        if (z17) {
            si2.a aVar = qVar.f509641e;
            if (aVar != null) {
                aVar.f(i17, bVar.f519077d);
            }
        } else {
            si2.a aVar2 = qVar.f509641e;
            if (aVar2 != null) {
                aVar2.e(i17, bVar.f519077d);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
