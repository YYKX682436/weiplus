package j0;

/* loaded from: classes14.dex */
public final class n4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f377997d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f377998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f377999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f378000g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f378001h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f378002i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(p3325xe03a0797.p3326xc267989b.y0 y0Var, n0.v2 v2Var, c0.o oVar, n0.e5 e5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377999f = y0Var;
        this.f378000g = v2Var;
        this.f378001h = oVar;
        this.f378002i = e5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        j0.n4 n4Var = new j0.n4(this.f377999f, this.f378000g, this.f378001h, this.f378002i, interfaceC29045xdcb5ca57);
        n4Var.f377998e = obj;
        return n4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.n4) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f377997d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.a0 a0Var = (p1.a0) this.f377998e;
            j0.l4 l4Var = new j0.l4(this.f377999f, this.f378000g, this.f378001h, null);
            j0.m4 m4Var = new j0.m4(this.f378002i);
            this.f377997d = 1;
            if (b0.d4.d(a0Var, l4Var, m4Var, this) == aVar) {
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
