package eq2;

/* loaded from: classes2.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337425d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f337426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f337427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jq2.a f337428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f337430i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f337431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f337432n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i17, jq2.a aVar, java.lang.String str, int i18, int i19, int i27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f337427f = i17;
        this.f337428g = aVar;
        this.f337429h = str;
        this.f337430i = i18;
        this.f337431m = i19;
        this.f337432n = i27;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        eq2.d dVar = new eq2.d(this.f337427f, this.f337428g, this.f337429h, this.f337430i, this.f337431m, this.f337432n, interfaceC29045xdcb5ca57);
        dVar.f337426e = obj;
        return dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((eq2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f337425d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f337426e;
            eq2.c cVar = new eq2.c(this.f337427f, this.f337428g, this.f337429h, this.f337430i, this.f337431m, this.f337432n);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            aq2.p pVar = new aq2.p(cVar, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), null);
            this.f337425d = 1;
            if (ay1.l.h(pVar, this) == aVar) {
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
