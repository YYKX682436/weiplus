package mx0;

/* loaded from: classes5.dex */
public final class g9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f413545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f413546g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413544e = c10977x8e40eced;
        this.f413545f = i17;
        this.f413546g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.g9(this.f413544e, this.f413545f, this.f413546g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.g9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413543d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413544e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            mx0.d9 d9Var = new mx0.d9(c10977x8e40eced, null);
            this.f413543d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, d9Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yx0.b8 b8Var = c10977x8e40eced.f151090v;
        int i18 = this.f413545f;
        boolean z17 = this.f413546g;
        com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b a17 = ts2.a.a(ts2.a.f503153a, c10977x8e40eced.R, false, 2, null);
        p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.y5(b8Var, new mx0.f9(c10977x8e40eced), z17, i18, a17, null), 3, null);
        return jz5.f0.f384359a;
    }
}
