package qv0;

/* loaded from: classes5.dex */
public abstract class f extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 implements com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.r {
    public yz5.l A;
    public yz5.l B;
    public boolean C;
    public boolean D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context) {
        super(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.E = jz5.h.b(new qv0.a(this));
        this.F = jz5.h.b(new qv0.b(this));
        this.G = jz5.h.b(new qv0.e(this));
    }

    /* renamed from: getCloseBtn */
    private final android.view.View m160989xbcfd02ba() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.E).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getDoneBtn */
    private final android.view.View m160990xab635744() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.F).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getTitleView */
    private final android.widget.TextView m160991x80215667() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.G).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final void B() {
        m160990xab635744().setEnabled(false);
        m160990xab635744().clearAnimation();
        m160990xab635744().animate().alpha(0.2f).setDuration(500L).start();
    }

    public final void C() {
        m160990xab635744().clearAnimation();
        m160990xab635744().animate().alpha(1.0f).setDuration(500L).start();
        m160990xab635744().setEnabled(true);
    }

    public boolean D() {
        return !(this instanceof iv0.c);
    }

    public boolean E(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        yz5.l lVar = this.B;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.mo146xb9724478(view)).booleanValue();
        }
        return true;
    }

    public boolean F(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        yz5.l lVar = this.A;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.mo146xb9724478(view)).booleanValue();
        }
        return true;
    }

    public final void G() {
        m160991x80215667().invalidate();
        m160991x80215667().setText(mo11426x7c1b2e13());
        if (this instanceof lw0.c) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e c10962x80d4584e = this.H;
            if (c10962x80d4584e != null) {
                c10962x80d4584e.setVisibility(0);
            }
            m160991x80215667().setVisibility(8);
        } else {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e c10962x80d4584e2 = this.H;
            if (c10962x80d4584e2 != null) {
                c10962x80d4584e2.setVisibility(8);
            }
            m160991x80215667().setVisibility(0);
        }
        android.view.View m160989xbcfd02ba = m160989xbcfd02ba();
        int i17 = D() ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m160989xbcfd02ba, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel", "redrawToolbarUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m160989xbcfd02ba.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m160989xbcfd02ba, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel", "redrawToolbarUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View m160990xab635744 = m160990xab635744();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m160990xab635744, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel", "redrawToolbarUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m160990xab635744.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m160990xab635744, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel", "redrawToolbarUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void H() {
        this.C = false;
        this.D = false;
    }

    public final void I(yz5.l done, yz5.l close) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(done, "done");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(close, "close");
        this.A = done;
        this.B = close;
    }

    public final void J() {
        if (this.C) {
            return;
        }
        this.C = true;
        this.D = true;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    /* renamed from: getPanelBackground */
    public android.graphics.drawable.Drawable mo47064x46b2581c() {
        android.content.res.Resources a17 = j65.q.a(getContext());
        java.lang.ThreadLocal threadLocal = d3.q.f307641a;
        android.graphics.drawable.Drawable a18 = d3.l.a(a17, com.p314xaae8f345.mm.R.C30861xcebc809e.cmc, null);
        return a18 == null ? new android.graphics.drawable.ColorDrawable(j65.q.a(getContext()).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ad7, null)) : a18;
    }

    /* renamed from: getShouldTakeSnapshotWhenClose$plugin_mj_template_release */
    public final boolean m160992x59adcaf2() {
        return this.D;
    }

    /* renamed from: getToolbarTabLayout */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e m160993x520b995a() {
        return this.H;
    }

    /* renamed from: getToolbarTitle */
    public abstract java.lang.String mo11426x7c1b2e13();

    /* renamed from: getUserActed$plugin_mj_template_release */
    public final boolean m160994x67ad68cc() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public boolean n(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public final boolean o() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public final void r(android.content.Context context, android.widget.FrameLayout headerContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerContainerLayout, "headerContainerLayout");
        super.r(context, headerContainerLayout);
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dge, headerContainerLayout);
        this.H = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e) findViewById(com.p314xaae8f345.mm.R.id.q9b);
        m160989xbcfd02ba().setOnClickListener(new qv0.c(this));
        m160990xab635744().setOnClickListener(new qv0.d(this));
        G();
    }

    /* renamed from: setToolbarTabLayout */
    public final void m160995xf6082e66(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e c10962x80d4584e) {
        this.H = c10962x80d4584e;
    }
}
