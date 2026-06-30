package eb2;

/* loaded from: classes2.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332339d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb2.m0 f332341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f332342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f332343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332344i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f332345m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ rn5.a f332346n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f332347o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ db2.v3 f332348p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e f332349q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f332350r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f332351s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(eb2.m0 m0Var, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.List list, boolean z17, rn5.a aVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, db2.v3 v3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar, boolean z18, db2.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f332341f = m0Var;
        this.f332342g = i17;
        this.f332343h = gVar;
        this.f332344i = list;
        this.f332345m = z17;
        this.f332346n = aVar;
        this.f332347o = gVar2;
        this.f332348p = v3Var;
        this.f332349q = eVar;
        this.f332350r = z18;
        this.f332351s = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        eb2.l0 l0Var = new eb2.l0(this.f332341f, this.f332342g, this.f332343h, this.f332344i, this.f332345m, this.f332346n, this.f332347o, this.f332348p, this.f332349q, this.f332350r, this.f332351s, interfaceC29045xdcb5ca57);
        l0Var.f332340e = obj;
        return l0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((eb2.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f332339d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f332340e;
            eb2.m0 m0Var = this.f332341f;
            int i18 = this.f332342g;
            eb2.k0 k0Var = new eb2.k0(m0Var, i18, this.f332343h, this.f332344i, this.f332345m, this.f332346n, this.f332347o, this.f332348p, this.f332349q, this.f332350r, this.f332351s);
            m0Var.f332365t = i18;
            this.f332341f.f332364s = true;
            oz5.l f93115e = y0Var.getF93115e();
            int i19 = p3325xe03a0797.p3326xc267989b.r2.O0;
            gb2.d dVar = new gb2.d(k0Var, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), null, 4, null);
            this.f332339d = 1;
            z17 = false;
            j17 = ay1.l.j(dVar, false, this, 1, null);
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = obj;
            z17 = false;
        }
        this.f332341f.f332364s = z17;
        return jz5.f0.f384359a;
    }
}
