package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o f183398d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o oVar) {
        this.f183398d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o oVar = this.f183398d;
        android.app.Activity m80379x76847179 = oVar.m80379x76847179();
        long j17 = oVar.T;
        r45.r03 r03Var = (r45.r03) oVar.f534252d;
        jz5.f0 f0Var = null;
        r45.e21 e21Var = r03Var != null ? (r45.e21) r03Var.m75936x14adae67(16) : null;
        oVar.getClass();
        if (e21Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) e21Var.m75936x14adae67(15);
            if (c19786x6a1e2862 != null) {
                oVar.W6(m80379x76847179, j17, e21Var, c19786x6a1e2862, "feed_jumpicon");
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                oVar.X6(m80379x76847179, j17, e21Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
