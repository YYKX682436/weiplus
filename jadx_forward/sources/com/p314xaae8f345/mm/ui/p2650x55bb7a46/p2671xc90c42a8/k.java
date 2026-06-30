package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class k extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 {

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f283823j;

    /* renamed from: k, reason: collision with root package name */
    public final ot0.q f283824k;

    /* renamed from: l, reason: collision with root package name */
    public final long f283825l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f283826m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f283827n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f283828o;

    public k(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, ot0.q qVar, long j19, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
        this.f283823j = str6;
        this.f283824k = qVar;
        this.f283825l = j19;
        this.f283826m = str7;
        this.f283827n = str8;
        this.f283828o = str9;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0
    public int a() {
        return 33;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        boolean b17 = b(lowerCase);
        java.lang.String str2 = this.f283826m;
        if (b17) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str2.toLowerCase().contains(lowerCase)) {
                return true;
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && c(lowerCase, str2.toLowerCase())) {
            return true;
        }
        return super.d(lowerCase);
    }
}
