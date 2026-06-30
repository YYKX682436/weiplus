package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class r00 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f201098a;

    public r00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var) {
        this.f201098a = m10Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.q63 q63Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f201098a;
            boolean z17 = ((mm2.c1) m10Var.f200534c.P0(mm2.c1.class)).P2;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume ");
            sb6.append(z17);
            sb6.append(' ');
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
            if (fr1Var == null) {
                fr1Var = new r45.fr1();
            }
            sb6.append(pm0.b0.g(fr1Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
            r45.fr1 fr1Var2 = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
            if (fr1Var2 != null && (q63Var = (r45.q63) fr1Var2.m75936x14adae67(7)) != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(q63Var.m75945x2fec8307(1), m10Var.L) && q63Var.m75939xb282bd08(2) > 0 && q63Var.m75939xb282bd08(3) == 0 && z17) {
                android.view.ViewGroup viewGroup = m10Var.f200532a;
                db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.czb));
            }
            m10Var.L = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveVisitorGameTeamWidget", "CgiFinderLiveGetGameTeamInfo failed " + fVar.f152149b + ' ' + fVar.f152148a);
        }
        return jz5.f0.f384359a;
    }
}
