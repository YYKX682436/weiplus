package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public final class x3 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f294073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f294074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.r f294075f;

    public x3(android.view.View view, android.view.View view2, yz5.r rVar) {
        this.f294073d = view;
        this.f294074e = view2;
        this.f294075f = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f294073d.removeOnAttachStateChangeListener(this);
        android.view.View view2 = this.f294074e;
        jz5.o a17 = com.p314xaae8f345.mm.ui.a4.a(view2);
        this.f294075f.C(view2, a17.f384374d, a17.f384375e, a17.f384376f);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.y0.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
