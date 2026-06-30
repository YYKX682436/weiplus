package it3;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376101d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2) {
        this.f376101d = activityC16983x775783e2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/activity/FinderRedPacketCoverEditUI$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376101d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2.f237144t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "[onSave] range:[" + activityC16983x775783e2.f237154p + ", " + activityC16983x775783e2.f237155q + ']');
        ((ku5.t0) ku5.t0.f394148d).q(new it3.s(activityC16983x775783e2));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/activity/FinderRedPacketCoverEditUI$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
