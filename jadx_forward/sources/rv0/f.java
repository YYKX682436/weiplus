package rv0;

/* loaded from: classes5.dex */
public final class f extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l {

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f481523J;
    public android.widget.TextView K;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10964x1eb31dbf L;
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 M;
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a N;
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a P;
    public boolean Q;
    public final int R;
    public final int S;
    public yz5.a T;
    public yz5.l U;
    public yz5.l V;
    public yz5.a W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusedSegmentVM, "focusedSegmentVM");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        this.N = ZeroTime;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        this.P = ZeroTime;
        this.R = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ac9, null);
        this.S = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560933ad2, null);
    }

    public static final void K(rv0.f fVar, float f17) {
        fVar.getClass();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(f17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        fVar.N = m33969x7905b775;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dft, bodyContainerLayout);
    }

    /* renamed from: getOnFirstAttached */
    public final yz5.a m163153xa550ba9f() {
        return this.T;
    }

    /* renamed from: getOnMusicStartInMediaChanged */
    public final yz5.l m163154x71551787() {
        return this.V;
    }

    /* renamed from: getOnPlayingProgressChanged */
    public final yz5.l m163155x6451abee() {
        return this.U;
    }

    /* renamed from: getOnUserTouch */
    public final yz5.a m163156xeba02ddf() {
        return this.W;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574020ll0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    /* renamed from: setCurrentTime */
    public final void m163157x9411da24(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a time) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = this.M;
        if (c4129xdee64553 == null) {
            return;
        }
        if (c4129xdee64553 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presentationTimeRange");
            throw null;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add = time.sub(c4129xdee64553.m34009x8082fb99()).add(this.N);
        long m33987xd22e7c2d = (long) this.P.m33987xd22e7c2d();
        long m33987xd22e7c2d2 = (long) add.m33987xd22e7c2d();
        java.lang.String d17 = ou0.f.d(m33987xd22e7c2d);
        java.lang.String d18 = ou0.f.d(m33987xd22e7c2d2);
        java.lang.String str = d18 + " / " + d17;
        android.widget.TextView textView = this.f481523J;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startTimeTv");
            throw null;
        }
        int length = d18.length();
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.R), 0, length, 18);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.S), length, str.length(), 18);
        textView.setText(spannableString);
        if (this.Q) {
            return;
        }
        if (time instanceof ou0.g ? ou0.f.c(time, 2L) : false) {
            return;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10964x1eb31dbf c10964x1eb31dbf = this.L;
        if (c10964x1eb31dbf != null) {
            c10964x1eb31dbf.m47246x6ce08982((long) add.sub(this.N).m33987xd22e7c2d());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wave");
            throw null;
        }
    }

    /* renamed from: setMusicFullDuration */
    public final void m163158x2d0e9bc6(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a duration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(duration, "duration");
        this.P = duration;
        java.lang.String d17 = ou0.f.d((long) duration.m33987xd22e7c2d());
        java.lang.String str = ou0.f.d(0L) + " / " + d17;
        android.widget.TextView textView = this.f481523J;
        if (textView != null) {
            textView.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startTimeTv");
            throw null;
        }
    }

    /* renamed from: setOnFirstAttached */
    public final void m163159xdc275413(yz5.a aVar) {
        this.T = aVar;
    }

    /* renamed from: setOnMusicStartInMediaChanged */
    public final void m163160x6113cd93(yz5.l lVar) {
        this.V = lVar;
    }

    /* renamed from: setOnPlayingProgressChanged */
    public final void m163161x141e74fa(yz5.l lVar) {
        this.U = lVar;
    }

    /* renamed from: setOnUserTouch */
    public final void m163162x8205a153(yz5.a aVar) {
        this.W = aVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.q3v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f481523J = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.qah);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.qc_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10964x1eb31dbf c10964x1eb31dbf = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10964x1eb31dbf) findViewById3;
        this.L = c10964x1eb31dbf;
        c10964x1eb31dbf.m47245xc6cf6336(new rv0.e(this));
        yz5.a aVar = this.T;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
