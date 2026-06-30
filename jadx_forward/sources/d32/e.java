package d32;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d32.j f307674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d32.j jVar) {
        super(0);
        this.f307674d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        d32.j jVar = this.f307674d;
        d32.k kVar = jVar.f307689i;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderer");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureMixRenderer", "release: ");
        is0.c cVar = kVar.f307700f;
        if (cVar != null) {
            cVar.close();
        }
        is0.c cVar2 = kVar.f307702h;
        if (cVar2 != null) {
            cVar2.close();
        }
        is0.c cVar3 = kVar.B;
        if (cVar3 != null) {
            cVar3.close();
        }
        is0.c cVar4 = kVar.C;
        if (cVar4 != null) {
            cVar4.close();
        }
        android.opengl.GLES20.glDeleteProgram(kVar.f307704j);
        android.opengl.GLES20.glDeleteProgram(kVar.f307716v);
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{kVar.A}, 0);
        try {
            p05.l4 l4Var = kVar.f307720z;
            if (l4Var != null) {
                l4Var.o();
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkSegmentDestroyFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1012L, 47L);
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = jVar.f307684d;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        javax.microedition.khronos.egl.EGL10 egl10 = jVar.f307683c;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        egl10.eglDestroyContext(jVar.f307684d, jVar.f307685e);
        egl10.eglDestroySurface(jVar.f307684d, jVar.f307686f);
        egl10.eglTerminate(jVar.f307684d);
        jVar.f307685e = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        jVar.f307686f = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        jVar.f307692l.quit();
        return jz5.f0.f384359a;
    }
}
