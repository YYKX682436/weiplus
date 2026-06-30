package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class h1 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.h1 f159295b;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 f159296a;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.h1 a() {
        if (f159295b == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.h1.class) {
                if (f159295b == null) {
                    f159295b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.h1();
                }
            }
        }
        return f159295b;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 b(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var;
        if (yVar == null || yVar.t3() == null) {
            return null;
        }
        if (yVar.t3().A) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var = this.f159296a;
            if (g1Var != null && (a1Var = g1Var.f159283d) != null) {
                a1Var.b(yVar, yVar.t3().u0().F);
                this.f159296a.f159283d.f159155x = yVar.t3().u0().H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var2 = this.f159296a;
                g1Var2.S(g1Var2.f159283d, true, true);
                yVar.t3().A = false;
                return this.f159296a;
            }
            yVar.t3().A = false;
        }
        this.f159296a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1();
        a1Var2.b(yVar, yVar.t3().u0().F);
        a1Var2.f159155x = yVar.t3().u0().H;
        this.f159296a.S(a1Var2, false, true);
        return this.f159296a;
    }
}
