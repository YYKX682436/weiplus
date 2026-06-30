package com.p314xaae8f345.p373xbe494963.p395xfa2d52a5;

/* loaded from: classes15.dex */
final /* synthetic */ class i implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g f128094a;

    private i(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar) {
        this.f128094a = gVar;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar) {
        return new com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.i(gVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ScrollView scrollView = this.f128094a.f128082k;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }
}
