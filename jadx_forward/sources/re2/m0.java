package re2;

/* loaded from: classes3.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 f475985d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1) {
        this.f475985d = activityC14183x9ab478f1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accept button clicked, invitationId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1 = this.f475985d;
        sb6.append(activityC14183x9ab478f1.f193064d);
        sb6.append(", accepting=");
        sb6.append(activityC14183x9ab478f1.f193076s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationConfirmUI", sb6.toString());
        if (activityC14183x9ab478f1.f193076s) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1.T6(activityC14183x9ab478f1);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
