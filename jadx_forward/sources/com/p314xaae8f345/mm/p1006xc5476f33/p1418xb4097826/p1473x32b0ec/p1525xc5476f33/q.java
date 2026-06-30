package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r f195471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.h0 f195472e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r rVar, cm2.h0 h0Var) {
        this.f195471d = rVar;
        this.f195472e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r rVar = this.f195471d;
        yz5.l lVar = rVar.f195596g;
        cm2.h0 h0Var = this.f195472e;
        if (lVar != null) {
            lVar.mo146xb9724478(h0Var);
        }
        bf2.c.c(bf2.c.f101131a, rVar.f195594e, 5, 4, pm0.v.u(h0Var.f124882w), h0Var.D, null, 0, 0, null, 0, 992, null);
        if (((mm2.c1) rVar.f195594e.a(mm2.c1.class)).M7()) {
            qo0.c cVar = rVar.f195595f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.mo57682x2a5e9229(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
                vVar.b();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f195598i, "needJump:" + h0Var.f124921g);
        if (h0Var.f124921g) {
            mm2.e1 e1Var = (mm2.e1) rVar.f195594e.a(mm2.e1.class);
            long j17 = e1Var.f410516m;
            long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
            java.lang.String e17 = xy2.c.e(rVar.f195593d);
            gk2.e eVar = rVar.f195594e;
            new ke2.v(j17, m75942xfb822ef2, 4, e17, ((mm2.e1) eVar.a(mm2.e1.class)).f410518o, h0Var.f124920f, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(h0Var.f124881v.mo14344x5f01b1f6()), zl2.r4.f555483a.f1(eVar, java.lang.Long.valueOf(h0Var.f124882w)), ((mm2.e1) eVar.a(mm2.e1.class)).f410526w, null, 512, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p(h0Var, rVar));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r.f195592n;
            android.view.ViewGroup viewGroup = rVar.f195599m;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            mVar.a(context, rVar.f195594e, rVar.f195598i, h0Var);
            if (rVar.f195595f.mo11219xd0598cf8() == 0) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                ml2.f4 f4Var = ml2.f4.f408965f;
                java.lang.String valueOf = java.lang.String.valueOf(h0Var.f124882w);
                r45.n3 n3Var = h0Var.f124883x;
                java.lang.String str = (n3Var == null || (m75945x2fec8307 = n3Var.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307;
                java.lang.String valueOf2 = java.lang.String.valueOf(h0Var.f124882w);
                java.lang.String str2 = h0Var.C;
                ml2.r0.Dj(r0Var, f4Var, null, valueOf, str, valueOf2, str2 == null ? "" : str2, h0Var.D, h0Var.E, null, null, null, null, false, null, 16128, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
