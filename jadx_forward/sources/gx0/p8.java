package gx0;

/* loaded from: classes5.dex */
public final class p8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358364d;

    /* renamed from: e, reason: collision with root package name */
    public int f358365e;

    public p8(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.p8(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new gx0.p8((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358365e;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i95.m mVar = (i95.m) this.f358364d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return mVar;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        i95.m c17 = i95.n0.c(pp0.q0.class);
        pp0.q0 q0Var = (pp0.q0) c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q0Var);
        pp0.q0.od(q0Var, false, 1, null);
        this.f358364d = c17;
        this.f358365e = 1;
        java.lang.Object g17 = az0.i5.f97090a.g(this);
        if (g17 != aVar) {
            g17 = jz5.f0.f384359a;
        }
        return g17 == aVar ? aVar : c17;
    }
}
