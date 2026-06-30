package wq4;

/* loaded from: classes13.dex */
public class g implements wq4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b f530171a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b textureViewSurfaceTextureListenerC18921x32ae0c3b, wq4.d dVar) {
        this.f530171a = textureViewSurfaceTextureListenerC18921x32ae0c3b;
    }

    @Override // wq4.j
    /* renamed from: createContext */
    public javax.microedition.khronos.egl.EGLContext mo174320xbe9e5913(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        int i17 = this.f530171a.f258571o;
        int[] iArr = {12440, i17, 12344};
        javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        if (i17 == 0) {
            iArr = null;
        }
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
    }

    @Override // wq4.j
    /* renamed from: destroyContext */
    public void mo174321x8812055(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
        if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            return;
        }
        java.util.Objects.toString(eGLDisplay);
        java.util.Objects.toString(eGLContext);
        java.lang.Thread.currentThread().getId();
    }
}
