package an2;

/* loaded from: classes14.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ an2.e f8843d;

    public d(an2.e eVar) {
        this.f8843d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget$ItemViewHolder$label$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        an2.e eVar = this.f8843d;
        an2.b bVar = eVar.f8846f;
        if (bVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget$ItemViewHolder$label$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        eVar.f8844d.invoke(bVar);
        if (bVar.a() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget$ItemViewHolder$label$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", eVar.itemView, null, 25561);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/navigators/FinderLiveBeautyNavigatorWidget$ItemViewHolder$label$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
