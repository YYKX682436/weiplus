package ka2;

/* loaded from: classes8.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 f387579d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4) {
        this.f387579d = activityC13659x4f0951e4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f387579d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
