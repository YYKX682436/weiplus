package fm2;

/* loaded from: classes3.dex */
public abstract class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 {

    /* renamed from: d, reason: collision with root package name */
    public sm2.k9 f345549d;

    /* renamed from: e, reason: collision with root package name */
    public sm2.o4 f345550e;

    /* renamed from: f, reason: collision with root package name */
    public sm2.f f345551f;

    /* renamed from: g, reason: collision with root package name */
    public in0.q f345552g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.util.AttributeSet attributeSet) {
        super(context, componentCallbacksC1101xa17d4670, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context;
        this.f345549d = new sm2.k9(abstractActivityC15087xee12defa);
        this.f345550e = new sm2.o4(abstractActivityC15087xee12defa);
        this.f345551f = new sm2.f(abstractActivityC15087xee12defa);
    }

    /* renamed from: getLiveCore */
    public final in0.q m129720xd052bc21() {
        return this.f345552g;
    }

    /* renamed from: getLiveEndUIC */
    public final sm2.f m129721x9e94176() {
        return this.f345551f;
    }

    /* renamed from: getLivePrepareUIC */
    public final sm2.k9 m129722x7ffc6cca() {
        return this.f345549d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a, qo0.c
    /* renamed from: getLiveRole */
    public abstract /* synthetic */ int mo11219xd0598cf8();

    /* renamed from: getLiveStartUIC */
    public final sm2.o4 m129723x1ce28c0f() {
        return this.f345550e;
    }

    /* renamed from: getStartUIC */
    public final sm2.o4 m129724xca56ce03() {
        return this.f345550e;
    }

    /* renamed from: prepareToStart */
    public void m129725xe466bfa0(boolean z17) {
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 renderRatioLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        int i17;
        kn0.p pVar;
        sm2.o4 o4Var = this.f345550e;
        if (!z17) {
            o4Var.B();
            return;
        }
        fm2.a aVar = o4Var.f101128c;
        boolean z18 = false;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(aVar, false, 1, null);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW", true);
        fm2.a aVar2 = o4Var.f101128c;
        if (aVar2 != null) {
            aVar2.mo46557x60d69242(qo0.b.f446919n, bundle);
        }
        in0.q qVar = o4Var.f101130e;
        if (qVar != null && (pVar = qVar.D) != null && pVar.f391122i) {
            z18 = true;
        }
        if (z18 && (o9Var = o4Var.f491149i) != null && (i17 = ((mm2.c1) o9Var.P0(mm2.c1.class)).f410403q5) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var = o9Var.f195253u;
            g90Var.l(i17);
            g90Var.j();
            o9Var.y1(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var2 = o4Var.f491149i;
        if (o9Var2 != null && (renderRatioLayout = o9Var2.f195250r.getRenderRatioLayout()) != null) {
            renderRatioLayout.post(new sm2.v2(o4Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = o4Var.W;
        if (naVar != null) {
            naVar.C1();
        }
        pm0.v.V(200L, new sm2.w2(o4Var));
        mm2.f6 f6Var = (mm2.f6) o4Var.c(mm2.f6.class);
        so2.j5 j5Var = ((mm2.f6) o4Var.f101142a.a(mm2.f6.class)).f410582w;
        c61.bc bcVar = j5Var instanceof c61.bc ? (c61.bc) j5Var : null;
        f6Var.f410583x = bcVar != null ? bcVar.c() : 0L;
        fm2.a aVar3 = o4Var.f101128c;
        if (aVar3 != null) {
            zl2.r4.f555483a.E2(o4Var.f101142a, aVar3);
        }
        ((we2.w) o4Var.c(we2.w.class)).N6();
    }

    /* renamed from: setLiveCore */
    public final void m129726xcb0b1d2d(in0.q qVar) {
        this.f345552g = qVar;
    }

    /* renamed from: setLiveEndUIC */
    public final void m129727x380d8f82(sm2.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
        this.f345551f = fVar;
    }

    /* renamed from: setLivePrepareUIC */
    public final void m129728x47f2d4d6(sm2.k9 k9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k9Var, "<set-?>");
        this.f345549d = k9Var;
    }

    /* renamed from: setLiveStartUIC */
    public final void m129729x532b871b(sm2.o4 o4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o4Var, "<set-?>");
        this.f345550e = o4Var;
    }
}
