package ka2;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 f387581d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4) {
        this.f387581d = activityC13659x4f0951e4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initViews$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4 = this.f387581d;
        ha2.a aVar = activityC13659x4f0951e4.f183327u;
        jz5.f0 f0Var = null;
        if (aVar != null) {
            activityC13659x4f0951e4.m7(aVar, null, false);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            activityC13659x4f0951e4.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initViews$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
