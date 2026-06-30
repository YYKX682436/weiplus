package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class za implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f294148d;

    public za(com.p314xaae8f345.mm.ui.ga gaVar) {
        this.f294148d = gaVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f294148d.f290177g.removeOnAttachStateChangeListener(this);
    }
}
