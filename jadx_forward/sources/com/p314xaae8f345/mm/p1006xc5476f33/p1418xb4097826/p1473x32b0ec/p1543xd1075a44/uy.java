package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class uy implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz f201546b;

    public uy(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar) {
        this.f201545a = context;
        this.f201546b = dzVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.q63 q63Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        android.content.Context context = this.f201545a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click gameTeamInfo status:");
            java.lang.Integer num = null;
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(0)) : null);
            sb6.append(", in_teaming_up:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(5)) : null);
            sb6.append(' ');
            if (fr1Var != null && (q63Var = (r45.q63) fr1Var.m75936x14adae67(7)) != null) {
                num = java.lang.Integer.valueOf(q63Var.m75939xb282bd08(4));
            }
            sb6.append(num);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", sb6.toString());
            if (fr1Var != null) {
                r45.q63 q63Var2 = (r45.q63) fr1Var.m75936x14adae67(7);
                if ((q63Var2 != null ? q63Var2.m75939xb282bd08(4) : 0) > 0) {
                    db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cza));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz.i(this.f201546b);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "resp.game_team_info null");
            }
        } else {
            db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgq), 0).show();
        }
        return jz5.f0.f384359a;
    }
}
