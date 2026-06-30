package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.videobase.DisplayTarget */
/* loaded from: classes14.dex */
public class C3826xc46e8cd3 {
    private static final java.lang.String TAG = "DisplayTarget";

    /* renamed from: _hellAccFlag_ */
    private byte f14985x7f11beae;

    /* renamed from: mIsViewFromTXCloudVideoView */
    private boolean f14986xe5d5a35;

    /* renamed from: mSurface */
    private android.view.Surface f14987x2fa29f80;

    /* renamed from: mSurfaceView */
    private java.lang.ref.WeakReference<android.view.SurfaceView> f14988x566f8e45;

    /* renamed from: mTargetType */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a f14989xf9333cb8;

    /* renamed from: mTextureView */
    private java.lang.ref.WeakReference<android.view.TextureView> f14990xa3d8fb3;

    /* renamed from: mTxCloudVideoView */
    private java.lang.ref.WeakReference<com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf> f14991xcd7f693c;

    /* renamed from: mUIHandler */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f14992x69b7c049;

    /* renamed from: com.tencent.liteav.videobase.videobase.DisplayTarget$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128359a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.m31231xcee59d22().length];
            f128359a = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.SURFACEVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128359a[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TEXTUREVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128359a[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.SURFACE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f128359a[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TXCLOUDVIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.tencent.liteav.videobase.videobase.DisplayTarget$a */
    /* loaded from: classes14.dex */
    public enum a {
        TEXTUREVIEW,
        SURFACEVIEW,
        SURFACE,
        TXCLOUDVIEW
    }

    public C3826xc46e8cd3(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3) {
        this.f14992x69b7c049 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f14986xe5d5a35 = false;
        this.f14989xf9333cb8 = c3826xc46e8cd3.f14989xf9333cb8;
        this.f14991xcd7f693c = c3826xc46e8cd3.f14991xcd7f693c;
        this.f14990xa3d8fb3 = c3826xc46e8cd3.f14990xa3d8fb3;
        this.f14988x566f8e45 = c3826xc46e8cd3.f14988x566f8e45;
        this.f14987x2fa29f80 = c3826xc46e8cd3.f14987x2fa29f80;
        this.f14986xe5d5a35 = c3826xc46e8cd3.f14986xe5d5a35;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 m31211xaf65a0fc(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3) {
            return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3) obj);
        }
        if (obj instanceof com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
            return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) obj);
        }
        if (obj instanceof android.view.TextureView) {
            return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((android.view.TextureView) obj);
        }
        if (obj instanceof android.view.SurfaceView) {
            return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((android.view.SurfaceView) obj);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "object is unknown. object=".concat(java.lang.String.valueOf(obj)));
        return null;
    }

    /* renamed from: lambda$setVisibility$0 */
    public static void m31212xea4391c3(android.view.View view, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/liteav/videobase/videobase/DisplayTarget", "lambda$setVisibility$0", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/liteav/videobase/videobase/DisplayTarget", "lambda$setVisibility$0", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: requestLayout */
    private void m31213x46ac7299(android.view.View view) {
        if (view == null) {
            return;
        }
        m31214xf590a988(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.b.a(view));
    }

    /* renamed from: runOnUIThread */
    private void m31214xf590a988(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == this.f14992x69b7c049.getLooper()) {
            runnable.run();
        } else {
            this.f14992x69b7c049.post(runnable);
        }
    }

    /* renamed from: setVisibility */
    private void m31215x901b6914(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        m31214xf590a988(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.a.a(view, i17));
    }

    /* renamed from: equals */
    public boolean m31216xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3 = (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3) obj;
            if (this.f14989xf9333cb8 == c3826xc46e8cd3.f14989xf9333cb8 && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(m31220x13d2be05(), c3826xc46e8cd3.m31220x13d2be05()) && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(m31221x3a06c52a(), c3826xc46e8cd3.m31221x3a06c52a()) && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(m31219x8638c3bc(), c3826xc46e8cd3.m31219x8638c3bc()) && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(this.f14987x2fa29f80, c3826xc46e8cd3.f14987x2fa29f80)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getSize */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 m31217xfb854877() {
        java.lang.ref.WeakReference<com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf> weakReference;
        java.lang.ref.WeakReference<android.view.TextureView> weakReference2;
        int i17;
        int i18;
        java.lang.ref.WeakReference<android.view.SurfaceView> weakReference3;
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a aVar = this.f14989xf9333cb8;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = (aVar != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.SURFACEVIEW || (weakReference3 = this.f14988x566f8e45) == null) ? (aVar != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TEXTUREVIEW || (weakReference2 = this.f14990xa3d8fb3) == null) ? (aVar != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TXCLOUDVIEW || (weakReference = this.f14991xcd7f693c) == null) ? null : weakReference.get() : weakReference2.get() : weakReference3.get();
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            i17 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getWidth();
            i18 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(i17, i18);
    }

    /* renamed from: getSurface */
    public android.view.Surface m31218xcf572877() {
        return this.f14987x2fa29f80;
    }

    /* renamed from: getSurfaceView */
    public android.view.SurfaceView m31219x8638c3bc() {
        java.lang.ref.WeakReference<android.view.SurfaceView> weakReference = this.f14988x566f8e45;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: getTXCloudVideoView */
    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf m31220x13d2be05() {
        java.lang.ref.WeakReference<com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf> weakReference = this.f14991xcd7f693c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: getTextureView */
    public android.view.TextureView m31221x3a06c52a() {
        java.lang.ref.WeakReference<android.view.TextureView> weakReference = this.f14990xa3d8fb3;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: getType */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a m31222xfb85f7b0() {
        return this.f14989xf9333cb8;
    }

    /* renamed from: hideAll */
    public void m31223x366504ff() {
        if (this.f14986xe5d5a35) {
            return;
        }
        m31215x901b6914(m31221x3a06c52a(), 8);
        m31215x901b6914(m31219x8638c3bc(), 8);
    }

    /* renamed from: isUseSameView */
    public boolean m31224x6d6e1b48(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3) {
        if (m31216xb2c87fbf(c3826xc46e8cd3)) {
            return true;
        }
        if (c3826xc46e8cd3 == null) {
            return false;
        }
        int i17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.AnonymousClass1.f128359a[this.f14989xf9333cb8.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 == 4 && m31220x13d2be05() == c3826xc46e8cd3.m31220x13d2be05() : m31218xcf572877() == c3826xc46e8cd3.m31218xcf572877() : m31221x3a06c52a() == c3826xc46e8cd3.m31221x3a06c52a() : m31219x8638c3bc() == c3826xc46e8cd3.m31219x8638c3bc();
    }

    /* renamed from: isValid */
    public boolean m31225x7b953cf2() {
        int i17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.AnonymousClass1.f128359a[this.f14989xf9333cb8.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 == 4 && m31220x13d2be05() != null : m31218xcf572877() != null : m31221x3a06c52a() != null : m31219x8638c3bc() != null;
    }

    /* renamed from: showAll */
    public void m31226x7b37e964() {
        m31215x901b6914(m31221x3a06c52a(), 0);
        m31215x901b6914(m31219x8638c3bc(), 0);
        java.lang.ref.WeakReference<com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf> weakReference = this.f14991xcd7f693c;
        if (weakReference != null) {
            m31213x46ac7299(weakReference.get());
        }
        m31213x46ac7299(m31221x3a06c52a());
        m31213x46ac7299(m31219x8638c3bc());
    }

    /* renamed from: toString */
    public java.lang.String m31227x9616526c() {
        return "DisplayTarget{mTargetType=" + this.f14989xf9333cb8 + ", mTXCloudVideoView=" + m31220x13d2be05() + ", mTextureView=" + m31221x3a06c52a() + ", mSurfaceView=" + m31219x8638c3bc() + ", mSurface=" + this.f14987x2fa29f80 + '}';
    }

    public C3826xc46e8cd3(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f14992x69b7c049 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f14986xe5d5a35 = false;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            this.f14989xf9333cb8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TXCLOUDVIEW;
            return;
        }
        android.view.SurfaceView mo46535x8638c3bc = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46535x8638c3bc();
        android.view.Surface m94621xcf572877 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.m94621xcf572877();
        android.view.TextureView m31245xc29e49ba = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3828x2b5173cf.m31245xc29e49ba(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        if (mo46535x8638c3bc != null) {
            this.f14989xf9333cb8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.SURFACEVIEW;
            this.f14988x566f8e45 = new java.lang.ref.WeakReference<>(mo46535x8638c3bc);
        } else if (m94621xcf572877 != null) {
            this.f14989xf9333cb8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.SURFACE;
            this.f14987x2fa29f80 = m94621xcf572877;
        } else if (m31245xc29e49ba != null) {
            this.f14989xf9333cb8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TEXTUREVIEW;
            this.f14990xa3d8fb3 = new java.lang.ref.WeakReference<>(m31245xc29e49ba);
            this.f14991xcd7f693c = new java.lang.ref.WeakReference<>(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        } else {
            this.f14989xf9333cb8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TXCLOUDVIEW;
            this.f14991xcd7f693c = new java.lang.ref.WeakReference<>(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        }
        this.f14986xe5d5a35 = true;
    }

    public C3826xc46e8cd3(android.view.TextureView textureView) {
        this.f14992x69b7c049 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f14986xe5d5a35 = false;
        this.f14989xf9333cb8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.TEXTUREVIEW;
        this.f14990xa3d8fb3 = new java.lang.ref.WeakReference<>(textureView);
    }

    public C3826xc46e8cd3(android.view.SurfaceView surfaceView) {
        this.f14992x69b7c049 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f14986xe5d5a35 = false;
        this.f14989xf9333cb8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.SURFACEVIEW;
        this.f14988x566f8e45 = new java.lang.ref.WeakReference<>(surfaceView);
    }

    public C3826xc46e8cd3(android.view.Surface surface) {
        this.f14992x69b7c049 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f14986xe5d5a35 = false;
        this.f14989xf9333cb8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3.a.SURFACE;
        this.f14987x2fa29f80 = surface;
    }
}
