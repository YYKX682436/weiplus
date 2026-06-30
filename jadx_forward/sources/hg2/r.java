package hg2;

/* loaded from: classes3.dex */
public final class r implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.vf f362921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f362922c;

    public r(android.content.Context context, dk2.vf vfVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        this.f362920a = context;
        this.f362921b = vfVar;
        this.f362922c = k0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        r45.ce0 ce0Var;
        java.lang.String m75945x2fec8307;
        r45.ce0 ce0Var2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        hg2.q qVar = new hg2.q(this.f362921b);
        l81.b1 b1Var = new l81.b1();
        r45.y23 y23Var = (r45.y23) ((r45.bv1) fVar.f152151d).m75936x14adae67(3);
        java.lang.String str2 = "";
        if (y23Var == null || (ce0Var2 = (r45.ce0) y23Var.m75936x14adae67(9)) == null || (str = ce0Var2.m75945x2fec8307(0)) == null) {
            str = "";
        }
        b1Var.f398547b = str;
        r45.y23 y23Var2 = (r45.y23) ((r45.bv1) fVar.f152151d).m75936x14adae67(3);
        if (y23Var2 != null && (ce0Var = (r45.ce0) y23Var2.m75936x14adae67(9)) != null && (m75945x2fec8307 = ce0Var.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        b1Var.f398555f = str2;
        b1Var.f398565k = 1205;
        b1Var.f398549c = zl2.q4.f555466a.x();
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        b1Var.H = k91.z3.TRANSPARENT;
        java.lang.String appId = b1Var.f398547b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        b1Var.f398570o = new st2.h2(this.f362922c, appId);
        b1Var.f398561i = qVar;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f362920a, b1Var);
        return jz5.f0.f384359a;
    }
}
