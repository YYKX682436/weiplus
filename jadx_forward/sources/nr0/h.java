package nr0;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f420616d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f420617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr0.x f420618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nr0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420618f = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        nr0.h hVar = new nr0.h(this.f420618f, interfaceC29045xdcb5ca57);
        hVar.f420617e = obj;
        return hVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f420616d;
        nr0.x xVar = this.f420618f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f420617e;
            zr0.p pVar = xVar.f420655n;
            this.f420617e = y0Var2;
            this.f420616d = 1;
            if (pVar.j(this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f420617e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        is0.c cVar = xVar.f420651g;
        if (cVar != null) {
            cVar.close();
        }
        rs0.i.f480829a.u(xVar.f420656o);
        xVar.f420656o = null;
        xVar.f420650f = null;
        android.os.HandlerThread handlerThread = xVar.f420649e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        xVar.f420649e = null;
        android.graphics.SurfaceTexture surfaceTexture = xVar.f420652h;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        xVar.f420652h = null;
        android.view.Surface surface = xVar.f420653i;
        if (surface != null) {
            surface.release();
        }
        xVar.f420653i = null;
        p3325xe03a0797.p3326xc267989b.y0 y0Var3 = xVar.f420657p;
        if (y0Var3 != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var3, null);
        }
        xVar.f420657p = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", "destroyGLEnv finish hash:" + y0Var.hashCode());
        return jz5.f0.f384359a;
    }
}
