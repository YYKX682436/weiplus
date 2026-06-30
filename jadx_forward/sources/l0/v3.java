package l0;

/* loaded from: classes14.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f396091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f396092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f396093f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f396094g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f396095h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f396096i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(float f17, long j17, yz5.p pVar, int i17, boolean z17, long j18) {
        super(2);
        this.f396091d = f17;
        this.f396092e = j17;
        this.f396093f = pVar;
        this.f396094g = i17;
        this.f396095h = z17;
        this.f396096i = j18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        a2.t tVar;
        a2.s sVar;
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        n0.h3 h3Var = l0.l5.f395909a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        a2.o1 start = ((l0.j5) y0Var2.i(h3Var)).f395840g;
        a2.o1 stop = ((l0.j5) y0Var2.i(h3Var)).f395845l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stop, "stop");
        int i17 = a2.i1.f82280e;
        a2.g1 start2 = start.f82323a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start2, "start");
        a2.g1 stop2 = stop.f82323a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stop2, "stop");
        l2.l start3 = start2.f82256a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start3, "start");
        l2.l stop3 = stop2.f82256a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stop3, "stop");
        int i18 = l2.l.f396657a;
        long a17 = start3.a();
        long a18 = stop3.a();
        float f17 = this.f396091d;
        long f18 = e1.a0.f(a17, a18, f17);
        l2.l bVar = (f18 > e1.y.f327853k ? 1 : (f18 == e1.y.f327853k ? 0 : -1)) != 0 ? new l2.b(f18, null) : l2.j.f396655b;
        f2.h hVar = (f2.h) a2.i1.a(start2.f82261f, stop2.f82261f, f17);
        long b17 = a2.i1.b(start2.f82257b, stop2.f82257b, f17);
        f2.r start4 = start2.f82258c;
        if (start4 == null) {
            start4 = f2.r.f340355i;
        }
        f2.r stop4 = stop2.f82258c;
        if (stop4 == null) {
            stop4 = f2.r.f340355i;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start4, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stop4, "stop");
        int i19 = stop4.f340358d;
        f2.r rVar = new f2.r(e06.p.f(start4.f340358d + a06.d.a((i19 - r9) * f17), 1, 1000));
        f2.p pVar = (f2.p) a2.i1.a(start2.f82259d, stop2.f82259d, f17);
        f2.q qVar = (f2.q) a2.i1.a(start2.f82260e, stop2.f82260e, f17);
        java.lang.String str = (java.lang.String) a2.i1.a(start2.f82262g, stop2.f82262g, f17);
        long b18 = a2.i1.b(start2.f82263h, stop2.f82263h, f17);
        l2.a aVar = start2.f82264i;
        float f19 = aVar != null ? aVar.f396639a : 0.0f;
        l2.a aVar2 = stop2.f82264i;
        float a19 = q2.a.a(f19, aVar2 != null ? aVar2.f396639a : 0.0f, f17);
        l2.m mVar = l2.m.f396658c;
        l2.m mVar2 = start2.f82265j;
        if (mVar2 == null) {
            mVar2 = mVar;
        }
        l2.m mVar3 = stop2.f82265j;
        if (mVar3 != null) {
            mVar = mVar3;
        }
        l2.m mVar4 = new l2.m(q2.a.a(mVar2.f396659a, mVar.f396659a, f17), q2.a.a(mVar2.f396660b, mVar.f396660b, f17));
        h2.d dVar = (h2.d) a2.i1.a(start2.f82266k, stop2.f82266k, f17);
        long f27 = e1.a0.f(start2.f82267l, stop2.f82267l, f17);
        l2.g gVar = (l2.g) a2.i1.a(start2.f82268m, stop2.f82268m, f17);
        e1.z0 z0Var = start2.f82269n;
        if (z0Var == null) {
            z0Var = new e1.z0(0L, 0L, 0.0f, 7, null);
        }
        e1.z0 z0Var2 = stop2.f82269n;
        if (z0Var2 == null) {
            z0Var2 = new e1.z0(0L, 0L, 0.0f, 7, null);
        }
        long f28 = e1.a0.f(z0Var.f327860a, z0Var2.f327860a, f17);
        long j17 = z0Var.f327861b;
        float c17 = d1.e.c(j17);
        long j18 = z0Var2.f327861b;
        e1.z0 z0Var3 = new e1.z0(f28, d1.f.a(q2.a.a(c17, d1.e.c(j18), f17), q2.a.a(d1.e.d(j17), d1.e.d(j18), f17)), q2.a.a(z0Var.f327862c, z0Var2.f327862c, f17), null);
        a2.t tVar2 = start2.f82270o;
        if (tVar2 == null && stop2.f82270o == null) {
            tVar = null;
        } else {
            if (tVar2 == null) {
                tVar2 = a2.t.f82343a;
            }
            tVar = tVar2;
        }
        a2.g1 g1Var = new a2.g1(bVar, b17, rVar, pVar, qVar, hVar, str, b18, new l2.a(a19), mVar4, dVar, f27, gVar, z0Var3, tVar, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null);
        int i27 = a2.q.f82334b;
        a2.p start5 = start.f82324b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start5, "start");
        a2.p stop5 = stop.f82324b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stop5, "stop");
        l2.f fVar = (l2.f) a2.i1.a(start5.f82326a, stop5.f82326a, f17);
        l2.h hVar2 = (l2.h) a2.i1.a(start5.f82327b, stop5.f82327b, f17);
        long b19 = a2.i1.b(start5.f82328c, stop5.f82328c, f17);
        l2.n start6 = start5.f82329d;
        if (start6 == null) {
            start6 = l2.n.f396661c;
        }
        l2.n stop6 = stop5.f82329d;
        if (stop6 == null) {
            stop6 = l2.n.f396661c;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start6, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stop6, "stop");
        l2.n nVar = new l2.n(a2.i1.b(start6.f396662a, stop6.f396662a, f17), a2.i1.b(start6.f396663b, stop6.f396663b, f17), null);
        a2.s sVar2 = start5.f82330e;
        a2.s sVar3 = stop5.f82330e;
        if (sVar2 == null && sVar3 == null) {
            sVar = null;
        } else {
            a2.s sVar4 = a2.s.f82340b;
            if (sVar2 == null) {
                sVar2 = sVar4;
            }
            if (sVar3 == null) {
                sVar3 = sVar4;
            }
            boolean z17 = sVar3.f82341a;
            boolean z18 = sVar2.f82341a;
            if (z18 != z17) {
                sVar2 = new a2.s(((java.lang.Boolean) a2.i1.a(java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17), f17)).booleanValue());
            }
            sVar = sVar2;
        }
        a2.o1 o1Var = new a2.o1(g1Var, new a2.p(fVar, hVar2, b19, nVar, sVar, (l2.d) a2.i1.a(start5.f82331f, stop5.f82331f, f17), null));
        long j19 = this.f396096i;
        if (this.f396095h) {
            o1Var = a2.o1.a(o1Var, j19, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null);
        }
        l0.h4.b(this.f396092e, o1Var, null, this.f396093f, oVar, ((this.f396094g >> 6) & 14) | 384, 0);
        return jz5.f0.f384359a;
    }
}
