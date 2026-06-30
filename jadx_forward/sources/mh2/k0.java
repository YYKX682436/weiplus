package mh2;

/* loaded from: classes10.dex */
public final class k0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final ah2.f f407916d;

    /* renamed from: e, reason: collision with root package name */
    public final lj2.v0 f407917e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f407918f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f407919g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f407920h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f407921i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f407922m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f407923n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f407924o;

    /* renamed from: p, reason: collision with root package name */
    public mh2.a f407925p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f407926q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f407927r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f407928s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, ah2.f contentService, lj2.v0 pluginAbility, boolean z17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentService, "contentService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f407916d = contentService;
        this.f407917e = pluginAbility;
        this.f407918f = z17;
        this.f407919g = "KTVSingContentWidget_" + hashCode();
        this.f407920h = jz5.h.b(new mh2.h0(this, context));
        this.f407921i = jz5.h.b(new mh2.i0(this, context));
        this.f407922m = jz5.h.b(new mh2.f0(this, context));
        this.f407923n = jz5.h.b(new mh2.g0(this, context));
        setOrientation(1);
        setClipChildren(false);
        g();
    }

    public static final void a(mh2.k0 k0Var, om2.o oVar) {
        mh2.n0 f17 = k0Var.f407916d.f();
        if (f17 != null) {
            mh2.a m147304xa3cabb61 = k0Var.m147304xa3cabb61();
            mh2.f1 f1Var = m147304xa3cabb61 instanceof mh2.f1 ? (mh2.f1) m147304xa3cabb61 : null;
            android.view.ViewGroup viewGroup = f1Var != null ? f1Var.f407865g : null;
            if (viewGroup != null) {
                if (!(viewGroup.indexOfChild(f17) != -1)) {
                    viewGroup.removeAllViews();
                    viewGroup.addView(f17, new android.view.ViewGroup.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.agv)));
                }
            }
            r45.xn1 xn1Var = oVar.f427894b;
            if (xn1Var != null) {
                f17.a(oVar.f427893a, xn1Var);
            }
        }
    }

    public static final void f(mh2.k0 k0Var, mh2.a aVar, om2.d0 d0Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k0Var.f407925p, aVar)) {
            aVar.c(d0Var);
            return;
        }
        mh2.a aVar2 = k0Var.f407925p;
        if (aVar2 != null) {
            aVar2.e(d0Var);
        }
        k0Var.f407925p = aVar;
        k0Var.removeAllViews();
        int b17 = k0Var.f407918f ? -1 : i65.a.b(k0Var.getContext(), 260);
        android.view.View view = aVar.f407825b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        k0Var.addView(view, new android.widget.LinearLayout.LayoutParams(-1, b17));
        aVar.c(d0Var);
        p3325xe03a0797.p3326xc267989b.l.d(k0Var.f407916d.a(), null, null, new mh2.j0(k0Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFinishSingingWidget */
    public final mh2.a m147301x4d6ec60e() {
        return (mh2.a) ((jz5.n) this.f407922m).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getNoSingerWidget */
    public final mh2.a m147302xbafad237() {
        return (mh2.a) ((jz5.n) this.f407923n).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPrepareSingWidget */
    public final mh2.a m147303x69bfd164() {
        return (mh2.a) ((jz5.n) this.f407920h).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getSingingWidget */
    public final mh2.a m147304xa3cabb61() {
        return (mh2.a) ((jz5.n) this.f407921i).mo141623x754a37bb();
    }

    public final void g() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f407926q;
        boolean z17 = r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a();
        ah2.f fVar = this.f407916d;
        if (!z17) {
            this.f407926q = p3325xe03a0797.p3326xc267989b.l.d(fVar.a(), null, null, new mh2.e0(this, null), 3, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f407927r;
        if (!(r2Var2 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var2).a())) {
            this.f407927r = p3325xe03a0797.p3326xc267989b.l.d(fVar.a(), null, null, new mh2.c0(this, null), 3, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.f407928s;
        if (r2Var3 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var3).a()) {
            return;
        }
        this.f407928s = p3325xe03a0797.p3326xc267989b.l.d(fVar.a(), null, null, new mh2.a0(this, null), 3, null);
    }

    /* renamed from: getCurrentSingerUserId */
    public final java.lang.String m147305xfc0091c5() {
        return this.f407924o;
    }

    /* renamed from: getKTVSongCoverAnchorView */
    public final android.view.View m147306xcedb6dc5() {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f407925p, m147304xa3cabb61()) || !(m147304xa3cabb61() instanceof mh2.f1)) {
            return null;
        }
        mh2.a m147304xa3cabb61 = m147304xa3cabb61();
        mh2.f1 f1Var = m147304xa3cabb61 instanceof mh2.f1 ? (mh2.f1) m147304xa3cabb61 : null;
        if (f1Var != null) {
            return f1Var.f407866h;
        }
        return null;
    }

    /* renamed from: getPluginAbility */
    public final lj2.v0 m147307x3a33aac1() {
        return this.f407917e;
    }

    public final void h(boolean z17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f407925p, m147304xa3cabb61())) {
            if (!(m147304xa3cabb61() instanceof mh2.m1)) {
                this.f407916d.f().c();
                return;
            }
            mh2.a m147304xa3cabb61 = m147304xa3cabb61();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m147304xa3cabb61, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.ktv.view.KtvCompactSingingWidget");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = ((mh2.m1) m147304xa3cabb61).f407939d;
            if (z17) {
                c14246xaa893502.d();
            } else {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502.f193250o;
                c14246xaa893502.e(false);
            }
        }
    }
}
