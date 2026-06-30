package com.p314xaae8f345.p373xbe494963.p395xfa2d52a5;

/* loaded from: classes15.dex */
final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 f128059a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f128060b;

    private a(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, boolean z17) {
        this.f128059a = c3803x932db299;
        this.f128060b = z17;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299, boolean z17) {
        return new com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.a(c3803x932db299, z17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f128059a.m30230x3c555ff4(this.f128060b);
    }
}
