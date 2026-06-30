package gu0;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357378d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357379e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357380f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f357381g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f357382h;

    /* renamed from: i, reason: collision with root package name */
    public int f357383i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357384m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357385n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 f357386o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 f357387p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(gu0.k2 k2Var, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357384m = k2Var;
        this.f357385n = str;
        this.f357386o = c4069xbe747ef4;
        this.f357387p = c4167x88133861;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gu0.x0(this.f357384m, this.f357385n, this.f357386o, this.f357387p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422;
        java.lang.Exception e17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357383i;
        gu0.k2 k2Var = this.f357384m;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((yy0.k8) ((pp0.q0) i95.n0.c(pp0.q0.class))).getClass();
            if (!az0.i5.f97090a.t()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "exportVideoInternal: MaasCore not inited, skip ExportSession creation");
                return null;
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe68764222 = new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422();
            k2Var.f357272o = c4143xe68764222;
            try {
                java.lang.String str = this.f357385n;
                com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4 = this.f357386o;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861 = this.f357387p;
                this.f357378d = c4143xe68764222;
                this.f357379e = str;
                this.f357380f = c4069xbe747ef4;
                this.f357381g = c4167x88133861;
                this.f357382h = k2Var;
                this.f357383i = 1;
                p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                rVar.k();
                rVar.m(new gu0.t0(c4143xe68764222));
                c4143xe68764222.c(str, c4069xbe747ef4, c4167x88133861, c4167x88133861.f129947a.n(), gu0.u0.f357350a, gu0.v0.f357360a, new gu0.w0(c4143xe68764222, k2Var, str, rVar));
                java.lang.Object j17 = rVar.j();
                if (j17 == aVar) {
                    return aVar;
                }
                c4143xe6876422 = c4143xe68764222;
                obj = j17;
            } catch (java.lang.Exception e18) {
                c4143xe6876422 = c4143xe68764222;
                e17 = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "exportVideoInternal exception: " + e17.getMessage());
                c4143xe6876422.b();
                k2Var.f357272o = null;
                return null;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4143xe6876422 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422) this.f357378d;
            try {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            } catch (java.lang.Exception e19) {
                e17 = e19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "exportVideoInternal exception: " + e17.getMessage());
                c4143xe6876422.b();
                k2Var.f357272o = null;
                return null;
            }
        }
        return (jz5.o) obj;
    }
}
