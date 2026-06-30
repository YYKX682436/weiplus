package com.tencent.liteav.videobase.egl;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class EGLCore {
    private static final long DESTROY_EGL_CORE_DELAY_TIME_MS = 100;
    private static final int MAX_EGL_CORE_COUNT = 50;
    private static final java.lang.String TAG = "EGLCore";
    private com.tencent.liteav.videobase.egl.e<?> mEglHelper;
    private boolean mIsOffScreen = false;
    private java.lang.Object mSharedContext;
    private static final com.tencent.liteav.base.util.l sSequenceTaskRunner = new com.tencent.liteav.base.util.l();
    private static final java.util.concurrent.atomic.AtomicInteger sEGLCoreCount = new java.util.concurrent.atomic.AtomicInteger();

    public static com.tencent.liteav.videobase.egl.EGLCore create(java.lang.Object obj) {
        com.tencent.liteav.videobase.egl.EGLCore eGLCore = new com.tencent.liteav.videobase.egl.EGLCore();
        try {
            eGLCore.initialize(obj, null, 128, 128);
            eGLCore.makeCurrent();
            return eGLCore;
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "create EGLCore failed.", e17);
            return null;
        }
    }

    public static void destroy(com.tencent.liteav.videobase.egl.EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        if (eGLCore.mIsOffScreen) {
            destroyAsync(eGLCore);
        } else {
            destroySync(eGLCore);
        }
    }

    public static void destroyAsync(com.tencent.liteav.videobase.egl.EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        eGLCore.unmakeCurrent();
        sSequenceTaskRunner.a(com.tencent.liteav.videobase.egl.c.a(eGLCore), 100L);
    }

    public static void destroySync(com.tencent.liteav.videobase.egl.EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.unmakeCurrent();
            eGLCore.uninitialize();
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "EGLCore destroy sync success. ".concat(java.lang.String.valueOf(eGLCore)));
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "EGLCore destroy sync failed.", e17);
        }
    }

    public static /* synthetic */ void lambda$destroyAsync$0(com.tencent.liteav.videobase.egl.EGLCore eGLCore) {
        try {
            eGLCore.unmakeCurrent();
            eGLCore.uninitialize();
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "EGLCore destroy async success. ".concat(java.lang.String.valueOf(eGLCore)));
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "EGLCore destroy async failed.", e17);
        }
    }

    private void uninitialize() {
        com.tencent.liteav.videobase.egl.e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.c();
            this.mEglHelper = null;
        }
        this.mSharedContext = null;
        sEGLCoreCount.decrementAndGet();
    }

    public java.lang.Object getEglContext() {
        com.tencent.liteav.videobase.egl.e<?> eVar = this.mEglHelper;
        if (eVar == null) {
            return null;
        }
        return eVar.f();
    }

    public java.lang.Object getSharedContext() {
        return this.mSharedContext;
    }

    public com.tencent.liteav.base.util.Size getSurfaceSize() {
        com.tencent.liteav.videobase.egl.e<?> eVar = this.mEglHelper;
        return eVar == null ? new com.tencent.liteav.base.util.Size(0, 0) : eVar.e();
    }

    public void initialize(java.lang.Object obj, android.view.Surface surface, int i17, int i18) {
        this.mIsOffScreen = surface == null;
        if (obj == null) {
            if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
                this.mEglHelper = com.tencent.liteav.videobase.egl.b.a((android.opengl.EGLContext) null, surface, i17, i18);
            } else {
                this.mEglHelper = com.tencent.liteav.videobase.egl.a.a((javax.microedition.khronos.egl.EGLContext) null, surface, i17, i18);
            }
        } else if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            this.mEglHelper = com.tencent.liteav.videobase.egl.a.a((javax.microedition.khronos.egl.EGLContext) obj, surface, i17, i18);
        } else {
            if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 17 || !(obj instanceof android.opengl.EGLContext)) {
                throw new com.tencent.liteav.videobase.egl.d(0, "sharedContext isn't EGLContext");
            }
            this.mEglHelper = com.tencent.liteav.videobase.egl.b.a((android.opengl.EGLContext) obj, surface, i17, i18);
        }
        this.mSharedContext = obj;
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "EGLCore created in thread " + java.lang.Thread.currentThread().getId() + ", sharedContext: " + obj + ", Surface: " + surface + ", width: " + i17 + ", height: " + i18 + ", eglCoreCount: " + sEGLCoreCount.incrementAndGet());
    }

    public void makeCurrent() {
        com.tencent.liteav.videobase.egl.e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.b();
        }
    }

    public void setPresentationTime(long j17) {
        com.tencent.liteav.videobase.egl.e<?> eVar = this.mEglHelper;
        if (eVar == null || !(eVar instanceof com.tencent.liteav.videobase.egl.b)) {
            return;
        }
        com.tencent.liteav.videobase.egl.b bVar = (com.tencent.liteav.videobase.egl.b) eVar;
        android.opengl.EGLExt.eglPresentationTimeANDROID(bVar.f46747a, bVar.f46748b, j17);
    }

    public void swapBuffers() {
        com.tencent.liteav.videobase.egl.e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void unmakeCurrent() {
        com.tencent.liteav.videobase.egl.e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.d();
        }
    }
}
