package rv0;

/* loaded from: classes5.dex */
public final class o7 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f481697J;
    public yz5.p K;
    public yz5.a L;
    public yz5.a M;
    public android.view.View N;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusedSegmentVM, "focusedSegmentVM");
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfr, bodyContainerLayout);
    }

    /* renamed from: getOnApplyToAllButtonClicked */
    public final yz5.a m163190x2c77c188() {
        return this.M;
    }

    /* renamed from: getOnAttached */
    public final yz5.a m163191xb3775899() {
        return this.f481697J;
    }

    /* renamed from: getOnMuteIconClicked */
    public final yz5.a m163192x7e8b500() {
        return this.L;
    }

    /* renamed from: getOnVolumeChanged */
    public final yz5.p m163193x80267865() {
        return this.K;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lky);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        super.p();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.b(this, this.N, null);
        yz5.a aVar = this.f481697J;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* renamed from: setIsMuted */
    public final void m163194x2c5e279f(boolean z17) {
        float m47230x754a37bb;
        if (z17) {
            m47230x754a37bb = 0.0f;
        } else {
            if (this.P == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                throw null;
            }
            m47230x754a37bb = r4.m47230x754a37bb() / 100.0f;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1 = this.P;
        if (c10963x9da302b1 != null) {
            c10963x9da302b1.A(m47230x754a37bb);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
    }

    /* renamed from: setOnApplyToAllButtonClicked */
    public final void m163195x764419fc(yz5.a aVar) {
        this.M = aVar;
    }

    /* renamed from: setOnAttached */
    public final void m163196xe19ba6a5(yz5.a aVar) {
        this.f481697J = aVar;
    }

    /* renamed from: setOnMuteIconClicked */
    public final void m163197xe37ec174(yz5.a aVar) {
        this.L = aVar;
    }

    /* renamed from: setOnVolumeChanged */
    public final void m163198xb6fd11d9(yz5.p pVar) {
        this.K = pVar;
    }

    /* renamed from: setVolume */
    public final void m163199x27f73e1c(float f17) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1 = this.P;
        if (c10963x9da302b1 != null) {
            c10963x9da302b1.m47240x53d8522f(f17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qby);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.P = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1) findViewById;
        this.N = findViewById(com.p314xaae8f345.mm.R.id.q3i);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1 = this.P;
        if (c10963x9da302b1 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        c10963x9da302b1.m47236xb6f0e82(new rv0.k7(this));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b12 = this.P;
        if (c10963x9da302b12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        c10963x9da302b12.m47233x7dc5406d(new rv0.l7(this));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b13 = this.P;
        if (c10963x9da302b13 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        c10963x9da302b13.m47237xf00f287e(new rv0.m7(this));
        android.view.View view = this.N;
        if (view != null) {
            view.setOnClickListener(new rv0.n7(this));
        }
    }
}
