package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3;

/* loaded from: classes14.dex */
public final class j extends com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f128496a;

    /* renamed from: b, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f128497b;

    /* renamed from: c, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b f128498c;

    /* renamed from: d, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener f128499d;

    /* renamed from: e, reason: collision with root package name */
    private final com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f128500e;

    /* renamed from: f, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f128501f;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType f128502g;

    /* renamed from: h, reason: collision with root package name */
    private android.view.TextureView f128503h;

    /* renamed from: i, reason: collision with root package name */
    private android.graphics.SurfaceTexture f128504i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f128505j;

    /* renamed from: k, reason: collision with root package name */
    private android.graphics.Matrix f128506k;

    /* renamed from: l, reason: collision with root package name */
    private android.graphics.SurfaceTexture f128507l;

    /* renamed from: m, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f128508m;

    /* renamed from: n, reason: collision with root package name */
    private final android.view.TextureView.SurfaceTextureListener f128509n;

    /* renamed from: com.tencent.liteav.videoconsumer.renderer.j$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 implements android.view.TextureView.SurfaceTextureListener {
        public AnonymousClass1() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128498c.a("surfaceCreate"), com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128496a, "onSurfaceTextureAvailable, size:" + i17 + "x" + i18 + " surfaceTexture:" + surfaceTexture + " mSavedSurfaceTexture:" + com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128504i, new java.lang.Object[0]);
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.b(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.a(surfaceTexture));
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar = com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this;
            jVar.b(jVar.f128503h);
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128508m.f14764x6be2dc6 = i17;
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128508m.f14763xb7389127 = i18;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128496a, "onSurfaceTextureDestroyed surface:" + surfaceTexture + " mTextureView:" + com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128503h);
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.a();
            if (com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128503h == null) {
                return true;
            }
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128504i = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128498c.a("surfaceSizeChanged"), com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128496a, "onSurfaceTextureSizeChanged, size: %dx%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.b(surfaceTexture);
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar = com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this;
            jVar.b(jVar.f128503h);
            if ((com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128508m.f14764x6be2dc6 > com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128508m.f14763xb7389127) != (i17 > i18)) {
                com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.h(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this);
            }
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128508m.f14764x6be2dc6 = i17;
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128508m.f14763xb7389127 = i18;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
            if (com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128505j) {
                return;
            }
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.k(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this);
            com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.this.f128497b.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.p.a(this));
        }
    }

    public j(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener) {
        java.lang.String str = "TextureViewRenderHelper_" + hashCode();
        this.f128496a = str;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f128497b = handlerC3775x958f0279;
        this.f128498c = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b();
        this.f128501f = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();
        this.f128502g = null;
        this.f128504i = null;
        this.f128505j = false;
        this.f128506k = new android.graphics.Matrix();
        this.f128508m = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();
        this.f128509n = new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.AnonymousClass1();
        this.f128499d = renderViewListener;
        this.f128500e = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(str, "txCloudVideoView is null.");
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(str, "construct,txCloudVideoView=".concat(java.lang.String.valueOf(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf)));
        android.view.TextureView textureView = new android.view.TextureView(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getContext());
        this.f128503h = textureView;
        handlerC3775x958f0279.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.k.a(this, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, textureView));
    }

    public static /* synthetic */ void h(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar) {
        android.view.TextureView textureView;
        android.graphics.Bitmap bitmap;
        if (jVar.f128499d == null || (textureView = jVar.f128503h) == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        jVar.f128499d.mo31295x842745c7(bitmap);
    }

    public static /* synthetic */ boolean k(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar) {
        jVar.f128505j = true;
        return true;
    }

    public static /* synthetic */ void m(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar) {
        android.view.TextureView textureView;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = jVar.f128500e;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null || (textureView = jVar.f128503h) == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3828x2b5173cf.m31246xbed28357(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, textureView);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: checkViewAvailability */
    public final void mo31303xf6cbedc8() {
        this.f128497b.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.n.a(this));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: getTransformMatrix */
    public final android.graphics.Matrix mo31304xb1778017(int i17, int i18) {
        android.graphics.Matrix matrix = new android.graphics.Matrix(this.f128506k);
        matrix.postScale(1.0f, -1.0f, i17 / 2.0f, i18 / 2.0f);
        return matrix;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: isUsingTextureView */
    public final boolean mo31305x1b7c0c86() {
        return true;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: release */
    public final void mo31306x41012807(boolean z17) {
        this.f128497b.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.m.a(this, z17));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: updateVideoFrameInfo */
    public final synchronized void mo31307xd2265aa9(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType, int i17, int i18, boolean z17) {
        if (this.f128502g == gLScaleType) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f128501f;
            if (i17 == c3779x275421.f14764x6be2dc6 && i18 == c3779x275421.f14763xb7389127) {
                return;
            }
        }
        this.f128502g = gLScaleType;
        this.f128501f.set(i17, i18);
        this.f128497b.m29527xc88bc38e(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.o.a(this));
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.view.TextureView textureView) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3828x2b5173cf.m31242xbb8aeee6(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, textureView);
        jVar.a(textureView);
    }

    public static /* synthetic */ void b(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar) {
        android.view.TextureView textureView = jVar.f128503h;
        if (textureView == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(jVar.f128496a, "view is not available when textureView is null");
            return;
        }
        if (textureView.isAvailable() && jVar.f128503h.getWidth() != 0 && jVar.f128503h.getHeight() != 0 && jVar.f128503h.isShown()) {
            return;
        }
        java.lang.String str = jVar.f128496a;
        android.view.TextureView textureView2 = jVar.f128503h;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(str, "%s is not available when surface available:%b, isShown:%b", textureView2, java.lang.Boolean.valueOf(textureView2.isAvailable()), java.lang.Boolean.valueOf(jVar.f128503h.isShown()));
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j jVar, boolean z17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(jVar.f128496a, "release,mTextureView=" + jVar.f128503h);
        if (jVar.f128503h == null) {
            return;
        }
        jVar.a();
        if (jVar.f128503h.getSurfaceTextureListener() == jVar.f128509n) {
            jVar.f128503h.setSurfaceTextureListener(null);
        }
        android.graphics.SurfaceTexture surfaceTexture = jVar.f128504i;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            jVar.f128504i = null;
        }
        if (jVar.f128500e != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(jVar.f128496a, "clearLastImage=" + z17 + ",mHasFirstFrameRendered=" + jVar.f128505j);
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3828x2b5173cf.m31247x417bc549(jVar.f128500e, jVar.f128503h, z17 | (jVar.f128505j ^ true));
        }
        jVar.f128503h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(android.view.TextureView textureView) {
        double d17;
        if (textureView == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(textureView.getWidth(), textureView.getHeight());
        if (this.f128501f.m29560x7b953cf2() && c3779x275421.m29560x7b953cf2()) {
            double m29554x41194293 = c3779x275421.m29554x41194293();
            double m29554x411942932 = this.f128501f.m29554x41194293();
            double d18 = 1.0d;
            if (m29554x411942932 < m29554x41194293) {
                com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType = this.f128502g;
                if (gLScaleType != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FIT_CENTER) {
                    if (gLScaleType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP) {
                        d17 = m29554x41194293 / m29554x411942932;
                    }
                    d17 = 1.0d;
                }
                double d19 = m29554x411942932 / m29554x41194293;
                d17 = 1.0d;
                d18 = d19;
            } else {
                com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType2 = this.f128502g;
                if (gLScaleType2 != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FIT_CENTER) {
                    if (gLScaleType2 == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP) {
                        double d192 = m29554x411942932 / m29554x41194293;
                        d17 = 1.0d;
                        d18 = d192;
                    }
                    d17 = 1.0d;
                }
                d17 = m29554x41194293 / m29554x411942932;
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale((float) d18, (float) d17, c3779x275421.f14764x6be2dc6 / 2.0f, c3779x275421.f14763xb7389127 / 2.0f);
            if (!matrix.equals(textureView.getTransform(new android.graphics.Matrix()))) {
                textureView.setTransform(matrix);
                textureView.postInvalidate();
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128498c.a("updateTextureViewMatrix"), this.f128496a, "view: %s, scaleX: %.2f, scaleY: %.2f, frame: %s, view: %s", textureView, java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d17), this.f128501f, c3779x275421);
            }
            this.f128506k = matrix;
        }
    }

    public j(android.view.TextureView textureView, com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener) {
        java.lang.String str = "TextureViewRenderHelper_" + hashCode();
        this.f128496a = str;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f128497b = handlerC3775x958f0279;
        this.f128498c = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b();
        this.f128501f = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();
        this.f128502g = null;
        this.f128504i = null;
        this.f128505j = false;
        this.f128506k = new android.graphics.Matrix();
        this.f128508m = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();
        this.f128509n = new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j.AnonymousClass1();
        this.f128499d = renderViewListener;
        this.f128500e = null;
        if (textureView == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(str, "textureView is null.");
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(str, "construct,textureView=".concat(java.lang.String.valueOf(textureView)));
        this.f128503h = textureView;
        handlerC3775x958f0279.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.l.a(this, textureView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.view.TextureView textureView) {
        if (textureView == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f128496a, "setup,textureView is null.");
            return;
        }
        if (textureView.isAvailable()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(textureView.getWidth(), textureView.getHeight());
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128496a, "setup,textureView=" + textureView + "," + c3779x275421);
            b(textureView.getSurfaceTexture());
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128496a, "setup,textureView not available.");
        }
        textureView.setSurfaceTextureListener(this.f128509n);
        b(textureView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.SurfaceTexture a(android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture surfaceTexture2 = this.f128504i;
        if (surfaceTexture2 != null && this.f128503h != null && !com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.h.a(surfaceTexture, surfaceTexture2)) {
            try {
                this.f128503h.setSurfaceTexture(this.f128504i);
                surfaceTexture = this.f128504i;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f128496a, "error setting saved SurfaceTexture.", th6);
            }
            this.f128504i = null;
        }
        return surfaceTexture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(android.graphics.SurfaceTexture surfaceTexture) {
        if (this.f128507l == surfaceTexture) {
            return;
        }
        this.f128507l = surfaceTexture;
        com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener = this.f128499d;
        if (renderViewListener != null) {
            renderViewListener.mo31296xd8f18906(new android.view.Surface(surfaceTexture), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f128507l = null;
        com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener = this.f128499d;
        if (renderViewListener != null) {
            renderViewListener.mo31297x9b9c64c();
        }
    }
}
