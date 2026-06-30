package bm2;

/* loaded from: classes8.dex */
public final class a7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f103308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f103309f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(bm2.k7 k7Var, r45.yx1 yx1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f103308e = k7Var;
        this.f103309f = yx1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bm2.a7(this.f103308e, this.f103309f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.a7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f103307d;
        bm2.k7 k7Var = this.f103308e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sf2.d3 d3Var = k7Var.f103573i;
            this.f103307d = 1;
            obj = d3Var.o7(3, this.f103309f, false, this);
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
        if (obj != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            bm2.z6 z6Var = new bm2.z6(k7Var, null);
            this.f103307d = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, z6Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
