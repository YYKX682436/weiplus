package tv0;

/* loaded from: classes5.dex */
public final class j0 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k {
    public final jz5.g A;
    public float B;
    public final android.graphics.PointF C;
    public final android.graphics.PointF D;
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae E;
    public p3325xe03a0797.p3326xc267989b.r2 F;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f503734n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f503735o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f503736p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f503737q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f503738r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f503739s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f503740t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f503741u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f503742v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f503743w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f503744x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.RectF f503745y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f503746z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f503734n = jz5.h.b(new tv0.k(this));
        this.f503735o = jz5.h.b(new tv0.h0(this));
        this.f503737q = jz5.h.b(new tv0.f0(this));
        this.f503738r = jz5.h.b(new tv0.b0(this));
        this.f503739s = jz5.h.b(new tv0.g0(this));
        this.f503740t = jz5.h.b(new tv0.t(this));
        this.f503741u = jz5.h.b(new tv0.g(this));
        this.f503742v = jz5.h.b(new tv0.e0(this));
        this.f503743w = jz5.h.b(new tv0.c0(this));
        this.f503744x = jz5.h.b(new tv0.i0(this));
        this.f503745y = new android.graphics.RectF();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        this.f503746z = ZeroTime;
        this.A = jz5.h.b(new tv0.i(this));
        this.B = 1.0f;
        this.C = new android.graphics.PointF(1.0f, 1.0f);
        this.D = new android.graphics.PointF(1.0f, 1.0f);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        tv0.d dVar = new tv0.d(m158354x19263085());
        dVar.I(new tv0.u(this), new tv0.v(this));
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        ex0.a0 a0Var;
        tv0.d panel = (tv0.d) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.V6(this, "KEY_TARGET_SEGMENT_ID", null, 2, null);
        if (c3971x241f78 == null) {
            return;
        }
        this.f503736p = c3971x241f78;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.V6(this, "KEY_ENTER_TIME_IN_TIMELINE", null, 2, null);
        if (c4128x879fba0a == null) {
            return;
        }
        this.f503746z = c4128x879fba0a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 t76 = t7();
        if (t76 == null || (a0Var = ((gx0.kh) ((jz5.n) this.f503737q).mo141623x754a37bb()).f358175r) == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = this.f503746z;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub = t76.B().m34007xde00a612().sub(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(1L));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub, "sub(...)");
        this.f503746z = ou0.f.b(c4128x879fba0a2, sub);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.b(panel, panel.m167076x672c0853(), java.lang.Integer.valueOf(i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl)));
        this.D.set(q7().getScaleX(), q7().getScaleY());
        this.C.set(s7().getScaleX(), s7().getScaleY());
        l7(q7());
        yw0.n f27 = o7().f2();
        yw0.q qVar = yw0.q.f548118h;
        f27.e(qVar);
        o7().f2().c(yw0.q.f548116f);
        o7().f2().c(qVar);
        o7().f2().f548108e.f548102a.f548104a.requestLayout();
        this.F = p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new tv0.f(this, t76, null), 3, null);
        yw0.n f28 = o7().f2();
        tv0.x xVar = new tv0.x(this, t76);
        f28.getClass();
        f28.f548104a.post(new yw0.m(xVar));
        this.E = t76.q1();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d m167077xc6fe9940 = panel.m167077xc6fe9940();
        if (m167077xc6fe9940.getWidth() <= 0) {
            m167077xc6fe9940.getViewTreeObserver().addOnGlobalLayoutListener(new tv0.s(m167077xc6fe9940, this, a0Var, t76));
        } else {
            x7(m167077xc6fe9940, a0Var, t76);
        }
        a0Var.f338648y.mo7806x9d92d11c(W6(), new tv0.l(panel.m167077xc6fe9940()));
        panel.m167076x672c0853().setOnClickListener(new tv0.y(this));
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        yw0.b n76 = n7();
        n76.f548064i = yw0.a.f548055e;
        ((yw0.l) n76.f548120a).a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CropMaterialReferenceDrawer", "endTrackingSafeArea: ");
        o7().f2().e(yw0.q.f548116f);
        o7().u7().setVisibility(8);
        yw0.p m76 = m7();
        m76.f548113c = yw0.o.f548110e;
        ((yw0.l) m76.f548120a).a();
        android.graphics.PointF pointF = new android.graphics.PointF(o7().A7().getWidth(), o7().A7().getHeight());
        by0.b.b(q7(), (w7().getWidth() * 1.0f) / w7().getHeight(), pointF.x, pointF.y);
        android.widget.FrameLayout q76 = q7();
        android.graphics.PointF pointF2 = this.D;
        q76.setScaleX(pointF2.x);
        q7().setScaleY(pointF2.y);
        q7().requestLayout();
        android.graphics.PointF pointF3 = new android.graphics.PointF(o7().A7().getWidth(), o7().A7().getHeight());
        w7().setScaleX(1.0f);
        w7().setScaleY(1.0f);
        w7().setTranslationX(0.0f);
        w7().setTranslationY(0.0f);
        by0.b.b(s7(), (w7().getWidth() * 1.0f) / w7().getHeight(), pointF3.x, pointF3.y);
        android.widget.FrameLayout s76 = s7();
        android.graphics.PointF pointF4 = this.C;
        s76.setScaleX(pointF4.x);
        s7().setScaleY(pointF4.y);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new tv0.j(this, new tv0.a0(this), null), 3, null);
        this.f503736p = null;
    }

    public final void k7() {
        long v76 = v7();
        float f17 = 2;
        float b17 = (d1.k.b(v76) * (w7().getScaleY() - this.B)) / f17;
        float d17 = (d1.k.d(v76) * (w7().getScaleX() - this.B)) / f17;
        float translationY = w7().getTranslationY();
        float f18 = -b17;
        if (translationY < f18) {
            translationY = f18;
        }
        if (translationY <= b17) {
            b17 = translationY;
        }
        float translationX = w7().getTranslationX();
        float f19 = -d17;
        if (translationX < f19) {
            translationX = f19;
        }
        if (translationX <= d17) {
            d17 = translationX;
        }
        this.f503745y.set((r7().centerX() - ((d1.k.d(v76) * w7().getScaleX()) / f17)) + d17, (r7().centerY() - ((d1.k.b(v76) * w7().getScaleY()) / f17)) + b17, r7().centerX() + ((d1.k.d(v76) * w7().getScaleX()) / f17) + d17, r7().centerY() + ((d1.k.b(v76) * w7().getScaleY()) / f17) + b17);
        w7().animate().setUpdateListener(new tv0.e(this)).translationX(d17).translationY(b17).setDuration(300L).start();
    }

    public final void l7(android.view.View view) {
        android.graphics.PointF pointF;
        tv0.d dVar = (tv0.d) this.f150773i;
        if (dVar != null) {
            int mo47066x10b53b15 = dVar.mo47066x10b53b15();
            pointF = new android.graphics.PointF(o7().A7().getWidth(), (((r2.getHeight() * 1.0f) + (((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.q8m)) != null ? r4.getHeight() : 0)) - mo47066x10b53b15) - ((gx0.bh) ((jz5.n) this.f503739s).mo141623x754a37bb()).c7());
        } else {
            pointF = new android.graphics.PointF();
        }
        float f17 = pointF.x;
        float f18 = pointF.y;
        by0.b.b(view, f17 / f18, f17, f18);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.requestLayout();
    }

    public final yw0.p m7() {
        return (yw0.p) o7().f2().b(yw0.q.f548118h);
    }

    public final yw0.b n7() {
        return (yw0.b) o7().f2().b(yw0.q.f548116f);
    }

    public final gx0.w8 o7() {
        return (gx0.w8) ((jz5.n) this.f503740t).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        if (X6()) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new tv0.j(this, null, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 t76 = t7();
        if (t76 != null) {
            this.F = p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new tv0.f(this, t76, null), 3, null);
        }
    }

    public final gx0.bf p7() {
        return (gx0.bf) ((jz5.n) this.f503738r).mo141623x754a37bb();
    }

    public final android.widget.FrameLayout q7() {
        return (android.widget.FrameLayout) ((jz5.n) this.f503743w).mo141623x754a37bb();
    }

    public final android.graphics.RectF r7() {
        return n7().f548060e;
    }

    public final android.widget.FrameLayout s7() {
        return (android.widget.FrameLayout) ((jz5.n) this.f503742v).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 t7() {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f503736p;
        if (c3971x241f78 != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 b76 = ((gx0.kh) ((jz5.n) this.f503737q).mo141623x754a37bb()).b7(c3971x241f78);
            if (b76 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) {
                return (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) b76;
            }
        }
        return null;
    }

    public final float u7() {
        mv0.b bVar;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar;
        java.lang.Float a17;
        ex0.a0 a0Var = ((gx0.kh) ((jz5.n) this.f503737q).mo141623x754a37bb()).f358175r;
        if (a0Var == null || (bVar = a0Var.f338636m) == null || (cVar = bVar.f413063a) == null || (a17 = by0.b.a(cVar)) == null) {
            return 0.5625f;
        }
        return a17.floatValue();
    }

    public final long v7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 t76 = t7();
        if (t76 != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 o17 = t76.o1();
            java.lang.Float valueOf = o17 != null ? java.lang.Float.valueOf((float) o17.f129896b) : null;
            if (valueOf != null) {
                float floatValue = valueOf.floatValue();
                if (floatValue > u7()) {
                    float width = w7().getWidth();
                    return d1.l.a(width, width / floatValue);
                }
                float height = w7().getHeight();
                return d1.l.a(floatValue * height, height);
            }
        }
        return d1.k.f307174b;
    }

    public final android.view.ViewGroup w7() {
        return (android.view.ViewGroup) ((jz5.n) this.f503744x).mo141623x754a37bb();
    }

    public final void x7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d c10942x373bdc1d, ex0.a0 a0Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3) {
        jz5.g gVar = this.f503734n;
        bx0.j jVar = new bx0.j(e3.d.b(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) this.f503735o).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), 0), i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
        c10942x373bdc1d.m47130x52abbc9c(c4181x2248e1a3);
        c10942x373bdc1d.b(a0Var, jVar, m158345xefc66565());
        c10942x373bdc1d.m47455x476e2aac(new tv0.o(c4181x2248e1a3, this, a0Var, c10942x373bdc1d));
        c10942x373bdc1d.m47454x565c0d26(new tv0.r(this));
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = c4181x2248e1a3.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
        c10942x373bdc1d.n(c3971x241f78, this.f503746z);
        tv0.d dVar = (tv0.d) this.f150773i;
        if (dVar != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub = this.f503746z.sub(c4181x2248e1a3.A());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub, "sub(...)");
            dVar.K(sub);
        }
    }

    public final void y7() {
        w7().animate().scaleX(this.B).scaleY(this.B).setUpdateListener(new tv0.d0(this)).translationX(0.0f).translationY(0.0f).setDuration(300L).start();
        this.f503745y.set(r7());
    }

    public final void z7() {
        long v76 = v7();
        float x17 = w7().getX() + (w7().getWidth() / 2.0f);
        float y17 = w7().getY() + (w7().getHeight() / 2.0f);
        float d17 = d1.k.d(v76) * w7().getScaleX();
        float b17 = d1.k.b(v76) * w7().getScaleY();
        yw0.b n76 = n7();
        float f17 = 2;
        float f18 = d17 / f17;
        float f19 = b17 / f17;
        n76.f548061f.set(x17 - f18, y17 - f19, x17 + f18, y17 + f19);
        ((yw0.l) n76.f548120a).a();
    }
}
