package com.tencent.mm.plugin.api.recordView;

/* loaded from: classes10.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f74749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.api.recordView.m f74750e;

    public j(com.tencent.mm.plugin.api.recordView.m mVar, android.opengl.EGLContext eGLContext) {
        this.f74750e = mVar;
        this.f74749d = eGLContext;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.api.recordView.m mVar = this.f74750e;
        int i17 = mVar.f74759e;
        int i18 = mVar.f74760f;
        mVar.getClass();
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        mVar.f74766l = eglGetDisplay;
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            mVar.f74766l = null;
            throw new java.lang.RuntimeException("eglInitialize failed");
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGL14.eglChooseConfig(mVar.f74766l, mVar.f74765k, 0, eGLConfigArr, 0, 1, new int[1], 0);
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig == null) {
            throw new java.lang.RuntimeException("chooseConfig failed");
        }
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(mVar.f74766l, eGLConfig, this.f74749d, new int[]{12440, 2, 12344}, 0);
        mVar.f74768n = eglCreateContext;
        if (eglCreateContext == android.opengl.EGL14.EGL_NO_CONTEXT) {
            throw new java.lang.RuntimeException("EGL error " + android.opengl.EGL14.eglGetError());
        }
        mVar.a("eglCreateContext");
        int[] iArr2 = {12375, i17, 12374, i18, 12344};
        mVar.f74767m = null;
        try {
            mVar.f74767m = android.opengl.EGL14.eglCreatePbufferSurface(mVar.f74766l, eGLConfigArr[0], iArr2, 0);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.YUVDateRenderToRBGBufferThread", "eglCreateWindowSurface", e17);
        }
        mVar.a("eglCreatePbufferSurface");
        android.opengl.EGLSurface eGLSurface = mVar.f74767m;
        if ((eGLSurface == null || eGLSurface == android.opengl.EGL14.EGL_NO_SURFACE) && android.opengl.EGL14.eglGetError() == 12299) {
            com.tencent.mars.xlog.Log.e("MicroMsg.YUVDateRenderToRBGBufferThread", "makeMyEGLCurrentSurface:returned EGL_BAD_NATIVE_WINDOW.");
        }
        android.opengl.EGLDisplay eGLDisplay = mVar.f74766l;
        android.opengl.EGLSurface eGLSurface2 = mVar.f74767m;
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, mVar.f74768n)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.YUVDateRenderToRBGBufferThread", "eglMakeCurrent:" + android.opengl.EGL14.eglGetError());
        }
        int i19 = mVar.f74759e;
        int i27 = mVar.f74760f;
        int i28 = mVar.f74762h;
        int i29 = mVar.f74763i;
        mVar.getClass();
        com.tencent.mm.plugin.api.recordView.o oVar = new com.tencent.mm.plugin.api.recordView.o(i19, i27, i28, i29);
        mVar.f74757c = oVar;
        oVar.onSurfaceCreated(null, null);
        mVar.f74757c.onSurfaceChanged(null, i28, i29);
        com.tencent.mm.plugin.api.recordView.n nVar = mVar.f74758d;
        if (nVar != null) {
            com.tencent.mm.plugin.api.recordView.o oVar2 = mVar.f74757c;
            java.nio.ByteBuffer byteBuffer = ((kt3.h) nVar).f311986b;
            kotlin.jvm.internal.o.d(byteBuffer);
            oVar2.f74793w = byteBuffer;
        }
    }
}
