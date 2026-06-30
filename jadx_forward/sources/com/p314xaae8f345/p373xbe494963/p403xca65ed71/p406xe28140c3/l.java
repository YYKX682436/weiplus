package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class l implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j f128514a;

    /* renamed from: b, reason: collision with root package name */
    private final android.view.TextureView f128515b;

    private l(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar, android.view.TextureView textureView) {
        this.f128514a = jVar;
        this.f128515b = textureView;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar, android.view.TextureView textureView) {
        return new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.l(jVar, textureView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f128514a.a(this.f128515b);
    }
}
