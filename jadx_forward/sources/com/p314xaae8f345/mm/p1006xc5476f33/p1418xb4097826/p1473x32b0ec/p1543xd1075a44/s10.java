package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class s10 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 f201230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f201231b;

    public s10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var, yz5.a aVar) {
        this.f201230a = z10Var;
        this.f201231b = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.y63 y63Var;
        r45.y63 y63Var2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var = this.f201230a;
        z10Var.f202039o = false;
        int i17 = fVar.f152148a;
        yz5.a aVar = this.f201231b;
        if (i17 == 0 && fVar.f152149b == 0) {
            z10Var.f202042r = (r45.yq1) ((r45.ps1) fVar.f152151d).m75936x14adae67(2);
            z10Var.f202043s = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
            ((mm2.c1) z10Var.f202027c.P0(mm2.c1.class)).Y8(z10Var.f202043s);
            r45.yq1 yq1Var = (r45.yq1) ((r45.ps1) fVar.f152151d).m75936x14adae67(2);
            z10Var.f202038n = (yq1Var == null || (y63Var2 = (r45.y63) yq1Var.m75936x14adae67(0)) == null) ? false : y63Var2.m75933x41a8a7f2(1);
            r45.yq1 yq1Var2 = (r45.yq1) ((r45.ps1) fVar.f152151d).m75936x14adae67(2);
            z10Var.f202037m = (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.m75936x14adae67(0)) == null) ? null : y63Var.m75945x2fec8307(2);
            aVar.mo152xb9724478();
        } else {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
