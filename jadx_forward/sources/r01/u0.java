package r01;

/* loaded from: classes7.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r01.l1 f449789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f449790f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r01.l1 l1Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449789e = l1Var;
        this.f449790f = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new r01.u0(this.f449789e, this.f449790f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((r01.u0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f449788d;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TAG", "Error: " + e17.getMessage());
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r01.s0 s0Var = new r01.s0(this.f449789e, null);
            this.f449788d = 1;
            obj = p3325xe03a0797.p3326xc267989b.z0.f(s0Var, this);
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
        jz5.l lVar = (jz5.l) obj;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b) lVar.f384366d;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar2 = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b) lVar.f384367e;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        r01.t0 t0Var = new r01.t0(this.f449790f, bVar, bVar2, null);
        this.f449788d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, t0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
