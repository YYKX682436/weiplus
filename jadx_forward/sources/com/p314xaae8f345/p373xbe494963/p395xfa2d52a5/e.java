package com.p314xaae8f345.p373xbe494963.p395xfa2d52a5;

/* loaded from: classes15.dex */
final /* synthetic */ class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 f128066a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f128067b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f128068c;

    private e(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, java.lang.String str, java.lang.String str2) {
        this.f128066a = c3803x932db299;
        this.f128067b = str;
        this.f128068c = str2;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.e(c3803x932db299, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f128066a.m30229x8a81dd1(this.f128067b, this.f128068c);
    }
}
