package zx0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f558532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f558533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3995xe72952b6 f558534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zx0.f f558535g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yx0.b8 b8Var, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3995xe72952b6 c3995xe72952b6, zx0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558533e = b8Var;
        this.f558534f = c3995xe72952b6;
        this.f558535g = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zx0.e(this.f558533e, this.f558534f, this.f558535g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f558532d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f558533e.A = this.f558534f.f129385c;
            mx0.s sVar = mx0.s.f413830a;
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3995xe72952b6 c3995xe72952b6 = this.f558534f;
            this.f558532d = 1;
            obj = sVar.d(c3995xe72952b6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        rx0.d dVar = (rx0.d) obj;
        if (dVar.f482445a == null) {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b H = this.f558533e.H();
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3996x128b8fa c3996x128b8fa = dVar.f482446b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c3996x128b8fa);
            H.f(c3996x128b8fa);
            this.f558535g.f558537b.mo7808x76db6cb1(new rx0.a(rx0.b.f482439d, dVar, null));
        } else {
            this.f558533e.H().e(this.f558534f.f129383a, dVar.f482445a);
        }
        return jz5.f0.f384359a;
    }
}
