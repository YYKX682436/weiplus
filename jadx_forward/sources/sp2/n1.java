package sp2;

/* loaded from: classes2.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492637d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f492638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f492640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f492641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f492642i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f492643m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f492644n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.a f492645o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.l f492646p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f492647q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(sp2.o2 o2Var, boolean z17, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, long j17, yz5.a aVar, yz5.l lVar, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492639f = o2Var;
        this.f492640g = z17;
        this.f492641h = i17;
        this.f492642i = gVar;
        this.f492643m = i18;
        this.f492644n = j17;
        this.f492645o = aVar;
        this.f492646p = lVar;
        this.f492647q = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        sp2.n1 n1Var = new sp2.n1(this.f492639f, this.f492640g, this.f492641h, this.f492642i, this.f492643m, this.f492644n, this.f492645o, this.f492646p, this.f492647q, interfaceC29045xdcb5ca57);
        n1Var.f492638e = obj;
        return n1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492637d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f492638e;
            sp2.o2 o2Var = this.f492639f;
            o2Var.f492697z = true;
            sp2.m1 m1Var = new sp2.m1(this.f492640g, this.f492639f, this.f492642i, this.f492641h, this.f492640g && this.f492641h == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o2Var.V, "default"), this.f492643m, this.f492644n);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            aq2.m mVar = new aq2.m(m1Var, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), o2Var.f492654a);
            this.f492637d = 1;
            z17 = false;
            j17 = ay1.l.j(mVar, false, this, 1, null);
            if (j17 == aVar) {
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
            j17 = obj;
            z17 = false;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) j17;
        sp2.o2 o2Var2 = this.f492639f;
        o2Var2.f492697z = z17;
        oz5.l lVar = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) o2Var2.f492662e).f392029d;
        sp2.l1 l1Var = new sp2.l1(fVar, this.f492641h, o2Var2, this.f492640g, this.f492643m, this.f492645o, this.f492644n, this.f492646p, this.f492647q, null);
        this.f492637d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(lVar, l1Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
