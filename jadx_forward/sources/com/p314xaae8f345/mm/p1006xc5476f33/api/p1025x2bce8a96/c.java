package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* loaded from: classes13.dex */
public class c implements android.opengl.GLSurfaceView.EGLContextFactory {
    public c(com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab) {
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightCameraGLSurfaceView", "creating OpenGL ES 2.0 context");
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }
}
