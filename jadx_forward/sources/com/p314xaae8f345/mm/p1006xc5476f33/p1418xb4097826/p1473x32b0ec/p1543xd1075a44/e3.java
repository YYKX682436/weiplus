package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 f199741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cw1 f199742e;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var, r45.cw1 cw1Var) {
        this.f199741d = h3Var;
        this.f199742e = cw1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setFollowState$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var = this.f199741d;
        h3Var.getClass();
        r45.cw1 infoItem = this.f199742e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoItem, "infoItem");
        ya2.b2 b2Var = new ya2.b2();
        b2Var.f69328x21f9b213 = java.lang.String.valueOf(infoItem.m75945x2fec8307(1));
        b2Var.f69347xdec927b = java.lang.String.valueOf(infoItem.m75945x2fec8307(0));
        int m75939xb282bd08 = infoItem.m75939xb282bd08(5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = h3Var.f200046b;
        if (m75939xb282bd08 == 2) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Pj(ml2.a2.f408733g, true);
            zl2.r4.f555483a.R(h3Var.f200045a, lVar.S0(), b2Var.D0(), true, 5, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x2(h3Var));
        } else {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Pj(ml2.a2.f408733g, false);
            boolean f17 = hc2.s.f(b2Var);
            java.lang.String D0 = b2Var.D0();
            android.content.Context context = h3Var.f200045a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            long j17 = ((mm2.e1) lVar.P0(mm2.e1.class)).f410516m;
            dk2.xf W0 = lVar.W0();
            c61.yb.R8(ybVar, V6, D0, 1, j17, f17, null, W0 != null ? ((dk2.r4) W0).K(((mm2.e1) lVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)) : null, 10, 11, null, null, null, null, 7712, null);
        }
        boolean a17 = hc2.s.a(b2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h3Var.f200047c, "followBtn click, nickName:" + b2Var.w0() + ", isBlock" + a17);
        if (a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0) lVar : null;
            if (nd0Var != null) {
                nd0Var.v1(b2Var.D0());
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
        java.lang.String D02 = b2Var.D0();
        am.zd zdVar = c5560x6f070be.f135879g;
        zdVar.f90084a = D02;
        zdVar.f90085b = 4;
        zdVar.f90086c = true;
        c5560x6f070be.e();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setFollowState$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
