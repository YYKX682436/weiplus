package cr2;

/* loaded from: classes2.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f303414d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f303415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cr2.x f303416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f303417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f303418h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303419i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303420m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(cr2.x xVar, int i17, boolean z17, yz5.l lVar, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f303416f = xVar;
        this.f303417g = i17;
        this.f303418h = z17;
        this.f303419i = lVar;
        this.f303420m = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        cr2.r rVar = new cr2.r(this.f303416f, this.f303417g, this.f303418h, this.f303419i, this.f303420m, interfaceC29045xdcb5ca57);
        rVar.f303415e = obj;
        return rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cr2.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f303414d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f303415e;
            int i18 = this.f303417g;
            boolean z17 = this.f303418h;
            cr2.x xVar = this.f303416f;
            cr2.q qVar = new cr2.q(i18, xVar, z17);
            oz5.l f93115e = y0Var.getF93115e();
            int i19 = p3325xe03a0797.p3326xc267989b.r2.O0;
            aq2.g gVar = new aq2.g(qVar, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), xVar.f303428a, xVar.f303432e);
            this.f303414d = 1;
            obj = ay1.l.j(gVar, false, this, 1, null);
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
        cr2.x xVar2 = this.f303416f;
        oz5.l lVar = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) xVar2.f303438k).f392029d;
        cr2.p pVar = new cr2.p(xVar2, fVar, this.f303419i, this.f303418h, this.f303420m, null);
        this.f303414d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(lVar, pVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
