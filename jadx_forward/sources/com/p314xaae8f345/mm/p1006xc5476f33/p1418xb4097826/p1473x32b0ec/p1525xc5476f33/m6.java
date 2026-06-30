package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class m6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 f194999d;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var) {
        this.f194999d = v6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        j0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sub_action", 2);
        zy2.zb.y6(j0Var, ml2.z4.S, jSONObject.toString(), null, 4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var = this.f194999d;
        v6Var.C = false;
        android.view.View view2 = v6Var.f196205u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = v6Var.f196207w;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l6(v6Var, true));
        zl2.r4 r4Var = zl2.r4.f555483a;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new zl2.z2(null), 2, null);
        v6Var.f196205u.setOnClickListener(null);
        r45.ch1 ch1Var = new r45.ch1();
        r45.vh1 vh1Var = new r45.vh1();
        vh1Var.set(0, 1);
        ch1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(vh1Var.mo14344x5f01b1f6()));
        ch1Var.set(1, 20041);
        ch1Var.set(2, zl2.q4.f555466a.m());
        new ke2.q0(ch1Var, v6Var.S0(), null, null).l();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$likeIconChangeToApplaud$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
