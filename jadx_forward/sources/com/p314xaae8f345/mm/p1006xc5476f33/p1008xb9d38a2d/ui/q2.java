package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class q2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11405x94a32f64 f155660d;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11405x94a32f64 activityC11405x94a32f64) {
        this.f155660d = activityC11405x94a32f64;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11405x94a32f64 activityC11405x94a32f64 = this.f155660d;
        if (activityC11405x94a32f64.f154822e.t().length >= 50) {
            db5.e1.i(activityC11405x94a32f64, com.p314xaae8f345.mm.R.C30867xcad56011.c8m, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b3 b3Var = activityC11405x94a32f64.f154822e;
        int headerViewsCount = i17 - activityC11405x94a32f64.f154821d.getHeaderViewsCount();
        if (headerViewsCount >= 0) {
            boolean[] zArr = b3Var.f155272p;
            if (headerViewsCount < zArr.length) {
                zArr[headerViewsCount] = !zArr[headerViewsCount];
                b3Var.notifyDataSetChanged();
            }
        } else {
            b3Var.getClass();
        }
        if (activityC11405x94a32f64.f154822e.t().length > 0) {
            activityC11405x94a32f64.mo74408xb0dfae51(true);
        } else {
            activityC11405x94a32f64.mo74408xb0dfae51(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
