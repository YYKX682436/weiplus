package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes4.dex */
public final class d1 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f157943e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b.f157920r, "AppBrandAppLaunchUsernameDuplicateRecord2")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f157944d;

    public d1(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b.f157920r, "AppBrandAppLaunchUsernameDuplicateRecord2", dm.s.f321283h);
        this.f157944d = k0Var;
    }

    public final boolean D0(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b();
        bVar.f68233x483b1229 = str.hashCode();
        bVar.f68232xdec927b = str;
        boolean z17 = get(bVar, new java.lang.String[0]);
        bVar.f68231xa783a79b = j17;
        return z17 ? mo9952xce0038c9(bVar, new java.lang.String[0]) : mo880xb970c2b9(bVar);
    }

    public boolean y0(java.lang.String str) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b();
        bVar.f68233x483b1229 = str.hashCode();
        if (!get(bVar, "usernameHash") || (str2 = bVar.f68232xdec927b) == null || !str2.equals(str)) {
            bVar = null;
        }
        return bVar != null && bVar.f68231xa783a79b > 0;
    }

    public boolean z0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b();
        bVar.f68232xdec927b = str;
        bVar.f68233x483b1229 = str.hashCode();
        return super.mo9951xb06685ab(bVar, "usernameHash");
    }
}
