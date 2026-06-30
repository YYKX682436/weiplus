package rk4;

/* loaded from: classes.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f478535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oe5.a f478536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24953x8ceac238 f478537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n13.t f478538h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(android.app.Activity activity, oe5.a aVar, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24953x8ceac238 c24953x8ceac238, n13.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478535e = activity;
        this.f478536f = aVar;
        this.f478537g = c24953x8ceac238;
        this.f478538h = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.u2(this.f478535e, this.f478536f, this.f478537g, this.f478538h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.u2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478534d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rk4.u6 u6Var = rk4.k8.f478321r;
            al4.a aVar2 = rk4.k8.f478323t;
            if (aVar2 != null) {
                this.f478534d = 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        ((dk5.y) a0Var).wi(this.f478535e, this.f478536f, this.f478537g.m92455xe6ec16a5(), this.f478538h);
        return f0Var;
    }
}
