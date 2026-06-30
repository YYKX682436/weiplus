package se2;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f488408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.c f488409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f488411g;

    public q(in5.s0 s0Var, lm2.c cVar, java.lang.String str, android.view.View view) {
        this.f488408d = s0Var;
        this.f488409e = cVar;
        this.f488410f = str;
        this.f488411g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        gk2.e S0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        in5.s0 s0Var = this.f488408d;
        java.lang.Object tag = s0Var.o().getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb) tag : null;
        java.lang.String str = this.f488410f;
        if (tbVar == null || (S0 = tbVar.S0()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "setBoxCommentLikeListener but buContext is null!");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        lm2.c cVar = this.f488409e;
        if (!cVar.f400907g) {
            se2.w.f488428a.t(s0Var.f374653d, this.f488411g, new se2.p(str, S0, cVar));
        } else if (se2.w.f488428a.d(str, S0, cVar)) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) S0.a(mm2.c1.class)).T ? ml2.g5.M : ml2.g5.f409029w, 1, cVar.a(), cVar.j());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
