package jj3;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jj3.c f381551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(jj3.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f381551d = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jj3.i(this.f381551d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jj3.i iVar = (jj3.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.RenderTargetHolder", "release surface " + this.f381551d, new java.lang.Object[0]);
        jj3.c cVar = this.f381551d;
        android.opengl.EGLSurface eGLSurface = cVar.f381539c;
        if (eGLSurface != null) {
            android.opengl.EGLDisplay eGLDisplay = cVar.f381540d;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            jj3.c cVar2 = this.f381551d;
            cVar2.f381539c = android.opengl.EGL14.EGL_NO_SURFACE;
            cVar2.f381541e = false;
        }
        return jz5.f0.f384359a;
    }
}
