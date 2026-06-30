package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q2 f207321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f207322e;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q2 q2Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa) {
        this.f207321d = q2Var;
        this.f207322e = c19782x23db1cfa;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String m76197x6c03c64c = this.f207322e.m76197x6c03c64c();
        if (m76197x6c03c64c == null) {
            m76197x6c03c64c = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q2 q2Var = this.f207321d;
        q2Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", m76197x6c03c64c);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, q2Var.f207356a, intent, 0L, null, 0, 1, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(q2Var.f207356a, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
