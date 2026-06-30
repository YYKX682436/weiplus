package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class p8 extends m81.b {

    /* renamed from: q, reason: collision with root package name */
    public final int f157256q;

    /* renamed from: r, reason: collision with root package name */
    public final int f157257r;

    public p8(java.lang.String str, int i17, int i18, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va vaVar) {
        super(f(str, i17, i18), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.e(str) + java.lang.String.format(java.util.Locale.US, "_%s_%d_%d.wxapkg.diff", java.lang.Integer.valueOf(str.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), str2, str, i18, 0);
        this.f157256q = i17;
        this.f157257r = i18;
        "@LibraryAppId".equals(str);
    }

    public static java.lang.String f(java.lang.String str, int i17, int i18) {
        return java.lang.String.format(java.util.Locale.US, "WxaPkgDiff_%s_%d_%d", java.lang.Integer.valueOf(str.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // m81.b
    public java.util.List d() {
        return java.util.Arrays.asList(this.f271247c, g());
    }

    public java.lang.String g() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e9.f(this.f406221l, this.f157257r);
    }
}
