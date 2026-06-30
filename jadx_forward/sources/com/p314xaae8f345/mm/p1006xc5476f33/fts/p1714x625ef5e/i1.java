package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class i1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f219095n;

    /* renamed from: o, reason: collision with root package name */
    public final int f219096o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219097p;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var, java.lang.String userName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f219097p = s1Var;
        this.f219095n = userName;
        this.f219096o = i17;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "InsertKefuContactTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f219095n;
        boolean p47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219097p;
        if (p47) {
            dm.u8 Di = ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Di);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1.k(s1Var, Di, this.f219096o);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1.j(s1Var, n17);
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "insert kefu contact " + this.f219095n;
    }
}
