package an2;

/* loaded from: classes14.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ an2.e f90376d;

    public d(an2.e eVar) {
        this.f90376d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget$ItemViewHolder$label$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        an2.e eVar = this.f90376d;
        an2.b bVar = eVar.f90379f;
        if (bVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget$ItemViewHolder$label$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        eVar.f90377d.mo146xb9724478(bVar);
        if (bVar.a() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget$ItemViewHolder$label$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", eVar.f3639x46306858, null, 25561);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget$ItemViewHolder$label$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
