package el2;

/* loaded from: classes3.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f335326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f335327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f52 f335328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f335329g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(el2.i2 i2Var, r45.f52 f52Var, java.lang.Boolean bool, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f335327e = i2Var;
        this.f335328f = f52Var;
        this.f335329g = bool;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new el2.f2(this.f335327e, this.f335328f, this.f335329g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((el2.f2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f335326d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            el2.i2 i2Var = this.f335327e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = i2Var.f335363n;
            el2.e2 e2Var = new el2.e2(i2Var, this.f335328f, this.f335329g);
            this.f335326d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).a(e2Var, this) == aVar) {
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
