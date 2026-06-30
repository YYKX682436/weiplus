package com.p314xaae8f345.p373xbe494963.p395xfa2d52a5;

/* loaded from: classes15.dex */
final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 f128069a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f128070b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f128071c;

    private f(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, java.lang.String str, java.lang.String str2) {
        this.f128069a = c3803x932db299;
        this.f128070b = str;
        this.f128071c = str2;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.f(c3803x932db299, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f128069a.m30218x177e8ea7(this.f128070b, this.f128071c);
    }
}
