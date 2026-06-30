package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes8.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16723x347a332a f233731d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16723x347a332a activityC16723x347a332a) {
        this.f233731d = activityC16723x347a332a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16723x347a332a activityC16723x347a332a = this.f233731d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC16723x347a332a.f233618d;
        if (j0Var == null) {
            activityC16723x347a332a.f233618d = db5.e1.x(activityC16723x347a332a.mo55332x76847179(), activityC16723x347a332a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), null, activityC16723x347a332a.f233619e, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.p(this), null);
        } else {
            j0Var.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
