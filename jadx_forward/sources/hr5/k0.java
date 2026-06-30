package hr5;

/* loaded from: classes15.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f365909d;

    /* renamed from: e, reason: collision with root package name */
    public long f365910e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f365911f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f365912g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f365913h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f365914i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f365915m;

    /* renamed from: n, reason: collision with root package name */
    public int f365916n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365917o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f365918p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f365919q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f365920r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gr5.d f365921s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(hr5.a1 a1Var, float f17, long j17, boolean z17, gr5.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365917o = a1Var;
        this.f365918p = f17;
        this.f365919q = j17;
        this.f365920r = z17;
        this.f365921s = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr5.k0(this.f365917o, this.f365918p, this.f365919q, this.f365920r, this.f365921s, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr5.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        zq5.v vVar;
        hr5.a1 a1Var;
        long j17;
        long j18;
        zq5.v vVar2;
        gr5.b bVar;
        boolean z17;
        gr5.n nVar;
        zq5.v a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f365916n;
        hr5.a1 a1Var2 = this.f365917o;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zq5.b.d();
            long j19 = a1Var2.f365814e;
            zq5.g gVar = new zq5.g(j19);
            if (!zq5.h.c(j19)) {
                gVar = null;
            }
            if (gVar == null) {
                return java.lang.Boolean.FALSE;
            }
            long j27 = a1Var2.f365815f;
            zq5.g gVar2 = new zq5.g(j27);
            if (!zq5.h.c(j27)) {
                gVar2 = null;
            }
            if (gVar2 == null) {
                return java.lang.Boolean.FALSE;
            }
            vVar = a1Var2.f365828s;
            zq5.v vVar3 = a1Var2.f365829t;
            gr5.n nVar2 = a1Var2.f365817h;
            gr5.b bVar2 = a1Var2.f365818i;
            boolean z18 = a1Var2.f365819j;
            this.f365911f = vVar;
            this.f365912g = vVar3;
            this.f365913h = nVar2;
            this.f365914i = bVar2;
            long j28 = gVar.f556600a;
            this.f365909d = j28;
            long j29 = gVar2.f556600a;
            this.f365910e = j29;
            this.f365915m = z18;
            this.f365916n = 1;
            a1Var = a1Var2;
            if (a1Var.g("scale", this) == aVar) {
                return aVar;
            }
            j17 = j28;
            j18 = j29;
            vVar2 = vVar3;
            bVar = bVar2;
            z17 = z18;
            nVar = nVar2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return java.lang.Boolean.TRUE;
            }
            boolean z19 = this.f365915m;
            long j37 = this.f365910e;
            long j38 = this.f365909d;
            gr5.b bVar3 = (gr5.b) this.f365914i;
            gr5.n nVar3 = (gr5.n) this.f365913h;
            zq5.v vVar4 = (zq5.v) this.f365912g;
            vVar = (zq5.v) this.f365911f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            z17 = z19;
            a1Var = a1Var2;
            bVar = bVar3;
            j18 = j37;
            j17 = j38;
            nVar = nVar3;
            vVar2 = vVar4;
        }
        float c17 = this.f365918p / vVar.c();
        float d17 = a1Var.d(c17, false);
        float c18 = vVar2.c();
        long j39 = vVar2.f556629b;
        long g17 = hr5.b1.g(j17, j18, nVar, bVar, z17, 0, c18, j39, this.f365919q);
        long e17 = hr5.b1.e(c18, j39, d17, g17, zq5.l.f556610b, 0.0f);
        long c19 = a1Var.c(e17, d17);
        a17 = r34.a((r20 & 1) != 0 ? r34.f556628a : zq5.s.a(d17, d17), (r20 & 2) != 0 ? r34.f556629b : c19, (r20 & 4) != 0 ? r34.f556630c : 0.0f, (r20 & 8) != 0 ? r34.f556631d : 0L, (r20 & 16) != 0 ? vVar2.f556632e : 0L);
        hr5.a1 a1Var3 = a1Var;
        a1Var.f365810a.a(new hr5.j0(c17, c18, d17, e17, j39, c19, a1Var3, this.f365918p, this.f365919q, this.f365920r, g17, vVar2, a17));
        if (this.f365920r) {
            hr5.a1 a1Var4 = this.f365917o;
            java.lang.Integer num = new java.lang.Integer(1);
            gr5.d dVar = this.f365921s;
            this.f365911f = null;
            this.f365912g = null;
            this.f365913h = null;
            this.f365914i = null;
            this.f365916n = 2;
            if (hr5.a1.a(a1Var4, a17, num, dVar, "scale", this) == aVar) {
                return aVar;
            }
        } else {
            a1Var3.j(a17);
        }
        return java.lang.Boolean.TRUE;
    }
}
