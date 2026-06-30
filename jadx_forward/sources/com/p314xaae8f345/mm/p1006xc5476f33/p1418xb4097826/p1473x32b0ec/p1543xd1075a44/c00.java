package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class c00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f199463d;

    public c00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var) {
        this.f199463d = m10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        r45.z87 z87Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$checkGameInvitation$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Uj((ml2.r0) c17, 15, 0, null, null, 14, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f199463d;
        m10Var.C = -1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = m10Var.f200546o;
        if (y1Var != null) {
            y1Var.q();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var2 = this.f199463d;
        m10Var2.H = false;
        r45.xq1 xq1Var = ((mm2.c1) m10Var2.f200534c.P0(mm2.c1.class)).C2;
        r45.fr1 fr1Var = ((mm2.c1) this.f199463d.f200534c.P0(mm2.c1.class)).M2;
        if (xq1Var != null && fr1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var3 = this.f199463d;
            r45.xq1 xq1Var2 = ((mm2.c1) m10Var3.f200534c.P0(mm2.c1.class)).C2;
            r45.fr1 fr1Var2 = ((mm2.c1) m10Var3.f200534c.P0(mm2.c1.class)).M2;
            if (!((mm2.c1) m10Var3.f200534c.P0(mm2.c1.class)).T) {
                if (!(((mm2.n0) m10Var3.f200534c.P0(mm2.n0.class)).f410806r)) {
                    if (xq1Var2 != null && fr1Var2 != null) {
                        int m75939xb282bd08 = fr1Var2.m75939xb282bd08(0);
                        if (m75939xb282bd08 == 3 || ((mm2.c1) m10Var3.f200534c.P0(mm2.c1.class)).P2) {
                            db5.t7.i(m10Var3.f200532a.getContext(), m10Var3.f200532a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.czd), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
                        } else {
                            if (m75939xb282bd08 != 4) {
                                if (!(fr1Var2.m75939xb282bd08(5) == 0)) {
                                    m10Var3.I = true;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pz pzVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10.R;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = m10Var3.f200534c;
                                    android.content.Context context = m10Var3.f200532a.getContext();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                                    java.lang.String m75945x2fec83072 = fr1Var2.m75945x2fec8307(4);
                                    java.lang.String str = "";
                                    java.lang.String str2 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
                                    boolean a17 = pzVar.a(fr1Var2);
                                    if (!pzVar.a(fr1Var2) ? (m75945x2fec8307 = xq1Var2.m75945x2fec8307(3)) != null : (z87Var = (r45.z87) fr1Var2.m75936x14adae67(18)) != null && (m75945x2fec8307 = z87Var.m75945x2fec8307(4)) != null) {
                                        str = m75945x2fec8307;
                                    }
                                    android.content.Context context2 = m10Var3.f200532a.getContext();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                                    r45.yq1 yq1Var = ((mm2.c1) m10Var3.f200534c.P0(mm2.c1.class)).f410344g6;
                                    pzVar.b(lVar, context, xq1Var2, fr1Var2, str2, b3Var.g(a17, 6, str, context2, yq1Var != null ? yq1Var.m75939xb282bd08(5) : -1), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m00(m10Var3), ((mm2.c1) m10Var3.f200534c.P0(mm2.c1.class)).N2);
                                }
                            }
                            db5.t7.i(m10Var3.f200532a.getContext(), m10Var3.f200532a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cze), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
                        }
                    }
                }
            }
            db5.t7.i(m10Var3.f200532a.getContext(), m10Var3.f200532a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.czf), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
        } else if (fr1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveVisitorGameTeamWidget", "lastGameTeamInfo is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$checkGameInvitation$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
