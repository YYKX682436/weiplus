package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* loaded from: classes10.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f156282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m f156283e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar, android.opengl.EGLContext eGLContext) {
        this.f156283e = mVar;
        this.f156282d = eGLContext;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar = this.f156283e;
        int i17 = mVar.f156292e;
        int i18 = mVar.f156293f;
        mVar.getClass();
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        mVar.f156299l = eglGetDisplay;
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            mVar.f156299l = null;
            throw new java.lang.RuntimeException("eglInitialize failed");
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGL14.eglChooseConfig(mVar.f156299l, mVar.f156298k, 0, eGLConfigArr, 0, 1, new int[1], 0);
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig == null) {
            throw new java.lang.RuntimeException("chooseConfig failed");
        }
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(mVar.f156299l, eGLConfig, this.f156282d, new int[]{12440, 2, 12344}, 0);
        mVar.f156301n = eglCreateContext;
        if (eglCreateContext == android.opengl.EGL14.EGL_NO_CONTEXT) {
            throw new java.lang.RuntimeException("EGL error " + android.opengl.EGL14.eglGetError());
        }
        mVar.a("eglCreateContext");
        int[] iArr2 = {12375, i17, 12374, i18, 12344};
        mVar.f156300m = null;
        try {
            mVar.f156300m = android.opengl.EGL14.eglCreatePbufferSurface(mVar.f156299l, eGLConfigArr[0], iArr2, 0);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YUVDateRenderToRBGBufferThread", "eglCreateWindowSurface", e17);
        }
        mVar.a("eglCreatePbufferSurface");
        android.opengl.EGLSurface eGLSurface = mVar.f156300m;
        if ((eGLSurface == null || eGLSurface == android.opengl.EGL14.EGL_NO_SURFACE) && android.opengl.EGL14.eglGetError() == 12299) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YUVDateRenderToRBGBufferThread", "makeMyEGLCurrentSurface:returned EGL_BAD_NATIVE_WINDOW.");
        }
        android.opengl.EGLDisplay eGLDisplay = mVar.f156299l;
        android.opengl.EGLSurface eGLSurface2 = mVar.f156300m;
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, mVar.f156301n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.YUVDateRenderToRBGBufferThread", "eglMakeCurrent:" + android.opengl.EGL14.eglGetError());
        }
        int i19 = mVar.f156292e;
        int i27 = mVar.f156293f;
        int i28 = mVar.f156295h;
        int i29 = mVar.f156296i;
        mVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.o(i19, i27, i28, i29);
        mVar.f156290c = oVar;
        oVar.onSurfaceCreated(null, null);
        mVar.f156290c.onSurfaceChanged(null, i28, i29);
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.n nVar = mVar.f156291d;
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.o oVar2 = mVar.f156290c;
            java.nio.ByteBuffer byteBuffer = ((kt3.h) nVar).f393519b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(byteBuffer);
            oVar2.f156326w = byteBuffer;
        }
    }
}
