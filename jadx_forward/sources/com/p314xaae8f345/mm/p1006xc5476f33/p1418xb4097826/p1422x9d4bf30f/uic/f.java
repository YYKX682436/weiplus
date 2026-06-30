package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o f183402d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o oVar) {
        this.f183402d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.e21 e21Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o oVar = this.f183402d;
        android.app.Activity m80379x76847179 = oVar.m80379x76847179();
        r45.r03 r03Var = (r45.r03) this.f183402d.f534252d;
        if (r03Var == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1)) == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        oVar.Y6(m80379x76847179, (r20 & 2) != 0 ? null : null, str, (r20 & 8) != 0 ? "" : null, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 59 : 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
