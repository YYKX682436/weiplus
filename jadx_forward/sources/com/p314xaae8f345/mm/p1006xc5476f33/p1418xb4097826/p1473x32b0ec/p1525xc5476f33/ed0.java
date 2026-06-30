package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ed0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 f193934d;

    public ed0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var) {
        this.f193934d = nd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        dk2.gf gfVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nk2.l.f419554a.b(nk2.a.f419485e);
        ya2.g gVar = ya2.h.f542017a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = this.f193934d;
        ya2.b2 b17 = gVar.b(((mm2.c1) nd0Var.P0(mm2.c1.class)).f410385o);
        jz5.f0 f0Var = null;
        if (b17 != null) {
            nd0Var.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((mm2.d) nd0Var.P0(mm2.d.class)).f410476g, true);
            java.lang.Object[] objArr = n17 != null && n17.r2();
            boolean rj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).rj(b17.w0());
            if (nd0Var.D1()) {
                if (objArr == false) {
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    android.content.Context context = nd0Var.f195150r;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
                    r4Var.Q(context, nd0Var.S0(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lc0(nd0Var));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
                    java.lang.String str2 = ((mm2.d) nd0Var.P0(mm2.d.class)).f410476g;
                    am.zd zdVar = c5560x6f070be.f135879g;
                    zdVar.f90084a = str2;
                    zdVar.f90085b = 4;
                    zdVar.f90086c = true;
                    c5560x6f070be.e();
                    if (nd0Var.B.getVisibility() == 0) {
                        p3325xe03a0797.p3326xc267989b.r2 r2Var = nd0Var.H;
                        if (!(r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) && nd0Var.D1()) {
                            nd0Var.H = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(nd0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mc0(nd0Var, null), 3, null);
                        }
                    }
                }
            } else if (!rj6) {
                boolean f17 = hc2.s.f(b17);
                if (((mm2.c1) nd0Var.P0(mm2.c1.class)).I7().m75939xb282bd08(2) == 3) {
                    android.content.Context context2 = nd0Var.f194857f.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    str = xy2.c.e(context2);
                } else {
                    str = "";
                }
                java.lang.String str3 = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "#followAnchor nickName:" + b17.w0() + ", isPrivate:" + f17);
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.content.Context context3 = nd0Var.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).c(zy2.ra.class))).V6();
                java.lang.String D0 = b17.D0();
                long j17 = ((mm2.e1) nd0Var.P0(mm2.e1.class)).f410516m;
                dk2.xf W0 = nd0Var.W0();
                c61.yb.R8(ybVar, V6, D0, 1, j17, f17, str3, W0 != null ? ((dk2.r4) W0).K(((mm2.e1) nd0Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)) : null, 1, null, null, null, null, null, 7936, null);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
                java.lang.String D02 = b17.D0();
                am.zd zdVar2 = c5560x6f070be2.f135879g;
                zdVar2.f90084a = D02;
                zdVar2.f90085b = 4;
                zdVar2.f90086c = true;
                c5560x6f070be2.e();
            }
            boolean a17 = hc2.s.a(b17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "followBtn click, nickName:" + b17.w0() + ", isBlock" + a17);
            if (a17) {
                nd0Var.v1(b17.D0());
            }
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Pj(ml2.a2.f408732f, nd0Var.D1());
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            nd0Var.f195158z.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "no anchor finder contact ");
        }
        dk2.Cif cif = dk2.Cif.f315159a;
        long m75942xfb822ef2 = ((mm2.e1) nd0Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        kk.l lVar = dk2.Cif.f315160b;
        if (lVar.k(java.lang.Long.valueOf(m75942xfb822ef2)) && (gfVar = (dk2.gf) lVar.get(java.lang.Long.valueOf(m75942xfb822ef2))) != null) {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.t1 t1Var = ml2.t1.f409478f;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("follow_icon_expose_condition_sessionid", gfVar.f315062b);
            zy2.zb.T8((zy2.zb) c18, t1Var, linkedHashMap, null, null, null, null, false, 124, null);
        }
        if (((mm2.c1) nd0Var.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) nd0Var.X0(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
            vVar.a();
            vVar.c(2008);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
