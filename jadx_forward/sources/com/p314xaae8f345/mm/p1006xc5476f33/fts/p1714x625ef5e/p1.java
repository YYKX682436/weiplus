package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class p1 implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219180d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var) {
        this.f219180d = s1Var;
    }

    @Override // l75.z0
    public final void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        o13.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219180d;
        if (s1Var.f423740d && (obj instanceof java.lang.String)) {
            java.lang.String str = (java.lang.String) obj;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str)) {
                if (i17 == 2) {
                    o13.y yVar2 = s1Var.f219197e;
                    if (yVar2 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar2).b(s1Var.f219199g + 1, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.i1(s1Var, str, s1Var.f219202m));
                        return;
                    }
                    return;
                }
                if (i17 != 3) {
                    if (i17 == 5 && (yVar = s1Var.f219197e) != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(s1Var.f219199g + 1, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.h1(s1Var, str));
                        return;
                    }
                    return;
                }
                o13.y yVar3 = s1Var.f219197e;
                if (yVar3 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar3).b(s1Var.f219199g + 1, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m1(s1Var, str));
                }
            }
        }
    }
}
