package ab2;

/* loaded from: classes2.dex */
public final class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj {

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 f84307y;

    /* renamed from: z, reason: collision with root package name */
    public final zy2.h8 f84308z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f84307y = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w6) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w6.class)).f217840d;
        this.f84308z = ((te2.e4) ((zy2.g8) pf5.z.f435481a.a(context).c(zy2.g8.class))).f499507d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void C() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        if (abstractC13919x46aff122 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(abstractC13919x46aff122, false, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void G(ym5.s3 reason) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        if (!reason.f545057i || !reason.f545054f || (i0Var = this.f187957g) == null || (m56068x4905e9fa = i0Var.m56068x4905e9fa()) == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m56068x4905e9fa.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        int w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager).w() + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f188102s, "[smoothScrollToNextPosition] nextPosition=" + w17);
        m56068x4905e9fa.post(new ab2.f0(m56068x4905e9fa, w17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void P() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    public void X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 model, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj callback) {
        fc2.c n17;
        fc2.c n18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.X(model, callback);
        ab2.d0 d0Var = new ab2.d0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.f84307y;
        l0Var.N0(2, this.f187955e, d0Var);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(l0Var);
        }
        zy2.h8 h8Var = this.f84308z;
        ab2.e0 e0Var = new ab2.e0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var).N0(e0Var, i0Var != null ? i0Var.m56068x4905e9fa() : null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar2 == null || (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var;
        s3Var.getClass();
        n17.a(s3Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        fc2.c n17;
        fc2.c n18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.f84307y;
        l0Var.m56485x3f5eee52();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.d(l0Var);
        }
        zy2.h8 h8Var = this.f84308z;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var).m56497x3f5eee52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar2 != null && (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var;
            s3Var.getClass();
            n17.d(s3Var);
        }
        super.mo979x3f5eee52();
    }
}
