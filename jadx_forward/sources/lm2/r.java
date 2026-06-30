package lm2;

/* loaded from: classes3.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.s f400972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f400973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f400974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400975h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400976i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400977m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(lm2.s sVar, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.List list, java.util.List list2, java.util.List list3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f400972e = sVar;
        this.f400973f = z17;
        this.f400974g = gVar;
        this.f400975h = list;
        this.f400976i = list2;
        this.f400977m = list3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lm2.r(this.f400972e, this.f400973f, this.f400974g, this.f400975h, this.f400976i, this.f400977m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lm2.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f400971d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            lm2.q qVar = new lm2.q(this.f400972e, this.f400973f, this.f400974g, this.f400975h, this.f400976i, this.f400977m, null);
            this.f400971d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, qVar, this) == aVar) {
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
