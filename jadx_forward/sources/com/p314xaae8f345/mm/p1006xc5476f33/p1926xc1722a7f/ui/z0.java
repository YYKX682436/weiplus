package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes11.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f233761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff f233762e;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff activityC16726x80180cff, android.view.View view) {
        this.f233762e = activityC16726x80180cff;
        this.f233761d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff activityC16726x80180cff = this.f233762e;
        int i17 = activityC16726x80180cff.f233646g + 8;
        activityC16726x80180cff.f233646g = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.n1 n1Var = activityC16726x80180cff.f233644e;
        n1Var.c();
        n1Var.f233720p = i17;
        n1Var.q();
        if (activityC16726x80180cff.f233647h <= activityC16726x80180cff.f233646g) {
            activityC16726x80180cff.f233645f.removeFooterView(this.f233761d);
            int i18 = activityC16726x80180cff.f233646g;
        }
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(7L);
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
