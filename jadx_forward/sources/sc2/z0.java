package sc2;

/* loaded from: classes2.dex */
public final class z0 implements cw2.i9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.i9 f487937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.b f487939f;

    public z0(sc2.h1 h1Var, so2.b bVar) {
        this.f487938e = h1Var;
        this.f487939f = bVar;
        if (!cw2.i9.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(cw2.i9.class.getClassLoader(), new java.lang.Class[]{cw2.i9.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoPlayLifecycle");
        }
        this.f487937d = (cw2.i9) newProxyInstance;
    }

    @Override // cw2.i9
    public void B(nk4.c data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f487937d.B(data);
    }

    @Override // cw2.i9
    public void C(nk4.q data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f487937d.C(data);
    }

    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        this.f487937d.D(mb4Var, j17);
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
        this.f487937d.F(mb4Var);
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
        this.f487937d.G(mb4Var);
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        this.f487937d.J(mb4Var, waVar, i17);
    }

    @Override // cw2.fb
    public void b(float f17) {
        this.f487937d.b(f17);
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        this.f487937d.d(mb4Var, waVar, i17);
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
        this.f487937d.e(mb4Var, i17, i18, rVar);
    }

    @Override // cw2.i9
    public void f(nk4.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f487937d.f(data);
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
        this.f487937d.g(mb4Var, tVar);
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce5;
        java.lang.Long l17;
        java.lang.Long l18;
        so2.b bVar = this.f487939f;
        long longValue = (bVar == null || (l18 = bVar.f491798d) == null) ? 0L : l18.longValue();
        boolean z17 = false;
        sc2.h1 h1Var = this.f487938e;
        if (longValue > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = h1Var.f487462x;
            if (c15188xd8bd4bd != null) {
                c15188xd8bd4bd.f0((bVar == null || (l17 = bVar.f491798d) == null) ? 0L : l17.longValue(), false, 3);
            }
            if (bVar != null) {
                bVar.f491798d = 0L;
            }
        }
        long m75942xfb822ef2 = mb4Var != null ? mb4Var.m75942xfb822ef2(24) : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce52 = h1Var.U;
        if (c15179x385a9ce52 != null && c15179x385a9ce52.getV() == m75942xfb822ef2) {
            z17 = true;
        }
        if (z17 || (c15179x385a9ce5 = h1Var.U) == null) {
            return;
        }
        c15179x385a9ce5.m61299x314a6be(mb4Var != null ? mb4Var.m75942xfb822ef2(24) : 0L);
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        this.f487937d.n(mb4Var, aVar);
    }

    @Override // cw2.i9
    public void p(nk4.j data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f487937d.p(data);
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
        this.f487937d.s(waVar, aVar);
    }

    @Override // cw2.fb
    public void t(long j17, long j18, long j19, java.lang.String str, int i17, bu2.h0 mediaHWInfo, java.lang.String specFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaHWInfo, "mediaHWInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specFormat, "specFormat");
        this.f487937d.t(j17, j18, j19, str, i17, mediaHWInfo, specFormat);
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
        this.f487937d.u(mb4Var, j17, aVar);
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
        sc2.h1 h1Var = this.f487938e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce5 = h1Var.U;
        if (c15179x385a9ce5 != null) {
            c15179x385a9ce5.y(j17);
        }
        h1Var.f487469z1 = j17;
        h1Var.f487467y1 = j18;
    }

    @Override // cw2.fb
    public void x(r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar) {
        this.f487937d.x(mb4Var, waVar, i17, eVar);
    }
}
