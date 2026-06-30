package bp5;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f105000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.util.SparseArray sparseArray, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f105000d = sparseArray;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bp5.i(this.f105000d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bp5.i iVar = (bp5.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.RenderTargetHolder", "release all surface", new java.lang.Object[0]);
        int size = this.f105000d.size();
        for (int i17 = 0; i17 < size; i17++) {
            bp5.g gVar = (bp5.g) this.f105000d.valueAt(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "closeArrayMap: release " + gVar);
            android.opengl.EGLSurface eGLSurface = gVar.f104997c;
            if (eGLSurface != null) {
                android.opengl.EGLDisplay eGLDisplay = gVar.f104998d;
                if (eGLSurface == null) {
                    eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                }
                android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                gVar.f104997c = android.opengl.EGL14.EGL_NO_SURFACE;
                gVar.f104999e = false;
            }
        }
        return jz5.f0.f384359a;
    }
}
