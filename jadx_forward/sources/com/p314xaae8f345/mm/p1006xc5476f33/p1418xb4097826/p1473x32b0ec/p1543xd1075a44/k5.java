package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class k5 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l5 f200348d;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l5 l5Var) {
        this.f200348d = l5Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l5 l5Var = this.f200348d;
        boolean z17 = ((mm2.c1) l5Var.f200433f.S0().a(mm2.c1.class)).A7() == null;
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = l5Var.f200431d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        boolean Y1 = r4Var.Y1(context);
        boolean z18 = (z17 || ((java.lang.Number) ae2.in.f85359n7.r()).intValue() == 2 || !Y1) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = l5Var.f200433f;
        r45.xq1 xq1Var = ((mm2.c1) lVar.S0().a(mm2.c1.class)).C2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gameInfo is not null: ");
        sb6.append(xq1Var != null);
        sb6.append(", setting: ");
        sb6.append(xq1Var != null ? java.lang.Integer.valueOf(xq1Var.m75939xb282bd08(1)) : null);
        sb6.append(", canshow: ");
        sb6.append(bool);
        sb6.append(", isLandScapeOpenLiteapp: ");
        sb6.append(z18);
        sb6.append(", isPlayTogetherJumpInfoNull:");
        sb6.append(z17);
        sb6.append(", isLandScape:");
        sb6.append(Y1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l5Var.f200434g, sb6.toString());
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) || z18) {
            l5Var.f200438n = false;
            qo0.c.a(l5Var.f200432e, qo0.b.A2, null, 2, null);
        } else {
            l5Var.f200438n = true;
        }
        if (l5Var.f200439o != l5Var.f200438n) {
            jf2.u uVar = (jf2.u) lVar.U0(jf2.u.class);
            if (uVar != null) {
                jf2.u.a7(uVar, "canShowPlayTogetherEntracne", false, 2, null);
            }
            l5Var.f200439o = l5Var.f200438n;
        }
    }
}
