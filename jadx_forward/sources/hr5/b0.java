package hr5;

/* loaded from: classes15.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f365837d;

    /* renamed from: e, reason: collision with root package name */
    public int f365838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f365840g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f365841h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(hr5.a1 a1Var, long j17, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365839f = a1Var;
        this.f365840g = j17;
        this.f365841h = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr5.b0(this.f365839f, this.f365840g, this.f365841h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr5.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        zq5.n nVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f365838e;
        hr5.a1 a1Var = this.f365839f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                long j17 = a1Var.f365814e;
                zq5.g gVar = new zq5.g(j17);
                if (!zq5.h.c(j17)) {
                    gVar = null;
                }
                if (gVar == null) {
                    return java.lang.Boolean.FALSE;
                }
                long j18 = a1Var.f365815f;
                if ((zq5.h.c(j18) ? new zq5.g(j18) : null) == null) {
                    return java.lang.Boolean.FALSE;
                }
                this.f365838e = 1;
                if (a1Var.g("fling", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = (zq5.n) this.f365837d;
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    a1Var.f365810a.a(new hr5.a0(a1Var, nVar, this.f365840g));
                    a1Var.f(0);
                    return java.lang.Boolean.TRUE;
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            a1Var.f(16);
            hr5.a1 a1Var2 = this.f365839f;
            long j19 = a1Var2.f365829t.f556629b;
            zq5.n nVar2 = a1Var2.F;
            a1Var2.f365810a.a(new hr5.w(a1Var2, j19, nVar2, this.f365840g));
            hr5.a1 a1Var3 = this.f365839f;
            hr5.a aVar2 = a1Var3.f365812c;
            long j27 = this.f365840g;
            java.util.Map map = this.f365841h;
            hr5.y yVar = new hr5.y(a1Var3, j27, j19);
            hr5.z zVar = hr5.z.f366035d;
            this.f365837d = nVar2;
            this.f365838e = 2;
            if (((fr5.p0) aVar2).b(j19, nVar2, j27, map, yVar, zVar, this) == aVar) {
                return aVar;
            }
            nVar = nVar2;
            a1Var.f365810a.a(new hr5.a0(a1Var, nVar, this.f365840g));
            a1Var.f(0);
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Throwable th6) {
            a1Var.f(0);
            throw th6;
        }
    }
}
