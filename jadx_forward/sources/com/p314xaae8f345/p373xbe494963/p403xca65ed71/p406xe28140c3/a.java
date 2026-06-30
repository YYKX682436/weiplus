package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3;

/* loaded from: classes14.dex */
public final class a extends com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f128471a;

    /* renamed from: b, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f128472b;

    /* renamed from: c, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener f128473c;

    /* renamed from: d, reason: collision with root package name */
    private android.view.Surface f128474d;

    public a(android.view.Surface surface, com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener) {
        java.lang.String str = "SurfaceRenderHelper_" + hashCode();
        this.f128471a = str;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f128472b = handlerC3775x958f0279;
        this.f128473c = renderViewListener;
        if (surface == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(str, "surface is null.");
        } else {
            this.f128474d = surface;
            handlerC3775x958f0279.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.b.a(this, surface));
        }
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.a aVar, android.view.Surface surface) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(aVar.f128471a, "construct,surface=".concat(java.lang.String.valueOf(surface)));
        com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener = aVar.f128473c;
        if (renderViewListener != null) {
            renderViewListener.mo31296xd8f18906(surface, false);
        }
    }

    public static /* synthetic */ void b(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.a aVar) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(aVar.f128471a, "release,mSurface=" + aVar.f128474d);
        if (aVar.f128474d == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener = aVar.f128473c;
        if (renderViewListener != null) {
            renderViewListener.mo31297x9b9c64c();
        }
        aVar.f128474d = null;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: checkViewAvailability */
    public final void mo31303xf6cbedc8() {
        this.f128472b.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.d.a(this));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: getTransformMatrix */
    public final android.graphics.Matrix mo31304xb1778017(int i17, int i18) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(1.0f, -1.0f, i17 / 2.0f, i18 / 2.0f);
        return matrix;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: isUsingTextureView */
    public final boolean mo31305x1b7c0c86() {
        return false;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: release */
    public final void mo31306x41012807(boolean z17) {
        this.f128472b.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.c.a(this));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: updateVideoFrameInfo */
    public final void mo31307xd2265aa9(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType, int i17, int i18, boolean z17) {
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.a aVar) {
        android.view.Surface surface = aVar.f128474d;
        if (surface == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(aVar.f128471a, "view is not available when surface is null");
        } else {
            if (surface.isValid()) {
                return;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(aVar.f128471a, "view is not available when %s is not valid", aVar.f128474d);
        }
    }
}
