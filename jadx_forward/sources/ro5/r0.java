package ro5;

/* loaded from: classes14.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f479821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f479823f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ro5.m1 m1Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479822e = m1Var;
        this.f479823f = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ro5.r0(this.f479822e, this.f479823f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ro5.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479821d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            cp5.j jVar = this.f479822e.f479775d.f537333n;
            this.f479821d = 1;
            jVar.getClass();
            obj = p3325xe03a0797.p3326xc267989b.l.g(jVar.f302692d, new cp5.g(false, jVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        dp5.f fVar = (dp5.f) obj;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(((dp5.a) fVar).f323805d);
        surfaceTexture.setOnFrameAvailableListener(new ro5.q0(this.f479823f, fVar));
        return new ro5.f0(surfaceTexture, fVar);
    }
}
