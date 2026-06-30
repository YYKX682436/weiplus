package dv2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f325356d;

    /* renamed from: e, reason: collision with root package name */
    public int f325357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dv2.e1 f325358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 f325359g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 f325360h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(dv2.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 g9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325358f = e1Var;
        this.f325359g = g9Var;
        this.f325360h = m8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dv2.c1(this.f325358f, this.f325359g, this.f325360h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dv2.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        dv2.e1 e1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f325357e;
        dv2.e1 e1Var2 = this.f325358f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostSafePreCheckUIC", "[preCheckInner] wait for watermark detect result");
            ub2.k kVar = (ub2.k) ((jz5.n) e1Var2.f325374r).mo141623x754a37bb();
            this.f325356d = e1Var2;
            this.f325357e = 1;
            obj = kVar.c(this);
            if (obj == aVar) {
                return aVar;
            }
            e1Var = e1Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1Var = (dv2.e1) this.f325356d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        e1Var.f325372p = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostSafePreCheckUIC", "[preCheckInner] receive watermark detect result, " + e1Var2.f325372p);
        dv2.e1 e1Var3 = this.f325358f;
        pf5.e.m158344xbe96bc24(e1Var3, null, null, new dv2.b1(this.f325359g, e1Var3, this.f325360h, null), 3, null);
        return jz5.f0.f384359a;
    }
}
