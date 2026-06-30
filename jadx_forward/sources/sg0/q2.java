package sg0;

/* loaded from: classes8.dex */
public final class q2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f489318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f489319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f489321g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f489322h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f489323i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(sg0.w2 w2Var, java.lang.Long l17, java.lang.String str, boolean z17, java.util.Map map, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489318d = w2Var;
        this.f489319e = l17;
        this.f489320f = str;
        this.f489321g = z17;
        this.f489322h = map;
        this.f489323i = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sg0.q2(this.f489318d, this.f489319e, this.f489320f, this.f489321g, this.f489322h, this.f489323i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sg0.q2 q2Var = (sg0.q2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 bj6 = sg0.w2.bj(this.f489318d, this.f489319e);
        if (bj6 != null) {
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("query", this.f489320f);
            lVarArr[1] = new jz5.l("addToKvHistory", java.lang.Boolean.valueOf(this.f489321g));
            java.util.Map map = this.f489322h;
            if (map == null) {
                map = new java.util.LinkedHashMap();
            }
            lVarArr[2] = new jz5.l("searchCgiParams", java.lang.String.valueOf(ri.l0.a(map)));
            bj6.a("onSearchClick", kz5.c1.k(lVarArr));
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f489323i, null, 1, null);
        return jz5.f0.f384359a;
    }
}
