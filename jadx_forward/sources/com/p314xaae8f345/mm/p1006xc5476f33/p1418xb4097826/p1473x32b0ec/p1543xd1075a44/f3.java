package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cw1 f199837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 f199838e;

    public f3(r45.cw1 cw1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var) {
        this.f199837d = cw1Var;
        this.f199838e = h3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.c4 c4Var = ml2.c4.f408867f;
        r45.cw1 infoItem = this.f199837d;
        r0Var.pj(c4Var, infoItem.m75939xb282bd08(5), infoItem.m75945x2fec8307(0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var = this.f199838e;
        h3Var.f200051g.h();
        h3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoItem, "infoItem");
        java.lang.String m75945x2fec8307 = infoItem.m75945x2fec8307(0);
        r45.cw1 cw1Var = h3Var.f200048d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, cw1Var != null ? cw1Var.m75945x2fec8307(0) : null);
        dk2.q4 q4Var = dk2.q4.f315471a;
        android.content.Context context = h3Var.f200045a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = h3Var.f200046b;
        if (b17) {
            if (infoItem.m75939xb282bd08(5) == 2) {
                java.lang.String m75945x2fec83072 = infoItem.m75945x2fec8307(0);
                if (m75945x2fec83072 != null) {
                    zl2.q4.f555466a.G(m75945x2fec83072, ((mm2.c1) lVar.P0(mm2.c1.class)).f410385o, h3Var.f200045a, ((mm2.c1) lVar.P0(mm2.c1.class)).f410394p2, java.lang.String.valueOf(((mm2.e1) lVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)), 4);
                }
            } else {
                android.content.Context context2 = h3Var.f200045a;
                gk2.e S0 = lVar.S0();
                java.lang.String str = ((mm2.c1) lVar.P0(mm2.c1.class)).f410385o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                dk2.q4.j(q4Var, context2, S0, true, str, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6(), true, null, 64, null);
            }
        } else if (infoItem.m75939xb282bd08(5) == 2) {
            java.lang.String m75945x2fec83073 = infoItem.m75945x2fec8307(0);
            if (m75945x2fec83073 != null) {
                zl2.q4.f555466a.G(m75945x2fec83073, "", h3Var.f200045a, ((mm2.c1) lVar.P0(mm2.c1.class)).f410394p2, java.lang.String.valueOf(((mm2.e1) lVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)), 4);
            }
        } else {
            java.lang.String m75945x2fec83074 = infoItem.m75945x2fec8307(0);
            if (m75945x2fec83074 != null) {
                android.content.Context context3 = h3Var.f200045a;
                gk2.e S02 = lVar.S0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                dk2.q4.j(q4Var, context3, S02, false, m75945x2fec83074, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6(), true, null, 64, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
