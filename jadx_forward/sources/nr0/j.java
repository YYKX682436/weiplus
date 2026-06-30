package nr0;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f420620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f420621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nr0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420621e = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr0.j(this.f420621e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f420620d;
        nr0.x xVar = this.f420621e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.view.Surface surface = xVar.f420653i;
            if (!(surface != null && surface.isValid())) {
                this.f420620d = 1;
                if (xVar.m("getGLInputTexture", new nr0.k(xVar, true, null), this) == aVar) {
                    return aVar;
                }
            }
            return xVar.f420653i;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xVar.f420653i = new android.view.Surface(xVar.f420652h);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create texture:[");
        sb6.append(xVar.f420651g);
        sb6.append("] surface:[");
        android.view.Surface surface2 = xVar.f420653i;
        sb6.append(surface2 != null ? new java.lang.Integer(surface2.hashCode()) : null);
        sb6.append("] name:");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", sb6.toString());
        return xVar.f420653i;
    }
}
