package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class h3 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 f255483d;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var) {
        this.f255483d = q3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = this.f255483d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q3Var.f255723e, "onViewAttachedToWindow() called with: v = " + v17);
        q3Var.l(v17);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = this.f255483d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q3Var.f255723e, "onViewDetachedFromWindow() called with: v = " + v17);
        q3Var.f255743x0 = true;
        q3Var.c();
    }
}
