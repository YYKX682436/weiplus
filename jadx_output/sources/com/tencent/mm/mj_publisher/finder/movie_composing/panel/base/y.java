package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public abstract class y extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.r {
    public final qw0.e A;
    public final int B;
    public final com.tencent.mm.ui.tools.f5 C;
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.t D;
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.s E;
    public int F;
    public final int G;
    public final int H;
    public yz5.a I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f69260J;
    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.KeyBoardPanel$inputMethodChangeReceiver$1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.KeyBoardPanel$inputMethodChangeReceiver$1] */
    public y(android.content.Context context) {
        super(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.A = new qw0.e();
        this.B = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.agi);
        this.C = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
        this.E = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.s.f69252d;
        this.F = Integer.MIN_VALUE;
        this.G = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.agl);
        this.H = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.agm);
        this.K = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.KeyBoardPanel$inputMethodChangeReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                java.lang.String action;
                boolean z17 = false;
                if (intent != null && (action = intent.getAction()) != null && action.equals("android.intent.action.INPUT_METHOD_CHANGED")) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y yVar = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y.this;
                    yVar.I = new com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.v(yVar);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyboardHeight() {
        int a17 = com.tencent.mm.sdk.platformtools.d2.a(getContext());
        return a17 <= 0 ? this.B : a17;
    }

    public final void C() {
        android.widget.EditText inputEditText = getInputEditText();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Object systemService = getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            kotlin.Result.m521constructorimpl(inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(inputEditText.getApplicationWindowToken(), 0)) : null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    public abstract void D(int i17, int i18);

    public void E() {
        android.widget.EditText inputEditText = getInputEditText();
        inputEditText.setFocusable(true);
        inputEditText.setFocusableInTouchMode(true);
        inputEditText.requestFocus();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Object systemService = getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            kotlin.Result.m521constructorimpl(inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(inputEditText, 0)) : null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    public final void F(float f17, boolean z17, yz5.l lVar, yz5.a aVar) {
        float panelHeight = getPanelHeight() - f17;
        if (z17) {
            getPanelContainer().animate().translationY(panelHeight).setDuration(200L).withEndAction(new com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.w(aVar)).setUpdateListener(new com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.x(lVar)).start();
            return;
        }
        getPanelContainer().setTranslationY(panelHeight);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public int getEditTextMaxLineOnExpand() {
        return 3;
    }

    public abstract float getInitialAnimationPanelHeight();

    public abstract android.widget.EditText getInputEditText();

    public final int getKeyboardViewHeight() {
        return getKeyboardHeight() + getNavigationBarHeight();
    }

    public final int getPanelTransparentHeight() {
        return this.G - this.H;
    }

    public final void setInputMethodChangeCallback(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f69260J = callback;
    }

    public final void setKeyBoardStatusListener(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.t keyBoardStatusListener) {
        kotlin.jvm.internal.o.g(keyBoardStatusListener, "keyBoardStatusListener");
        this.D = keyBoardStatusListener;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void t() {
        this.E = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.s.f69252d;
        this.C.d();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        this.C.f210400e = new com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.u(this);
        D(getKeyboardViewHeight(), 0);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void y() {
        C();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            android.content.Context context = getContext();
            jz5.f0 f0Var = null;
            com.tencent.mm.mj_publisher.finder.movie_composing.MovieComposingUI movieComposingUI = context instanceof com.tencent.mm.mj_publisher.finder.movie_composing.MovieComposingUI ? (com.tencent.mm.mj_publisher.finder.movie_composing.MovieComposingUI) context : null;
            if (movieComposingUI != null) {
                movieComposingUI.unregisterReceiver(this.K);
                f0Var = jz5.f0.f302826a;
            }
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}
