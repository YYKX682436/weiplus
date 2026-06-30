package h41;

/* loaded from: classes14.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h41.x f360389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f360390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h41.x xVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360389e = xVar;
        this.f360390f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.t(this.f360389e, this.f360390f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360388d;
        h41.x xVar = this.f360389e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h41.j jVar = xVar.f360418b;
            h41.m mVar = new h41.m(xVar);
            h41.n nVar = new h41.n(xVar);
            h41.o oVar = new h41.o(xVar);
            h41.p pVar = new h41.p(xVar);
            h41.q qVar = new h41.q(xVar);
            h41.r rVar = new h41.r(xVar);
            h41.s sVar = new h41.s(xVar);
            this.f360388d = 1;
            obj = jVar.b(mVar, nVar, oVar, pVar, qVar, rVar, sVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.a aVar2 = xVar.f360417a;
        if (aVar2 != null) {
            aVar2.H1(this.f360390f, booleanValue);
        }
        return jz5.f0.f384359a;
    }
}
