package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b f207141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207142e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b, int i17) {
        this.f207141d = activityC14941x5c78ef2b;
        this.f207142e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo");
        r45.mu2 mu2Var = (r45.mu2) tag;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b = this.f207141d;
        activityC14941x5c78ef2b.getClass();
        boolean z17 = false;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
        if (c19782x23db1cfa != null) {
            if ((c19782x23db1cfa.m76195x13a3e4aa() & 4) != 0) {
                z17 = true;
            }
        }
        int i17 = this.f207142e;
        if (z17 && activityC14941x5c78ef2b.f207054u == 2) {
            java.lang.String a17 = com.p314xaae8f345.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
            if (a17 == null) {
                a17 = "";
            }
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).bj(activityC14941x5c78ef2b.mo55332x76847179(), "wxid_wi_1d142z0zdj03", 5, a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l(activityC14941x5c78ef2b, mu2Var, i17));
        } else {
            activityC14941x5c78ef2b.X6(mu2Var, i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
