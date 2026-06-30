package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes9.dex */
public class a2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final r45.lo0 f218983n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f218984o;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, r45.lo0 lo0Var) {
        this.f218984o = l2Var;
        this.f218983n = lo0Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "InsertVoiceTransTextTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str;
        r45.lo0 lo0Var = this.f218983n;
        java.lang.String a17 = o13.n.a(lo0Var.f461204f);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var = this.f218984o;
        if (K0) {
            l2Var.f219144m.a(lo0Var.f461202d);
            return true;
        }
        java.lang.String str2 = lo0Var.f461203e;
        if (lo0Var.f461206h == 1) {
            str = c01.z1.r();
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(lo0Var.f461203e, lo0Var.f461202d);
            if (f27 != null) {
                str = c01.w9.s(f27.j());
                java.lang.String str3 = lo0Var.f461203e;
                if (str == null) {
                    str = str3;
                }
            } else {
                str = lo0Var.f461203e;
            }
        } else {
            str = lo0Var.f461203e;
        }
        java.lang.String str4 = str;
        l2Var.f219142h.h();
        l2Var.f219142h.N(65536, 70, lo0Var.f461202d, str2, lo0Var.f461205g, a17, str4);
        l2Var.f219142h.j();
        l2Var.f219144m.a(lo0Var.f461202d);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        r45.lo0 lo0Var = this.f218983n;
        return java.lang.String.format("{msgId: %d, talker: %s}", java.lang.Long.valueOf(lo0Var.f461202d), lo0Var.f461203e);
    }
}
