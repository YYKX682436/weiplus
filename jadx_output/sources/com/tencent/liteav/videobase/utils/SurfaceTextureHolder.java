package com.tencent.liteav.videobase.utils;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class SurfaceTextureHolder implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private com.tencent.liteav.base.util.CustomHandler mCallbackHandler;
    private android.graphics.SurfaceTexture.OnFrameAvailableListener mOnFrameAvailableListener;
    private android.view.Surface mSurface;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    private final java.lang.String mTag = "SurfaceTextureHolder_" + java.lang.Integer.toHexString(hashCode());
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();

    public SurfaceTextureHolder(int i17, boolean z17) {
        this.mSurfaceTexture = new android.graphics.SurfaceTexture(i17);
        if (z17) {
            this.mSurface = new android.view.Surface(this.mSurfaceTexture);
        }
    }

    public static /* synthetic */ void lambda$onFrameAvailable$0(com.tencent.liteav.videobase.utils.SurfaceTextureHolder surfaceTextureHolder, android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = surfaceTextureHolder.mOnFrameAvailableListener;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
    }

    public android.view.Surface getSurface() {
        return this.mSurface;
    }

    public android.graphics.SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    public float[] getTransformMatrix(boolean z17, float f17, float f18, float f19, float f27) {
        android.graphics.SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("getTransformMatrix"), this.mTag, "getTransformMatrix, surface texture is released!", new java.lang.Object[0]);
            return null;
        }
        float[] fArr = new float[16];
        try {
            surfaceTexture.getTransformMatrix(fArr);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mThrottlers.a("getTransformMatrix"), this.mTag, "updateTexImage exception: ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
        }
        if (z17) {
            if (!com.tencent.liteav.base.util.f.a(f17, 0.0f) || !com.tencent.liteav.base.util.f.a(f18, 0.0f)) {
                android.opengl.Matrix.translateM(fArr, 0, f17, f18, 0.0f);
            }
            if (!com.tencent.liteav.base.util.f.a(f19, 1.0f) || !com.tencent.liteav.base.util.f.a(f27, 1.0f)) {
                android.opengl.Matrix.scaleM(fArr, 0, f19, f27, 1.0f);
            }
        }
        return fArr;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.liteav.base.util.CustomHandler customHandler = this.mCallbackHandler;
        if (customHandler != null) {
            customHandler.runOrPost(com.tencent.liteav.videobase.utils.f.a(this, surfaceTexture));
        }
    }

    public void release() {
        android.view.Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
    }

    public void setDefaultBufferSize(int i17, int i18) {
        android.graphics.SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("setDefaultBufferSize"), this.mTag, "setDefaultBufferSize, surface texture is released!", new java.lang.Object[0]);
        } else {
            surfaceTexture.setDefaultBufferSize(i17, i18);
        }
    }

    public void setOnFrameAvailableListener(android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, android.os.Handler handler) {
        if (this.mSurfaceTexture == null) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("setOnFrameAvailableListener"), this.mTag, "setOnFrameAvailableListener, surface texture is released!", new java.lang.Object[0]);
            return;
        }
        this.mCallbackHandler = new com.tencent.liteav.base.util.CustomHandler(handler != null ? handler.getLooper() : android.os.Looper.getMainLooper());
        this.mOnFrameAvailableListener = onFrameAvailableListener;
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            this.mSurfaceTexture.setOnFrameAvailableListener(this, this.mCallbackHandler);
        } else {
            this.mSurfaceTexture.setOnFrameAvailableListener(this);
        }
    }

    public void updateTexImage() {
        android.graphics.SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("updateTexImage"), this.mTag, "updateTexImage, surface texture is released!", new java.lang.Object[0]);
            return;
        }
        try {
            surfaceTexture.updateTexImage();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mThrottlers.a("updateTexImage"), this.mTag, "updateTexImage exception: ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
        }
    }
}
