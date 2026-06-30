package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class n1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f219171n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219172o;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var) {
        this.f219172o = s1Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "UpdateKefuContactTask";
    }

    @Override // p13.c
    public boolean i() {
        o13.v fj6;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219172o;
        for (java.lang.String str : new java.util.HashSet(s1Var.f219200h)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            s1Var.getClass();
            o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
            long b17 = (zVar == null || (fj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) zVar).fj()) == null) ? 0L : ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) fj6).b(str);
            w13.g gVar = s1Var.f219198f;
            if (gVar != null) {
                gVar.M(str, b17);
            }
            s1Var.f219200h.remove(str);
            this.f219171n++;
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "update kefu contact count: " + this.f219171n;
    }
}
