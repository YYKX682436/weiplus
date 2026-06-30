package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class e7 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 f232651d;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var) {
        this.f232651d = q7Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var = this.f232651d;
        if (q7Var.f232922e || (g8Var = q7Var.f232921d) == null) {
            return;
        }
        g8Var.a(java.lang.System.currentTimeMillis(), 1, "2", 10, null);
    }
}
