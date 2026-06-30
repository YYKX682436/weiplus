package mw1;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw1.b f413228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mw1.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413228d = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mw1.d(this.f413228d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mw1.d dVar = (mw1.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.RenderTargetHolder", "release surface " + this.f413228d, new java.lang.Object[0]);
        mw1.b bVar = this.f413228d;
        android.opengl.EGLSurface eGLSurface = bVar.f413225c;
        if (eGLSurface != null) {
            android.opengl.EGLDisplay eGLDisplay = bVar.f413226d;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            mw1.b bVar2 = this.f413228d;
            bVar2.f413225c = android.opengl.EGL14.EGL_NO_SURFACE;
            bVar2.f413227e = false;
        }
        return jz5.f0.f384359a;
    }
}
