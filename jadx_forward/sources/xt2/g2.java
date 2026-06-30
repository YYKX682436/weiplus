package xt2;

/* loaded from: classes3.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538298d;

    public g2(xt2.e3 e3Var) {
        this.f538298d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        so2.j5 j5Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$closeOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xt2.e3 e3Var = this.f538298d;
        if (e3Var.f538236e.mo11219xd0598cf8() == 0) {
            gk2.e m175929xd052fc2c = e3Var.m175929xd052fc2c();
            java.lang.Long l17 = null;
            if ((m175929xd052fc2c != null ? ((mm2.f6) m175929xd052fc2c.a(mm2.f6.class)).f410582w : null) != null) {
                gk2.e m175929xd052fc2c2 = e3Var.m175929xd052fc2c();
                so2.j5 j5Var2 = m175929xd052fc2c2 != null ? ((mm2.f6) m175929xd052fc2c2.a(mm2.f6.class)).f410582w : null;
                boolean z17 = j5Var2 instanceof cm2.m0;
                bf2.c cVar = bf2.c.f101131a;
                if (z17) {
                    gk2.e m175929xd052fc2c3 = e3Var.m175929xd052fc2c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m175929xd052fc2c3);
                    cm2.m0 m0Var = (cm2.m0) j5Var2;
                    bf2.c.c(cVar, m175929xd052fc2c3, 2, 5, java.lang.String.valueOf(m0Var.f124902w), 0, null, 0, 0, null, 0, 1008, null);
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ml2.r0 r0Var = (ml2.r0) c17;
                    ml2.f4 f4Var = ml2.f4.f408972o;
                    gk2.e m175929xd052fc2c4 = e3Var.m175929xd052fc2c();
                    if (m175929xd052fc2c4 != null && (j5Var = ((mm2.f6) m175929xd052fc2c4.a(mm2.f6.class)).f410582w) != null) {
                        l17 = java.lang.Long.valueOf(j5Var.mo2128x1ed62e84());
                    }
                    ml2.r0.Dj(r0Var, f4Var, null, java.lang.String.valueOf(l17), null, null, null, 0, 0L, st2.g3.f493859a.k(m0Var.f124901v), null, null, null, false, null, 16120, null);
                    c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                    r45.qt2 m175932xea5dd46d = e3Var.m175932xea5dd46d();
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    qo0.c cVar2 = e3Var.f538236e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                    ((c61.p2) ybVar).Kj(m175932xea5dd46d, 18054, zl2.r4.k0(r4Var, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar2).m57654xd7793f26(), 29, pm0.v.u(m0Var.f124902w), 0, null, 24, null));
                } else if (j5Var2 instanceof cm2.k0) {
                    gk2.e m175929xd052fc2c5 = e3Var.m175929xd052fc2c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m175929xd052fc2c5);
                    bf2.c.c(cVar, m175929xd052fc2c5, 2, 6, java.lang.String.valueOf(((cm2.k0) j5Var2).f124894w), 0, null, 0, 0, null, 0, 1008, null);
                }
            }
        }
        xt2.e3.b(e3Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$closeOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
