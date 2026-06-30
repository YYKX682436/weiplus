package on2;

/* loaded from: classes3.dex */
public final class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.b3 f428407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f428408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ on2.f2 f428409f;

    public d2(so2.b3 b3Var, in5.s0 s0Var, on2.f2 f2Var) {
        this.f428407d = b3Var;
        this.f428408e = s0Var;
        this.f428409f = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.G().r()).intValue() <= 0) {
            db5.t7.m123883x26a183b(view.getContext(), view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn9), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        so2.b3 b3Var = this.f428407d;
        java.lang.String m75945x2fec8307 = b3Var.f491801d.m75945x2fec8307(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g;
        in5.s0 s0Var = this.f428408e;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        kVar.c(e17, m75945x2fec8307, "");
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        r45.zy1 zy1Var = b3Var.f491801d;
        on2.f2 f2Var = this.f428409f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = f2Var.f428439e.f204084d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader");
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248) abstractC13919x46aff122).f189016d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222 = f2Var.f428439e.f204084d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff1222, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader");
        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248) abstractC13919x46aff1222).f189018f;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context3);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Vi(context2, 1, zy1Var, str, j17, Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null, true);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409134q, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
