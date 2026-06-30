package sp2;

/* loaded from: classes2.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb f492557d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb activityC14524xdd91c7bb) {
        this.f492557d = activityC14524xdd91c7bb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI$initActionBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f492557d.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI$initActionBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
