package oa2;

/* loaded from: classes2.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa2.w f425371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r03 f425372e;

    public u(oa2.w wVar, r45.r03 r03Var) {
        this.f425371d = wVar;
        this.f425372e = r03Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$updateViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oa2.w wVar = this.f425371d;
        if (wVar.m158354x19263085().getIntent().getIntExtra("key_entrance_source_type", 0) == 0) {
            wVar.m158354x19263085().finish();
        } else {
            android.content.Intent intent = new android.content.Intent();
            r45.r23 r23Var = (r45.r23) this.f425372e.m75936x14adae67(23);
            intent.putExtra("finder_username", (r23Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r23Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, wVar.m80379x76847179(), intent, 0L, null, 0, 1, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(wVar.m80379x76847179(), intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$updateViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
