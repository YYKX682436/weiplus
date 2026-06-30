package tx0;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f504045d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f504046e;

    /* renamed from: f, reason: collision with root package name */
    public int f504047f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f504048g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tx0.k f504049h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tx0.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504049h = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        tx0.g gVar = new tx0.g(this.f504049h, interfaceC29045xdcb5ca57);
        gVar.f504048g = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tx0.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        tx0.k kVar;
        java.lang.Throwable th6;
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f504047f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            tx0.k kVar2 = this.f504049h;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                this.f504048g = kVar2;
                this.f504045d = this;
                this.f504046e = kVar2;
                this.f504047f = 1;
                p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                rVar.k();
                if (kVar2.f504059c) {
                    kVar2.f504061e = new tx0.e(rVar);
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.h.e().l(kVar2.f504062f, true, false, false);
                    rVar.m(new tx0.f(kVar2));
                } else {
                    rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("No Location Permission"))));
                }
                java.lang.Object j17 = rVar.j();
                if (j17 == aVar) {
                    return aVar;
                }
                kVar = kVar2;
                obj = j17;
            } catch (java.lang.Throwable th7) {
                kVar = kVar2;
                th6 = th7;
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                kVar.f504060d = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
                return jz5.f0.f384359a;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (tx0.k) this.f504046e;
            try {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                p3321xbce91901.C29043x91b2b43d.Companion companion22 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                kVar.f504060d = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
                return jz5.f0.f384359a;
            }
        }
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813((com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011) obj);
        kVar.f504060d = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
        return jz5.f0.f384359a;
    }
}
