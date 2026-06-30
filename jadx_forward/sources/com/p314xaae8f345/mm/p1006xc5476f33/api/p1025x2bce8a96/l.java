package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* loaded from: classes10.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m f156287d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar) {
        this.f156287d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.opengl.EGLDisplay eGLDisplay;
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar = this.f156287d;
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.o oVar = mVar.f156290c;
        int i17 = oVar.f156324u;
        if (i17 != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
        }
        int i18 = oVar.f156325v;
        if (i18 != 0) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i18}, 0);
        }
        android.opengl.EGLDisplay eGLDisplay2 = mVar.f156299l;
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
        android.opengl.EGLSurface eGLSurface2 = mVar.f156300m;
        if (eGLSurface2 != null && mVar.f156301n != null && (eGLDisplay = mVar.f156299l) != null) {
            android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface2);
            android.opengl.EGL14.eglDestroyContext(mVar.f156299l, mVar.f156301n);
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(mVar.f156299l);
            mVar.f156301n = null;
            mVar.f156299l = null;
            mVar.f156300m = null;
        }
        mVar.f156289b.mo50302x6b17ad39(null);
        mVar.f156288a.quitSafely();
    }
}
