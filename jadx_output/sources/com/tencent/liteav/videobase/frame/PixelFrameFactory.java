package com.tencent.liteav.videobase.frame;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class PixelFrameFactory {
    private android.opengl.EGLSurface mCallerEGLDrawSurface;
    private android.opengl.EGLSurface mCallerEGLReadSurface;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private final com.tencent.liteav.base.util.Size mLastFrameSize;
    private com.tencent.liteav.videobase.frame.h mPixelFrameRenderer;
    private com.tencent.liteav.videobase.egl.EGLCore mRenderEGLCore;
    private final com.tencent.liteav.base.b.b mThrottlers;
    private final java.lang.String mTAG = "PixelFrameFactory_" + hashCode();
    private java.lang.Object mSharedEGLContext = null;
    private android.opengl.EGLDisplay mCallerEGLDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
    private android.opengl.EGLContext mCallerEGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;

    public PixelFrameFactory() {
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        this.mCallerEGLReadSurface = eGLSurface;
        this.mCallerEGLDrawSurface = eGLSurface;
        this.mLastFrameSize = new com.tencent.liteav.base.util.Size();
        this.mThrottlers = new com.tencent.liteav.base.b.b();
    }

    private com.tencent.liteav.videobase.frame.PixelFrame copyTexture(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame) {
        if (this.mGLTexturePool == null) {
            this.mGLTexturePool = new com.tencent.liteav.videobase.frame.e();
        }
        com.tencent.liteav.videobase.frame.d a17 = this.mGLTexturePool.a(pixelFrame.getWidth(), pixelFrame.getHeight());
        if (this.mLastFrameSize.width != pixelFrame.getWidth() || this.mLastFrameSize.height != pixelFrame.getHeight()) {
            com.tencent.liteav.videobase.frame.h hVar = this.mPixelFrameRenderer;
            if (hVar != null) {
                hVar.a();
                this.mPixelFrameRenderer = null;
            }
            this.mLastFrameSize.width = pixelFrame.getWidth();
            this.mLastFrameSize.height = pixelFrame.getHeight();
        }
        if (this.mPixelFrameRenderer == null) {
            this.mPixelFrameRenderer = new com.tencent.liteav.videobase.frame.h(pixelFrame.getWidth(), pixelFrame.getHeight());
        }
        this.mPixelFrameRenderer.a(pixelFrame, com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FILL, a17);
        com.tencent.liteav.videobase.frame.PixelFrame a18 = a17.a(pixelFrame.getGLContext());
        a17.release();
        return a18;
    }

    private com.tencent.liteav.videobase.frame.PixelFrame deepCopyDataToPixelFrame(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame, java.lang.Object obj) {
        if (obj instanceof byte[]) {
            byte[] a17 = com.tencent.liteav.videobase.utils.d.a(((byte[]) obj).length);
            if (a17 == null) {
                return null;
            }
            java.lang.System.arraycopy(obj, 0, a17, 0, a17.length);
            pixelFrame.setData(a17);
        } else if (obj instanceof java.nio.ByteBuffer) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
            java.nio.ByteBuffer b17 = com.tencent.liteav.videobase.utils.d.b(byteBuffer.capacity());
            if (b17 == null) {
                return null;
            }
            byteBuffer.rewind();
            b17.put(byteBuffer);
            b17.rewind();
            pixelFrame.setBuffer(b17);
        }
        pixelFrame.retain();
        return pixelFrame;
    }

    private com.tencent.liteav.videobase.frame.PixelFrame deepCopyTextureToPixelFrame(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame, java.lang.Object obj) {
        saveCallerEGLContext();
        android.opengl.GLES20.glFinish();
        if (!com.tencent.liteav.base.util.CommonUtil.equals(this.mSharedEGLContext, obj)) {
            uninitOpenGLComponents();
            initRenderEGLContext(obj);
        }
        if (!makeCurrent()) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("makeCurrent"), this.mTAG, "use origin texture when makeCurrent error", new java.lang.Object[0]);
            pixelFrame.retain();
            return pixelFrame;
        }
        com.tencent.liteav.videobase.frame.PixelFrame copyTexture = copyTexture(pixelFrame);
        android.opengl.GLES20.glFinish();
        restoreCallerEGLContext();
        return copyTexture;
    }

    private void initRenderEGLContext(java.lang.Object obj) {
        if (this.mRenderEGLCore != null) {
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "initRenderEGLContext");
        this.mSharedEGLContext = obj;
        com.tencent.liteav.videobase.egl.EGLCore eGLCore = new com.tencent.liteav.videobase.egl.EGLCore();
        this.mRenderEGLCore = eGLCore;
        try {
            eGLCore.initialize(obj, null, 128, 128);
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            this.mRenderEGLCore = null;
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("initEGLCore"), this.mTAG, "create EGLCore failed.", e17);
        }
    }

    private boolean makeCurrent() {
        com.tencent.liteav.videobase.egl.EGLCore eGLCore = this.mRenderEGLCore;
        if (eGLCore == null) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("makeCurrentNull"), this.mTAG, "makeCurrent on mEGLCore is null", new java.lang.Object[0]);
            return false;
        }
        try {
            eGLCore.makeCurrent();
            return true;
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mThrottlers.a("makeCurrentError"), this.mTAG, "make current failed.", e17);
            return false;
        }
    }

    private void restoreCallerEGLContext() {
        if (!com.tencent.liteav.base.util.CommonUtil.equals(this.mCallerEGLContext, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            android.opengl.EGL14.eglMakeCurrent(this.mCallerEGLDisplay, this.mCallerEGLDrawSurface, this.mCallerEGLReadSurface, this.mCallerEGLContext);
            return;
        }
        android.opengl.EGLDisplay eglGetCurrentDisplay = android.opengl.EGL14.eglGetCurrentDisplay();
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eglGetCurrentDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    private void saveCallerEGLContext() {
        android.opengl.EGLContext eglGetCurrentContext = android.opengl.EGL14.eglGetCurrentContext();
        if (com.tencent.liteav.base.util.CommonUtil.equals(this.mCallerEGLContext, android.opengl.EGL14.EGL_NO_CONTEXT) || !com.tencent.liteav.base.util.CommonUtil.equals(eglGetCurrentContext, this.mCallerEGLContext)) {
            this.mCallerEGLContext = eglGetCurrentContext;
            this.mCallerEGLDisplay = android.opengl.EGL14.eglGetCurrentDisplay();
            this.mCallerEGLReadSurface = android.opengl.EGL14.eglGetCurrentSurface(12378);
            this.mCallerEGLDrawSurface = android.opengl.EGL14.eglGetCurrentSurface(12377);
        }
    }

    private com.tencent.liteav.videobase.frame.PixelFrame shallowCopyDataToPixelFrame(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame, java.lang.Object obj) {
        if (obj instanceof byte[]) {
            pixelFrame.setData((byte[]) obj);
        } else if (obj instanceof java.nio.ByteBuffer) {
            pixelFrame.setBuffer((java.nio.ByteBuffer) obj);
        }
        pixelFrame.retain();
        return pixelFrame;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r2 = deepCopyDataToPixelFrame(r0, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.tencent.liteav.videobase.frame.PixelFrame create(int r2, int r3, int r4, long r5, int r7, int r8, int r9, java.lang.Object r10, java.lang.Object r11, boolean r12) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.tencent.liteav.videobase.frame.PixelFrame r0 = new com.tencent.liteav.videobase.frame.PixelFrame     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            r0.setWidth(r2)     // Catch: java.lang.Throwable -> L4d
            r0.setHeight(r3)     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.base.util.k r2 = com.tencent.liteav.base.util.k.a(r4)     // Catch: java.lang.Throwable -> L4d
            r0.setRotation(r2)     // Catch: java.lang.Throwable -> L4d
            r0.setTimestamp(r5)     // Catch: java.lang.Throwable -> L4d
            r0.setGLContext(r10)     // Catch: java.lang.Throwable -> L4d
            r0.setTextureId(r9)     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$a r2 = com.tencent.liteav.videobase.base.GLConstants.a.a(r7)     // Catch: java.lang.Throwable -> L4d
            r0.setPixelBufferType(r2)     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r2 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.a(r8)     // Catch: java.lang.Throwable -> L4d
            r0.setPixelFormatType(r2)     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$a r2 = r0.getPixelBufferType()     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$a r3 = com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY     // Catch: java.lang.Throwable -> L4d
            if (r2 == r3) goto L40
            com.tencent.liteav.videobase.base.GLConstants$a r2 = r0.getPixelBufferType()     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$a r3 = com.tencent.liteav.videobase.base.GLConstants.a.BYTE_BUFFER     // Catch: java.lang.Throwable -> L4d
            if (r2 != r3) goto L3b
            goto L40
        L3b:
            com.tencent.liteav.videobase.frame.PixelFrame r2 = r1.deepCopyTextureToPixelFrame(r0, r10)     // Catch: java.lang.Throwable -> L4d
            goto L4b
        L40:
            if (r12 == 0) goto L47
            com.tencent.liteav.videobase.frame.PixelFrame r2 = r1.deepCopyDataToPixelFrame(r0, r11)     // Catch: java.lang.Throwable -> L4d
            goto L4b
        L47:
            com.tencent.liteav.videobase.frame.PixelFrame r2 = r1.shallowCopyDataToPixelFrame(r0, r11)     // Catch: java.lang.Throwable -> L4d
        L4b:
            monitor-exit(r1)
            return r2
        L4d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.frame.PixelFrameFactory.create(int, int, int, long, int, int, int, java.lang.Object, java.lang.Object, boolean):com.tencent.liteav.videobase.frame.PixelFrame");
    }

    public synchronized void release(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            pixelFrame.release();
        }
    }

    public synchronized void uninitOpenGLComponents() {
        if (this.mRenderEGLCore == null) {
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "uninitOpenGLComponents");
        if (makeCurrent()) {
            com.tencent.liteav.videobase.frame.e eVar = this.mGLTexturePool;
            if (eVar != null) {
                eVar.a();
                this.mGLTexturePool.b();
                this.mGLTexturePool = null;
            }
            com.tencent.liteav.videobase.frame.h hVar = this.mPixelFrameRenderer;
            if (hVar != null) {
                hVar.a();
                this.mPixelFrameRenderer = null;
            }
        }
        com.tencent.liteav.videobase.egl.EGLCore.destroy(this.mRenderEGLCore);
        this.mRenderEGLCore = null;
    }
}
