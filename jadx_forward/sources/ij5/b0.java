package ij5;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f373286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f373287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f373288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f373289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wi5.z f373290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, java.util.HashMap hashMap, ij5.d0 d0Var, wi5.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373287e = i2Var;
        this.f373288f = hashMap;
        this.f373289g = d0Var;
        this.f373290h = zVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ij5.b0(this.f373287e, this.f373288f, this.f373289g, this.f373290h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((ij5.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f373286d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ij5.a0 a0Var = new ij5.a0(this.f373288f, this.f373289g, this.f373290h);
            this.f373286d = 1;
            if (this.f373287e.a(a0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
