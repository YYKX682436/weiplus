package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class v9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w9 f196228d;

    public v9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w9 w9Var) {
        this.f196228d = w9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorRandomMicBubble$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w9 w9Var = this.f196228d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w9Var.f196423f, "close promote");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = w9Var.f196429o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ((mm2.i5) w9Var.f196421d.a(mm2.i5.class)).f410673f.mo7808x76db6cb1(null);
        ml2.q2 q2Var = ml2.q2.M;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "report21054 op: 42 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorRandomMicBubble$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
