package ty0;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f504349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f504350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504352g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0.f1 f1Var, n0.e5 e5Var, n0.e5 e5Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504350e = f1Var;
        this.f504351f = e5Var;
        this.f504352g = e5Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ty0.d0(this.f504350e, this.f504351f, this.f504352g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ty0.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f504349d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            n0.e5 e5Var = this.f504351f;
            java.util.Iterator it = ty0.z0.h(e5Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj2).m33856x92013dca(), (java.lang.String) this.f504352g.mo128745x754a37bb())) {
                    break;
                }
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj2;
            int indexOf = c4116xf4b2c356 != null ? ((java.util.List) e5Var.mo128745x754a37bb()).indexOf(c4116xf4b2c356) : 0;
            e0.f1 f1Var = this.f504350e;
            this.f504349d = 1;
            if (e0.f1.g(f1Var, indexOf, 0, this, 2, null) == aVar) {
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
