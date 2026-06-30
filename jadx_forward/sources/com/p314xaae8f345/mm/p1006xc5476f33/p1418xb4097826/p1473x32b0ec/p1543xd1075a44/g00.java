package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class g00 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f199919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f199920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f199921c;

    public g00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var, int i17, r45.xq1 xq1Var) {
        this.f199919a = m10Var;
        this.f199920b = i17;
        this.f199921c = xq1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f199919a;
        m10Var.f200556y = false;
        int i17 = fVar.f152148a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = m10Var.f200534c;
            ((mm2.c1) lVar.P0(mm2.c1.class)).Y8(fr1Var);
            ((mm2.c1) lVar.P0(mm2.c1.class)).o9(((r45.ps1) fVar.f152151d).m75933x41a8a7f2(3));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click gameTeamInfo status:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(0)) : null);
            sb6.append(", in_teaming_up:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(5)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
            if (fr1Var != null) {
                int i18 = this.f199920b;
                if (i18 == 0) {
                    int m75939xb282bd08 = fr1Var.m75939xb282bd08(0);
                    if (m75939xb282bd08 == 1 || m75939xb282bd08 == 2) {
                        m10Var.u(this.f199921c, fr1Var);
                    }
                } else if (i18 == m10Var.K) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "update gameTeamInfo from show invite");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "resp.game_team_info null");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveVisitorGameTeamWidget", "ljd do CgiFinderLiveGetGameTeamInfo fail errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
