package bp5;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp5.g f23468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bp5.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23468d = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bp5.j(this.f23468d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bp5.j jVar = (bp5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.RenderTargetHolder", "release surface " + this.f23468d, new java.lang.Object[0]);
        bp5.g gVar = this.f23468d;
        android.opengl.EGLSurface eGLSurface = gVar.f23464c;
        if (eGLSurface != null) {
            android.opengl.EGLDisplay eGLDisplay = gVar.f23465d;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            bp5.g gVar2 = this.f23468d;
            gVar2.f23464c = android.opengl.EGL14.EGL_NO_SURFACE;
            gVar2.f23466e = false;
        }
        return jz5.f0.f302826a;
    }
}
