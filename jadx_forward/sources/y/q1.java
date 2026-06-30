package y;

/* loaded from: classes14.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f539964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y.p1 f539965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f539966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y.s1 f539967g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(y.p1 p1Var, long j17, y.s1 s1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539965e = p1Var;
        this.f539966f = j17;
        this.f539967g = s1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new y.q1(this.f539965e, this.f539966f, this.f539967g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((y.q1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.p pVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f539964d;
        y.s1 s1Var = this.f539967g;
        y.p1 p1Var = this.f539965e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            z.e eVar = p1Var.f539957a;
            p2.q qVar = new p2.q(this.f539966f);
            z.p pVar2 = s1Var.f539973d;
            this.f539964d = 1;
            obj = z.e.c(eVar, qVar, pVar2, null, null, this, 12, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        z.n nVar = (z.n) obj;
        if (nVar.f550279b == z.m.Finished && (pVar = s1Var.f539975f) != null) {
            pVar.mo149xb9724478(new p2.q(p1Var.f539958b), nVar.f550278a.mo128745x754a37bb());
        }
        return jz5.f0.f384359a;
    }
}
