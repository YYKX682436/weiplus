package fm2;

/* loaded from: classes3.dex */
public abstract class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 {

    /* renamed from: d, reason: collision with root package name */
    public tm2.t2 f345553d;

    /* renamed from: e, reason: collision with root package name */
    public tm2.s2 f345554e;

    /* renamed from: f, reason: collision with root package name */
    public tm2.g f345555f;

    /* renamed from: g, reason: collision with root package name */
    public tn0.w0 f345556g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.util.AttributeSet attributeSet) {
        super(context, componentCallbacksC1101xa17d4670, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context;
        this.f345553d = new tm2.t2(abstractActivityC15087xee12defa);
        this.f345554e = new tm2.s2(abstractActivityC15087xee12defa);
        this.f345555f = new tm2.g(abstractActivityC15087xee12defa);
    }

    /* renamed from: getLiveCore */
    public final tn0.w0 m129730xd052bc21() {
        return this.f345556g;
    }

    /* renamed from: getLiveEndUIC */
    public final tm2.g m129731x9e94176() {
        return this.f345555f;
    }

    /* renamed from: getLivePrepareUIC */
    public final tm2.t2 m129732x7ffc6cca() {
        return this.f345553d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a, qo0.c
    /* renamed from: getLiveRole */
    public abstract /* synthetic */ int mo11219xd0598cf8();

    /* renamed from: getLiveStartUIC */
    public final tm2.s2 m129733x1ce28c0f() {
        return this.f345554e;
    }

    /* renamed from: getStartUIC */
    public final tm2.s2 m129734xca56ce03() {
        return this.f345554e;
    }

    /* renamed from: prepareToStart */
    public void m129735xe466bfa0(boolean z17) {
        tm2.s2 s2Var = this.f345554e;
        if (!z17) {
            s2Var.k();
            return;
        }
        fm2.b bVar = s2Var.f101134c;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(bVar, false, 1, null);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW", true);
        fm2.b bVar2 = s2Var.f101134c;
        if (bVar2 != null) {
            bVar2.mo46557x60d69242(qo0.b.f446919n, bundle);
        }
        s2Var.i(true);
        mm2.f6 f6Var = (mm2.f6) s2Var.c(mm2.f6.class);
        so2.j5 j5Var = ((mm2.f6) s2Var.f101142a.a(mm2.f6.class)).f410582w;
        c61.bc bcVar = j5Var instanceof c61.bc ? (c61.bc) j5Var : null;
        f6Var.f410583x = bcVar != null ? bcVar.c() : 0L;
        fm2.b bVar3 = s2Var.f101134c;
        if (bVar3 != null) {
            zl2.r4.f555483a.E2(s2Var.f101142a, bVar3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = s2Var.f502125i0;
        if (naVar != null) {
            naVar.C1();
        }
        ((we2.w) s2Var.c(we2.w.class)).N6();
    }

    /* renamed from: setLiveCore */
    public final void m129736xcb0b1d2d(tn0.w0 w0Var) {
        this.f345556g = w0Var;
    }

    /* renamed from: setLiveEndUIC */
    public final void m129737x380d8f82(tm2.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<set-?>");
        this.f345555f = gVar;
    }

    /* renamed from: setLivePrepareUIC */
    public final void m129738x47f2d4d6(tm2.t2 t2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t2Var, "<set-?>");
        this.f345553d = t2Var;
    }

    /* renamed from: setLiveStartUIC */
    public final void m129739x532b871b(tm2.s2 s2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s2Var, "<set-?>");
        this.f345554e = s2Var;
    }
}
