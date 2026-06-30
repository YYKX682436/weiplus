package yx0;

/* loaded from: classes5.dex */
public final class e6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f548819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nx0.w f548820g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(yx0.b8 b8Var, pp0.p0 p0Var, nx0.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548818e = b8Var;
        this.f548819f = p0Var;
        this.f548820g = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.e6(this.f548818e, this.f548819f, this.f548820g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.e6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548817d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f548817d = 1;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
            if (this.f548818e.B(this.f548819f, this.f548820g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
