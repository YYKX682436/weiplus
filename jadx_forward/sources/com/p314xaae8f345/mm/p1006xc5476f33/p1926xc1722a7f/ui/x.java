package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes15.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a f233757d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a) {
        this.f233757d = activityC16724xf2604f0a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a = this.f233757d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.m0 m0Var = activityC16724xf2604f0a.f233638y;
        if (m0Var != null) {
            activityC16724xf2604f0a.f233625i = new an3.g(1, m0Var.f233712b, m0Var.f233711a, m0Var.f233713c, 0, "", "");
            activityC16724xf2604f0a.f233620d = db5.e1.Q(activityC16724xf2604f0a.mo55332x76847179(), activityC16724xf2604f0a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16724xf2604f0a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6l), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.y(activityC16724xf2604f0a));
            an3.e.a(3);
            gm0.j1.d().g(activityC16724xf2604f0a.f233625i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
