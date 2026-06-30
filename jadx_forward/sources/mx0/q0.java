package mx0;

/* loaded from: classes5.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f413763f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(mx0.e1 e1Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413762e = e1Var;
        this.f413763f = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.q0(this.f413762e, this.f413763f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413761d;
        mx0.e1 e1Var = this.f413762e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f413761d = 1;
            e1Var.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            e1Var.f413467a.A0(new mx0.g0(nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        e1Var.f(booleanValue ? mx0.d0.f413426d : mx0.d0.f413428f);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        mx0.p0 p0Var2 = new mx0.p0(this.f413763f, booleanValue, e1Var, null);
        this.f413761d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, p0Var2, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
