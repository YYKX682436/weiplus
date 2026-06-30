package cw0;

/* loaded from: classes5.dex */
public final class w0 extends qv0.f {
    public yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.l f304225J;
    public yz5.l K;
    public yz5.a L;
    public yz5.l M;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 N;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 P;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 Q;
    public android.widget.TextView R;
    public android.widget.TextView S;
    public android.view.View T;
    public android.widget.TextView U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void K(cw0.w0 w0Var, boolean z17) {
        if (!z17) {
            w0Var.getClass();
            return;
        }
        yz5.l lVar = w0Var.M;
        if (lVar != null) {
        }
        w0Var.M(false);
    }

    public final void L(float f17, java.lang.Float f18, java.lang.Float f19) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1 = this.N;
        if (c10963x9da302b1 == null || this.Q == null || this.P == null) {
            return;
        }
        if (c10963x9da302b1 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("narrationVolumeSeekBar");
            throw null;
        }
        float f27 = 100;
        c10963x9da302b1.m47240x53d8522f(f17 * f27);
        if (f18 == null) {
            android.widget.TextView textView = this.R;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ostText");
                throw null;
            }
            textView.setVisibility(8);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b12 = this.P;
            if (c10963x9da302b12 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ostVolumeSeekBar");
                throw null;
            }
            c10963x9da302b12.setVisibility(8);
        } else {
            android.widget.TextView textView2 = this.R;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ostText");
                throw null;
            }
            textView2.setVisibility(0);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b13 = this.P;
            if (c10963x9da302b13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ostVolumeSeekBar");
                throw null;
            }
            c10963x9da302b13.m47240x53d8522f(f18.floatValue() * f27);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b14 = this.P;
            if (c10963x9da302b14 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ostVolumeSeekBar");
                throw null;
            }
            c10963x9da302b14.setVisibility(0);
        }
        if (f19 == null) {
            android.widget.TextView textView3 = this.S;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicText");
                throw null;
            }
            textView3.setVisibility(8);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b15 = this.Q;
            if (c10963x9da302b15 != null) {
                c10963x9da302b15.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicVolumeSeekBar");
                throw null;
            }
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b16 = this.Q;
        if (c10963x9da302b16 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicVolumeSeekBar");
            throw null;
        }
        c10963x9da302b16.m47240x53d8522f(f19.floatValue() * f27);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b17 = this.Q;
        if (c10963x9da302b17 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicVolumeSeekBar");
            throw null;
        }
        c10963x9da302b17.setVisibility(0);
        android.widget.TextView textView4 = this.S;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicText");
            throw null;
        }
    }

    public final void M(boolean z17) {
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.a0n : com.p314xaae8f345.mm.R.C30861xcebc809e.f562485c1;
        android.widget.TextView textView = this.U;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i17, 0, 0, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.djn, bodyContainerLayout);
    }

    /* renamed from: getOnAttached */
    public final yz5.a m122814xb3775899() {
        return this.L;
    }

    /* renamed from: getOnAutoAdjustStateChange */
    public final yz5.l m122815x7c5db5ce() {
        return this.M;
    }

    /* renamed from: getOnMusicVolumeChangedListener */
    public final yz5.l m122816x10d3139e() {
        return this.K;
    }

    /* renamed from: getOnNarrationVolumeChangeListener */
    public final yz5.l m122817x9ddba12b() {
        return this.I;
    }

    /* renamed from: getOnOSTVolumeChangedListener */
    public final yz5.l m122818x7e890d3() {
        return this.f304225J;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String r17 = i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.llm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.b(this, this.T, null);
        yz5.a aVar = this.L;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* renamed from: setOnAttached */
    public final void m122819xe19ba6a5(yz5.a aVar) {
        this.L = aVar;
    }

    /* renamed from: setOnAutoAdjustStateChange */
    public final void m122820x928d9b42(yz5.l lVar) {
        this.M = lVar;
    }

    /* renamed from: setOnMusicVolumeChangedListener */
    public final void m122821xbbc76aa(yz5.l lVar) {
        this.K = lVar;
    }

    /* renamed from: setOnNarrationVolumeChangeListener */
    public final void m122822x7b58d29f(yz5.l lVar) {
        this.I = lVar;
    }

    /* renamed from: setOnOSTVolumeChangedListener */
    public final void m122823xf7a746df(yz5.l lVar) {
        this.f304225J = lVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qm7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.N = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.q8w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.P = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f564901qh4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.Q = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f568981qr0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f568984qb5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.R = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.qqy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.S = (android.widget.TextView) findViewById6;
        this.T = findViewById(com.p314xaae8f345.mm.R.id.h_);
        this.U = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568949qw);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1 = this.N;
        if (c10963x9da302b1 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("narrationVolumeSeekBar");
            throw null;
        }
        c10963x9da302b1.m47237xf00f287e(new cw0.s0(this));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b12 = this.P;
        if (c10963x9da302b12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ostVolumeSeekBar");
            throw null;
        }
        c10963x9da302b12.m47237xf00f287e(new cw0.t0(this));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b13 = this.Q;
        if (c10963x9da302b13 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicVolumeSeekBar");
            throw null;
        }
        c10963x9da302b13.m47237xf00f287e(new cw0.u0(this));
        android.view.View view = this.T;
        if (view != null) {
            view.setOnClickListener(new cw0.v0(this));
        }
    }
}
