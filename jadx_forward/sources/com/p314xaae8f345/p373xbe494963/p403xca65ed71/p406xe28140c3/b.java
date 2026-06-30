package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.a f128475a;

    /* renamed from: b, reason: collision with root package name */
    private final android.view.Surface f128476b;

    private b(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.a aVar, android.view.Surface surface) {
        this.f128475a = aVar;
        this.f128476b = surface;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.a aVar, android.view.Surface surface) {
        return new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.b(aVar, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.a.a(this.f128475a, this.f128476b);
    }
}
