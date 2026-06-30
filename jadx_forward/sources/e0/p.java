package e0;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f327193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.u1 f327194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.k0 f327195f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e0.u1 u1Var, z.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f327194e = u1Var;
        this.f327195f = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e0.p(this.f327194e, this.f327195f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e0.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f327193d;
        e0.u1 u1Var = this.f327194e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                boolean e17 = u1Var.f327240b.e();
                z.p pVar = this.f327195f;
                if (e17) {
                    pVar = pVar instanceof z.p1 ? (z.p1) pVar : e0.r.f327226a;
                }
                z.p pVar2 = pVar;
                z.e eVar = u1Var.f327240b;
                p2.m mVar = new p2.m(u1Var.f327241c);
                this.f327193d = 1;
                if (z.e.c(eVar, mVar, pVar2, null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            ((n0.q4) u1Var.f327242d).mo148714x53d8522f(java.lang.Boolean.FALSE);
        } catch (java.util.concurrent.CancellationException unused) {
        }
        return jz5.f0.f384359a;
    }
}
