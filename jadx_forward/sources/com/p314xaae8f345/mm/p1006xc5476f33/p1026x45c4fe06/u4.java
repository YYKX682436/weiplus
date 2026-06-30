package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f170797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 f170798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af f170799f;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        this.f170799f = c11527x5889d9af;
        this.f170797d = c11510xdd90c2f2;
        this.f170798e = c11808xe47dc718;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af = this.f170799f;
        android.app.Activity w17 = c11527x5889d9af.w();
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.f172995u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1) w17.findViewById(com.p314xaae8f345.mm.R.id.a0o);
        if (h1Var != null) {
            h1Var.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718 = this.f170798e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f170797d;
        if (c11510xdd90c2f2 == null) {
            c11527x5889d9af.J(c11808xe47dc718.f158811d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 L = c11527x5889d9af.L(c11808xe47dc718.f158811d);
        if (L == null) {
            c11527x5889d9af.O(c11510xdd90c2f2, c11527x5889d9af.I(c11808xe47dc718), c11808xe47dc718);
        } else {
            c11527x5889d9af.N(c11510xdd90c2f2, L, c11808xe47dc718);
        }
    }
}
