package pr0;

/* loaded from: classes14.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.n0 f439398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f439399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f439400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f439401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(pr0.n0 n0Var, android.graphics.SurfaceTexture surfaceTexture, java.lang.Integer num, java.lang.Integer num2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439398e = n0Var;
        this.f439399f = surfaceTexture;
        this.f439400g = num;
        this.f439401h = num2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pr0.j0(this.f439398e, this.f439399f, this.f439400g, this.f439401h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439397d;
        pr0.n0 n0Var = this.f439398e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nr0.x k17 = n0Var.k();
            this.f439397d = 1;
            k17.getClass();
            if (k17.m("bindSurface", new nr0.f(new android.view.Surface(this.f439399f), k17, this.f439400g, this.f439401h, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = as0.a.f94958a.a(n0Var.f439366d);
        if (a17 != null) {
            a17.f137108x = a17.b("ScreenViewType", "texture", true);
        }
        return jz5.f0.f384359a;
    }
}
