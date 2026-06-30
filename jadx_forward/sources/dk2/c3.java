package dk2;

/* loaded from: classes3.dex */
public final class c3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f314807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f314808b;

    public c3(dk2.r4 r4Var, r45.hc1 hc1Var) {
        this.f314807a = r4Var;
        this.f314808b = hc1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
            dk2.r4 r4Var = this.f314807a;
            ((mm2.c1) r4Var.m(mm2.c1.class)).f410344g6 = (r45.yq1) ((r45.ps1) fVar.f152151d).m75936x14adae67(2);
            ((mm2.c1) r4Var.m(mm2.c1.class)).Y8(fr1Var);
            mm2.c1 c1Var = (mm2.c1) r4Var.m(mm2.c1.class);
            r45.yq1 yq1Var = (r45.yq1) ((r45.ps1) fVar.f152151d).m75936x14adae67(2);
            c1Var.f410372l6 = yq1Var != null ? yq1Var.m75945x2fec8307(4) : null;
            r45.yq1 yq1Var2 = (r45.yq1) ((r45.ps1) fVar.f152151d).m75936x14adae67(2);
            gk2.e eVar = r4Var.f315540b;
            if (yq1Var2 != null) {
                mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("joinLive 3dInfo, uid: ");
                r45.rb rbVar = (r45.rb) yq1Var2.m75936x14adae67(6);
                sb6.append(rbVar != null ? rbVar.m75945x2fec8307(0) : null);
                sb6.append(", content: ");
                r45.rb rbVar2 = (r45.rb) yq1Var2.m75936x14adae67(6);
                sb6.append(rbVar2 != null ? rbVar2.m75945x2fec8307(1) : null);
                sb6.append(", is3DDirecting: ");
                sb6.append(yq1Var2.m75933x41a8a7f2(7));
                sb6.append(", is3DDirector: ");
                sb6.append(yq1Var2.m75933x41a8a7f2(8));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c1Var2.f410333f, sb6.toString());
                ((mm2.c1) c1Var2.m147920xbba4bfc0(mm2.c1.class)).Y2 = yq1Var2.m75933x41a8a7f2(7);
                ((mm2.c1) c1Var2.m147920xbba4bfc0(mm2.c1.class)).Z2 = yq1Var2.m75933x41a8a7f2(8);
                ((mm2.c1) c1Var2.m147920xbba4bfc0(mm2.c1.class)).f410309a3 = (r45.rb) yq1Var2.m75936x14adae67(6);
            }
            ((mm2.c1) eVar.a(mm2.c1.class)).X6(this.f314808b.m75939xb282bd08(47));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null && (c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class)) != null) {
                c4Var.F1();
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doCgiToRefresh gameTeamInfo status:");
            sb7.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(0)) : null);
            sb7.append(", in_teaming_up:");
            sb7.append(fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(5)) : null);
            sb7.append(", toast: ");
            r45.yq1 yq1Var3 = (r45.yq1) ((r45.ps1) fVar.f152151d).m75936x14adae67(2);
            sb7.append(yq1Var3 != null ? yq1Var3.m75945x2fec8307(4) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb7.toString());
        }
        return jz5.f0.f384359a;
    }
}
