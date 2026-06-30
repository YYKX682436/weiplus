package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class y10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 f201934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.p f201935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f201936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var, cm2.p pVar, int i17) {
        super(1);
        this.f201934d = z10Var;
        this.f201935e = pVar;
        this.f201936f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if ((fVar != null && fVar.f152148a == 0) && fVar.f152149b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
            if (fr1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var = this.f201934d;
                ((mm2.c1) z10Var.f202027c.P0(mm2.c1.class)).Y8(fr1Var);
                ((mm2.c1) z10Var.f202027c.P0(mm2.c1.class)).o9(((r45.ps1) fVar.f152151d).m75933x41a8a7f2(3));
                this.f201935e.f124910h = fr1Var;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = z10Var.f202040p;
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8147xed6e4d18(this.f201936f);
                }
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh gameteam fail: ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(' ');
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
