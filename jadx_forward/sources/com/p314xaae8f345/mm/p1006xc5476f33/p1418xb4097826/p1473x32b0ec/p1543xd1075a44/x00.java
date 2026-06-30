package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class x00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f201806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f201807e;

    public x00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var, r45.fr1 fr1Var) {
        this.f201806d = m10Var;
        this.f201807e = fr1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.v63 v63Var;
        android.view.ViewGroup viewGroup;
        android.view.View view2;
        r45.v63 v63Var2;
        r45.v63 v63Var3;
        r45.v63 v63Var4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f201806d;
        m10Var.getClass();
        r45.fr1 fr1Var = this.f201807e;
        r45.q63 q63Var = (r45.q63) fr1Var.m75936x14adae67(7);
        if (q63Var != null && (v63Var = (r45.v63) q63Var.m75936x14adae67(10)) != null) {
            int i17 = 0;
            if (v63Var.m75945x2fec8307(0) != null) {
                l81.b1 b1Var = new l81.b1();
                r45.q63 q63Var2 = (r45.q63) fr1Var.m75936x14adae67(7);
                java.lang.String str = null;
                b1Var.f398547b = (q63Var2 == null || (v63Var4 = (r45.v63) q63Var2.m75936x14adae67(10)) == null) ? null : v63Var4.m75945x2fec8307(0);
                r45.q63 q63Var3 = (r45.q63) fr1Var.m75936x14adae67(7);
                if (q63Var3 != null && (v63Var3 = (r45.v63) q63Var3.m75936x14adae67(10)) != null) {
                    i17 = v63Var3.m75939xb282bd08(2);
                }
                b1Var.f398549c = i17;
                zl2.r4 r4Var = zl2.r4.f555483a;
                if (r4Var.t0() != 0) {
                    b1Var.f398549c = r4Var.t0();
                }
                r45.q63 q63Var4 = (r45.q63) fr1Var.m75936x14adae67(7);
                if (q63Var4 != null && (v63Var2 = (r45.v63) q63Var4.m75936x14adae67(10)) != null) {
                    str = v63Var2.m75945x2fec8307(1);
                }
                b1Var.f398555f = str;
                b1Var.f398565k = 1205;
                b1Var.f398561i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n00(fr1Var);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = m10Var.f200546o;
                int i18 = -1;
                int height = (y1Var == null || (view2 = y1Var.f293560f) == null) ? -1 : view2.getHeight();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = m10Var.f200546o;
                if (y1Var2 != null && (viewGroup = y1Var2.B) != null) {
                    i18 = viewGroup.getWidth();
                }
                int i19 = i18;
                k91.s2 s2Var = k91.s2.f387294e;
                android.view.ViewGroup viewGroup2 = m10Var.f200532a;
                b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, height, s2Var, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(i65.a.f(viewGroup2.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), true, true, false, false, 24, null), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(viewGroup2.getContext().getClass().getName(), m10Var.f200534c.x0() ? s2Var : k91.s2.f387293d), k91.t2.f387301f, false, false, null, k91.y2.f387361e, false, true, null, false, 0, null, 0, height, i19, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -9976800, 2047, null);
                b1Var.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h00(m10Var);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(viewGroup2.getContext(), b1Var);
                m10Var.N = b1Var;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
