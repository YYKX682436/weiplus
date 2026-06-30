package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* loaded from: classes4.dex */
public class b0 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f158336d = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0.f158335p, "AppBrandBackgroundFetchDataToken")};

    public b0(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0.f158335p, "AppBrandBackgroundFetchDataToken", null);
    }

    public boolean P2(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str2 == null) {
            return true;
        }
        l75.f0 f0Var = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0();
            a0Var.f68528xdec927b = str;
            if (super.get(a0Var, dm.i4.f66875xa013b0d5)) {
                f0Var = a0Var;
            }
        }
        if (str2.isEmpty()) {
            if (f0Var == null) {
                return true;
            }
            return super.mo9951xb06685ab(f0Var, dm.i4.f66875xa013b0d5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0 a0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0();
        a0Var2.f68528xdec927b = str;
        a0Var2.f68527x29df9a74 = str2;
        return f0Var == null ? super.mo880xb970c2b9(a0Var2) : super.mo9952xce0038c9(a0Var2, dm.i4.f66875xa013b0d5);
    }

    public boolean d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0();
        a0Var.f68528xdec927b = str;
        return super.mo9951xb06685ab(a0Var, dm.i4.f66875xa013b0d5);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11728x88582d32 get(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.a0();
        a0Var.f68528xdec927b = str;
        if (!super.get(a0Var, dm.i4.f66875xa013b0d5)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11728x88582d32 c11728x88582d32 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11728x88582d32();
        c11728x88582d32.f158328d = a0Var.f68528xdec927b;
        c11728x88582d32.f158329e = a0Var.f68527x29df9a74;
        return c11728x88582d32;
    }
}
