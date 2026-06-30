package bp5;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f23467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.util.SparseArray sparseArray, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23467d = sparseArray;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bp5.i(this.f23467d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bp5.i iVar = (bp5.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.RenderTargetHolder", "release all surface", new java.lang.Object[0]);
        int size = this.f23467d.size();
        for (int i17 = 0; i17 < size; i17++) {
            bp5.g gVar = (bp5.g) this.f23467d.valueAt(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "closeArrayMap: release " + gVar);
            android.opengl.EGLSurface eGLSurface = gVar.f23464c;
            if (eGLSurface != null) {
                android.opengl.EGLDisplay eGLDisplay = gVar.f23465d;
                if (eGLSurface == null) {
                    eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                }
                android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                gVar.f23464c = android.opengl.EGL14.EGL_NO_SURFACE;
                gVar.f23466e = false;
            }
        }
        return jz5.f0.f302826a;
    }
}
