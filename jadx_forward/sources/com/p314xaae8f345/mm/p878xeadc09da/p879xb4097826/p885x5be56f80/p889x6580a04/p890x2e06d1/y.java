package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1;

/* loaded from: classes5.dex */
public abstract class y extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 implements com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.r {
    public final qw0.e A;
    public final int B;
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 C;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.t D;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.s E;
    public int F;
    public final int G;
    public final int H;
    public yz5.a I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f150793J;
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.C10938xf46a3c30 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.KeyBoardPanel$inputMethodChangeReceiver$1] */
    public y(android.content.Context context) {
        super(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.A = new qw0.e();
        this.B = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.agi);
        this.C = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5((android.app.Activity) context);
        this.E = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.s.f150785d;
        this.F = Integer.MIN_VALUE;
        this.G = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.agl);
        this.H = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.agm);
        this.K = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.KeyBoardPanel$inputMethodChangeReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                java.lang.String action;
                boolean z17 = false;
                if (intent != null && (action = intent.getAction()) != null && action.equals("android.intent.action.INPUT_METHOD_CHANGED")) {
                    z17 = true;
                }
                if (z17) {
                    com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y yVar = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y.this;
                    yVar.I = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.v(yVar);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getKeyboardHeight */
    public final int m47101x9918f4e4() {
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(getContext());
        return a17 <= 0 ? this.B : a17;
    }

    public final void C() {
        android.widget.EditText mo47104x3b6b208b = mo47104x3b6b208b();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.Object systemService = getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(mo47104x3b6b208b.getApplicationWindowToken(), 0)) : null);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    public abstract void D(int i17, int i18);

    public void E() {
        android.widget.EditText mo47104x3b6b208b = mo47104x3b6b208b();
        mo47104x3b6b208b.setFocusable(true);
        mo47104x3b6b208b.setFocusableInTouchMode(true);
        mo47104x3b6b208b.requestFocus();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.Object systemService = getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(mo47104x3b6b208b, 0)) : null);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    public final void F(float f17, boolean z17, yz5.l lVar, yz5.a aVar) {
        float mo47066x10b53b15 = mo47066x10b53b15() - f17;
        if (z17) {
            m47065x99c433d3().animate().translationY(mo47066x10b53b15).setDuration(200L).withEndAction(new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.w(aVar)).setUpdateListener(new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.x(lVar)).start();
            return;
        }
        m47065x99c433d3().setTranslationY(mo47066x10b53b15);
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* renamed from: getEditTextMaxLineOnExpand */
    public int mo47102x5193cd64() {
        return 3;
    }

    /* renamed from: getInitialAnimationPanelHeight */
    public abstract float mo47103x42d19a55();

    /* renamed from: getInputEditText */
    public abstract android.widget.EditText mo47104x3b6b208b();

    /* renamed from: getKeyboardViewHeight */
    public final int m47105xecc3a569() {
        return m47101x9918f4e4() + m47061x92c6830();
    }

    /* renamed from: getPanelTransparentHeight */
    public final int m47106xf8568a6b() {
        return this.G - this.H;
    }

    /* renamed from: setInputMethodChangeCallback */
    public final void m47107x79e29ffe(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f150793J = callback;
    }

    /* renamed from: setKeyBoardStatusListener */
    public final void m47108xeca1a16f(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.t keyBoardStatusListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyBoardStatusListener, "keyBoardStatusListener");
        this.D = keyBoardStatusListener;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void t() {
        this.E = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.s.f150785d;
        this.C.d();
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        this.C.f291933e = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.u(this);
        D(m47105xecc3a569(), 0);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void y() {
        C();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            android.content.Context context = getContext();
            jz5.f0 f0Var = null;
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.ActivityC10929xf9779373 activityC10929xf9779373 = context instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.ActivityC10929xf9779373 ? (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.ActivityC10929xf9779373) context : null;
            if (activityC10929xf9779373 != null) {
                activityC10929xf9779373.unregisterReceiver(this.K);
                f0Var = jz5.f0.f384359a;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }
}
