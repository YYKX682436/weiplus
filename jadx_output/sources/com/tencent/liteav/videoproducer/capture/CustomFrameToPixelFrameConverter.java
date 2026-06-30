package com.tencent.liteav.videoproducer.capture;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class CustomFrameToPixelFrameConverter {
    private static final java.lang.String TAG = "CustomFrameToPixelFrameConverter";
    private final java.lang.Object mSharedContext;
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private com.tencent.liteav.videobase.egl.EGLCore mEGLCore = null;
    private com.tencent.liteav.videobase.frame.h mPixelFrameRenderer = null;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool = null;
    private int mWidth = 0;
    private int mHeight = 0;

    public CustomFrameToPixelFrameConverter(java.lang.Object obj) {
        this.mSharedContext = obj;
    }

    private void initializeGLComponents(int i17, int i18, com.tencent.liteav.videobase.frame.PixelFrame pixelFrame) {
        if (this.mEGLCore != null) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mThrottlers.a("initGL"), TAG, "egl is initialized!", new java.lang.Object[0]);
            return;
        }
        java.lang.Object gLContext = pixelFrame.getGLContext() != null ? pixelFrame.getGLContext() : this.mSharedContext;
        try {
            com.tencent.liteav.videobase.egl.EGLCore eGLCore = new com.tencent.liteav.videobase.egl.EGLCore();
            this.mEGLCore = eGLCore;
            eGLCore.initialize(gLContext, null, i17, i18);
            this.mEGLCore.makeCurrent();
            com.tencent.liteav.base.util.LiteavLog.i(this.mThrottlers.a("initSuccess"), TAG, "initialize egl, width: " + i17 + ", height: " + i18 + ", sharedContext: " + gLContext, new java.lang.Object[0]);
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("initError"), TAG, "initialize egl failed.", e17);
            this.mEGLCore = null;
        }
        if (this.mEGLCore != null) {
            this.mGLTexturePool = new com.tencent.liteav.videobase.frame.e();
            if (this.mPixelFrameRenderer == null) {
                this.mPixelFrameRenderer = new com.tencent.liteav.videobase.frame.h(i17, i18);
            }
        }
    }

    private boolean isNeedRecreateEGL(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame, com.tencent.liteav.videobase.egl.EGLCore eGLCore) {
        return (pixelFrame.getHeight() == this.mHeight && pixelFrame.getWidth() == this.mWidth && !(pixelFrame.getGLContext() != null && !com.tencent.liteav.base.util.CommonUtil.equals(pixelFrame.getGLContext(), eGLCore.getSharedContext()))) ? false : true;
    }

    private void uninitializedGLComponents() {
        com.tencent.liteav.videobase.egl.EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.makeCurrent();
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("make"), TAG, "uninitialize egl, make current error ", e17);
        }
        com.tencent.liteav.base.util.LiteavLog.i(this.mThrottlers.a("uninitGL"), TAG, "uninitialize egl", new java.lang.Object[0]);
        com.tencent.liteav.videobase.frame.h hVar = this.mPixelFrameRenderer;
        if (hVar != null) {
            hVar.a();
            this.mPixelFrameRenderer = null;
        }
        com.tencent.liteav.videobase.frame.e eVar = this.mGLTexturePool;
        if (eVar != null) {
            eVar.a();
            this.mGLTexturePool.b();
            this.mGLTexturePool = null;
        }
        com.tencent.liteav.videobase.egl.EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public com.tencent.liteav.videobase.frame.PixelFrame convertFrame(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "convertFrame: pixelFrame is null.");
            return null;
        }
        com.tencent.liteav.videobase.egl.EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null || isNeedRecreateEGL(pixelFrame, eGLCore)) {
            this.mWidth = pixelFrame.getWidth();
            this.mHeight = pixelFrame.getHeight();
            uninitializedGLComponents();
            initializeGLComponents(this.mWidth, this.mHeight, pixelFrame);
        }
        com.tencent.liteav.videobase.egl.EGLCore eGLCore2 = this.mEGLCore;
        if (eGLCore2 == null || this.mGLTexturePool == null || this.mPixelFrameRenderer == null) {
            return null;
        }
        try {
            eGLCore2.makeCurrent();
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "EGL makeCurrent error ", e17);
        }
        com.tencent.liteav.videobase.utils.OpenGlUtils.glViewport(0, 0, this.mWidth, this.mHeight);
        com.tencent.liteav.videobase.frame.d a17 = this.mGLTexturePool.a(this.mWidth, this.mHeight);
        this.mPixelFrameRenderer.a(pixelFrame, com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP, a17);
        android.opengl.GLES20.glFinish();
        com.tencent.liteav.videobase.frame.PixelFrame a18 = a17.a(this.mEGLCore.getEglContext());
        a18.setTimestamp(pixelFrame.getTimestamp());
        a17.release();
        return a18;
    }

    public void release() {
        uninitializedGLComponents();
    }

    public void releaseFrame(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            pixelFrame.release();
        }
    }
}
