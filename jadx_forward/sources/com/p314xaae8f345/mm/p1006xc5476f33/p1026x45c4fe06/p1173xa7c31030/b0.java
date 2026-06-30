package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f168863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.c0 f168864e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.c0 c0Var, long j17) {
        this.f168864e = c0Var;
        this.f168863d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.c0 c0Var = this.f168864e;
        java.lang.String str2 = c0Var.f168866a;
        c0Var.getClass();
        long j17 = this.f168863d;
        int i17 = j17 <= 60 ? 1 : (j17 <= 60 || j17 > 80) ? (j17 <= 80 || j17 > 100) ? (j17 <= 100 || j17 > 300) ? (j17 <= 300 || j17 > 600) ? (j17 <= 600 || j17 > 1000) ? 7 : 6 : 5 : 4 : 3 : 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(1246, i17);
        g0Var.A(1246, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = c0Var.f168867b;
        if (n7Var != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c0Var.f168868c)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = n7Var.mo32091x9a3f0ba2() != null ? n7Var.mo32091x9a3f0ba2().S2(false) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.b();
                if (S2 != null) {
                    c0Var.f168868c = S2.W0();
                }
            }
            if (c0Var.f168869d < 0) {
                int ordinal = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.l1.a(n7Var).ordinal();
                if (ordinal == 0) {
                    c0Var.f168869d = 2;
                } else if (ordinal == 1) {
                    c0Var.f168869d = 4;
                } else if (ordinal == 2) {
                    c0Var.f168869d = 3;
                } else if (ordinal != 3) {
                    c0Var.f168869d = -1;
                } else {
                    c0Var.f168869d = 5;
                }
            }
            if (c0Var.f168869d == 3) {
                c0Var.f168870e = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d() + "";
            }
        }
        if (n7Var == null || n7Var.mo32091x9a3f0ba2() == null) {
            str = "";
        } else {
            java.lang.String n07 = n7Var.mo32091x9a3f0ba2().n0();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str = fp.s0.a(n07 != null ? n07 : "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f169357a.b(18794, java.lang.String.format("%d,%s,%s,%s,%d,%s", java.lang.Long.valueOf(j17), str2, str, c0Var.f168868c, java.lang.Integer.valueOf(c0Var.f168869d), c0Var.f168870e));
    }
}
