package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class z4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 {

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f284119j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f284120k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f284121l;

    public z4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = str.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279943c)) {
            java.lang.String str2 = this.f279943c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            java.util.Locale locale2 = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale2, "getDefault(...)");
            java.lang.String lowerCase2 = str2.toLowerCase(locale2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
            if (r26.n0.B(lowerCase2, lowerCase, false)) {
                return true;
            }
        }
        return super.d(lowerCase);
    }
}
