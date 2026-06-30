package yx0;

/* loaded from: classes.dex */
public final class l5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 f548970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(yx0.b8 b8Var, com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548969e = b8Var;
        this.f548970f = c11121x1f1011;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.l5(this.f548969e, this.f548970f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.l5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548968d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f548969e.f548725s != yx0.v.f549228f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "setLocationInfo >> but state is " + this.f548969e.f548725s);
                return f0Var;
            }
            pp0.p0 p0Var = this.f548969e.K;
            if (p0Var != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 a17 = tx0.a.a(this.f548970f);
                this.f548968d = 1;
                obj = p0Var.G0(a17, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        return f0Var;
    }
}
