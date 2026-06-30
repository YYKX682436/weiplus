package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class d00 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f199568a;

    public d00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var) {
        this.f199568a = m10Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f199568a;
        m10Var.P = false;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
            boolean m75933x41a8a7f2 = ((r45.ps1) fVar.f152151d).m75933x41a8a7f2(3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = m10Var.f200534c;
            ((mm2.c1) lVar.P0(mm2.c1.class)).Y8(fr1Var);
            ((mm2.c1) lVar.P0(mm2.c1.class)).o9(m75933x41a8a7f2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click gameTeamInfo status:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(0)) : null);
            sb6.append(", in_teaming_up:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(5)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
            if (fr1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10.a(m10Var, fr1Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "resp.game_team_info null");
            }
        } else {
            android.view.ViewGroup viewGroup = m10Var.f200532a;
            db5.t7.m123883x26a183b(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgq), 0).show();
        }
        return jz5.f0.f384359a;
    }
}
