package com.p314xaae8f345.p373xbe494963.p395xfa2d52a5;

/* loaded from: classes15.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 f128063a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f128064b;

    private c(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, java.lang.String str) {
        this.f128063a = c3803x932db299;
        this.f128064b = str;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, java.lang.String str) {
        return new com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.c(c3803x932db299, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f128063a.m30228x306c214d(this.f128064b);
    }
}
