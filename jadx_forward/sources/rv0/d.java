package rv0;

/* loaded from: classes5.dex */
public final class d extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f481496J;
    public yz5.l K;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusedSegmentVM, "focusedSegmentVM");
    }

    @Override // qv0.f
    public boolean E(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return super.E(view);
    }

    @Override // qv0.f
    public boolean F(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return super.F(view);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfq, bodyContainerLayout);
    }

    /* renamed from: getOnFirstAttached */
    public final yz5.a m163148xa550ba9f() {
        return this.f481496J;
    }

    /* renamed from: getOnVolumeChanged */
    public final yz5.l m163149x80267865() {
        return this.K;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lkx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    /* renamed from: setOnFirstAttached */
    public final void m163150xdc275413(yz5.a aVar) {
        this.f481496J = aVar;
    }

    /* renamed from: setOnVolumeChanged */
    public final void m163151xb6fd11d9(yz5.l lVar) {
        this.K = lVar;
    }

    /* renamed from: setVolume */
    public final void m163152x27f73e1c(float f17) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1 = this.L;
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
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1) findViewById;
        this.L = c10963x9da302b1;
        c10963x9da302b1.m47236xb6f0e82(new rv0.a(this));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b12 = this.L;
        if (c10963x9da302b12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        c10963x9da302b12.m47233x7dc5406d(new rv0.b(this));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b13 = this.L;
        if (c10963x9da302b13 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        c10963x9da302b13.m47237xf00f287e(new rv0.c(this));
        yz5.a aVar = this.f481496J;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
