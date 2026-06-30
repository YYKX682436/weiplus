package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class n6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 {

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f283905j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f283906k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f283907l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o6 f283908m;

    public n6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6 c6Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o6 o6Var) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
        this.f283908m = o6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (b(lowerCase)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f283906k) && this.f283906k.toLowerCase().contains(lowerCase)) {
                return true;
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f283906k) && c(lowerCase, this.f283906k.toLowerCase())) {
            return true;
        }
        return super.d(lowerCase);
    }
}
