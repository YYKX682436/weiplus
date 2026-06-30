package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gi0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 f194237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f194238e;

    public gi0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 ji0Var, android.app.Activity activity) {
        this.f194237d = ji0Var;
        this.f194238e = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Rj((ml2.r0) c17, 9, null, 0, 6, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 ji0Var = this.f194237d;
        dk2.xf W0 = ji0Var.W0();
        if (W0 != null) {
            ((dk2.r4) W0).r(this.f194238e, false);
        }
        r45.z63 g76 = ((mm2.c1) ji0Var.P0(mm2.c1.class)).g7();
        if (g76 != null) {
            ji0Var.v1(false, g76);
        }
        ji0Var.u1();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
