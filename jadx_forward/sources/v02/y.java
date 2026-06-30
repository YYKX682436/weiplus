package v02;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f513825d;

    /* renamed from: e, reason: collision with root package name */
    public int f513826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f513827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f513828g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f513829h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String str, java.lang.Long l17, v02.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f513827f = str;
        this.f513828g = l17;
        this.f513829h = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new v02.y(this.f513827f, this.f513828g, this.f513829h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((v02.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f513826e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        v02.f0 f0Var2 = this.f513829h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(this.f513827f, this.f513828g.longValue());
            if (k17 == null) {
                return f0Var;
            }
            this.f513825d = k17;
            this.f513826e = 1;
            java.lang.Object Zi = v02.f0.Zi(f0Var2, k17, this);
            if (Zi == aVar) {
                return aVar;
            }
            f9Var = k17;
            obj = Zi;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f513825d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        v02.f0.bj(f0Var2, f9Var, (java.lang.String) obj);
        return f0Var;
    }
}
