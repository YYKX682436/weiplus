package com.tencent.liteav.videobase.videobase;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class DisplayTarget {
    private static final java.lang.String TAG = "DisplayTarget";
    private byte _hellAccFlag_;
    private boolean mIsViewFromTXCloudVideoView;
    private android.view.Surface mSurface;
    private java.lang.ref.WeakReference<android.view.SurfaceView> mSurfaceView;
    private final com.tencent.liteav.videobase.videobase.DisplayTarget.a mTargetType;
    private java.lang.ref.WeakReference<android.view.TextureView> mTextureView;
    private java.lang.ref.WeakReference<com.tencent.rtmp.ui.TXCloudVideoView> mTxCloudVideoView;
    private final com.tencent.liteav.base.util.CustomHandler mUIHandler;

    /* renamed from: com.tencent.liteav.videobase.videobase.DisplayTarget$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46826a;

        static {
            int[] iArr = new int[com.tencent.liteav.videobase.videobase.DisplayTarget.a.values().length];
            f46826a = iArr;
            try {
                iArr[com.tencent.liteav.videobase.videobase.DisplayTarget.a.SURFACEVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46826a[com.tencent.liteav.videobase.videobase.DisplayTarget.a.TEXTUREVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f46826a[com.tencent.liteav.videobase.videobase.DisplayTarget.a.SURFACE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f46826a[com.tencent.liteav.videobase.videobase.DisplayTarget.a.TXCLOUDVIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes14.dex */
    public enum a {
        TEXTUREVIEW,
        SURFACEVIEW,
        SURFACE,
        TXCLOUDVIEW
    }

    public DisplayTarget(com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget) {
        this.mUIHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = displayTarget.mTargetType;
        this.mTxCloudVideoView = displayTarget.mTxCloudVideoView;
        this.mTextureView = displayTarget.mTextureView;
        this.mSurfaceView = displayTarget.mSurfaceView;
        this.mSurface = displayTarget.mSurface;
        this.mIsViewFromTXCloudVideoView = displayTarget.mIsViewFromTXCloudVideoView;
    }

    public static com.tencent.liteav.videobase.videobase.DisplayTarget create(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof com.tencent.liteav.videobase.videobase.DisplayTarget) {
            return new com.tencent.liteav.videobase.videobase.DisplayTarget((com.tencent.liteav.videobase.videobase.DisplayTarget) obj);
        }
        if (obj instanceof com.tencent.rtmp.ui.TXCloudVideoView) {
            return new com.tencent.liteav.videobase.videobase.DisplayTarget((com.tencent.rtmp.ui.TXCloudVideoView) obj);
        }
        if (obj instanceof android.view.TextureView) {
            return new com.tencent.liteav.videobase.videobase.DisplayTarget((android.view.TextureView) obj);
        }
        if (obj instanceof android.view.SurfaceView) {
            return new com.tencent.liteav.videobase.videobase.DisplayTarget((android.view.SurfaceView) obj);
        }
        com.tencent.liteav.base.util.LiteavLog.w(TAG, "object is unknown. object=".concat(java.lang.String.valueOf(obj)));
        return null;
    }

    public static void lambda$setVisibility$0(android.view.View view, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/liteav/videobase/videobase/DisplayTarget", "lambda$setVisibility$0", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/liteav/videobase/videobase/DisplayTarget", "lambda$setVisibility$0", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    private void requestLayout(android.view.View view) {
        if (view == null) {
            return;
        }
        runOnUIThread(com.tencent.liteav.videobase.videobase.b.a(view));
    }

    private void runOnUIThread(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == this.mUIHandler.getLooper()) {
            runnable.run();
        } else {
            this.mUIHandler.post(runnable);
        }
    }

    private void setVisibility(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        runOnUIThread(com.tencent.liteav.videobase.videobase.a.a(view, i17));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget = (com.tencent.liteav.videobase.videobase.DisplayTarget) obj;
            if (this.mTargetType == displayTarget.mTargetType && com.tencent.liteav.base.util.CommonUtil.equals(getTXCloudVideoView(), displayTarget.getTXCloudVideoView()) && com.tencent.liteav.base.util.CommonUtil.equals(getTextureView(), displayTarget.getTextureView()) && com.tencent.liteav.base.util.CommonUtil.equals(getSurfaceView(), displayTarget.getSurfaceView()) && com.tencent.liteav.base.util.CommonUtil.equals(this.mSurface, displayTarget.mSurface)) {
                return true;
            }
        }
        return false;
    }

    public com.tencent.liteav.base.util.Size getSize() {
        java.lang.ref.WeakReference<com.tencent.rtmp.ui.TXCloudVideoView> weakReference;
        java.lang.ref.WeakReference<android.view.TextureView> weakReference2;
        int i17;
        int i18;
        java.lang.ref.WeakReference<android.view.SurfaceView> weakReference3;
        com.tencent.liteav.videobase.videobase.DisplayTarget.a aVar = this.mTargetType;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = (aVar != com.tencent.liteav.videobase.videobase.DisplayTarget.a.SURFACEVIEW || (weakReference3 = this.mSurfaceView) == null) ? (aVar != com.tencent.liteav.videobase.videobase.DisplayTarget.a.TEXTUREVIEW || (weakReference2 = this.mTextureView) == null) ? (aVar != com.tencent.liteav.videobase.videobase.DisplayTarget.a.TXCLOUDVIEW || (weakReference = this.mTxCloudVideoView) == null) ? null : weakReference.get() : weakReference2.get() : weakReference3.get();
        if (tXCloudVideoView != null) {
            i17 = tXCloudVideoView.getWidth();
            i18 = tXCloudVideoView.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        return new com.tencent.liteav.base.util.Size(i17, i18);
    }

    public android.view.Surface getSurface() {
        return this.mSurface;
    }

    public android.view.SurfaceView getSurfaceView() {
        java.lang.ref.WeakReference<android.view.SurfaceView> weakReference = this.mSurfaceView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public com.tencent.rtmp.ui.TXCloudVideoView getTXCloudVideoView() {
        java.lang.ref.WeakReference<com.tencent.rtmp.ui.TXCloudVideoView> weakReference = this.mTxCloudVideoView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public android.view.TextureView getTextureView() {
        java.lang.ref.WeakReference<android.view.TextureView> weakReference = this.mTextureView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public com.tencent.liteav.videobase.videobase.DisplayTarget.a getType() {
        return this.mTargetType;
    }

    public void hideAll() {
        if (this.mIsViewFromTXCloudVideoView) {
            return;
        }
        setVisibility(getTextureView(), 8);
        setVisibility(getSurfaceView(), 8);
    }

    public boolean isUseSameView(com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget) {
        if (equals(displayTarget)) {
            return true;
        }
        if (displayTarget == null) {
            return false;
        }
        int i17 = com.tencent.liteav.videobase.videobase.DisplayTarget.AnonymousClass1.f46826a[this.mTargetType.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 == 4 && getTXCloudVideoView() == displayTarget.getTXCloudVideoView() : getSurface() == displayTarget.getSurface() : getTextureView() == displayTarget.getTextureView() : getSurfaceView() == displayTarget.getSurfaceView();
    }

    public boolean isValid() {
        int i17 = com.tencent.liteav.videobase.videobase.DisplayTarget.AnonymousClass1.f46826a[this.mTargetType.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 == 4 && getTXCloudVideoView() != null : getSurface() != null : getTextureView() != null : getSurfaceView() != null;
    }

    public void showAll() {
        setVisibility(getTextureView(), 0);
        setVisibility(getSurfaceView(), 0);
        java.lang.ref.WeakReference<com.tencent.rtmp.ui.TXCloudVideoView> weakReference = this.mTxCloudVideoView;
        if (weakReference != null) {
            requestLayout(weakReference.get());
        }
        requestLayout(getTextureView());
        requestLayout(getSurfaceView());
    }

    public java.lang.String toString() {
        return "DisplayTarget{mTargetType=" + this.mTargetType + ", mTXCloudVideoView=" + getTXCloudVideoView() + ", mTextureView=" + getTextureView() + ", mSurfaceView=" + getSurfaceView() + ", mSurface=" + this.mSurface + '}';
    }

    public DisplayTarget(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.mUIHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        if (tXCloudVideoView == null) {
            this.mTargetType = com.tencent.liteav.videobase.videobase.DisplayTarget.a.TXCLOUDVIEW;
            return;
        }
        android.view.SurfaceView surfaceView = tXCloudVideoView.getSurfaceView();
        android.view.Surface surface = tXCloudVideoView.getSurface();
        android.view.TextureView textureViewSetByUser = com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView);
        if (surfaceView != null) {
            this.mTargetType = com.tencent.liteav.videobase.videobase.DisplayTarget.a.SURFACEVIEW;
            this.mSurfaceView = new java.lang.ref.WeakReference<>(surfaceView);
        } else if (surface != null) {
            this.mTargetType = com.tencent.liteav.videobase.videobase.DisplayTarget.a.SURFACE;
            this.mSurface = surface;
        } else if (textureViewSetByUser != null) {
            this.mTargetType = com.tencent.liteav.videobase.videobase.DisplayTarget.a.TEXTUREVIEW;
            this.mTextureView = new java.lang.ref.WeakReference<>(textureViewSetByUser);
            this.mTxCloudVideoView = new java.lang.ref.WeakReference<>(tXCloudVideoView);
        } else {
            this.mTargetType = com.tencent.liteav.videobase.videobase.DisplayTarget.a.TXCLOUDVIEW;
            this.mTxCloudVideoView = new java.lang.ref.WeakReference<>(tXCloudVideoView);
        }
        this.mIsViewFromTXCloudVideoView = true;
    }

    public DisplayTarget(android.view.TextureView textureView) {
        this.mUIHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = com.tencent.liteav.videobase.videobase.DisplayTarget.a.TEXTUREVIEW;
        this.mTextureView = new java.lang.ref.WeakReference<>(textureView);
    }

    public DisplayTarget(android.view.SurfaceView surfaceView) {
        this.mUIHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = com.tencent.liteav.videobase.videobase.DisplayTarget.a.SURFACEVIEW;
        this.mSurfaceView = new java.lang.ref.WeakReference<>(surfaceView);
    }

    public DisplayTarget(android.view.Surface surface) {
        this.mUIHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = com.tencent.liteav.videobase.videobase.DisplayTarget.a.SURFACE;
        this.mSurface = surface;
    }
}
