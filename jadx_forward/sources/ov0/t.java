package ov0;

/* loaded from: classes5.dex */
public abstract class t extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y {
    public final int L;
    public final int M;
    public final int N;
    public final jz5.g P;
    public final jz5.g Q;
    public final jz5.g R;
    public final jz5.g S;
    public final jz5.g T;
    public final jz5.g U;
    public final jz5.g V;
    public final jz5.g W;

    /* renamed from: l1, reason: collision with root package name */
    public final ov0.r f430680l1;

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f430681p0;

    /* renamed from: p1, reason: collision with root package name */
    public ov0.f f430682p1;

    /* renamed from: x0, reason: collision with root package name */
    public final jz5.g f430683x0;

    /* renamed from: x1, reason: collision with root package name */
    public ov0.e f430684x1;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.ArrayList f430685y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.L = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.agt);
        this.M = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.agk);
        this.N = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ago);
        this.P = jz5.h.b(new ov0.q(this));
        this.Q = jz5.h.b(new ov0.s(this));
        this.R = jz5.h.b(new ov0.i(this));
        this.S = jz5.h.b(new ov0.j(this));
        this.T = jz5.h.b(new ov0.p(this));
        this.U = jz5.h.b(new ov0.o(this));
        this.V = jz5.h.b(new ov0.h(this));
        this.W = jz5.h.b(new ov0.k(this));
        this.f430681p0 = jz5.h.b(new ov0.n(this));
        this.f430683x0 = jz5.h.b(new ov0.g(this));
        this.f430685y0 = new java.util.ArrayList();
        this.f430680l1 = new ov0.r(this);
    }

    /* renamed from: getInitTabPage */
    private final ov0.e m157193xcbe86b5e() {
        ov0.e eVar = ov0.e.f430658e;
        ov0.e eVar2 = (ov0.e) j("key_open_page", eVar);
        return eVar2 == null ? eVar : eVar2;
    }

    /* renamed from: getTabLayout */
    private final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e m157194x52245469() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.P).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e) mo141623x754a37bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getViewPager */
    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe m157195xa0cf1568() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.Q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y
    public void D(int i17, int i18) {
        if (i18 != 0) {
            int mo47066x10b53b15 = mo47066x10b53b15();
            android.widget.LinearLayout linearLayout = this.f150745o;
            if (linearLayout.getHeight() != mo47066x10b53b15) {
                linearLayout.getLayoutParams().height = mo47066x10b53b15;
            }
        }
        m157195xa0cf1568().getLayoutParams().height = i17;
        m157195xa0cf1568().requestLayout();
    }

    public final void H() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 editText = m157203x4d68d3e1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
        editText.setInputType(0);
        editText.setCursorVisible(false);
        editText.setFocusableInTouchMode(false);
        m157203x4d68d3e1().setVisibility(8);
        m157202xba2a8c67().setVisibility(8);
    }

    public float I(ov0.e page) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        if (page != ov0.e.f430659f) {
            return (page == ov0.e.f430658e || M()) ? mo47066x10b53b15() : mo47066x10b53b15();
        }
        float f17 = this.L;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a17 = n3.b1.a(this);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        int c17 = (a18 != null ? a18.f328580d - a18.f328578b : com.p314xaae8f345.mm.ui.bl.c(getContext())) - j65.q.a(getContext()).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ajd);
        if (c17 < 0) {
            c17 = 0;
        }
        return f17 + c17;
    }

    public final void J() {
        m157197xea0b8dfb().setVisibility(8);
    }

    public final void K(java.util.List tabs, ov0.f tabChangeListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabs, "tabs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabChangeListener, "tabChangeListener");
        this.f430682p1 = tabChangeListener;
        m157195xa0cf1568().m8315x6cab2c8d(new pw0.j(tabs));
        java.util.ArrayList arrayList = this.f430685y0;
        arrayList.clear();
        arrayList.addAll(tabs);
        m157194x52245469().m47221xfd22d5dc(m157195xa0cf1568());
        m157194x52245469().m47211xed4b2ce4(this.f430680l1);
        m157194x52245469().m47212x9c28fa5e(true);
    }

    public abstract void L();

    public boolean M() {
        return m157193xcbe86b5e() == ov0.e.f430658e;
    }

    public boolean N() {
        return false;
    }

    public void O() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 editText = m157199xdb574fcd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
        editText.setInputType(131073);
        editText.setCursorVisible(true);
        editText.setFocusableInTouchMode(true);
        editText.setSelection(editText.getText().length());
        editText.requestFocus();
        if (N()) {
            m157203x4d68d3e1().setVisibility(0);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 editText2 = m157203x4d68d3e1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText2, "editText");
            editText2.setInputType(1);
            editText2.setCursorVisible(true);
            editText2.setFocusableInTouchMode(true);
            editText2.setSelection(editText2.getText().length());
        } else {
            H();
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 editText3 = m157199xdb574fcd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText3, "editText");
        android.content.res.Resources a17 = j65.q.a(getContext());
        editText3.setPadding(a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561248d8), a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        editText3.setGravity(8388627);
        editText3.setVerticalScrollBarEnabled(true);
        editText3.setMaxLines(mo47102x5193cd64());
        android.view.ViewGroup.LayoutParams layoutParams = editText3.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        m157196xda5977e().setTranslationY(0.0f);
        E();
        F(I(ov0.e.f430658e), true, null, null);
    }

    public void P() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 editText = m157199xdb574fcd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
        editText.setInputType(0);
        editText.setCursorVisible(false);
        editText.setFocusableInTouchMode(false);
        C();
        J();
        H();
        boolean M = M();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 editText2 = m157199xdb574fcd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText2, "editText");
        android.content.res.Resources a17 = j65.q.a(getContext());
        editText2.setPadding(a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561248d8), 0);
        editText2.setGravity(8388627);
        editText2.setVerticalScrollBarEnabled(false);
        android.view.ViewGroup.LayoutParams layoutParams = editText2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.H;
        }
        F(I(ov0.e.f430659f), M, new ov0.l(this), new ov0.m(this));
    }

    public final void Q() {
        m157197xea0b8dfb().setVisibility(0);
    }

    public final void R(ov0.e page) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        if (page == m157204x661a2673()) {
            return;
        }
        java.util.Iterator it = this.f430685y0.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((sw0.c) it.next()).f494953b == page) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            m157194x52245469().e(valueOf.intValue(), false);
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public ou0.z b() {
        return new ou0.v(false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dg9, bodyContainerLayout);
        L();
    }

    /* renamed from: getContentContainer */
    public final android.widget.LinearLayout m157196xda5977e() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f430683x0).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.LinearLayout) mo141623x754a37bb;
    }

    /* renamed from: getDeleteBtn */
    public final android.widget.ImageView m157197xea0b8dfb() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.V).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }

    /* renamed from: getDoneBtn */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m157198xab635744() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.R).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    /* renamed from: getEditText */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157199xdb574fcd() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.S).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y
    /* renamed from: getInitialAnimationPanelHeight */
    public float mo47103x42d19a55() {
        return I(m157193xcbe86b5e());
    }

    /* renamed from: getInputBoxHeight */
    public int mo157200xbb31ef1e() {
        return this.M;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y
    /* renamed from: getInputEditText */
    public android.widget.EditText mo47104x3b6b208b() {
        return m157199xdb574fcd();
    }

    /* renamed from: getNextBtn */
    public final android.widget.TextView m157201xabe4ee33() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.W).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    /* renamed from: getPanelBackground */
    public android.graphics.drawable.Drawable mo47064x46b2581c() {
        return new android.graphics.drawable.ColorDrawable(0);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    /* renamed from: getPanelHeight */
    public int mo47066x10b53b15() {
        return mo157200xbb31ef1e() + this.N + m47105xecc3a569();
    }

    @Override // android.view.View
    public final android.widget.LinearLayout getRootView() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f430681p0).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.LinearLayout) mo141623x754a37bb;
    }

    /* renamed from: getSecondDeleteBtn */
    public final android.widget.ImageView m157202xba2a8c67() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.U).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }

    /* renamed from: getSecondEditText */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157203x4d68d3e1() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.T).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314) mo141623x754a37bb;
    }

    /* renamed from: getSelectedTabPage */
    public final ov0.e m157204x661a2673() {
        return this.f430684x1;
    }

    /* renamed from: getStylePageView */
    public final android.view.View m157205x83e42eef() {
        java.lang.Object obj;
        java.util.Iterator it = this.f430685y0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sw0.c) obj).f494953b == ov0.e.f430659f) {
                break;
            }
        }
        sw0.c cVar = (sw0.c) obj;
        if (cVar != null) {
            return cVar.f494954c;
        }
        return null;
    }

    /* renamed from: getTitlePageView */
    public final android.view.View m157206x354d9c96() {
        java.lang.Object obj;
        java.util.Iterator it = this.f430685y0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sw0.c) obj).f494953b == ov0.e.f430658e) {
                break;
            }
        }
        sw0.c cVar = (sw0.c) obj;
        if (cVar != null) {
            return cVar.f494954c;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public boolean m() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public boolean n(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public boolean o() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        R(m157193xcbe86b5e());
        if (N() && m157204x661a2673() == ov0.e.f430658e) {
            m157203x4d68d3e1().setVisibility(0);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 editText = m157203x4d68d3e1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
            editText.setInputType(1);
            editText.setCursorVisible(true);
            editText.setFocusableInTouchMode(true);
            editText.setSelection(editText.getText().length());
        } else {
            H();
        }
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.ActivityC10929xf9779373 activityC10929xf9779373 = context instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.ActivityC10929xf9779373 ? (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.ActivityC10929xf9779373) context : null;
        if (activityC10929xf9779373 != null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.INPUT_METHOD_CHANGED");
            activityC10929xf9779373.registerReceiver(this.K, intentFilter);
        }
        float mo47103x42d19a55 = mo47103x42d19a55();
        qw0.e eVar = this.A;
        eVar.f448600a = mo47103x42d19a55;
        m47072xbce46ae2(eVar);
        this.C.f();
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void s() {
        yz5.a aVar = this.I;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        java.lang.Object text = mo47104x3b6b208b().getText();
        if (text == null) {
            text = "";
        }
        m47074x209a1f1f(text);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void x() {
        if (M()) {
            E();
        }
        R(m157193xcbe86b5e());
    }
}
