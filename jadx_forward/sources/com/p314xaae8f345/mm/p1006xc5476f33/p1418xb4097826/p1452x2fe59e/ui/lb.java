package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class lb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986 f191798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.n01 f191799e;

    public lb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986 activityC14022xa7ad2986, r45.n01 n01Var) {
        this.f191798d = activityC14022xa7ad2986;
        this.f191799e = n01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986 activityC14022xa7ad2986 = this.f191798d;
        java.lang.String str = activityC14022xa7ad2986.f190929v;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appealView click, url = ");
        r45.n01 n01Var = this.f191799e;
        sb6.append(n01Var.m75945x2fec8307(6));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409490j2, activityC14022xa7ad2986.f7("160"), null, "160", null, null, false, 116, null);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Nk("161", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986.g7(activityC14022xa7ad2986, null, null, 3, null));
        java.lang.String m75945x2fec8307 = n01Var.m75945x2fec8307(6);
        if (m75945x2fec8307 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986.d7(activityC14022xa7ad2986, m75945x2fec8307);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
