package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class x5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f201824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f201825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f201826c;

    public x5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var, boolean z17, boolean z18) {
        this.f201824a = d6Var;
        this.f201825b = z17;
        this.f201826c = z18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.y63 y63Var;
        r45.y63 y63Var2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f201824a;
        d6Var.f199605n = false;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.yq1 yq1Var = (r45.yq1) ((r45.ps1) fVar.f152151d).m75936x14adae67(2);
            d6Var.f199601j = yq1Var;
            d6Var.f199603l = (yq1Var == null || (y63Var2 = (r45.y63) yq1Var.m75936x14adae67(0)) == null) ? null : y63Var2.m75945x2fec8307(2);
            r45.yq1 yq1Var2 = d6Var.f199601j;
            d6Var.f199604m = (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.m75936x14adae67(0)) == null) ? false : y63Var.m75933x41a8a7f2(1);
            boolean z17 = this.f201826c;
            boolean z18 = this.f201825b;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.a(d6Var);
            } else if (z17) {
                d6Var.j();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.b(d6Var);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveGetGameTeamInfo hasContinue: ");
            sb6.append(d6Var.f199604m);
            sb6.append(", hasLastBuffer: ");
            sb6.append(d6Var.f199603l != null);
            sb6.append(", isLoadMore: ");
            sb6.append(z18);
            sb6.append(", isResume: ");
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d6Var.f199595d, sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
