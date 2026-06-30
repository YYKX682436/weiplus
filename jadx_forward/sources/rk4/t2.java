package rk4;

/* loaded from: classes.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(rk4.l3 l3Var, android.content.Context context, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478509e = l3Var;
        this.f478510f = context;
        this.f478511g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.t2(this.f478509e, this.f478510f, this.f478511g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.t2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478508d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rk4.u6 u6Var = rk4.k8.f478321r;
            al4.a aVar2 = rk4.k8.f478323t;
            if (aVar2 != null) {
                this.f478508d = 1;
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
        rk4.s2 s2Var = new rk4.s2(this.f478511g);
        n13.r rVar = new n13.r();
        rVar.f415651b = this.f478509e.f478361s;
        rVar.f415652c = s2Var;
        rVar.f415659j = false;
        rVar.f415650a = false;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).a(this.f478510f, rVar);
        return f0Var;
    }
}
