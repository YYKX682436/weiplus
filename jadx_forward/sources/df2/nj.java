package df2;

/* loaded from: classes3.dex */
public final class nj implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.oj f312395a;

    public nj(df2.oj ojVar) {
        this.f312395a = ojVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
            boolean m75933x41a8a7f2 = ((r45.ps1) fVar.f152151d).m75933x41a8a7f2(3);
            df2.oj ojVar = this.f312395a;
            java.lang.String str = ojVar.f312504m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click gameTeamInfo status:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(0)) : null);
            sb6.append(", in_teaming_up:");
            sb6.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(5)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (fr1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f312504m, "resp.game_team_info null");
            } else {
                ((mm2.c1) ojVar.m56788xbba4bfc0(mm2.c1.class)).Y8(fr1Var);
                ((mm2.c1) ojVar.m56788xbba4bfc0(mm2.c1.class)).o9(m75933x41a8a7f2);
            }
        }
        return jz5.f0.f384359a;
    }
}
