package com.tencent.mm.plugin.api.recordView;

/* loaded from: classes10.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.api.recordView.m f74754d;

    public l(com.tencent.mm.plugin.api.recordView.m mVar) {
        this.f74754d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.opengl.EGLDisplay eGLDisplay;
        com.tencent.mm.plugin.api.recordView.m mVar = this.f74754d;
        com.tencent.mm.plugin.api.recordView.o oVar = mVar.f74757c;
        int i17 = oVar.f74791u;
        if (i17 != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
        }
        int i18 = oVar.f74792v;
        if (i18 != 0) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i18}, 0);
        }
        android.opengl.EGLDisplay eGLDisplay2 = mVar.f74766l;
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
        android.opengl.EGLSurface eGLSurface2 = mVar.f74767m;
        if (eGLSurface2 != null && mVar.f74768n != null && (eGLDisplay = mVar.f74766l) != null) {
            android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface2);
            android.opengl.EGL14.eglDestroyContext(mVar.f74766l, mVar.f74768n);
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(mVar.f74766l);
            mVar.f74768n = null;
            mVar.f74766l = null;
            mVar.f74767m = null;
        }
        mVar.f74756b.removeCallbacksAndMessages(null);
        mVar.f74755a.quitSafely();
    }
}
