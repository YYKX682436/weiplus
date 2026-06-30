package ns0;

/* loaded from: classes13.dex */
public final class b implements android.opengl.GLSurfaceView.EGLContextFactory {
    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 egl, javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig eglConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(egl, "egl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(display, "display");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglConfig, "eglConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RenderContextFactory", "creating OpenGL ES 2.0 context");
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl.eglCreateContext(display, eglConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_gl_key").o("support_egl_context_client_version", 3), 12344});
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eglCreateContext, "eglCreateContext(...)");
        return eglCreateContext;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(javax.microedition.khronos.egl.EGL10 egl, javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLContext context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(egl, "egl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(display, "display");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RenderContextFactory", "destroyContext OpenGL ES 2.0 Context");
        egl.eglDestroyContext(display, context);
    }
}
