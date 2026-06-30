package rv0;

/* loaded from: classes5.dex */
public final class j7 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f481601J;
    public yz5.a K;
    public yz5.a L;
    public yz5.a M;
    public yz5.a N;
    public yz5.a P;
    public yz5.a Q;
    public android.view.View R;
    public android.view.View S;
    public final jz5.g T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusedSegmentVM, "focusedSegmentVM");
        this.T = jz5.h.b(new rv0.i7(this));
    }

    /* renamed from: getSpeedPicker */
    private final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p904x29f9ddf2.C10971x9c61f083 m163172x4ff3aa7f() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.T).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p904x29f9ddf2.C10971x9c61f083) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570800dg3, bodyContainerLayout);
    }

    /* renamed from: getCurrentSpeed */
    public final double m163173xb7d568c4() {
        return (m163172x4ff3aa7f().m47267xb7d568c4() != null ? r0.intValue() : 100) / 100.0d;
    }

    /* renamed from: getOnApplyToAllButtonClicked */
    public final yz5.a m163174x2c77c188() {
        return this.f481601J;
    }

    /* renamed from: getOnAttached */
    public final yz5.a m163175xb3775899() {
        return this.M;
    }

    /* renamed from: getOnClosed */
    public final yz5.a m163176xb9e4f5a1() {
        return this.P;
    }

    /* renamed from: getOnFirstAttached */
    public final yz5.a m163177xa550ba9f() {
        return this.L;
    }

    /* renamed from: getOnOpened */
    public final yz5.a m163178xce92dc9e() {
        return this.N;
    }

    /* renamed from: getOnResetButtonClicked */
    public final yz5.a m163179x1454bc3b() {
        return this.K;
    }

    /* renamed from: getOnSpeedChanged */
    public final yz5.a m163180xffe8c4e2() {
        return this.Q;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.llb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        super.p();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.b(this, this.R, null);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.b(this, this.S, null);
        yz5.a aVar = this.M;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void s() {
        yz5.a aVar = this.P;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* renamed from: setOnApplyToAllButtonClicked */
    public final void m163181x764419fc(yz5.a aVar) {
        this.f481601J = aVar;
    }

    /* renamed from: setOnAttached */
    public final void m163182xe19ba6a5(yz5.a aVar) {
        this.M = aVar;
    }

    /* renamed from: setOnClosed */
    public final void m163183xb49d56ad(yz5.a aVar) {
        this.P = aVar;
    }

    /* renamed from: setOnFirstAttached */
    public final void m163184xdc275413(yz5.a aVar) {
        this.L = aVar;
    }

    /* renamed from: setOnOpened */
    public final void m163185xc94b3daa(yz5.a aVar) {
        this.N = aVar;
    }

    /* renamed from: setOnResetButtonClicked */
    public final void m163186x8ea7eb47(yz5.a aVar) {
        this.K = aVar;
    }

    /* renamed from: setOnSpeedChanged */
    public final void m163187xc7df2cee(yz5.a aVar) {
        this.Q = aVar;
    }

    /* renamed from: setSpeed */
    public final void m163188x53b4c105(double d17) {
        m163172x4ff3aa7f().m47269x53b4c105(d17);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        this.R = findViewById(com.p314xaae8f345.mm.R.id.q3i);
        this.S = findViewById(com.p314xaae8f345.mm.R.id.q3o);
        android.view.View view = this.R;
        if (view != null) {
            view.setOnClickListener(new rv0.f7(this));
        }
        android.view.View view2 = this.S;
        if (view2 != null) {
            view2.setOnClickListener(new rv0.g7(this));
        }
        lx0.c cVar = new lx0.c(0, 1, null);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p904x29f9ddf2.C10971x9c61f083 m163172x4ff3aa7f = m163172x4ff3aa7f();
        m163172x4ff3aa7f.getClass();
        m163172x4ff3aa7f.Q = cVar;
        int i17 = cVar.f403565a;
        if (i17 != -1) {
            m163172x4ff3aa7f.f151019n = i17 - 1;
            m163172x4ff3aa7f.f151018m = 0;
        }
        m163172x4ff3aa7f.f151020o = i17 - 1;
        m163172x4ff3aa7f.f151021p = 25;
        m163172x4ff3aa7f.c();
        m163172x4ff3aa7f.invalidate();
        m163172x4ff3aa7f.requestLayout();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p904x29f9ddf2.C10971x9c61f083 m163172x4ff3aa7f2 = m163172x4ff3aa7f();
        m163172x4ff3aa7f2.f151012d = 5;
        m163172x4ff3aa7f2.f151013e = 10;
        m163172x4ff3aa7f().m47268x1a2696e2(new rv0.h7(this));
        yz5.a aVar = this.L;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void x() {
        yz5.a aVar = this.N;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
