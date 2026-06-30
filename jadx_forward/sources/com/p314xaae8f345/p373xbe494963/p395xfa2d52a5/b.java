package com.p314xaae8f345.p373xbe494963.p395xfa2d52a5;

/* loaded from: classes15.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 f128061a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f128062b;

    private b(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, java.lang.String str) {
        this.f128061a = c3803x932db299;
        this.f128062b = str;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, java.lang.String str) {
        return new com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.b(c3803x932db299, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f128061a.m30217xd10c3ed0(this.f128062b);
    }
}
