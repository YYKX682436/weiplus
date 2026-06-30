package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class b4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 {

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f283660j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f283661k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f283662l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f283663m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f283664n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f283665o;

    public b4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0
    public int a() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (b(lowerCase)) {
            if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f283661k) && this.f283661k.toLowerCase().contains(lowerCase)) || (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f283665o) && this.f283665o.toLowerCase().contains(lowerCase))) {
                return true;
            }
        } else if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f283661k) && c(lowerCase, this.f283661k.toLowerCase())) || (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f283665o) && c(lowerCase, this.f283665o.toLowerCase()))) {
            return true;
        }
        return super.d(lowerCase);
    }
}
