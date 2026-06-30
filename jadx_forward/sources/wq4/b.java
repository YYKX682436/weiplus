package wq4;

/* loaded from: classes13.dex */
public class b implements wq4.j {
    @Override // wq4.j
    /* renamed from: createContext */
    public javax.microedition.khronos.egl.EGLContext mo174320xbe9e5913(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
    }

    @Override // wq4.j
    /* renamed from: destroyContext */
    public void mo174321x8812055(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }
}
