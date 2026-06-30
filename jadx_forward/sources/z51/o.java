package z51;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f551730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.p f551731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z51.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f551731e = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new z51.o(this.f551731e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f551730d;
        z51.p pVar = this.f551731e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = ((z51.w) pVar.a(z51.w.class)).f551762g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("first play no wait parse to check loadBitmapJob: ");
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) : null);
            pVar.f(sb6.toString());
            if (r2Var != null) {
                this.f551730d = 1;
                if (((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
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
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        z51.n nVar = new z51.n(pVar, null);
        this.f551730d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, nVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
