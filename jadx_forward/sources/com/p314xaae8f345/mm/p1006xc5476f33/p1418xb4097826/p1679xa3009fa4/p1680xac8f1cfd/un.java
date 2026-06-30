package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class un implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn f217679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo f217680e;

    public un(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar) {
        this.f217679d = rnVar;
        this.f217680e = eoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$3$getItemConvert$1$onBindViewHolder$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click encash, encashInterceptJumpInfo:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar = this.f217679d;
        sb6.append(rnVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", sb6.toString());
        java.lang.Long l17 = rnVar.f217344e;
        if ((l17 != null ? l17.longValue() : 0L) > 0) {
            r45.v11 v11Var = (r45.v11) rnVar.f217343d.m75936x14adae67(9);
            java.util.LinkedList m75941xfb821914 = v11Var != null ? v11Var.m75941xfb821914(6) : null;
            boolean z17 = m75941xfb821914 == null || m75941xfb821914.isEmpty();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar = this.f217680e;
            if (!z17) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) eoVar.m80379x76847179(), 1, true);
                k0Var.q(eoVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j5x), 17);
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sn(m75941xfb821914, eoVar);
                k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tn(m75941xfb821914, rnVar, eoVar);
                k0Var.v();
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo.S6(eoVar, rnVar)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo.Q6(eoVar, rnVar);
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo.R6(eoVar, rnVar)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo.P6(eoVar, rnVar);
            } else {
                js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
                android.app.Activity m80379x76847179 = eoVar.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179;
                js4.q qVar = new js4.q();
                qVar.f383089a = rnVar.f217343d.m75939xb282bd08(1);
                java.lang.Long l18 = rnVar.f217344e;
                qVar.f383090b = l18 != null ? l18.longValue() : 0L;
                qVar.f383091c = rnVar.f217345f;
                qVar.f383092d = rnVar.f217346g;
                qVar.f383093e = rnVar.f217349m;
                qVar.f383094f = rnVar.f217350n;
                ((ms4.z) iVar).g(abstractActivityC21394xb3d2c0cf, qVar, new java.lang.ref.WeakReference(eoVar));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$3$getItemConvert$1$onBindViewHolder$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
