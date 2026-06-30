package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class u10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f217614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f217615e;

    public u10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f217614d = f50Var;
        this.f217615e = c19786x6a1e2862;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$accountAbnormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f217614d;
        nk6.y("PersonalCenterBanEntry", f50Var.f215871d);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f217615e;
        if (c19786x6a1e2862 != null) {
            xc2.y2.i(xc2.y2.f534876a, f50Var.m80379x76847179(), new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            m92.b j37 = g92.a.j3(g92.b.f351302e, f50Var.f215871d, false, 2, null);
            if (j37 == null || (m75945x2fec8307 = j37.u0().m75945x2fec8307(32)) == null) {
                f0Var2 = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfUIC", "[handleJumpError] jumpJson=".concat(m75945x2fec8307));
                qd2.q qVar = new qd2.q();
                android.content.Context context = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                qd2.q.e(qVar, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, 0, m75945x2fec8307, 0, 8, null);
            }
            if (f0Var2 == null) {
                f50Var.m158359x1e885992().putExtra("finder_username", f50Var.f215871d);
                f50Var.m158359x1e885992().putExtra("KEY_FINDER_SELF_FLAG", true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, f50Var.m158354x19263085(), f50Var.m158359x1e885992(), 0L, null, 0, 0, false, 0, null, 508, null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(f50Var.m158354x19263085(), f50Var.m158359x1e885992());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$accountAbnormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
