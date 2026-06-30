package hr5;

/* loaded from: classes15.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f365858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f365859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f365860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f365861h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hr5.a1 a1Var, float f17, long j17, long j18, float f18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365857d = a1Var;
        this.f365858e = f17;
        this.f365859f = j17;
        this.f365860g = j18;
        this.f365861h = f18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr5.d0(this.f365857d, this.f365858e, this.f365859f, this.f365860g, this.f365861h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr5.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        zq5.v a17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        hr5.a1 a1Var = this.f365857d;
        long j17 = a1Var.f365814e;
        zq5.g gVar = new zq5.g(j17);
        if (!zq5.h.c(j17)) {
            gVar = null;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (gVar != null) {
            long j18 = a1Var.f365815f;
            if ((zq5.h.c(j18) ? new zq5.g(j18) : null) != null) {
                float c17 = (a1Var.f365830u.c() * this.f365858e) / a1Var.f365828s.c();
                float d17 = a1Var.d(c17, a1Var.f365823n);
                zq5.v vVar = a1Var.f365829t;
                float c18 = vVar.c();
                long j19 = vVar.f556629b;
                long e17 = hr5.b1.e(c18, j19, d17, this.f365859f, this.f365860g, 0.0f);
                long c19 = a1Var.c(e17, d17);
                a17 = vVar.a((r20 & 1) != 0 ? vVar.f556628a : zq5.s.a(d17, d17), (r20 & 2) != 0 ? vVar.f556629b : c19, (r20 & 4) != 0 ? vVar.f556630c : 0.0f, (r20 & 8) != 0 ? vVar.f556631d : 0L, (r20 & 16) != 0 ? vVar.f556632e : 0L);
                hr5.a1 a1Var2 = this.f365857d;
                a1Var2.f365810a.a(new hr5.c0(c17, c18, d17, e17, j19, c19, a1Var2, this.f365859f, this.f365858e, this.f365860g, this.f365861h, vVar, a17));
                a1Var.j(a17);
            }
        }
        return f0Var;
    }
}
