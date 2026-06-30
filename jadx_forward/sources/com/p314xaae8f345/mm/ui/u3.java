package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public final class u3 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f292598f;

    public u3(android.view.View view, android.view.View view2, boolean z17) {
        this.f292596d = view;
        this.f292597e = view2;
        this.f292598f = z17;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f292596d.removeOnAttachStateChangeListener(this);
        com.p314xaae8f345.mm.ui.a4 a4Var = com.p314xaae8f345.mm.ui.a4.f278650a;
        boolean z17 = this.f292598f;
        android.view.View view2 = this.f292597e;
        com.p314xaae8f345.mm.ui.a4.c(a4Var, view2, z17);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.y0.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
