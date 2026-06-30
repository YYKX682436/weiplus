package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes7.dex */
public final class u2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 f214687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f214688e;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 w2Var, java.util.function.Consumer consumer) {
        this.f214687d = w2Var;
        this.f214688e = consumer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        android.view.WindowManager windowManager;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        android.view.Window window = this.f214687d.getWindow();
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        windowManager.addCrossWindowBlurEnabledListener(this.f214688e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        android.view.WindowManager windowManager;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        android.view.Window window = this.f214687d.getWindow();
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        windowManager.removeCrossWindowBlurEnabledListener(this.f214688e);
    }
}
