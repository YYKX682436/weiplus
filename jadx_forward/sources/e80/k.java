package e80;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331560d;

    /* renamed from: e, reason: collision with root package name */
    public int f331561e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m11.d f331563g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m11.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f331563g = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        e80.k kVar = new e80.k(this.f331563g, interfaceC29045xdcb5ca57);
        kVar.f331562f = obj;
        return kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e80.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        w11.m1 a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f331561e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f331562f = (p3325xe03a0797.p3326xc267989b.y0) this.f331562f;
            m11.d dVar = this.f331563g;
            this.f331560d = dVar;
            this.f331561e = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            com.p314xaae8f345.mm.p944x882e457a.f fVar = new com.p314xaae8f345.mm.p944x882e457a.f();
            dVar.f404203u = new e80.j(fVar, rVar, dVar);
            ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).getClass();
            w11.o1 o1Var = w11.s1.f523679a;
            if (o1Var == null || (a17 = ((aq1.l) o1Var).a(dVar)) == null) {
                fVar.f152148a = 3;
                fVar.f152149b = -1;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(fVar));
            } else {
                gm0.j1.d().g(a17.f523621a);
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
