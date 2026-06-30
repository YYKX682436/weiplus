package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface */
/* loaded from: classes14.dex */
public abstract class AbstractC3834x307e6230 {
    private static final java.lang.String TAG = "RenderViewHelperInterface";

    /* renamed from: com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128470a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.m31231xcee59d22().length];
            f128470a = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.SURFACEVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128470a[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TEXTUREVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128470a[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.SURFACE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f128470a[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TXCLOUDVIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface$RenderViewListener */
    /* loaded from: classes14.dex */
    public interface RenderViewListener {
        /* renamed from: onRequestRedraw */
        void mo31295x842745c7(android.graphics.Bitmap bitmap);

        /* renamed from: onSurfaceChanged */
        void mo31296xd8f18906(android.view.Surface surface, boolean z17);

        /* renamed from: onSurfaceDestroy */
        void mo31297x9b9c64c();
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230 m31299xaf65a0fc(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3, com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener) {
        android.view.Surface surface;
        android.view.TextureView textureView;
        android.view.SurfaceView m31219x8638c3bc;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        if (c3826xc46e8cd3 == null || c3826xc46e8cd3.m31222xfb85f7b0() == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "displayTarget or type is null. displayTarget=".concat(java.lang.String.valueOf(c3826xc46e8cd3)));
            return null;
        }
        int i17 = com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.AnonymousClass1.f128470a[c3826xc46e8cd3.m31222xfb85f7b0().ordinal()];
        if (i17 == 1) {
            surface = null;
            textureView = null;
            m31219x8638c3bc = c3826xc46e8cd3.m31219x8638c3bc();
            scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = null;
        } else if (i17 != 2) {
            if (i17 == 3) {
                surface = c3826xc46e8cd3.m31218xcf572877();
                scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = null;
            } else if (i17 != 4) {
                surface = null;
                scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = null;
            } else {
                com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf m31220x13d2be05 = c3826xc46e8cd3.m31220x13d2be05();
                if (m31220x13d2be05 == null) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "txCloudVideoView is null.");
                    m31219x8638c3bc = null;
                    textureView = null;
                    scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = m31220x13d2be05;
                    surface = null;
                } else {
                    android.view.SurfaceView mo46535x8638c3bc = m31220x13d2be05.mo46535x8638c3bc();
                    textureView = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3828x2b5173cf.m31245xc29e49ba(m31220x13d2be05);
                    m31219x8638c3bc = mo46535x8638c3bc;
                    scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = m31220x13d2be05;
                    surface = null;
                }
            }
            m31219x8638c3bc = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
            textureView = m31219x8638c3bc;
        } else {
            surface = null;
            scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = null;
            textureView = c3826xc46e8cd3.m31221x3a06c52a();
            m31219x8638c3bc = null;
        }
        if (m31219x8638c3bc != null) {
            return new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e(m31219x8638c3bc, renderViewListener);
        }
        if (textureView != null) {
            return new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j(textureView, renderViewListener);
        }
        if (surface != null) {
            return new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.a(surface, renderViewListener);
        }
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            return new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.j(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, renderViewListener);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "RenderViewHelper not created. displayTarget=".concat(java.lang.String.valueOf(c3826xc46e8cd3)));
        return null;
    }

    /* renamed from: createScaleType */
    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType m31300x38bd3208(int i17) {
        return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.a(i17);
    }

    /* renamed from: releaseSurface */
    public static void m31301xc6cc96a6(android.view.Surface surface) {
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: setBackgroundColor */
    public static void m31302x67f06213(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3, int i17) {
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf m31220x13d2be05;
        if (c3826xc46e8cd3 == null || c3826xc46e8cd3.m31222xfb85f7b0() == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "displayTarget or type is null. displayTarget=".concat(java.lang.String.valueOf(c3826xc46e8cd3)));
        } else if (com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.AnonymousClass1.f128470a[c3826xc46e8cd3.m31222xfb85f7b0().ordinal()] == 4 && (m31220x13d2be05 = c3826xc46e8cd3.m31220x13d2be05()) != null) {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3828x2b5173cf.m31249xb5d57d8(m31220x13d2be05, i17);
        }
    }

    /* renamed from: checkViewAvailability */
    public abstract void mo31303xf6cbedc8();

    /* renamed from: getTransformMatrix */
    public abstract android.graphics.Matrix mo31304xb1778017(int i17, int i18);

    /* renamed from: isUsingTextureView */
    public abstract boolean mo31305x1b7c0c86();

    /* renamed from: release */
    public abstract void mo31306x41012807(boolean z17);

    /* renamed from: updateVideoFrameInfo */
    public abstract void mo31307xd2265aa9(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType, int i17, int i18, boolean z17);
}
