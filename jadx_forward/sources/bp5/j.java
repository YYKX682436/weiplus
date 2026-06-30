package bp5;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp5.g f105001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bp5.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f105001d = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bp5.j(this.f105001d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bp5.j jVar = (bp5.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.RenderTargetHolder", "release surface " + this.f105001d, new java.lang.Object[0]);
        bp5.g gVar = this.f105001d;
        android.opengl.EGLSurface eGLSurface = gVar.f104997c;
        if (eGLSurface != null) {
            android.opengl.EGLDisplay eGLDisplay = gVar.f104998d;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            bp5.g gVar2 = this.f105001d;
            gVar2.f104997c = android.opengl.EGL14.EGL_NO_SURFACE;
            gVar2.f104999e = false;
        }
        return jz5.f0.f384359a;
    }
}
