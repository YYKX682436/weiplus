package c61;

/* loaded from: classes5.dex */
public final class ta extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24580xe2b43b66 f120841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f120842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24580xe2b43b66 c24580xe2b43b66, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f120841e = c24580xe2b43b66;
        this.f120842f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c61.ta(this.f120841e, this.f120842f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.ta) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f120840d;
        yz5.l lVar = this.f120842f;
        jz5.f0 f0Var = jz5.f0.f384359a;
        try {
        } catch (java.lang.Exception e17) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            c61.sa saVar = new c61.sa(lVar, e17, null);
            this.f120840d = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, saVar, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c61.ka kaVar = new c61.ka(this.f120841e);
            this.f120840d = 1;
            obj = kaVar.s(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    return f0Var;
                }
                if (i17 == 3) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24581x76fae64a c24581x76fae64a = (com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24581x76fae64a) obj;
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        c61.ra raVar = new c61.ra(lVar, c24581x76fae64a, null);
        this.f120840d = 3;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var2, raVar, this) == aVar ? aVar : f0Var;
    }
}
