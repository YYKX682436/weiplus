package iq2;

/* loaded from: classes2.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f375312d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f375313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f375315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f375316h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f375317i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f375318m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f375319n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(iq2.d0 d0Var, boolean z17, int i17, long j17, yz5.l lVar, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f375314f = d0Var;
        this.f375315g = z17;
        this.f375316h = i17;
        this.f375317i = j17;
        this.f375318m = lVar;
        this.f375319n = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        iq2.x xVar = new iq2.x(this.f375314f, this.f375315g, this.f375316h, this.f375317i, this.f375318m, this.f375319n, interfaceC29045xdcb5ca57);
        xVar.f375313e = obj;
        return xVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((iq2.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f375312d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f375313e;
            iq2.w wVar = new iq2.w(this.f375314f, this.f375315g, this.f375316h, this.f375317i);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            aq2.p pVar = new aq2.p(wVar, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), this.f375314f.f375250a);
            this.f375312d = 1;
            obj = ay1.l.j(pVar, false, this, 1, null);
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
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        iq2.d0 d0Var = this.f375314f;
        oz5.l lVar = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) d0Var.f375257h).f392029d;
        iq2.v vVar = new iq2.v(d0Var, fVar, this.f375315g, this.f375317i, this.f375318m, this.f375319n, null);
        this.f375312d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(lVar, vVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
